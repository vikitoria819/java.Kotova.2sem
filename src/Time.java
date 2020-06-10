public class Time<lublic> {
    private int h;
    private int m;

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public String show() {
        String hours = Integer.toString(h);
        String minute = Integer.toString(m);
        if (h < 10) { hours = "0" + hours;}
        if (m < 10) { minute = "0" + minute;}
        return hours + ":" + minute;
    }

    public boolean isMorning() {
        return( h >= 6 && h < 12);
    }

    public boolean isDay() {
        return( h >= 12 && h < 18);
    }

    public boolean isEvening() {
        return( h >= 18 && h < 24);
    }

    public boolean isNight() {
        return( h >= 0 && h < 6);
    }

    public String sayHello() {
        if (isMorning()) { return  "Доброе утро!";}
        else if (isDay()) {return "Добрый день!";}
        else if (isEvening()) {return "Добрый вечер!";}
        else {return  "Доброй ночи!";}
    }

    public String add(int n) {
        m = m + n;
        if (m > 60) {
            m = m % 60;
            h++;
            if (h > 23) { h = 0; }
        }
        return show();
    }

}
