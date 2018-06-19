package com.service;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;

/**
 * @Author: Jaime
 * @Date: 2018/6/14 17:49
 * @Description: *
 */
public class StartService {

    public static void main(String[] args) {
        Node node = NodeFactory.newInstance().createNode(
                "Calculator.composite");
        node.start();
        System.out.println("service启动");
        ICalculator c = node.getService(Calculator.class,
                "CalculatorServiceComponent");
        System.out.println(c.add(2, 2));
    }

}