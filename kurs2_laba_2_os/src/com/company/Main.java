package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Process[] processes;
        Random rnd = new Random();
        int z = rnd.nextInt(9+1);
        processes = new Process[z];

        Task_planer planer = new Task_planer(processes);
        planer.Start_planer();
    }


}
