package quotes;

public class Quote {
    public String quoteAuthor;
    public String author;

    public Quote(String quoteAuthor, String author) {
        this.quoteAuthor = quoteAuthor;
        this.author = author;
    }
    public String toString(){
        return String.format("%s was written by %s", quoteAuthor, author);
    }
}
