package may20;
public class Folder {
    private String name;
    private Folder subFolder;

    public Folder(String name, Folder subFolder) {
        this.name = name;
        this.subFolder = subFolder;
    }

    public String getName() {
        return name;
    }

    public Folder getSubFolder() {
        return subFolder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subFolder=" + subFolder +
                '}';
    }
}

