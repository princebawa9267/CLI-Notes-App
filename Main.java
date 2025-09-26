import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("--------- Welcome to note make application ---------");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Make folder. ");
            System.out.println("2. Rename folder. ");
            System.out.println("2. Show all files");
            System.out.println("3. Create file");
            System.out.println("4. Read file");
            System.out.println("5. Edit file");
            System.out.println("6. Remove file");
            System.out.println("7. Rename file ");
            System.out.println("7. Exit");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine()); // safer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
                continue;
            }

            switch (choice) {
                case 1 -> 
            }
        }
    }
} 