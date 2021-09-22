


//增加 -- 请求 增加的 api
function computer_save() {
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
        url: '/api/computer/computerInsert',
        type: 'post',
        data:  computer ,
        success: function (r) {
            console.log(r)
            if (r.code==200) {
                alert("操作成功");
                window.location.href="/page/computerList"
            }else{
                alert("操作失败");
            }
        }

    })
}

//查  配件列表
$(function () {
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
                jiSuan();

            }

        }

    })
    xin_pcInfo_jiSuan();

});


//增加前的计算
function xin_pcInfo_jiSuan() {
    // pcInfo 这个 div 下的 所有的 select 的变动事件 都要去计算
    $("#pcInfo select").change(function () {
       jiSuan();

    });
}

function jiSuan() {
   // alert("画画的卑鄙")  // ajax 提交 . 遍历所有 select
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
}