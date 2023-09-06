import java.util.UUID;

public class Books {
    private String title;
    private String author;
    private int yearOfIssue;
    private String bookCode;

    private UUID uniqueCopyID;
    private int copies;

    public Books(){
        this.uniqueCopyID = UUID.randomUUID();

    }
    public Books(String title, String author, int yearOfIssue, String bookCode, UUID uniqueCopyID, int copies) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.bookCode = bookCode;
        this.uniqueCopyID = uniqueCopyID;
        this.copies = copies;
    }

    public UUID getUniqueCopyID() {
        return uniqueCopyID;
    }

    public void setUniqueCopyID(UUID uniqueCopyID) {
        this.uniqueCopyID = uniqueCopyID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
