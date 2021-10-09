package com.zyc.design_pattern.establish.Factory.Two;

import com.zyc.design_pattern.establish.Factory.Bicycle;
import com.zyc.design_pattern.establish.Factory.Open;

public class BicycleFactory extends OpenFactory{
    @Override
    Open create() {
        return new Bicycle();
    }
}
