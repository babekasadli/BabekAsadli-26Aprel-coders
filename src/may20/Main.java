package may20;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("grandfather",
                new Folder("father",
                        new Folder("son", null)));

        String path = "/grandfather/father/son";
        Folder result = pathToFolder(folder, path);
        System.out.println(result);
    }

    public static Folder pathToFolder(Folder folder, String path) {
        if (path.isEmpty()) {
            return folder;
        }

        int index = path.indexOf('/');
        String currentName;
        String remainingPath;
        if (index >= 0) {
            currentName = path.substring(0, index);
            remainingPath = path.substring(index + 1);
        } else {
            currentName = path;
            remainingPath = "";
        }

        if (folder != null && folder.getName().equals(currentName)) {
            if (remainingPath.isEmpty()) {
                return folder;
            } else {
                return pathToFolder(folder.getSubFolder(), remainingPath);
            }
        } else {
            return null;
        }
    }
}
