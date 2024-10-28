package ua.edu.ucu.delivery;


import ua.edu.ucu.model.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}