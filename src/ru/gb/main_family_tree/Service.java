package ru.gb.main_family_tree;

import ru.gb.main_family_tree.file.FileHandlerForTree;
import ru.gb.main_family_tree.node.FamilyTree;
import ru.gb.main_family_tree.person.Human;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<FamilyTree> familyTreesList;
    private int treeIndex;

    public Service(List<FamilyTree> familyTreesList) {
        this.familyTreesList = familyTreesList;

        if (!familyTreesList.isEmpty()) {
            System.out.printf("Добавлено древо с индесом: %d", treeIndex);
            this.treeIndex++;
            System.out.println();
        }
    }

    public Service() {
        this(new ArrayList<>());
    }

    public void addFamilyTree(FamilyTree tree) {
        familyTreesList.add(tree);
        System.out.printf("Добавлено древо с индесом: %d", treeIndex);
        this.treeIndex++;
        System.out.println();
    }

    public void addPerson(Human person, int treeIndex) {
        FamilyTree needTree = familyTreesList.get(treeIndex);
        needTree.add(person);
    }

    public void createEmptyFamilyTree() {
        familyTreesList.add(new FamilyTree());
        System.out.printf("Создано пустое древо с индесом: %d", treeIndex);
        this.treeIndex++;
        System.out.println();
    }

    public Human getByName(String name, int treeIndex) {
        FamilyTree tree = familyTreesList.get(treeIndex);
        return tree.getByName(name);
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();

        for (FamilyTree tree : familyTreesList) {
            int index = getTreeIndex(tree);


            stringBuilder.append("\n");
            stringBuilder.append("-----------------------");
            stringBuilder.append("Индекс древа в списке: ");
            stringBuilder.append(index);
            stringBuilder.append("-----------------------");
            stringBuilder.append("\n");

            stringBuilder.append(tree.getInfo());
        }

        return stringBuilder.toString();
    }

    public int getTreeIndex(FamilyTree tree) {
        return this.familyTreesList.indexOf(tree);
    }

    public List<FamilyTree> getFamilyTreesList() {
        return familyTreesList;
    }

    public void saveTreesInfo(FileHandlerForTree fhTree) throws IOException, ClassNotFoundException {
        fhTree = new FileHandlerForTree(this.familyTreesList);
        fhTree.save();
    }

    public List<FamilyTree> loadTreesInfo(FileHandlerForTree fhTree) throws IOException, ClassNotFoundException {
        return (List<FamilyTree>) fhTree.load();
    }
}
