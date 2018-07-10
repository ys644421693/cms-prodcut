var Footer = React.createClass({

    render: function () {
        return <div className="ui black inverted vertical footer segment">
            <div className="ui center aligned container">
                <div className="ui stackable inverted grid">
                    <div className="three wide column">
                        <h4 className="ui inverted header">社区</h4>
                        <div className="ui inverted link list">
                            <a className="item" href="https://www.transifex.com/organization/semantic-org/"
                               target="_blank">协助翻译</a>
                            <a className="item" href="https://github.com/Semantic-Org/Semantic-UI/issues"
                               target="_blank">提交问题</a>
                            <a className="item" href="https://gitter.im/Semantic-Org/Semantic-UI"
                               target="_blank">加入讨论</a>
                            <a className="item" href="/cla.html" target="_blank">CLA</a>
                        </div>
                    </div>
                    <div className="three wide column">
                        <h4 className="ui inverted header">网络</h4>
                        <div className="ui inverted link list">
                            <a className="item" href="https://github.com/Semantic-Org/Semantic-UI" target="_blank">GitHub
                                库</a>
                            <a className="item" href="https://forums.semantic-ui.com" target="_blank">用户论坛</a>
                            <a className="item" href="http://1.semantic-ui.com">1.x 版本文档</a>
                            <a className="item" href="http://legacy.semantic-ui.com">0.x 版本文档</a>
                        </div>
                    </div>
                    <div className="seven wide right floated column">
                        <h4 className="ui inverted teal header">帮助维持本项目</h4>
                        <p> 社区为 Semantic UI 持续不断的发展提供了直接的支持。</p>
                        <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                            <input type="hidden" name="cmd" value="_s-xclick"/>
                            <input type="hidden" name="hosted_button_id" value="7ZAF2Q8DBZAQL"/>
                            <button type="submit" className="ui large teal button">现在捐赠</button>
                        </form>
                    </div>
                </div>
                <div className="ui inverted section divider"></div>
                <img src="/images/logo.png" className="ui centered mini image"/>
                <div className="ui horizontal inverted small divided link list">
                    <a className="item" href="http://semantic-ui.mit-license.org/" target="_blank">Free &amp; Open
                        Source (MIT)</a>
                </div>
            </div>
        </div>;
    }
});

ReactDOM.render(
    <Footer/>,
    document.getElementById('footer')
);