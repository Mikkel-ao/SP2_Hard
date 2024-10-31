import java.util.ArrayList;

public abstract class Title {
    private String name;
    protected int literatureTypePoints;
    protected double rate;

    public Title(String name, int literatureTypePoints) {
        this.name = name;
        this.literatureTypePoints = literatureTypePoints;
    }

    // Converting points here instead of the Switch in SP2 easy?
    private float convertLiteratureType() {
        return 0;
    }

    public double calculateRoyalty() {
        return 0; // return calculatePoints() * rate;
    }

    protected double getPages() {
        return 0;
    }

    protecte
}
