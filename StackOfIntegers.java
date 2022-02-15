package com.company;

import java.util.Stack;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int value){
        this.elements = new int[value];
        this.size = 0;
    }

    public boolean empty(){
        if(this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getSize(){
        return this.size;
    }

    public int peek(){
        //use for loop through the array from the back to get the last existing element
        return this.elements[this.size - 1];
    }

    public void push(int value){
        //use for loop through the array from the back to add the value
        this.size += 1;
        this.elements[this.size - 1] = value;
    }

    public int pop(){
        //use for loop through the array from the back to remove the last value
        int lastValue = this.elements[this.size - 1];
        this.size -= 1;
        return lastValue;
    }
}
