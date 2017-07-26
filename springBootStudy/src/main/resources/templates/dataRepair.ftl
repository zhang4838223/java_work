<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>数据修复</title>

    <!-- Bootstrap -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>
<h1>test</h1>
<div class="col-md-6" align="center">
    <form id="repairBatchStock">
        <table >
            <thead>
                <tr>
                    <th>
                        key
                    </th>
                    <th>
                        value
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        IsNeedRecord:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="1" name="IsNeedRecord" value="1" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        ApplyAddr:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="ApplyAddr" name="ApplyAddr" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        ApplyReason:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="ApplyReason" name="ApplyReason" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        LastmodifyByName:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="修改人" name="LastmodifyByName" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        BatchStockID:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="批次库存id" name="BatchStockID" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        Quantity:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="入库数量" name="Quantity" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        Weight:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="入库重量" name="Weight" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>

                <tr>
                    <td>
                        StockQuantity:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="库存数量" name="StockQuantity" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        StockWeight:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="库存数量" name="StockWeight" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        AvailableQuantity:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="可售数量" name="AvailableQuantity" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        AvailableWeight:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="可售重量" name="AvailableWeight" value="0" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>
                        Remark:
                    </td>
                    <td>
                        <input type="text" class="form-control" placeholder="备注说明" name="Remark" aria-describedby="basic-addon1">
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <button type="button" class="btn btn-lg btn-info" id="submit-btn">提交</button>
                    </td>
                </tr>

            </tbody>
        </table>
    </form>
</div>
</body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/dataRepair.js"></script>
</html>