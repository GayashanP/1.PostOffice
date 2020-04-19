package postofficenew;

import java.util.List;

public class User {
    private final String name;
    private final int age;
    private Letter letter;
    private int moneyAmount;
    private List<Stamp> userStamps;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void setUserStamps(List<Stamp> userStamps) {
        this.userStamps = userStamps;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Letter getLetter() {
        return letter;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public List<Stamp> getUserStamps() {
        return userStamps;
    }
}
