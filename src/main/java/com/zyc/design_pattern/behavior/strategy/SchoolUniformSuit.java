package com.zyc.design_pattern.behavior.strategy;

public class SchoolUniformSuit implements Change{
    private static SchoolUniformSuit schoolUniformSuit = new SchoolUniformSuit();

    private SchoolUniformSuit(){

    }

    public static SchoolUniformSuit getInstance(){
        return schoolUniformSuit;
    }
    @Override
    public String wear(Girl girl) {
        return "将女孩的"+girl.trousers+"换成了可爱的校服裤子";
    }
}
