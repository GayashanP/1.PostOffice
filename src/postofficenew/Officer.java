package postofficenew;

import java.util.Collections;
import java.util.List;

public class Officer {
    private final String name;
    private final int age;
    private final Building building;

    public Officer(String name, int age, Building building) {
        this.name = name;
        this.age = age;
        this.building = building;
    }

    public boolean receivedLetter(Letter letter) {
        return true;
    }

    public List<Stamp> sellStamps (int moneyAmount) {
        return Collections.emptyList();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Building getBuilding() {
        return building;
    }
}
