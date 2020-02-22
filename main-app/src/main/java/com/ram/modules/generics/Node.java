package com.ram.modules.generics;

public class Node<T extends Comparable<T>> {
    
    private T data;
    private Node<T> left;
    private Node<T> right;
    
    public Node(final T data) {
        this.data = data;
    }
    
    public void setLeft(final T data){
        this.left = new Node<>(data);
    }
    
    public void setRight(final T data){
        this.right = new Node<>(data);
    }
    
    @Override
    public String toString() {
        return "Node{" +
            "data=" + data +
            ", left=" + left +
            ", right=" + right +
            '}';
    }
}
