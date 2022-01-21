package GSM;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.Date;

public class Call {
    private LocalDateTime date;
    private String dialedNumber;
    private Duration duration;
    private Temporal start;
    private Temporal end;

    public Call(String dialedNumber) {
        this(dialedNumber,LocalDateTime.now(),0);
    }
    public Call(String dialedNumber,int second){
        this(dialedNumber,LocalDateTime.now(),second);
    }
    public Call(String dialedNumber,LocalDateTime date,int second){
        this.dialedNumber = dialedNumber;
        this.date = date;
        this.duration = Duration.ofSeconds(second);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDialedNumber() {
        return dialedNumber;
    }

    public void setDialedNumber(String dialedNumber) {
        this.dialedNumber = dialedNumber;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Temporal getStart() {
        return start;
    }

    public void setStart(Temporal start) {
        this.start = start;
    }

    public Temporal getEnd() {
        return end;
    }

    public void setEnd(Temporal end) {
        this.end = end;
    }



    public void start() {
        setStart(LocalDateTime.now());
    }

    public void end() {
        setEnd(LocalDateTime.now());
        calculateDuration(start,end);
    }

    private void calculateDuration(Temporal start,Temporal end) {
        setDuration(Duration.between(start,end));
    }

    @Override
    public String toString() {
        return "Call{" +
                "date=" + date +
                ", dialedNumber='" + dialedNumber + '\'' +
                ", duration=" + duration.getSeconds() +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
