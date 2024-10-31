import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    ArrayList<Title> getTitles() {
        return titles;
    }

}
