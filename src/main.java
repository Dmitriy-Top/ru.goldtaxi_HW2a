import Entity.*;
import Utilities.*;

import java.util.*;

/**
 * Created by дима on 30.10.2016.
 */
public class main {
    public static void main(String[] args) {
        List<Car> carArrayList = Collections.synchronizedList(Initialization.initCarArray());
        new CarWorkEmulator(carArrayList);
        while (true) {
            Order order = OrderReader.orderRead();
            new OrderWaiter(order, carArrayList);
        }
    }
}
