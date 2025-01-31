package com.parkito.learnmicro.post.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Tolerate;

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
@Builder
@Data
public class Parcel implements Serializable {
    @Tolerate
    public Parcel() {
    }

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

    @Getter
    @AllArgsConstructor
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
    }
}