import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("--------- Welcome to note make application ---------");

        Scanner sc = new Scanner(System.in);

        File notesAppFolder = new File("All Notes");
        notesAppFolder.mkdir();

        mainLoop: while(true){
            System.out.println("\n\n1. Make folder");
            System.out.println("2. Enter folder");
            System.out.println("3. Exit folder");
            System.out.println("4. Rename folder");
            System.out.println("5. Delete Folder");
            System.out.println("6. Show current path");
            System.out.println("7. Show all files & folders");
            System.out.println("8. Create file");
            System.out.println("9. Read file");
            System.out.println("10. Edit file");
            System.out.println("11. Remove file");
            System.out.println("12. Rename file ");
            System.out.println("13. Exit");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine()); // safer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
                continue;
            }

            switch (choice) {
                case 1 -> NotesManager.createFolder(sc);
                case 2 -> NotesManager.enterFolder(sc);
                case 3 -> NotesManager.exitFolder();
                case 4 -> NotesManager.renameFolder(sc);
                case 5 -> NotesManager.deleteFolder(sc);
                case 6 -> NotesManager.showCurrentPath();
                case 7 -> NotesManager.showAllFilesAndFolders();
                case 8 -> NotesManager.createFile(sc);
                case 9 -> NotesManager.readFile(sc);
                case 10 -> NotesManager.updateFile(sc);
                case 11 -> NotesManager.removeFile(sc);
                case 12 -> NotesManager.renameFile(sc);
                case 13 -> {
                    break mainLoop;
                }
                default -> System.out.println("Invalid input!!!");
            }
        }

        sc.close();
    }
} 