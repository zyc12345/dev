package com.zyc.design_pattern.establish.Factory.Two;

import com.zyc.design_pattern.establish.Factory.Motorcycle;
import com.zyc.design_pattern.establish.Factory.Open;

public class MotorcycleFactory extends OpenFactory{
    @Override
    Open create() {
        return new Motorcycle();
    }
}
