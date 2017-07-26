/**
 * Created by xiaojun.zhang1 on 2017/7/24.
 */
$(function () {

    $("#submit-btn").click(function () {
        if(confirm("是否确认提交?")){
            $("#submit-btn").attr('disabled',"disabled");
            save();
            $("#submit-btn").removeAttr("disabled");
        }
    });
});

function save(){
    //表单验证
    //$('#repairBatchStock').data('bootstrapValidator').validate();
    //if(!$('#repairBatchStock').data('bootstrapValidator').isValid())
    //{
    //    $.modal.setChildData(false);
    //    return;// 直接return 不做后续任何操作
    //}
    //判断是否选择上级区域
    $.ajax({
        type : "POST",
        url : "http://localhost:8888/repair/batchStock",
        async: true,
        processData : true,
        data : $("#repairBatchStock").serialize(),
        success : function() {
            alert("成功");
        }
    });
}