package com.zyc.design_pattern.behavior.strategy;

/**
 *
 * 公主套装
 *
 */
public class PrincessSuit implements Change {

    private static PrincessSuit princessSuit = new PrincessSuit();

    private PrincessSuit(){

    }

    public static PrincessSuit getInstance(){
        return princessSuit;
    }
    @Override
    public String wear(Girl girl) {
        return "将女孩的"+girl.jacket+"换为公主套装的上衣";
    }
}
