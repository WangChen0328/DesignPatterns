package Memento;

import java.util.ArrayList;

/**
 * @author wangchen
 * @date 2018/5/24 11:18
 */
public class Memento {

    int money;

    ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    int getMoney() {
        return money;
    }

    ArrayList getFruits() {
        return (ArrayList) fruits.clone();
    }
}
