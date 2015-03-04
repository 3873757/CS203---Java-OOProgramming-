/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author jambo
 */
import java.util.ArrayList;

public class Guarage {

    private Automobile a;
    private ArrayList<Item> items = new ArrayList<Item>();

    Guarage() {
        this.a = new Automobile();
    }

    public void store(Automobile a) {
        this.a = a;
    }

    public void store(Item a) {
        items.add(a);
    }

    public Automobile retrieve() {
        return this.a;
    }

    public Item retrieve(int index) {
        return items.get(index);
    }
}
