package problem3;

public class TextBook extends Book{
    private String level;
    public TextBook(String title, String author,int nbrPages,String language) {
        super(title,author,nbrPages);
        this.level = level;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Textbook [numRec=" + getNumRec() + ", title=" + getTitle() + ", author=" + getAuthor() +
                ", pages=" + getNbrPages() + ", level=" + level + "]";
    }

}
