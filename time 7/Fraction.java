import java.time.*;
import java.util.*;

public class Time {
    public int hour;
    public int minute;
    public int second;

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Invalid hour");
        }
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Invalid minute");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Invalid second");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new DateTimeException("Invalid hour");
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new DateTimeException("Invalid minute");
        this.minute = minute;
    }
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new DateTimeException("Invalid second");
        this.second = second;
    }
    public void addHours(int hours) {
        if (hours < 0)
            throw new DateTimeException("Invalid hour");
        this.hour = (this.hour + hours) % 24;
    }
    public void addMinutes(int minutes) {
        if (minutes < 0)
            throw new DateTimeException("Invalid minute");
        this.minute += minutes;
        this.hour += minute / 60;
        this.hour %=  24;
        this.minute %= 60;
    }
    public void addSeconds(int seconds) {
        if (seconds < 0)
            throw new DateTimeException("Invalid second");
        this.second += seconds;
        this.minute += second / 60;
        this.second %= 60;
        this.hour = minute / 60;
        this.hour %= 24;
        this.minute %= 60;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}


