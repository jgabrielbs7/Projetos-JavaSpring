package com.jgabriel.componentes.services;

import com.jgabriel.componentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return (order.getBasic()) - (order.getBasic() * (order.getDiscount() * 0.01)) + shippingService.shipment(order);
    }
}
