public class AudioBook extends Title {
    private durationInMinutes;

    public AudioBook(String name, int literatureTypePoints, int copies, int durationInMinutes) {
        super(name, literatureTypePoints);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes
    }

    protected double getPages() {
        return 0;
    }

    public int getDuration() {
        return 0;
    }

}
