package postofficenew;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeNew {

    
    public static void main(String[] args) {
        Building b1 = new Building(10, 20);
        Officer officer1 = new Officer("nimal", 100, b1);
        Stamp s1 = new Stamp(5);
        Stamp s2 = new Stamp(10);
        List<Stamp> stamps = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stamps.add(new Stamp(5));
        }
        for (int i = 0; i < 100; i++) {
            stamps.add(new Stamp(10));
        }
    }
    
}
