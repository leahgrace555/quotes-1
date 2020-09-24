package quotes;

public class Quote {
    public String text;
    public String author;

    public Quote(String quoteAuthor, String author) {
        this.text = quoteAuthor;
        this.author = author;
    }
    public String toString(){
        return String.format("%s was written by %s", text, author);
    }
}
