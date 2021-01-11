import java.sql.Date;

public class Flight {
    private String model;//机型
    private Date departureTime;//起飞时间
    private Date fallTime;//降落时间
    private String qifeididian;//起飞地点
    private String mudidi;//目的地

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getFallTime() {
        return fallTime;
    }

    public void setFallTime(Date fallTime) {
        this.fallTime = fallTime;
    }

    public String getQifeididian() {
        return qifeididian;
    }

    public void setQifeididian(String qifeididian) {
        this.qifeididian = qifeididian;
    }

    public String getMudidi() {
        return mudidi;
    }

    public void setMudidi(String mudidi) {
        this.mudidi = mudidi;
    }
}
