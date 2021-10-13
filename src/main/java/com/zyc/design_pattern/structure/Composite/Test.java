package com.zyc.design_pattern.structure.Composite;

public class Test {
    public static void main(String[] args) {
        DispersedNode dispersedNode = new DispersedNode("root");
        DispersedNode dispersedNodeOne = new DispersedNode("One");
        DispersedNode dispersedNodeTwo = new DispersedNode("Two");
        dispersedNode.add(dispersedNodeOne);
        dispersedNode.add(dispersedNodeTwo);
        Node one_one = new LeafNode("One-One");
        dispersedNodeOne.add(one_one);
        Node two_two = new LeafNode("Two-two");
        dispersedNodeTwo.add(two_two);
        for (Node list : dispersedNode.lists) {
            list.printName(list);
        }
    }
}
