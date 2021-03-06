/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.model;

import java.util.Date;

/**
 *
 * @author SBiswa32
 */
public class StockDetails {

    private Integer stockId;
    private Stock stock;
    private String compName;
    private String compDesc;
    private String remark;
    private Date listedDate;

    /**
     * @return the stockId
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * @param stockId the stockId to set
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    /**
     * @return the compName
     */
    public String getCompName() {
        return compName;
    }

    /**
     * @param compName the compName to set
     */
    public void setCompName(String compName) {
        this.compName = compName;
    }

    /**
     * @return the compDesc
     */
    public String getCompDesc() {
        return compDesc;
    }

    /**
     * @param compDesc the compDesc to set
     */
    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the listedDate
     */
    public Date getListedDate() {
        return listedDate;
    }

    /**
     * @param listedDate the listedDate to set
     */
    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }
}
