import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class NotesManager {

    private static String path = "All Notes";

    // 1.
    public static void createFolder(Scanner sc) {

        // Here now i will not use Enter path to create folder because it create
        // inconvenience
        // to the new users. So that's why here now i will use the 'All Notes' folder to
        // create the
        // files and folder.

        // System.out.print("Enter path where to create : ");
        // String folderPath = sc.nextLine();

        System.out.print("Enter folder name : ");
        String folderName = sc.nextLine();

        File folder = new File(path +"/"+ folderName);

        // mkdirs is used because there we can create nested folders
        if (folder.mkdirs()) {
            System.out.println("Folder created successfully ");
        } else {
            System.out.println("Folder already exists");
        }
    }

    // 2
    public static void enterFolder(Scanner sc) {
        System.out.print("Enter folder name : ");
        String folderName = sc.nextLine();
        File folder = new File(path + "/" + folderName);
        if (folder.exists()) {
            path = path + "/" + folderName;
            System.out.println("New path " + folder.getAbsolutePath());
        } else {
            System.out.println("You have entered the wrong folder name ");
        }
    }

    // 3
    public static void exitFolder() {
        if (path == "All Notes") {
            System.out.println("You are not allowed to exit this folder.");
            return;
        }
        path = path.substring(0, path.lastIndexOf("/"));
        File file = new File(path);
        System.out.println("New path : " + file.getAbsolutePath());
    }

    // 4
    public static void renameFolder(Scanner sc) {
        System.out.print("Enter folder name : ");
        String oldFolderName = sc.nextLine();
        File oldFolder = new File(path +"/"+ oldFolderName);
        if (!oldFolder.exists()) {
            System.out.println("Wrong Folder path!!!");
            return;
        }
        System.out.print("Enter new folder name");
        String newFolderName = sc.nextLine();
        File newFolder = new File(path + "/" + newFolderName);
        if(newFolder.exists()){
            System.out.println("This named file already exists..");
        }
        else{
            oldFolder.renameTo(newFolder);
            System.out.println("Renamed successfully");
        }
    }

    // 5
    public static void deleteFolder(Scanner sc) {
        System.out.print("Enter folder name : ");
        String folderName = sc.nextLine();
        File folder = new File(path + "/" + folderName);
        if(folder.exists() && folder.isDirectory()){
            if(folder.delete()){
                System.out.println(folderName + " is deleted.");
            }
            else{
                try{
                    for(File file : folder.listFiles()){
                        file.delete();
                    }
                    folder.delete();
                    System.out.println(folderName + " is deleted successfully");
                }
                catch(Exception e){
                    System.out.println("Make sure this folder's subfolder are empty");
                }
                
            }
        }
        else{
            System.out.println("Folder not exists");
        }
    }

    // 6
    public static void showCurrentPath() {
        File file = new File(path);
        System.out.println("Current location : " + file.getAbsolutePath());
    }

    // 7
    public static void showAllFilesAndFolders() {
        File folder = new File(path);
        for (File file : folder.listFiles()) {
            String type = (file.isFile()) ? "File" : "Folder";
            System.out.println(type + " : " + file.getName());
        }
    }

    // 8
    public static void createFile(Scanner sc){
        try {
            System.out.print("Enter file name with format (like :- myText.txt) : ");
            String fileName = sc.nextLine();
            File file = new File(path + "/" + fileName);
            if (file.createNewFile()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                System.out.println("Start typing your notes (type 'exit' to stop):");
                while(true){
                    String line = sc.nextLine();
                    if(line.equalsIgnoreCase("exit")){
                        break;
                    }
                    bw.write(line);
                    bw.newLine();
                }
                bw.close();
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addText(){
        System.out.println("Do you want to append or rewrite");
    }

    // 9
    public static void readFile(Scanner sc){
        
    }
}
