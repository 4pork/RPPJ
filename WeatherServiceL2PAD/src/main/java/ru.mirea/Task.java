package ru.mirea;
import java.util.Date;
public class Task {
    private int id;

    private Date date;

    private String city;

    private String weather;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", time='" + date + '\'' +
                ", city='" + city + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}

