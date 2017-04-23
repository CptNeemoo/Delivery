package Delivery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by LevelNone on 20.04.2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private UUID id;
    private Integer number;
    private Customer customer;
    private String address;
    private OrderPaymentMethod paymentMethod;
    private List<Burger> burgers;


    public Integer getOrderPrice()
    {
        return burgers.stream().mapToInt(Burger::getPrice).sum();
    }
}