package ru1.ivmiit.lists;

import ru1.ivmiit.Human;

import java.util.Comparator;

/**
 * Created by User on 07.03.2017.
 */
public class HumanNameComaparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        int k = (o1.getName()).compareTo(o2.getName());
        if(k == 0) {
            return o1.compareTo(o2);
        }
        else {
            return k;
        }
    }
    }

