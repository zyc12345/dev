package com.zyc.design_pattern.establish.Factory.One;

import com.zyc.design_pattern.establish.Factory.Bicycle;
import com.zyc.design_pattern.establish.Factory.Open;

public class BicycleFactory {

    public Open create(){
        return new Bicycle();
    }
}
