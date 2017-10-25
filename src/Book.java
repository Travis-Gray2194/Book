import java.util.ArrayList;

public class Book {


    private String booktitle;
    private ArrayList<Chapters>chaptersArrayList;

    public Book() {

        this.booktitle = booktitle;
        //Creating new Arraylist of Chapters
        this.chaptersArrayList= new ArrayList<Chapters>();


    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public ArrayList<Chapters> getChaptersArrayList() {
        return chaptersArrayList;
    }

    public void setChaptersArrayList(ArrayList<Chapters> chaptersArrayList) {
        this.chaptersArrayList = chaptersArrayList;
    }
}
