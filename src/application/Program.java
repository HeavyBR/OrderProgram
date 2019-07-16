package application;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program
{
    public static void main(String[] args)
    {
        Order javali = new Order();

        javali.setStatus(OrderStatus.PENDING_PAYMENT);
        System.out.println(javali);
    }
}
