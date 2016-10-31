import Entity.*;
import Utilities.*;

import java.util.ArrayList;

/**
 * Created by дима on 30.10.2016.
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = Initialization.initCarArray();

        while (true) {
            Order order = OrderReader.orderRead();
            CarSearch.searchFreeCar(carArrayList, order);

        }
    }
}
