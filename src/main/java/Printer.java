


public class Printer {

    private int sheets = 10;
    private int tonerVolume = 100;

    public void print(int pages, int numCopies) {

        int paperRequired = pages * numCopies;

        if(paperRequired > sheets){
            System.out.println("There is not enough paper");
        } else {

            this.sheets = sheets - paperRequired;

            this.tonerVolume = tonerVolume - paperRequired;
        }
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return tonerVolume;
    }
}
