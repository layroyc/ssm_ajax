package com.xiexin.bean;

import java.io.Serializable;

/**
 * computer
 * @author 
 */
public class Computer implements Serializable {
    private Integer pcId;

    private String pcName;

    private String pcMemory;

    private String pcCpu;

    private String pcVideocard;

    private String pcDisplay;

    private String pcHdd;

    private String pcPrice;

    private static final long serialVersionUID = 1L;

    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public String getPcMemory() {
        return pcMemory;
    }

    public void setPcMemory(String pcMemory) {
        this.pcMemory = pcMemory;
    }

    public String getPcCpu() {
        return pcCpu;
    }

    public void setPcCpu(String pcCpu) {
        this.pcCpu = pcCpu;
    }

    public String getPcVideocard() {
        return pcVideocard;
    }

    public void setPcVideocard(String pcVideocard) {
        this.pcVideocard = pcVideocard;
    }

    public String getPcDisplay() {
        return pcDisplay;
    }

    public void setPcDisplay(String pcDisplay) {
        this.pcDisplay = pcDisplay;
    }

    public String getPcHdd() {
        return pcHdd;
    }

    public void setPcHdd(String pcHdd) {
        this.pcHdd = pcHdd;
    }

    public String getPcPrice() {
        return pcPrice;
    }

    public void setPcPrice(String pcPrice) {
        this.pcPrice = pcPrice;
    }
}