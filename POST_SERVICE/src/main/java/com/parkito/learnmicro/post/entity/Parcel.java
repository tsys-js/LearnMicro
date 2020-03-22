package com.parkito.learnmicro.post.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Artem Karnov @date 11/6/2017.
 * artem.karnov@t-systems.com
 */
@Entity
public class Parcel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long parcelId;

    @Column(nullable = false, unique = true)
    private long number;

    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String userFrom;

    @Column(nullable = false)
    private String userTo;

    public enum Status {
        DELIVERED("1"),
        IN_PROCESS("2"),
        READY("3"),
        UNKNOWN("4");

        private String code;

        public static Status fromCode(String code) {
            for (Status codeType : values()) {
                if (codeType.code.equals(code)) {
                    return codeType;
                }
            }
            throw new IllegalArgumentException("No such value for id " + code);
        }

        Status(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public Parcel() {
    }

    public Parcel(long number, Status status, double weight, double price, String userFrom, String userTo) {
        this.number = number;
        this.status = status;
        this.weight = weight;
        this.price = price;
        this.userFrom = userFrom;
        this.userTo = userTo;
    }

    public long getParcelId() {
        return parcelId;
    }

    public void setParcelId(long parcelId) {
        this.parcelId = parcelId;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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