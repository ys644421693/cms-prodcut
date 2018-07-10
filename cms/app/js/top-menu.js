var TopMenu = React.createClass({

    render: function () {
        return <div className="ui secondary pointing  menu">
            <div className="item">
                <img src="/images/logo.png"/>
            </div>
            <a className="item active">Features</a>
            <a className="item">Testimonials</a>
            <a className="item">Sign-in</a>
            <div className="item">
                <div className="ui icon input">
                    <input type="text" placeholder="Search..."/>
                    <i className="search link icon"></i>
                </div>
            </div>

            <div className="right item">
                <a className="ui label blue"><i className="mail icon"></i>13</a>
                <a className="ui label blue"><i className="mail icon"></i>13</a>
                <a className="ui label blue"><i className="mail icon"></i>13</a>
            </div>
        </div>;
    }
});

ReactDOM.render(
    <TopMenu/>,
    document.getElementById('top-menu')
);