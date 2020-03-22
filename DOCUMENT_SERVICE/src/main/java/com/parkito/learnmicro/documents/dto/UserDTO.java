package com.parkito.learnmicro.documents.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Artem Karnov @date 11/6/2017.
 * artem.karnov@t-systems.com
 */

public class UserDTO implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private List<String> serials;

    public UserDTO() {
    }

    public UserDTO(String email, String firstName, String lastName, List<String> serials) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.serials = serials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSerials() {
        return serials;
    }

    public void setSerials(List<String> serials) {
        this.serials = serials;
    }
}
