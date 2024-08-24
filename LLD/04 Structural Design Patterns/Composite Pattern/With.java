// Component Interface
interface FileSystemComponent {
    void showDetails();
    int getSize();
}

// File Class
class File implements FileSystemComponent {
    private String name;
    private int size; // Size in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}

// Folder Class
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create files and folders
        FileSystemComponent file1 = new File("file1.txt", 10);
        FileSystemComponent file2 = new File("file2.txt", 20);

        Folder folder1 = new Folder("folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("folder2");
        folder2.addComponent(folder1); // Nested folder

        // Calculate size and print contents
        System.out.println("Total size: " + folder2.getSize() + " KB");
        folder2.showDetails();
    }
}
