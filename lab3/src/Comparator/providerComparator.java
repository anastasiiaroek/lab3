package Comparator;

import java.util.Comparator;

import model.*;

public class providerComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone a1, Phone a2) {
        return a1.getProvider().compareTo(a2.getProvider());
    }
}
