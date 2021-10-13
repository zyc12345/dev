package com.zyc.design_pattern.structure.Composite;

public class LeafNode extends Node{

    public LeafNode(String name){
        this.name = name;
    }
    @Override
    void printName(Node node) {
        System.out.println(node.name);
    }
}
