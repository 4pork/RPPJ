package ru.mirea;

import javafx.concurrent.Task;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {


    public void main(String[] args) {

        Queue<Task> inQueue = new ArrayBlockingQueue<>(1000);

        Queue<Task> outQueue = new ArrayBlockingQueue<>(1000);

        TaskGenerator taskGenerator = new TaskGenerator(100, inQueue);

        taskGenerator.process();

        TaskExecutor taskExecutor = new TaskExecutor(inQueue, outQueue);

        taskExecutor.process();

        QueueReader reader = new QueueReader(outQueue);

        reader.read();

    }

}
