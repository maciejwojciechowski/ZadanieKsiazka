public class MyBook {

    public final Title title;
    public final Author author;
    public final Desc description;
    public final Integer numberOfPages;

    public MyBook(String title, String author, String description, Integer numberOfPages) {
        this.title = new Title(title);
        this.author = new Author(author);
        this.description = new Desc(description);
        this.numberOfPages = numberOfPages;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyBook Details:\n" +
                "Title = " + title.getTitle() + '\n' +
                "Author = " + author.getAuthor() + '\n' +
                "Description = " + description.getDesc() + '\n' +
                "Number of pages = " + numberOfPages;
    }
}
