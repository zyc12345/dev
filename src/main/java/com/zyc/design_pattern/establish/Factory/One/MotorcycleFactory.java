package com.zyc.design_pattern.establish.Factory.One;

import com.zyc.design_pattern.establish.Factory.Motorcycle;
import com.zyc.design_pattern.establish.Factory.Open;

public class MotorcycleFactory {

    public Open create(){
        return new Motorcycle();
    }
}
