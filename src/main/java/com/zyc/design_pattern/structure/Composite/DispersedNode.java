package com.zyc.design_pattern.structure.Composite;

import java.util.ArrayList;
import java.util.List;

public class DispersedNode extends Node{

   public DispersedNode(String name){
        this.name = name;
    }

    List<Node> lists = new ArrayList<>();

    public void add(Node node){
        lists.add(node);
    }

    @Override
    void printName(Node node) {
        System.out.println(node.name);
    }
}
