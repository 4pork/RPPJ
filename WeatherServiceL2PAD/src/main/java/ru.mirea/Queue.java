package ru.mirea;

import java.util.LinkedList;
//import java.util.Queue;

public class Queue {

   LinkedList<Task> queue;
    public Queue(){
        queue = new LinkedList<>();
        }

        public Task getFirstTask(){
        return this.queue.getFirst();
        }

        public int size(){
        return this.queue.size();
    }
    public void add(){}
}
