package com.parkito.learnmicro.post.dto;

import java.io.Serializable;

/**
 * @author Artem Karnov @date 11/6/2017.
 * artem.karnov@t-systems.com
 */
public class ParcelDTO implements Serializable {

    private long number;
    private String status;
    private double weight;
    private double price;
    private String userFrom;
    private String userTo;

    public ParcelDTO() {
    }

    public ParcelDTO(long number, String status, double weight, double price, String userFrom, String userTo) {
        this.number = number;
        this.status = status;
        this.weight = weight;
        this.price = price;
        this.userFrom = userFrom;
        this.userTo = userTo;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public String getUserTo() {
        return userTo;
    }

    public void setUserTo(String userTo) {
        this.userTo = userTo;
    }
}