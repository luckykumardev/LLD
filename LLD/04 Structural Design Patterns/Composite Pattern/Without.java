// File Class
class File {
    private String name;
    private int size; // Size in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

// Folder Class
class Folder {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Folder> folders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        folders.add(folder);
    }

    public int getSize() {
        int totalSize = 0;
        for (File file : files) {
            totalSize += file.getSize();
        }
        for (Folder folder : folders) {
            totalSize += folder.getSize();
        }
        return totalSize;
    }

    public void printContents() {
        for (File file : files) {
            System.out.println(file.getName());
        }
        for (Folder folder : folders) {
            System.out.println(folder.name);
            folder.printContents(); // Recursively print contents of sub-folders
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create files and folders
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);

        Folder folder1 = new Folder("folder1");
        folder1.addFile(file1);
        folder1.addFile(file2);

        Folder folder2 = new Folder("folder2");
        folder2.addFolder(folder1); // Nested folder

        // Calculate size and print contents
        System.out.println("Total size: " + folder2.getSize() + " KB");
        folder2.printContents();
    }
}
