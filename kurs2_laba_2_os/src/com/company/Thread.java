package com.company;

public class Thread {
    int time;
    int number;
    Thread(int num,int t_work){//конструктор
        this.time = t_work;
        this.number = num;
    }
    public void Start_thread(){
        for(int i = 0;i<time;++i){
            System.out.println("Поток "+ number + " запущен,максимальное время выполнения: " + time + ", текущий: "+(i+1));
        }
    }
}
