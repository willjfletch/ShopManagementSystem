package com.arms;

/**
 * Represents Items to be sold as their own objects.
 *
 * @author William Fletcher
 *
 */
public class Item {

    int ID;
    String name;
    double value;

    /**
     * Constructor for creating Items.
     *
     * @param ID of item.
     * @param name of item.
     * @param value of item.
     */
    public Item(int ID, String name, double value) {

        this.ID = ID;
        this.name = name;
        this.value = value;

    }

    /**
     * toString method for items.
     *
     * @return item information in string format.
     */
    @Override
    public String toString(){
        return "This is item " + name;
    }

}
