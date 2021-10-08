package com.zyc.design_pattern.strategy;


public class Girl {
    public String getHeaddress() {
        return headdress;
    }

    public String getJacket() {
        return jacket;
    }

    public String getTrousers() {
        return trousers;
    }

    public void setHeaddress(String headdress) {
        this.headdress = headdress;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public void setTrousers(String trousers) {
        this.trousers = trousers;
    }

    // 头饰
    public   String headdress = "闪光头饰";

    // 上衣
    public   String jacket = "利落上衣";

    // 裤子
    public   String trousers = "飒爽裤子";

    // 给一个女孩换不同的衣服（要做的事儿），校服套装，公主套装，骑马套转
    // 给小女孩换上某个部分的衣服
    void changeSuit(Change change){
        System.out.println(change.wear(this));
    }
}
