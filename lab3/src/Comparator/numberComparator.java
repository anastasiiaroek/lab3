package Comparator;

import java.util.Comparator;

import model.*;

public class numberComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone a1, Phone a2) {
        return a1.getNumber().compareTo(a2.getNumber());
    }
}
