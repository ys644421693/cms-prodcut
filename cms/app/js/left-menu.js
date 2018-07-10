var LeftMenu = React.createClass({
    componentDidMount: function () {
        $('.ui.sticky').sticky({context: '#cms-content-id'});
    },
    render: function () {
        return <div >
            <div className="ui sticky transparent">
                <div className="ui accordion segment">
                    <div className="active title">
                        <i className="grid layout icon"></i>
                        什么是狗？
                        <i className="dropdown icon"></i>
                    </div>
                    <div className="active content">
                        <p>狗算是一种家畜。以其忠诚与忠心广受人类欢迎, 可以在世界各地的许多家庭里发现这个受欢迎的客人。</p>
                    </div>
                    <div className="title">
                        <i className="dropdown icon"></i>
                        狗有哪些种类？
                    </div>
                    <div className="content">
                        <p>狗有许多品种，每个品种都有不同的大小及性格，饲主通常选择适合自己生活方式的品种当作自已的伙伴，其中最受欢迎的品种绝对是吉娃娃。</p>
                    </div>
                    <div className="title">
                        <i className="dropdown icon"></i>
                        如何获得一只狗?
                    </div>
                    <div className="content">
                        <p>通常有三种方式可以取得一只狗狗，宠物店、私人饲主或是动物之家。 (请以领养代替购买)</p>
                        <p>你可以在动物之家内领养一只健康的小狗，比起在宠物店买，收容所中的宠物比较不容易有近亲交配出现的缺陷问题，而且领养一只小狗的费用远比你在宠物店中购买便宜得多。</p>
                    </div>
                </div>
            </div>
        </div>;

    }
});

ReactDOM.render(
    <LeftMenu/>,
    document.getElementById('left-menu')
);

var ContentPage = React.createClass({
    componentDidMount: function () {
        $('.ui.sticky').sticky({context: '#cms-content-id'});
    },
    render: function () {
        return <div>
            <div className="ui masthead vertical segment">
                <div className="ui container">


                </div>
                <div className="ui right internal attached rail">
                    <div className="ui sticky ">
                        <div className="ui vertical labeled icon buttons">
                            <button className="ui button">
                                <i className="save icon"></i>
                                保存
                            </button>
                            <button className="ui button">
                                <i className="unhide icon"></i>
                                预览
                            </button>
                            <button className="ui button">
                                <i className="chevron up icon"></i>
                                回到顶部
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>;
    }
});

ReactDOM.render(
    <ContentPage/>,
    document.getElementById('content-page')
);
