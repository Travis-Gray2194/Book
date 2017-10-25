import java.util.ArrayList;

public class Chapters  {

    private String Chapter;

    ArrayList<Pages>pagesArrayList;

    public Chapters() {

        pagesArrayList = new ArrayList<Pages>();

    }


    public String getChapter() {
        return Chapter;
    }

    public void setChapter(String chapter) {
        Chapter = chapter;
    }

    public ArrayList<Pages> getPagesArrayList() {
        return pagesArrayList;
    }

    public void setPagesArrayList(ArrayList<Pages> pagesArrayList) {
        this.pagesArrayList = pagesArrayList;
    }

    public void addPages(Pages anPage){
        pagesArrayList.add(anPage);
    }


}
