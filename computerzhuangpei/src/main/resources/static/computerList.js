$(function () {
    // 清空 之前的死数据
    $("#xin_dataTable tbody").empty();
    goPage(1);
// 1 2 3 4 5 分页 的css
//修改前的计算
    xin_pcInfo_jiSuan();


});


function goPage(page) {
    $.ajax({
        url: '/api/computer/computerSelectByPage',
        type: 'post',
        data: {
            page: page,
            limit: 5

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
function bianLi(datas) {
    $.each(datas, function (index, item) {
        //console.log(item)
        // console.log(index)
        // 铺货 到表格..
        // 下面是要改的
        var ta_pcId = $("<td>" + item.pcId + "</td>");
        var td_pcName = $("<td>" + item.pcName + "</td>");
        var td_pcMemory = $("<td>" + item.pcMemory + "</td>");
        var td_pcCpu = $("<td>" + item.pcCpu + "</td>");
        var td_pcVideocard = $("<td>" + item.pcVideocard + "</td>");
        var td_pcDisplay = $("<td>" + item.pcDisplay + "</td>");
        var td_pcHdd = $("<td>" + item.pcHdd + "</td>");
        var td_pcPrice = $("<td>" + item.pcPrice + "</td>");

        var td_option = $("<td><button onclick='xin_td_modify(this," + item.pcId +")'>修改</button><br/><button onclick='xin_td_del(this," + item.pcId +")'>  删除</button></td>");

        var tr = $("<tr></tr>");
        ta_pcId.appendTo(tr);
        td_pcName.appendTo(tr);
        td_pcCpu.appendTo(tr);
        td_pcMemory.appendTo(tr);
        td_pcVideocard.appendTo(tr);
        td_pcHdd.appendTo(tr);
        td_pcDisplay.appendTo(tr);
        td_pcPrice.appendTo(tr);
        //  var tr=$("<tr></tr>").append(td_peiJianName,td_typeIdf,td_peiJianRongLiang,td_peiJianPrice);
        td_option.appendTo(tr);
        // 下面是要改的
        tr.appendTo($("#xin_dataTable tbody"));

    });
}

// 分页下面的 上一页 下一页 铺货
function pageFoot(pageInfos) {
    console.log(pageInfos.currentPage);
    $("#xin_pageFoot").empty();

    var span = $("<span  style='width: 1000px; height: 50px'>共" + pageInfos.count + "条记录,当前第" + pageInfos.currentPage + "页/共" + pageInfos.totalPageNum + "页&nbsp;&nbsp;<button   onclick='pageNumI(1)'>首页</button>&nbsp;&nbsp;<button id='pageUp' onclick='pageUp(" + pageInfos.currentPage + "," + pageInfos.totalPageNum + ")'>上一页</button><button id='pageDown' onclick='pageDown(" + pageInfos.currentPage + "," + pageInfos.totalPageNum + ")' >下一页</button>&nbsp;&nbsp;<button  onclick='pageNumI(" + pageInfos.totalPageNum + ")'>尾页</button></span>");
    $("#xin_pageFoot").append(span);
    // 分配 li 12 3 4 5
    for (var i = pageInfos.currentPage - 4; i <= pageInfos.currentPage + 4; i++) {
        if (i < 1 || i > pageInfos.totalPageNum) {
            continue;
        }


        var aHtml;
        if (i === pageInfos.currentPage) {
            // 让 1 2 3 4 5 变粗

            aHtml = $("<a href='javascript:void(0);' style='font-weight: bold;text-decoration:none; color:#333; '>[" + pageInfos.currentPage + "]&nbsp;&nbsp;</a>");
            console.log(aHtml);
            $("#pageDown").before(aHtml);


        } else {
            aHtml = $("<a href='javascript:void(0);' style='text-decoration:none;color:#333;  ' onclick='pageNumI(" + i + ")'>[" + i + "]&nbsp;&nbsp;</a>");
            $("#pageDown").before(aHtml);
        }

    }


}


// 上一页 , 下一页
function pageDown(upPage, lastPage) {

    if (upPage === lastPage) {
        alert("最后一页了");
        // 让 oclick 失效
        //$("#pageDown").removeAttr("onclick");
        return;

    }
    // alert("x......iao..");
    $("#xin_dataTable tbody").empty();
    upPage++;
    //alert(upPage);
    goPage(upPage);
}

function pageUp(upPage) {
    if (upPage <= 1) {
        alert("第一页了");
        // 让 oclick 失效
        //$("#pageDown").removeAttr("onclick");
        return;

    }

    $("#xin_dataTable tbody").empty();
    upPage--;
    goPage(upPage);
}

// 1 2 3 4 5 分页

function pageNumI(i) {
    goPage(i);
    $("#xin_dataTable tbody").empty();
}

// 删除的方法
function xin_td_del(td, pcId) {

    // alert(num)
    if (confirm("确认要删除？")) {
        //var obj={};
        //obj.xxx=$("#xxx").val();
        $.ajax({
            url: '/api/computer/computerDelete',
            type: 'post',
            data: {pcId: pcId},
            success: function (r) {
                if (r.code == 200) {
                    $(td).parent().parent().remove();
                    alert("操作成功")
                } else {
                    alert("操作失败")
                }
            }

        })

    } else {
        window.event.returnValue = false;
    }


}

// 修改的ui  按主键id 修改
function xin_td_modify(td, pcId) {
    // 先获取值 --  从tr 中获取t的的值
    var tr = $(td).parent().parent(); // 找到 改行的 tr
    // console.log(tr.find("td:eq(0)").text() );
    var tr0 = tr.find("td:eq(0)").text();
    var tr1 = tr.find("td:eq(1)").text();
    var tr2 = tr.find("td:eq(2)").text();
    var tr3 = tr.find("td:eq(3)").text();
    var tr4 = tr.find("td:eq(4)").text();
    var tr5 = tr.find("td:eq(5)").text();
    var tr6 = tr.find("td:eq(6)").text();
    var tr7 = tr.find("td:eq(7)").text();
    // 再让上面隐藏
    $("#xin_show_table").hide();
    $("#xin_pageFoot").hide();
    // 让下面显示
    $("#computer_modify").show();
    // 把上面的 数据 贴到下面
    $("#pcId").val(tr0);
    $("#pcName").val(tr1);
    var pcCpu_option = $("<option value='0'>" + tr2 + "</option>");
    $("#pcCpu").prepend(pcCpu_option);
    var pcMemory_option = $("<option value='0'>" + tr3 + "</option>");
    $("#pcMemory").prepend(pcMemory_option);
    var pcHdd_option = $("<option value='0'>" + tr5 + "</option>");
    $("#pcHdd").prepend(pcHdd_option);
    var pcVideocard_option = $("<option value='0'>" + tr4 + "</option>");
    $("#pcVideocard").prepend(pcVideocard_option);
    var pcDisplay_option = $("<option value='0'>" + tr6 + "</option>");
    $("#pcDisplay").prepend(pcDisplay_option);
    $("#pcPrice").val(tr7);
    // 请求后台 的 数据 贴到 option 里  ajax 请求
    //var obj={};
    //obj.xxx=$("#xxx").val();
    $.ajax({
        url: '/api/peiJian/peiJianSelect',
        type: 'get',
        success: function (r) {
            console.log(r)
            if (r.code == 200) {
                $.each(r.data, function (index, item) {
                    if (item.typeIdf == 1) {
                        var pcCpu_option = $("<option value=" + item.typeIdf + ">" + item.peiJianName + "</option>");
                        $("#pcCpu").prepend(pcCpu_option);
                    }
                    if (item.typeIdf == 2) {
                        var pcMemory_option = $("<option value=" + item.typeIdf + ">" + item.peiJianName + "</option>");
                        $("#pcMemory").prepend(pcMemory_option);
                    }
                    if (item.typeIdf == 3) {
                        var pcVideocard_option = $("<option value=" + item.typeIdf + ">" + item.peiJianName + "</option>");
                        $("#pcVideocard").prepend(pcVideocard_option);
                    }
                    if (item.typeIdf == 4) {
                        var pcHdd_option = $("<option value=" + item.typeIdf + ">" + item.peiJianName + "</option>");
                        $("#pcHdd").prepend(pcHdd_option);
                    }

                    if (item.typeIdf == 5) {
                        var pcDisplay_option = $("<option value=" + item.typeIdf + ">" + item.peiJianName + "</option>");
                        $("#pcDisplay").prepend(pcDisplay_option);
                    }
                })
            }

        }

    })


}

//修改前的计算
function xin_pcInfo_jiSuan() {
    // pcInfo 这个 div 下的 所有的 select 的变动事件 都要去计算
    $("#pcInfo select").change(function () {
        //alert("画画的卑鄙")   ajax 提交 . 遍历所有 select
        var pcCpu = $("#pcCpu").find("option:selected").text();
        var pcMemory = $("#pcMemory").find("option:selected").text();
        var pcHdd = $("#pcHdd").find("option:selected").text();
        var pcVideocard = $("#pcVideocard").find("option:selected").text();
        var pcDisplay = $("#pcDisplay").find("option:selected").text();
        var nameList = new Array();
        nameList.push(pcCpu);
        nameList.push(pcMemory);
        nameList.push(pcHdd);
        nameList.push(pcVideocard);
        nameList.push(pcDisplay);

        $.ajax({
            url: '/api/peiJian/peiJianSelectForPrice',
            type: 'post',
            data: {
                // 根据 名字 来查询
                nameList: nameList
            },
            success: function (r) {
                console.log(r)
                // 得到 r 的值 改掉
                $("#pcPrice").val(r.data);
            }
        });

    });
}

//修改 -- 请求 修改的 api
function computer_modifyFun() {
    // 找到所有 id


    var computer = {};
    computer.pcId = $("#pcId").val();  // computerUpdate
    console.log(    computer.pcId )
    computer.pcName = $("#pcName").val();  // computerUpdate
    computer.pcCpu = $("#pcCpu").find("option:selected").text();
    computer.pcMemory = $("#pcMemory").find("option:selected").text();
    computer.pcHdd = $("#pcHdd").find("option:selected").text();
    computer.pcVideocard = $("#pcVideocard").find("option:selected").text();
    computer.pcDisplay = $("#pcDisplay").find("option:selected").text();
    computer.pcPrice = $("#pcPrice").val();
    $.ajax({
        url: '/api/computer/computerUpdate',
        type: 'post',
        data:  computer ,
        success: function (r) {
                console.log(r)

                if (r.code==200) {
                    alert("操作成功");
                }else{
                    alert("操作失败");
                }
        }

    })
}