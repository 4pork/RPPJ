public class Task {
    private int id;

    private String time;

    private String city;

    private String weather;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
                ", time='" + time + '\'' +
                ", city='" + city + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}

