package Utilities;

import Entity.Car;
import Entity.Order;


/**
 * Created by дима on 30.10.2016.
 */
public class OrderReader {
    public static Order orderRead() {
        Order order = null;
        boolean isCorrectOrder = false;
        while (!isCorrectOrder) {
            String orderText = Reader.getReader().nextLine();
            String orderFields[] = orderText.split("\\|");
            if (checkOrderFieldsIsCorrect(orderFields)) {
                order = new Order(orderFields[0], orderFields[1], Boolean.parseBoolean(orderFields[2]), Boolean.parseBoolean(orderFields[3]), Integer.parseInt(orderFields[4]));
            } else {
                System.out.println("Заявка не корректна");
                System.out.println("Пример заявки: Ленина 9|Мира 13|true|false|0");
            }
            if (order != null) isCorrectOrder = true;
        }

        return order;
    }

    private static boolean checkOrderFieldsIsCorrect(String[] orderFields) {
        boolean isCorrect = true;
        if (orderFields.length < 5) isCorrect = false;
        try {
            if (orderFields[0].length() == 0) isCorrect = false;
            if (orderFields[1].length() == 0) isCorrect = false;
            if (!"true".equals(orderFields[2]) && !"false".equals(orderFields[2])) isCorrect = false;
            if (!"true".equals(orderFields[3]) && !"false".equals(orderFields[3])) isCorrect = false;
            if (!(Car.TYPE_OF_CLASS_BUSYNESS == Integer.parseInt(orderFields[4])) && !(Car.TYPE_OF_CLASS_ECONOMIC == Integer.parseInt(orderFields[4])))
                isCorrect = false;
        } catch (NumberFormatException e) {
            isCorrect = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            isCorrect = false;
        }
        return isCorrect;
    }

}

