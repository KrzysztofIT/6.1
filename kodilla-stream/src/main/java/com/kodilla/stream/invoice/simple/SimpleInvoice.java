package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public boolean removeItem(SimpleItem item) {
        return items.remove(item);
    }

    public double getValueToPay() {
        //System.out.println(items.stream().map(n -> n.getProduct().getProductName()).collect(Collectors.toList()).contains("Product 2"));
        //items.stream().map(n -> n.getProduct().getProductName()).collect(Collectors.toList()).contains("Product 2");
        return items.stream().collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}