package ru.gb.main_family_tree.file;


import java.io.IOException;
import java.io.Serializable;

public interface Writable extends Serializable {
    void save() throws IOException, ClassNotFoundException;
    Serializable load() throws IOException, ClassNotFoundException;
}
