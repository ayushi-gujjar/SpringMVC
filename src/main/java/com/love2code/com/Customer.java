package com.love2code.com;

import jakarta.validation.constraints.Size;

public class Customer {
        private String firstName;
        @jakarta.validation.constraints.NotNull(message = "is required")
        @Size(min = 2 , message = "is required")
        private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
