import java.io.File;
import java.util.Scanner;

public class NotesManager {

    // private boolean checkFolderExists(File folder){
    //     if()
    // }

    public static void createFolder(Scanner sc) {

        System.out.print("Enter path where to create : ");
        String folderPath = sc.nextLine();
        System.out.println("Enter folder name : ");
        String folderName = sc.nextLine();

        File folder = new File(folderPath + "/" + folderName);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created successfully ");
        }
        else{
            System.out.println("Folder already exists");
        }
    }

    public static void renameFolder(Scanner sc){
        System.out.println("Enter full path (e.g C:/path...)");
        String oldFolderPath = sc.nextLine();
        File oldFolder = new File(oldFolderPath);
        System.out.println("Enter folder name");

        System.out.println("Enter new folder name");
    }
}
