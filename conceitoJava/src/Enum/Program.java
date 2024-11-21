package Enum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main (String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy");
        Date date = new Date ();
        String dateString = simpleDateFormat.format(date);

        Order order = new Order (1080, dateString, OrderStatus.PENDING_PAYMENT);
        System.out.println (order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf ("DELIVERED");
        System.out.println (os1);
        System.out.println (os2);
    }
}
