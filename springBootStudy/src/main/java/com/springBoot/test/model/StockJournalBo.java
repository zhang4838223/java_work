package com.springBoot.test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xiaojun.zhang1 on 2016/10/19.
 */
public class StockJournalBo {

    /**
     * 流水主表id
     */
    private Long stockJournalId;
    /**
     * 流水主表单据类型
     */
    private Integer billType;
    /**
     * 流水主表单据Id
     */
    private Long billId;
    /**
     * 流水主表单据号
     */
    private String billCode;
    /**
     * 流水主表上游单据id
     */
    private Long relateBillId;
    /**
     * 流水主表上游单据号
     */
    private String relateBillCode;
    /**
     * 流水主的单据关系表ID
     */
    private Long billRelationId;
    /**
     * 流水明细表id
     */
    private Long stockJournalItemId;
    /**
     * 流水明细表流水类型
     */
    private Integer  journalType;
    /**
     * 流水明细表SKUID
     */
    private Long  skuId;
    /**
     * 流水明细表商品类型
     */
    private Integer  goodType;
    /**
     * 流水明细表数量增量
     */
    private Integer  incrementQuantity;
    /**
     * 流水明细表重量增量
     */
    private BigDecimal incrementWeight;
    /**
     * 流水明细表库存状态
     */
    private Integer stockStatus;
    /**
     * 流水明细表计算方式
     */
    private Integer calCulationMode;
    /**
     * 流水明细表仓库id
     */
    private Long warehouseId;
    /**
     * 流水明细表仓库名称
     */
    private String warehouseName;
    /**
     * 流水明细表供应商id
     */
    private Long investorId;
    /**
     * 流水明细表供应商name
     */
    private String investorName;
    /**
     * 流水明细表提货权id
     */
    private Long stockOwnerId;
    /**
     * 流水明细表提货权name
     */
    private String stockOwnerName;
    /**
     * 流水明细表货主id
     */
    private Long deliveryOwnerId;
    /**
     * 流水明细表货主name
     */
    private String deliveryOwnerName;
    /**
     * 流水明细表归属公司ID
     */
    private Long orgTitleId;
    /**
     * 流水明细表炉批号
     */
    private String productionBatch;
    /**
     * 流水明细表捆包号
     */
    private String packageNo;
    /**
     * 流水明细表批次库存id
     */
    private Long batchStockId;
    /**
     * 流水明细表的WMS码单id
     */
    private Long itemCode;
    /**
     * 流水明细表的操作人
     */
    private Long addedBy;
    /**
     * 流水明细表的新增时间
     */
    private Date addedTime;
    /**
     * 流水明细表的有效标记
     */
    private char valid;
    /**
     * 单据关联关系表钢厂订货单id
     */
    private Long bhBillId;
    /**
     * 单据关联关系表钢厂订货单code
     */
    private String bhBillCode;
    /**
     * 单据关联关系表预入库通知单id
     */
    private Long cyBillId;
    /**
     * 单据关联关系表预入库通知单Code
     */
    private String cyBillCode;
    /**
     * 单据关联关系表入库单id
     */
    private Long rkBillId;
    /**
     * 单据关联关系表入库单Code
     */
    private String rkBillCode;

    /**
     * 单据关联关系表修改时间
     */

    private Date lastModifiedTime;
    /**
     * 流水明细表的修改人
     */
    private Long lastModifiedBy;

    //操作表示 true成功 false 失败。
    private boolean optFlag = true;

    /**
     * 起始页
     */
    private int     start;

    /**
     * 页数
     */
    private int     page    = 1;

    /**
     * 每页条数
     */
    private int     rows    = 10;

    //导出标识 all全部信息 page当前页面
    private String  exportFlag;

    public boolean isOptFlag() {
        return optFlag;
    }

