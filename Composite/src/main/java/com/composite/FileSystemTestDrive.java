package com.composite;

public class FileSystemTestDrive {

    public static void main(String[] args) {
        FileSystemComponent rootDirectory = new Directory("Root");
        FileSystemComponent fruitsDirectory = new Directory("Fruits");
        FileSystemComponent animalDirectory = new Directory("Animal");
        FileSystemComponent felineDirectory = new Directory("Feline");

        rootDirectory.add(fruitsDirectory);
        rootDirectory.add(animalDirectory);

        fruitsDirectory.add(new File("Appple", "red and juicy."));
        fruitsDirectory.add(new File("Banana", "yellow and sweet."));
        fruitsDirectory.add(new File("Lemon", "yellow and sour."));

        animalDirectory.add(felineDirectory);
        felineDirectory.add(new File("Lion", "King of animal."));
        felineDirectory.add(new File("Tiger", "Has cool color pattern."));

        rootDirectory.print(0);
        rootDirectory.getChildren();
        rootDirectory.remove(0);
        rootDirectory.getChildren();

        // What happens we call getChildren() on leaf? (we don't override the method in leaf class)
        FileSystemComponent file = new File("sample", "this is leaf");
        file.getChildren(); // leaf calls default behavior, doing nothing
    }
}
