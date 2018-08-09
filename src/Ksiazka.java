public class Ksiazka {

    public final String author;
    public final String title;
    public final String description;
    public final Integer numberOfPages;

    public Ksiazka(String autor, String tytul, String opis, Integer iloscStron) {
        this.author = autor;
        this.title = tytul;
        this.description = opis;
        this.numberOfPages = iloscStron;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }
}
