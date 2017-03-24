package com.springBoot.test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 流水列表页面展示对象
 * Created by xiaojun.zhang1 on 2016/10/19.
 */
public class StockJournalVo {

    /**
     * 流水主表id
     */
    private long stockJournalId;
    /**
     * 流水主表单据类型
     */
    private int billType;
    /**
     * 流水主表单据Id
     */
    private long billId;
    /**
     * 流水主表单据号
     */
    private String billCode;
    /**
     * 流水主表上游单据id
     */
    private long relateBillId;
    /**
     * 流水主表上游单据号
     */
    private String relateBillCode;
    /**
     * 流水主的单据关系表ID
     */
    private long billRelationId;
    /**
     * 流水明细表id
     */
    private long stockJournalItemId;
    /**
     * 流水明细表流水类型
     */
    private int  journalType;
    /**
     * 流水明细表SKUID
     */
    private long  skuId;
    /**
     * 流水明细表商品类型
     */
    private int  goodType;
    /**
     * 流水明细表数量增量
     */
    private int  incrementQuantity;
    /**
     * 流水明细表重量增量
     */
    private BigDecimal incrementWeight;
    /**
     * 流水明细表库存状态
     */
    private int stockStatus;
    /**
     * 流水明细表计算方式
     */
    private int calCulationMode;
    /**
     * 流水明细表仓库id
     */
    private long warehouseId;
    /**
     * 流水明细表仓库名称
     */
    private String warehouseName;
    /**
     * 流水明细表供应商id
     */
    private long investorId;
    /**
     * 流水明细表供应商name
     */
    private String investorName;
    /**
     * 流水明细表提货权id
     */
    private long stockOwnerId;
    /**
     * 流水明细表提货权name
     */
    private String stockOwnerName;
    /**
     * 流水明细表货主id
     */
    private long deliveryOwnerId;
    /**
     * 流水明细表货主name
     */
    private String deliveryOwnerName;
    /**
     * 流水明细表归属公司ID
     */
    private long orgTitleId;
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
    private long batchStockId;
    /**
     * 流水明细表的WMS码单id
     */
    private long itemCode;
    /**
     * 流水明细表的操作人
     */
    private long addedBy;
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
    private long bhBillId;
    /**
     * 单据关联关系表钢厂订货单code
     */
    private String bhBillCode;
    /**
     * 单据关联关系表预入库通知单id
     */
    private long cyBillId;
    /**
     * 单据关联关系表预入库通知单Code
     */
    private String cyBillCode;
    /**
     * 单据关联关系表入库单id
     */
    private long rkBillId;
    /**
     * 单据关联关系表入库单Code
     */
    private String rkBillCode;
    /**
     * 单据关联关系表修改时间
     */
    private Date lastModifiedTime;

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public long getStockJournalId() {
        return stockJournalId;
    }

    public void setStockJournalId(long stockJournalId) {
        this.stockJournalId = stockJournalId;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public long getRelateBillId() {
        return relateBillId;
    }

    public void setRelateBillId(long relateBillId) {
        this.relateBillId = relateBillId;
    }

    public String getRelateBillCode() {
        return relateBillCode;
    }

    public void setRelateBillCode(String relateBillCode) {
        this.relateBillCode = relateBillCode;
    }

    public long getBillRelationId() {
        return billRelationId;
    }

    public void setBillRelationId(long billRelationId) {
        this.billRelationId = billRelationId;
    }

    public long getStockJournalItemId() {
        return stockJournalItemId;
    }

    public void setStockJournalItemId(long stockJournalItemId) {
        this.stockJournalItemId = stockJournalItemId;
    }

    public int getJournalType() {
        return journalType;
    }

    public void setJournalType(int journalType) {
        this.journalType = journalType;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public int getGoodType() {
        return goodType;
    }

    public void setGoodType(int goodType) {
        this.goodType = goodType;
    }

    public int getIncrementQuantity() {
        return incrementQuantity;
    }

    public void setIncrementQuantity(int incrementQuantity) {
        this.incrementQuantity = incrementQuantity;
    }

    public BigDecimal getIncrementWeight() {
        return incrementWeight;
    }

    public void setIncrementWeight(BigDecimal incrementWeight) {
        this.incrementWeight = incrementWeight;
    }

    public int getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(int stockStatus) {
        this.stockStatus = stockStatus;
    }

    public int getCalCulationMode() {
        return calCulationMode;
    }

    public void setCalCulationMode(int calCulationMode) {
        this.calCulationMode = calCulationMode;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(long investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public long getStockOwnerId() {
        return stockOwnerId;
    }

    public void setStockOwnerId(long stockOwnerId) {
        this.stockOwnerId = stockOwnerId;
    }

    public String getStockOwnerName() {
        return stockOwnerName;
    }

    public void setStockOwnerName(String stockOwnerName) {
        this.stockOwnerName = stockOwnerName;
    }

    public long getDeliveryOwnerId() {
        return deliveryOwnerId;
    }

    public void setDeliveryOwnerId(long deliveryOwnerId) {
        this.deliveryOwnerId = deliveryOwnerId;
    }

    public String getDeliveryOwnerName() {
        return deliveryOwnerName;
    }

    public void setDeliveryOwnerName(String deliveryOwnerName) {
        this.deliveryOwnerName = deliveryOwnerName;
    }

    public long getOrgTitleId() {
        return orgTitleId;
    }

    public void setOrgTitleId(long orgTitleId) {
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

    public long getBatchStockId() {
        return batchStockId;
    }

    public void setBatchStockId(long batchStockId) {
        this.batchStockId = batchStockId;
    }

    public long getItemCode() {
        return itemCode;
    }

    public void setItemCode(long itemCode) {
        this.itemCode = itemCode;
    }

    public long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(long addedBy) {
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

    public long getBhBillId() {
        return bhBillId;
    }

    public void setBhBillId(long bhBillId) {
        this.bhBillId = bhBillId;
    }

    public String getBhBillCode() {
        return bhBillCode;
    }

    public void setBhBillCode(String bhBillCode) {
        this.bhBillCode = bhBillCode;
    }

    public long getCyBillId() {
        return cyBillId;
    }

    public void setCyBillId(long cyBillId) {
        this.cyBillId = cyBillId;
    }

    public String getCyBillCode() {
        return cyBillCode;
    }

    public void setCyBillCode(String cyBillCode) {
        this.cyBillCode = cyBillCode;
    }

    public long getRkBillId() {
        return rkBillId;
    }

    public void setRkBillId(long rkBillId) {
        this.rkBillId = rkBillId;
    }

    public String getRkBillCode() {
        return rkBillCode;
    }

    public void setRkBillCode(String rkBillCode) {
        this.rkBillCode = rkBillCode;
    }
}
