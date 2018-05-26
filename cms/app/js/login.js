var LoginForm = React.createClass({
    getInitialState: function () {
        return {userName: '', password: "", remember: 'no'};
    },
    userNameChange: function (event) {
        this.setState({userName: event.target.value});
    },
    passwordChange: function (event) {
        this.setState({password: event.target.value});
    },
    rememberChange: function (event) {
        if (event.target.value == this.state.remember) {
            this.setState({remember: "no"});
            return;
        }
        this.setState({remember: event.target.value});
    },
    submitData: function () {
        $.post(config.service + "/sys/login", this.state, function (data) {
            console.log(data);
            if (data.result == "SUCCESS") {
                window.location.href = 'index.html';
            } else {
                $("#tip").html(data.errorMsg);
            }
        }, "JSON").error(function (even, error, dt) {
            if (even.status == 404) {
                window.location.href = 'page-404.html';
            }
            if (even.status == 500) {
                window.location.href = 'page-500.html';
            }
            alert("login fail！");
        });
    },
    render: function () {
        var userName = this.state.userName;
        var password = this.state.password;
        var remember = this.state.remember;
        return <div className="login-box">
            <div className="header">
                Login to TTM-CMS
            </div>
            <form className="form-horizontal login">
                <fieldset className="col-sm-12">
                    <div className="form-group">
                        <div className="controls row">
                            <div className="input-group col-sm-12">
                                <input type="text" className="form-control" id="username"
                                       placeholder="Username" value={userName} onChange={this.userNameChange}/>
                                <span className="input-group-addon"><i className="fa fa-user"></i></span>
                            </div>
                        </div>
                    </div>
                    <div className="form-group">
                        <div className="controls row">
                            <div className="input-group col-sm-12">
                                <input type="password" className="form-control" id="password"
                                       placeholder="Password" value={password} onChange={this.passwordChange}/>
                                <span className="input-group-addon"><i className="fa fa-key"></i></span>
                            </div>
                        </div>
                    </div>
                    <div>
                        <span id={'tip'} style={{color:'red'}}></span>
                    </div>
                    <div className="confirm">
                        <input type="checkbox" name="remember" checked={remember == 'yes'} value="yes"
                               onChange={this.rememberChange}/>
                        <label for="remember">Remember me</label>
                    </div>
                    <div className="row">
                        <input type="button" className="btn btn-lg btn-primary col-xs-12" onClick={this.submitData}
                               value="LOGIN"/>
                    </div>
                </fieldset>
            </form>
            <a className="pull-left" href="login.html#">Forgot Password?</a>
            <a className="pull-right" href="page-register.html">Sign Up!</a>
            <div className="clearfix"></div>

        </div>;
    }
});

ReactDOM.render(
    <LoginForm/>,
    document.getElementById('login-template')
);