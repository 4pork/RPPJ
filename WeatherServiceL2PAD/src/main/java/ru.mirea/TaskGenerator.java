package ru.mirea;

//import javafx.concurrent.Task;

import java.util.Date;
import java.util.Queue;
import java.util.Random;


 class TaskGenerator {
     private Queue inQueue;
     private int NumGen;

    public TaskGenerator(Queue inQueue){
        this.inQueue = inQueue;
    }
    public TaskGenerator(int NumGen){
        this.NumGen = NumGen;
    }

    public void generate() {
        Task task;
        Random random = new Random();
        long ms;
        for(int i =0 ; i < NumGen; i++){
            task = new Task();
            ms = -946771200000L +(Math.abs(random.nextLong()) % (100*365*24*60*60*1000));
            task.setDate(new Date(ms));
            this.inQueue.add(task);
        }


    }
}
