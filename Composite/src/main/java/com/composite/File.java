package com.composite;

public class File extends FileSystemComponent {

    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public void print(int indentLevel) {
        String indent = " ".repeat(indentLevel);
        System.out.println(indent + name + ": " + content);
    }
}
