package com.company;


import java.util.Arrays;

public class Task_planer {
   Process[]list;
   Stack stack;
    public Task_planer(Process[]processes){
        this.list = processes;
        for(int i = 0;i < this.list.length;i++){
            this.list[i]= new Process();
        }
        this.stack = new Stack(this.list.length);
    }
    public void Start_planer(){
        sort(this.list);
        for(int i = this.list.length-1;i >= 0;i--){
            this.stack.push(this.list[i]);
        }
        for (int j = 0;j<this.stack.Size;j++){
            this.stack.pop().start_process();
        }
    }
    public void sort(Process[]processes){
        for(int i = 0;i < processes.length;i++){
            int min = processes[i].time;
            int min_count = i;
            for(int j = i+1;j< processes.length;j++){
               if (processes[j].time < min){
                   min =  processes[j].time;
                   min_count= j;

               }

            }
            if (i!= min_count){
                Process z;
                 z = processes[i];
                 processes[i] = processes[min_count];
                processes[min_count] = z;
            }
        }

    }

}

