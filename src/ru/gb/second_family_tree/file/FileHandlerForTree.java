package ru.gb.second_family_tree.file;

import ru.gb.second_family_tree.node.FamilyTree;

import java.io.*;

public class FileHandlerForTree implements Writable {
    private FamilyTree tree;
    public FileHandlerForTree(FamilyTree tree) throws IOException, ClassNotFoundException {
        this.tree = tree;
    }

    public FileHandlerForTree() throws IOException, ClassNotFoundException {
        this(new FamilyTree());
    }

    @Override
    public void save() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("tree.out"));
        objectOutputStream.writeObject(tree);
        objectOutputStream.close();
    }

    @Override
    public Serializable load() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("tree.out"));
        Serializable treeLoaded = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        return treeLoaded;
    }

}
