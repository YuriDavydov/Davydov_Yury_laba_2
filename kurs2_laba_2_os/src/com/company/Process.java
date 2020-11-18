package com.company;

import java.util.Random;

public  class Process {
    int number_process;
    int time;
    Thread[] threads;
    int thread_count;
    Process()
    {

        Random rnd = new Random();
        this.thread_count = rnd.nextInt(9+1);
        generate_threads();
    }
    public void generate_threads(){
        Random rnd = new Random();
        threads = new Thread[thread_count];
        for(int i = 0;i < threads.length;i++){
            int time_thread = rnd.nextInt(9+1);
            threads[i] = new Thread(i,time_thread);
            this.time += threads[i].time;
        }
    }
    public void start_process(){
        System.out.println("Процесс "+ number_process + " запущен,максимальное время выполнения: " + time + ", потоки: "+threads.length);
        for(int i = 0;i<thread_count;i++){
            threads[i].Start_thread();
        }
    }

}
