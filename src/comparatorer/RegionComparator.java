package comparatorer;

import Covid.Covid19Data;

import java.util.Comparator;


public class RegionComparator implements Comparator<Covid19Data> {

    public int compare(Covid19Data d1, Covid19Data d2) {
        return d1.getRegion().compareTo(d2.getRegion());
    }
}
