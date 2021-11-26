package ru.job4j.collection;

import java.util.*;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order
                : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("0001", "Zenbook"),
                new Order("0002", "TVBox"),
                new Order("0003", "Phone")
        );
        HashMap<String, Order> mapOrders = process(orders);
        for (Map.Entry<String, Order> entry
                : mapOrders.entrySet()) {
            System.out.printf("Number: %s" + " Order: %s\n",
                    entry.getKey(), entry.getValue());
        }
        System.out.println("**************************************************");
        Set<String> keys = mapOrders.keySet();
        Collection<Order> values = mapOrders.values();
        System.out.println(keys);
        System.out.println(values);
    }
}
