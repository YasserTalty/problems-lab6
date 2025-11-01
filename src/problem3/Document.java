package problem3;

public class Document {
    private static int count = 0;
    private int numRec;
    private String title;
    public Document(String title) {
        this.title = title;
        numRec = ++count;
    }
    public int getNumRec() {
        return numRec;
    }
    public void setNumRec(int numRec){
        this.numRec = numRec;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "Document [ numRec = "+numRec+", title = "+title+"]";
    }

}
