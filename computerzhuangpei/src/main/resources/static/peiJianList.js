$(function () {
    // 清空 之前的死数据
    $("#peiJianTable tbody").empty();
    goPage(1);
// 1 2 3 4 5 分页 的css
    console.log($("#pageUl"));


});


function goPage(page){
    $.ajax({
        url: '/api/peiJian/peiJianSelectByPage',
        type: 'post',
        data: {
            page:page,
            limit: 5,
            peiJianName: '',
            peiJianRongLiang: '',
            peiJianPrice: ''
        },
        success: function (r) {
            console.log(r);
            // 铺货啦
            if (r.code = 200) {
                // 遍历 r.data 这数据
                // alert("qqq")
                bianLi(r.data);
                //  数据分页下面的 上一页 下一页
                //铺货
                pageFoot(r);
            }
        }

    }); // ajax end
}

// 添加我们自己获取服务器的代码
// 调用  peijian 的 查全  分页


// 数据分页 遍历后 铺货
function bianLi(peiJians) {
    $.each(peiJians, function (index, item) {
        //console.log(item)
        // console.log(index)
        // 铺货 到表格..

        var td_peiJianName = $("<td>"+item.peiJianName+"</td>");
        var td_typeIdf = $("<td>"+item.typeIdf+"</td>");
        var td_peiJianRongLiang = $("<td>"+item.peiJianRongLiang+"</td>");
        var td_peiJianPrice = $("<td>"+item.peiJianPrice+"</td>");
        var td_index=$("<td>"+item.peiJianId+"</td>");
        var tr=$("<tr></tr>");
        td_index.appendTo(tr);
        td_peiJianName.appendTo(tr);
        td_typeIdf.appendTo(tr);
        td_peiJianRongLiang.appendTo(tr);
        td_peiJianPrice.appendTo(tr);
        //  var tr=$("<tr></tr>").append(td_peiJianName,td_typeIdf,td_peiJianRongLiang,td_peiJianPrice);
        tr.appendTo($("#peiJianTable tbody"));
    });
}
// 分页下面的 上一页 下一页 铺货
function  pageFoot(peiJianPage) {
    console.log(peiJianPage.currentPage);
    $("#pageFoot").empty();

    var span =$("<span  style='width: 1000px; height: 50px'>共"+peiJianPage.count+"条记录,当前第"+peiJianPage.currentPage+"页/共"+peiJianPage.totalPageNum+"页&nbsp;&nbsp;<button   onclick='pageNumI(1)'>首页</button>&nbsp;&nbsp;<button id='pageUp' onclick='pageUp("+peiJianPage.currentPage+","+peiJianPage.totalPageNum+")'>上一页</button><button id='pageDown' onclick='pageDown("+peiJianPage.currentPage+","+peiJianPage.totalPageNum+")' >下一页</button>&nbsp;&nbsp;<button   onclick='pageNumI("+peiJianPage.totalPageNum+")'>尾页</button></span>");
    $("#pageFoot").append(span);
    // 分配 li 12 3 4 5
   for (var i = peiJianPage.currentPage-4; i <= peiJianPage.currentPage+4; i++) {
        if(i<1||i>peiJianPage.totalPageNum){
            continue;
        }



        var aHtml;
        if(i===peiJianPage.currentPage){
            // 让 1 2 3 4 5 变粗

            aHtml=$("<a href='javascript:void(0);' style='font-weight: bold;text-decoration:none; color:#333; '>["+peiJianPage.currentPage+"]&nbsp;&nbsp;</a>");
            console.log(aHtml);
             $("#pageDown").before(aHtml);


        }else{
            aHtml=  $("<a href='javascript:void(0);' style='text-decoration:none;color:#333;  ' onclick='pageNumI("+i+")'>["+i+"]&nbsp;&nbsp;</a>");
            $("#pageDown").before(aHtml);
        }

    }
    


}



// 上一页 , 下一页
function pageDown(upPage,lastPage) {

    if (upPage===lastPage ) {
        alert("最后一页了");
        // 让 oclick 失效
        //$("#pageDown").removeAttr("onclick");
        return;

    }
    // alert("x......iao..");
    $("#peiJianTable tbody").empty();
    upPage++;
    //alert(upPage);
    goPage(upPage);
}
function pageUp(upPage) {
    if (upPage<=1 ) {
        alert("第一页了");
        // 让 oclick 失效
        //$("#pageDown").removeAttr("onclick");
        return;

    }

    $("#peiJianTable tbody").empty();
    upPage--;
    goPage(upPage);
}

// 1 2 3 4 5 分页

function pageNumI(i) {
        goPage(i);
    $("#peiJianTable tbody").empty();
}
