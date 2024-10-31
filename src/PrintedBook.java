public class PrintedBook extends Title {
    private int pages;


    public PrintedBook(String name, int literatureTypePoints, int copies, int pages) {
        super(name, literatureTypePoints);
        this.copies = copies;
        this.pages = pages;
    }
}
