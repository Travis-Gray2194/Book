import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book mybook = new Book();
        mybook.getBooktitle();
        Scanner keyboard = new Scanner(System.in);

        Chapters newchapter = new Chapters();
        newchapter.getChapter();


        Pages newpage = new Pages();
        newpage.getPages();

        int option = 0;
        String entered = "y";
        String yes = "";


        System.out.println("Would you like to create a new Book");
        yes = keyboard.nextLine();

        System.out.println("Please Enter New Book Title ");
        mybook.setBooktitle(keyboard.nextLine());


            do {


                System.out.println("--------Book Menu Options-------");
                System.out.println("1. Add a Chapter ");
                System.out.println("2. Add a Page ");
                System.out.println("3. Print Book Contents");
                System.out.println("4. Quit");
                option = keyboard.nextInt();
                keyboard.nextLine();

                if (option == 1) {

                    System.out.println("Enter Chapter Title to add to your Book");
                    newchapter = new Chapters();
                    newchapter.setChapter(keyboard.nextLine());
                }

                if (option == 2) {

                    System.out.println("Enter a Page title to add to your Book ");
                    newpage = new Pages();
                    newpage.setPages(keyboard.nextLine());
                }

                if (option == 3) {

                    System.out.println("Book Title: " + mybook.getBooktitle() + "Page Title: " + newpage.getPages() + "Chapter Title: " + newchapter.getChapter());

                }

                System.out.println("Do you want to continue working on your book y for Yes/and n for No");
                entered = keyboard.nextLine();
            } while (entered.equalsIgnoreCase("y")||entered.equalsIgnoreCase("n"));
        }

    }

