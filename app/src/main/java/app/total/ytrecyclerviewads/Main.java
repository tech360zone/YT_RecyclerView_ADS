package app.total.ytrecyclerviewads;

import java.util.Date;

public class Main {

    private String name;
    private Date date;

    public Main() {
    }

    public Main(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
