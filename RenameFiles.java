import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        // Specify the folder path containing the files
        String folderPath = "D:\\Song\\Eng";

        // Create a File object for the folder
        File folder = new File(folderPath);

        // Check if the folder exists and is a directory
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return;
        }

        // Iterate through all the files in the folder
        for (File file : folder.listFiles()) {
            if (file.isFile()) { // Ensure it’s a file and not a directory
                // Replace underscores and "_-_" with spaces
                String newName = file.getName().replace("_-_", " ").replace("_", " ");
                File newFile = new File(folder, newName); // Create new File object with the new name

                // Rename the file
                if (file.renameTo(newFile)) {
                    System.out.println("Renamed: " + file.getName() + " -> " + newName);
                } else {
                    System.out.println("Failed to rename: " + file.getName());
                }
            }
        }

        System.out.println("File renaming complete!");
    }
}
