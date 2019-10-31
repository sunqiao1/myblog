$(function(){
    showBlog();
    showLog();
    showType();
});

function showBlog(){
    var url="/blog/list";
    var data={};
    $.getJSON(url,data,function(result) {
        if (result.state == 0) {
            var blogList = result.data;
            showAllBlog(blogList)

        } else {
            alert(result.message)
        }
    });

}
function showAllBlog(blogList) {
    for (var i = 0; i < blogList.length; i++) {

        $("#main").append(
            "<article class='kratos-hentry clearfix'>"
            + "<div class='kratos-entry-border-new clearfix'>"
            + "<div class='kratos-entry-thumb-new'>"
            + "<a href='https://blog.pghk.tk/?p=17'><img src='img/thumb_13.jpg' alt='Hexo Github 404解决方法'></a>"
            + "</div>"
            + "<div class='kratos-post-inner-new>"
            + "<header class='kratos-entry-header-new'>"
            + "<a class='label' href='https://blog.pghk.tk/?cat=3'>" + blogList[i].typeName + "</a>"
            + "<h2 class='kratos-entry-title-new'><a href='https://blog.pghk.tk/?p=17'>" + blogList[i].title + "</a></h2>"

            + "</header>"
            + " <div class='kratos-entry-content-new'>"
            + "<p>" + blogList[i].summary + "</p>"
            + "</div>"
            + "</div>"
            + "<div class='kratos-post-meta-new'>"
            + "<span class='pull-left>"
            + "<a><i class='fa fa-calendar'></i> " + blogList[i].subDate + "</a>"
            + " </span>"
            + "<span class='visible-lg visible-md visible-sm pull-left'>"
            + "<a href='https://blog.pghk.tk/?p=17'><i class='fa fa-eye'></i> 14次阅读</a>"
            + "<a href='javascript:;' data-action='love' data-id='17' class='Love'><i class='fa fa-thumbs-o-up'></i> 3人点赞</a>"
            + "<a href='https://blog.pghk.tk/?author=1'><i class='fa fa-user'></i>" + blogList[i].author + "</a>"
            + "</span>"
            + "<span class='pull-right'>"
            + "<a class='read-more' href='https://blog.pghk.tk/?p=17' title='阅读全文'>阅读全文 <i class='fa fa-chevron-circle-right'></i></a>"
            + "</span>"
            + "</div>"
            + "</div>"
            + "</article>"
        )
    }

}



function showLog(){
    var url="/blogLog/log";
    var data={};
    $.getJSON(url,data,function(result) {
        if (result.state == 0) {
            var logList = result.data;
            showAllLog(logList)

        } else {
            alert(result.message)
        }
    });

}
    function showAllLog(logList){
        for(var i = 0; i<logList.length; i++){

            $("#log").prepend(
                myTime(logList[i].releasedate)
                +" <li style='list-style: none'>"

                +"<p style='color: #00a4ff'>"
                +"&nbsp;&nbsp;&nbsp;&nbsp;"+logList[i].info
                +"</p>"
                +"</li>"
            )
        }

}




function showType(){
    var url = "/blogType/type";
    var data = {};

    $.getJSON(url,data,function(result){
        if(result.state == 0){
            var typeList = result.data;
            showAllType(typeList)
        }else{
            alert(result.message)
        }
    });
}
function showAllType(typeList){
    for(var i = 0;i<typeList.length;i++){

        $("#blogtype").append(
            "<a>"
            +typeList[i].typeName
            +"</a>"

        )

    }
}



































//带有时区的转化二
function myTime(date) {

    var dateee = new Date(date).toJSON();

//        var dateee = new Date("2017-07-09T09:46:49.667").toJSON();

    var dd = new Date(+new Date(dateee) ).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '')
    return dd;
}

