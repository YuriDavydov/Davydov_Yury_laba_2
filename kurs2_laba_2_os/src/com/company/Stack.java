package com.company;



public class Stack {
   Process[] sc = new Process[100];
    int num = 0;
    int Size;

    public Stack(int size) {
        this.Size = size;
    }

    public void push(Process p) {
        if (num == Size) {
            System.out.println("Стек переполнен");
        } else {
            sc[num] = p;
            sc[num].number_process = num;
            num++;
        }
    }

    public Process pop() {
        if (num != 0) {
            return sc[--num];
        }
        else{
            return null;
        }

    }
}

