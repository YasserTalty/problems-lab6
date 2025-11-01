package problem3;

public class Magazine extends Document {
    private String month;
    private int year;
    public Magazine(String month,String title, int year){
        super(title);
        this.month = month;
        this.year = year;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString(){
        return "Magazine [numRec=" + getNumRec() + ", title=" + getTitle() + ", month=" + month + ", year=" + year + "]";
    }
}
