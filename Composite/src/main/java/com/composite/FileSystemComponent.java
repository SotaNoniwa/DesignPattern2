package com.composite;

public abstract class FileSystemComponent {

    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(int indentLevel) {
        throw new UnsupportedOperationException();
    }

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(int index) {
        throw new UnsupportedOperationException();
    }

    // Instead of throwing exception, we do nothing by default.
    // Doing nothing makes sense because leaf has no child.
    public void getChildren() {
    }
}
