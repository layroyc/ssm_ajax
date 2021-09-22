package com.xiexin.bean;

import java.io.Serializable;

/**
 * pei_jian
 * @author 
 */
public class PeiJian implements Serializable {
    private Integer peiJianId;

    private String peiJianName;

    private String peiJianRongLiang;

    private Double peiJianPrice;

    private Integer typeIdf;

    private static final long serialVersionUID = 1L;

    public Integer getPeiJianId() {
        return peiJianId;
    }

    public void setPeiJianId(Integer peiJianId) {
        this.peiJianId = peiJianId;
    }

    public String getPeiJianName() {
        return peiJianName;
    }

    public void setPeiJianName(String peiJianName) {
        this.peiJianName = peiJianName;
    }

    public String getPeiJianRongLiang() {
        return peiJianRongLiang;
    }

    public void setPeiJianRongLiang(String peiJianRongLiang) {
        this.peiJianRongLiang = peiJianRongLiang;
    }

    public Double getPeiJianPrice() {
        return peiJianPrice;
    }

    public void setPeiJianPrice(Double peiJianPrice) {
        this.peiJianPrice = peiJianPrice;
    }

    public Integer getTypeIdf() {
        return typeIdf;
    }

    public void setTypeIdf(Integer typeIdf) {
        this.typeIdf = typeIdf;
    }
}