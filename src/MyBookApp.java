import java.util.Scanner;

public class MyBookApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter book title:");
        String bookTitle = userInput.nextLine();
        System.out.println("Enter book author:");
        String bookAuthor = userInput.nextLine();
        System.out.println("Enter book description:");
        String bookDescription = userInput.nextLine();
        System.out.println("Enter number of pages:");
        String numberOfPages = userInput.nextLine();

        Integer numberOfPagesInt;

        try{
            numberOfPagesInt = Integer.parseInt(numberOfPages);
            MyBook myBook = new MyBook(bookTitle, bookAuthor, bookDescription, numberOfPagesInt);
            System.out.println(myBook);
        }catch (NumberFormatException e){
            System.out.println("You have entered incorrect number of pages.");
        }



    }
}
