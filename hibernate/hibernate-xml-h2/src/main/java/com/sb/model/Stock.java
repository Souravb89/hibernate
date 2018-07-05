/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SBiswa32
 */
public class Stock {
    private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<StockDetails> stockDetails = new HashSet();

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
     * @return the stockCode
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * @param stockCode the stockCode to set
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    /**
     * @return the stockName
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * @param stockName the stockName to set
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * @return the stockDetails
     */
    public Set<StockDetails> getStockDetails() {
        return stockDetails;
    }

    /**
     * @param stockDetails the stockDetails to set
     */
    public void setStockDetails(Set<StockDetails> stockDetails) {
        this.stockDetails = stockDetails;
    }

   
}
