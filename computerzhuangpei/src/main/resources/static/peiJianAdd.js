$(function () {
    // 思路:  先查全所有 类型
      $.ajax({
             url:'/api/type/selectTypeAll',
             type:'GET',
             success: function (r) {
                console.log(r);
                //   类型的遍历
                 bianLiType(r.data);
             }

         }); // ajax 结束
        // 类型 查全的 api
        function bianLiType(types) {
            var option_pre_dom= $("<option value='0'>--请选择配件类型--</option>");
            $("#typeIdf").empty().prepend(option_pre_dom);
            $.each(types,function (index,item) {
                    // 铺货到 select 选项
                 var typeId=  item.typeId;
                 var typeName=  item.typeName;
                 var option_dom= $("<option value="+typeId+">"+typeName+"</option>");
                $("#typeIdf").append(option_dom);
            })
        }




});

// 点击  列表的配件的 选项
function typeIdfChange(){
    // 让他 不隐藏
    console.log();
   var i= $("#typeIdf").val();
    if (i==4||i==2){
        $("#peiJianRongLiangNone").show();
    }else{
        $("#peiJianRongLiangNone").hide();
    }

}

// 配件 添加
function  addPeiJian() {

        // 对接添加的 api
        // 1. 找值
        // 2. 传值到后台 , 并提示
        var peiJian={};
        peiJian.peiJianName=$("#peiJianName").val();
        peiJian.typeIdf=$("#typeIdf").val();
        peiJian.peiJianRongLiang=$("#peiJianRongLiang").val();
        peiJian.peiJianPrice=$("#peiJianPrice").val();
        if(peiJian.peiJianRongLiang==''){
            peiJian.peiJianRongLiang='-----';
        };
        $.ajax({
            url:'/api/peiJian/peiJianInsert',
            type:'POST',
            data:peiJian,
            //data:JSON.stringify(obj),
            //contentType: "application/json",
            success: function (r) {
                console.log(r);
                if (r.code==200) {
                    alert("添加成功");
                    $("#peiJianName").val("");
                    $("#typeIdf").val("0");
                    $("#peiJianRongLiang").val("");
                    $("#peiJianPrice").val("");
                }else{
                    alert("检查一下网络,添加失败");
                    $("#peiJianName").val("");
                    $("#typeIdf").val("0");
                    $("#peiJianRongLiang").val("");
                    $("#peiJianPrice").val("");
                }
            }
        })


}