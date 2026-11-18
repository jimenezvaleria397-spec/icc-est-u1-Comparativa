public class Results {
private String fuctionName;
private long duration;
private String sample;

public Results(String fuctionName, long duration, String sample) {
    this.fuctionName = fuctionName;
    this.duration = duration;
    this.sample = sample;
}
public String getFuctionName() {
    return fuctionName;
}
public void setFuctionName(String fuctionName) {
    this.fuctionName = fuctionName;
}
public long getDuration() {
    return duration;
}
public void setDuration(long duration) {
    this.duration = duration;
}
public String getSample() {
    return sample;
}
public void setSample(String sample) {
    this.sample = sample;
}
@Override
public String toString() {
    return "Results [fuctionName=" + fuctionName + ", duration=" + duration / 1000000000.0 + ", sample=" + sample + "]";
}

}
