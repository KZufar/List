package ru1.ivmiit.lists;

import ru1.ivmiit.Human;

import java.util.Comparator;

public class HumansIdComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getId() - o2.getId();
    }
}
