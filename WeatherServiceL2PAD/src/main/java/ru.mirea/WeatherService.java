import java.util.LinkedList;
import java.util.Queue;

public class WeatherService {
    public static void main(String[] args) {
        Queue<Task> enterQ = new LinkedList<>();
        Task task = new Task();
        task.setId(1);
        task.setTime("11:43");
        task.setCity("Moscow");
        //task.setWeather("-1,C");
        enterQ.add(task);
        System.out.println(enterQ);
        Queue<Task> exitQ = new LinkedList<>();

    }



}
