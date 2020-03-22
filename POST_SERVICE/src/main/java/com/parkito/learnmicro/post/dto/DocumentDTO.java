package com.parkito.learnmicro.post.dto;

import java.io.Serializable;

/**
 * @author Artem Karnov @date 11/6/2017.
 * artem.karnov@t-systems.com
 */
public class DocumentDTO implements Serializable {

    private String serial;
    private String number;
    private String email;

    public DocumentDTO() {
    }

    public DocumentDTO(String serial, String number, String email) {
        this.serial = serial;
        this.number = number;
        this.email = email;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
