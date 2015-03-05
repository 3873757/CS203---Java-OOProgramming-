
package w2d4;

/**
 *
 * @author jambo
 */
public interface Asset {

    public abstract double getpurchaseprice();//when public abstract is removed no change

    public abstract double getcurrentValue(); //when public abstract is removed no change

    int amortize(int year);
}
