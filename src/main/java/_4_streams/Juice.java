package _4_streams;

public class Juice {

    private final Integer volume;

    public Juice(Integer volume) {
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "volume=" + volume +
                '}';
    }
}
