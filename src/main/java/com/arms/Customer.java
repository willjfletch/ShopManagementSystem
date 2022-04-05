package com.arms;

/**
 * Store customer information as its own object.
 *
 * @author William Fletcher
 */
public class Customer {

    public String userName;
    public String passWord;
    public String name;
    public String[] address;

    public Customer(String userName, String passWord, String name, String[] address) {

        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.address = address;
    }

}
