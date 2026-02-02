package com.jgabriel.componentes.services;

import com.jgabriel.componentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        Double shipment = 0.0;

        if(order.getBasic() < 100.00){
            shipment = 20.00;
        }
        else if(order.getBasic() >= 100.00 && order.getBasic() < 200.00){
            shipment = 12.00;
        }
        else if(order.getBasic() >= 200.00){
            shipment = 0.00;
        }
        return shipment;
    }
}
