package problem3;

public class Book extends Document{
    private String author;
    private int nbrPages;
    public Book(String author,String title,int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getNbrPages(){
        return nbrPages;
    }
    public void setNbrPages(int nbrPages){
        this.nbrPages = nbrPages;
    }
    @Override
    public String toString(){
        return "Book [numRec=" + getNumRec() + ", title=" + getTitle() + ", author=" + author + ", pages=" + nbrPages + "]";
    }
}
