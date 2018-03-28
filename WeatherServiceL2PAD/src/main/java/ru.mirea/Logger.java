package ru.mirea;

public class Logger {
    private Queue outQueue;

    public Logger(){}

    public void setOutQueue (Queue outQueue){

        this.outQueue = outQueue;
    }
    public void print(){
        Task log;
        for(int i = 0; i < this.outQueue.size(); i++){
            log = this.outQueue.getFirstTask();
            System.out.println("City:" + log.getCity());
            System.out.println("Time:" + log.getDate());
            System.out.println("Weather:" + log.getWeather());
        }
    }
}
