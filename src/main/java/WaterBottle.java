public class WaterBottle {

    private int volume = 100;

    public int getVolume() {
        return volume;
    }

    public void drink() {
         this.volume = volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
