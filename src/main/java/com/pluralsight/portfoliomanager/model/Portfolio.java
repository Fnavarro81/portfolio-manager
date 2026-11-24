package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> items;

    public Portfolio(String name, String owner, List<Valuable> items) {
        this.name = name;
        this.owner = owner;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getItems() {
        return items;
    }

    public void setItems(List<Valuable> items) {
        this.items = items;
    }

    public void add(Valuable valuable) {
        items.add(Objects.requireNonNull(valuable, "Valuable item must not be null"));
    }

    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        if (items == null) {
            return total;
        }
        for (Valuable item : items) {
            if (item != null && item.getValue() != null) {
                total = total.add(item.getValue());
            }
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (items == null || items.isEmpty()) {
            return null;
        }
        Valuable currentHighestValue = items.get(0);
        for (Valuable item : items) {
            if (item != null && item.getValue() != null) {
                if (currentHighestValue == null || currentHighestValue.getValue() == null || item.getValue().compareTo(currentHighestValue.getValue()) > 0) {
                    currentHighestValue = item;
                }
            }
        }
        return currentHighestValue;
    }

    public Valuable getLeastValuable() {
        if (items == null || items.isEmpty()) {
            return null;
        }
        Valuable currentLowestValue = items.get(0);
        for (Valuable item : items) {
            if (item != null && item.getValue() != null) {
                if (currentLowestValue == null || currentLowestValue.getValue() == null || item.getValue().compareTo(currentLowestValue.getValue()) < 0) {
                    currentLowestValue = item;
                }
            }
        }
        return currentLowestValue;
    }
}
