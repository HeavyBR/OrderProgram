package entities;

import entities.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;

public class Order
{
    private Date moment = new Date();
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();


    public Order(){ }

    public Order(Date moment, OrderStatus status, Client client)
    {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public Client getClient()
    {
        return client;
    }

    public  void setClient(Client client)
    {
        this.client = client;
    }

    public void addItem(OrderItem item)
    {
        items.add(item);
    }

    public void removeItem(OrderItem item)
    {
        items.remove(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", items=" + items +
                '}';
    }
}
