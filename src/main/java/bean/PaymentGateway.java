package bean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentGateway {

    private Order order;

    public Order getOrder() {
        return order;
    }

    @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}