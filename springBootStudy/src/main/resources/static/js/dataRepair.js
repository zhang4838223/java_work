/**
 * Created by xiaojun.zhang1 on 2017/7/24.
 */
$(function () {

    $("#submit-btn").click(function () {
        if(confirm("是否确认提交?")){
            save();
        }
    });

    validate();
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
            //alert("成功");
            $('#myModal').modal();
        }
    });
}

function validate() {
    $('#repairBatchStock').bootstrapValidator({
        message: 'input number please!',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            BatchStockID: {
                message: '批次库存id验证失败',
                validators: {
                    //notEmpty: {
                    //    message: '用户名不能为空'
                    //},
                    //stringLength: {
                    //    min: 6,
                    //    max: 18,
                    //    message: '用户名长度必须在6到18位之间'
                    //},
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: '<span style="color: #ff0000;">批次库存id只能是数字</span>'
                    }
                }
            },
            Quantity: {
                message: '批次库存入库数量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?[0-9]\d*$/,
                        message: '<span style="color: #ff0000;">入库数量只能是数字</span>'
                    }
                }
            },
            Weight: {
                message: '批次库存入库重量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$/,
                        message: '<span style="color: #ff0000;">入库重量只能是数字</span>'
                    }
                }
            },
            StockQuantity: {
                message: '批次库存库存数量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?[0-9]\d*$/,
                        message: '<span style="color: #ff0000;">库存数量只能是数字</span>'
                    }
                }
            },
            StockWeight: {
                message: '批次库存库存重量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$/,
                        message: '<span style="color: #ff0000;">库存重量只能是数字</span>'
                    }
                }
            },
            AvailableQuantity: {
                message: '批次库存可售数量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?[0-9]\d*$/,
                        message: '<span style="color: #ff0000;">可售数量只能是数字</span>'
                    }
                }
            },
            AvailableWeight: {
                message: '批次库存可售重量验证失败',
                validators: {
                    regexp: {
                        regexp: /^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$/,
                        message: '<span style="color: #ff0000;">可售重量只能是数字</span>'
                    }
                }
            },
            Remark: {
                message: '批次库存入库重量验证失败',
                validators: {
                    stringLength: {/*长度提示*/
                        min: 4,
                        max: 30,
                        message: '<span style="color: #ff0000;">长度必须在4到30之间</span>'
                    }/*最后一个没有逗号*/
                }
            }
        }
    });
}