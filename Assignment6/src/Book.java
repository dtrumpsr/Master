public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyRightDate;


    public Book(String bookTitle, String authorName, String publisherName,
                 int date) {
        title = bookTitle;
        author = authorName;
        publisher = publisherName;
        copyRightDate = date;
    }
 
    public Book() {
        title = "Citizen";
        author = "Anthony";
        publisher = "Picinini";
        copyRightDate = 2005;

    }
    public void setAuthor(String authorName) {
        author = authorName; }

    public String getAuthor() {
        return author; }
 
     public void setTitle(String bookTitle) {
        title = bookTitle; }

    public String getTitle() {
        return title; }

    public void setPublisher(String publisherName) {
        publisher = publisherName; }

    public String getPublisher() {
        return publisher;}
  
    public void setCopyRightDate(int date) {
        copyRightDate = date; }
 
    public int getCopyRightDate() {
        return copyRightDate; }
 
    public String toString() {
       return (title + "\t" + author + "\t" + publisher + "\t" + copyRightDate);
    }
}



