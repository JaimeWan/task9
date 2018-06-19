package com.service;

import org.oasisopen.sca.annotation.Reference;

/**
 * @Author: Jaime
 * @Date: 2018/6/14 17:31
 * @Description: *
 */
public class Calculator implements ICalculator {
    private IAdd add;

    public IAdd getAdd() {
        return add;
    }

    @Reference
    public void setAdd(IAdd add) {
        this.add = add;
    }

    public double add(double n1, double n2) {
        // TODO Auto-generated method stub
        return this.add.add(n1, n2);
    }
}
