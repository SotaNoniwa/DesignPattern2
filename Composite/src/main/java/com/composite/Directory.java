package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void print(int indentLevel) {
        String indent = " ".repeat(indentLevel);
        System.out.println(indent + name + " directory:");
        for (FileSystemComponent child : children) {
            child.print(indentLevel + 2);
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(int index) {
        children.remove(index);
    }

    @Override
    public void getChildren() {
        if (children.isEmpty()) {
            return;
        }
        StringBuilder builder = new StringBuilder("[");
        for (FileSystemComponent child : children) {
            builder.append(child.getName() + ", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        System.out.println(builder);
    }

}