    public void setOptFlag(boolean optFlag) {
        this.optFlag = optFlag;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getExportFlag() {
        return exportFlag;
    }

    public void setExportFlag(String exportFlag) {
        this.exportFlag = exportFlag;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Long getStockJournalId() {
        return stockJournalId;
    }

    public void setStockJournalId(Long stockJournalId) {
        this.stockJournalId = stockJournalId;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Long getRelateBillId() {
        return relateBillId;
    }

    public void setRelateBillId(Long relateBillId) {
        this.relateBillId = relateBillId;
    }

    public String getRelateBillCode() {
        return relateBillCode;
    }

    public void setRelateBillCode(String relateBillCode) {
        this.relateBillCode = relateBillCode;
    }

    public Long getBillRelationId() {
        return billRelationId;
    }

    public void setBillRelationId(Long billRelationId) {
        this.billRelationId = billRelationId;
    }

    public Long getStockJournalItemId() {
        return stockJournalItemId;
    }

    public void setStockJournalItemId(Long stockJournalItemId) {
        this.stockJournalItemId = stockJournalItemId;
    }

    public Integer getJournalType() {
        return journalType;
    }

    public void setJournalType(Integer journalType) {
        this.journalType = journalType;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public Integer getIncrementQuantity() {
        return incrementQuantity;
    }

    public void setIncrementQuantity(Integer incrementQuantity) {
        this.incrementQuantity = incrementQuantity;
    }

    public BigDecimal getIncrementWeight() {
        return incrementWeight;
    }

    public void setIncrementWeight(BigDecimal incrementWeight) {
        this.incrementWeight = incrementWeight;
    }

    public Integer getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Integer getCalCulationMode() {
        return calCulationMode;
    }

    public void setCalCulationMode(Integer calCulationMode) {
        this.calCulationMode = calCulationMode;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public Long getStockOwnerId() {
        return stockOwnerId;
    }

    public void setStockOwnerId(Long stockOwnerId) {
        this.stockOwnerId = stockOwnerId;
    }

    public String getStockOwnerName() {
        return stockOwnerName;
    }

    public void setStockOwnerName(String stockOwnerName) {
        this.stockOwnerName = stockOwnerName;
    }

    public Long getDeliveryOwnerId() {
        return deliveryOwnerId;
    }

    public void setDeliveryOwnerId(Long deliveryOwnerId) {
        this.deliveryOwnerId = deliveryOwnerId;
    }

    public String getDeliveryOwnerName() {
        return deliveryOwnerName;
    }

    public void setDeliveryOwnerName(String deliveryOwnerName) {
        this.deliveryOwnerName = deliveryOwnerName;
    }

    public Long getOrgTitleId() {
        return orgTitleId;
    }

    public void setOrgTitleId(Long orgTitleId) {
        this.orgTitleId = orgTitleId;
    }

    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public Long getBatchStockId() {
        return batchStockId;
    }

    public void setBatchStockId(Long batchStockId) {
        this.batchStockId = batchStockId;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public Long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Long addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public char getValid() {
        return valid;
    }

    public void setValid(char valid) {
        this.valid = valid;
    }

    public Long getBhBillId() {
        return bhBillId;
    }

    public void setBhBillId(Long bhBillId) {
        this.bhBillId = bhBillId;
    }

    public String getBhBillCode() {
        return bhBillCode;
    }

    public void setBhBillCode(String bhBillCode) {
        this.bhBillCode = bhBillCode;
    }

    public Long getCyBillId() {
        return cyBillId;
    }

    public void setCyBillId(Long cyBillId) {
        this.cyBillId = cyBillId;
    }

    public String getCyBillCode() {
        return cyBillCode;
    }

    public void setCyBillCode(String cyBillCode) {
        this.cyBillCode = cyBillCode;
    }

    public Long getRkBillId() {
        return rkBillId;
    }

    public void setRkBillId(Long rkBillId) {
        this.rkBillId = rkBillId;
    }

    public String getRkBillCode() {
        return rkBillCode;
    }

    public void setRkBillCode(String rkBillCode) {
        this.rkBillCode = rkBillCode;
    }
}
