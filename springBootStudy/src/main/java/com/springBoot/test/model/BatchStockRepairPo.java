package com.springBoot.test.model;

import java.math.BigDecimal;

/**
 * Created by xiaojun.zhang1 on 2017/7/24.
 */
public class BatchStockRepairPo {

    private byte isNeedRecord;
    private String applyAddr;
    private String applyReason;
    private String lastmodifyByName;
    private Long batchStockID;
    private Long quantity;
    private BigDecimal weight = BigDecimal.ZERO;
    private Long stockQuantity;
    private BigDecimal StockWeight = BigDecimal.ZERO;
    private Long availableQuantity;
    private BigDecimal availableWeight = BigDecimal.ZERO;
    private String remark;

    public byte getIsNeedRecord() {
        return isNeedRecord;
    }

    public void setIsNeedRecord(byte isNeedRecord) {
        this.isNeedRecord = isNeedRecord;
    }

    public String getApplyAddr() {
        return applyAddr;
    }

    public void setApplyAddr(String applyAddr) {
        this.applyAddr = applyAddr;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getLastmodifyByName() {
        return lastmodifyByName;
    }

    public void setLastmodifyByName(String lastmodifyByName) {
        this.lastmodifyByName = lastmodifyByName;
    }

    public Long getBatchStockID() {
        return batchStockID;
    }

    public void setBatchStockID(Long batchStockID) {
        this.batchStockID = batchStockID;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public BigDecimal getStockWeight() {
        return StockWeight;
    }

    public void setStockWeight(BigDecimal stockWeight) {
        StockWeight = stockWeight;
    }

    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public BigDecimal getAvailableWeight() {
        return availableWeight;
    }

    public void setAvailableWeight(BigDecimal availableWeight) {
        this.availableWeight = availableWeight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
