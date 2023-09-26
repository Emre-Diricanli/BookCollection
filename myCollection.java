import java.util.Scanner;
public class myCollection {
    public static void main(String[] args) {
        char selection;

        Scanner s = new Scanner(System.in);
        Item[] items = new Item [5];

        for(int i = 0; i <5; i++){
            System.out.println("Please enter B for Book or P for Periodical");
            selection = s.nextLine().charAt(0);
            if((selection == 'B')||((selection == 'b'))){
                Book b1 = new Book();
                int emptyInt;
                String emptyString;
                System.out.println("Please enter the name of the Book");
                emptyString = s.nextLine();
                b1.setTitle(emptyString);
                System.out.println("Please enter the author of the Book");
                emptyString = s.nextLine();
                b1.setAuthor(emptyString);
                System.out.println("Please enter the ISBN of the Book");
                emptyInt = s.nextInt();
                s.nextLine();
                b1.setIsbnNumber(emptyInt);
                items [i] = b1;
            } else if ((selection == 'P')||(selection == 'p')){
                Periodical p1 = new Periodical();
                int emptyInt;
                String emptyString;
                System.out.println("Please enter the name of Periodical");
                emptyString = s.nextLine();
                p1.setTitle(emptyString);
                System.out.println("Please enter the issue number");
                emptyInt = s.nextInt();
                s.nextLine();
                p1.setIssueNum(emptyInt);
                items [i] = p1;
            }
        }
        System.out.println("Your Items: ");
        for(int i = 0; i <5; i++){
            System.out.println(items [i].getListing());
        }

    }
}
