import java.util.ArrayList;
import java.util.Iterator;

public class Main implements GenPrintBox {
    public static void main(String[] args) {
        Box <Fruit> b=GenPrintBox.getFruitBox();
        System.out.println("Состав корзины:");
        GenPrintBox.printBox(b);
    }

}
