package com.kadioglumf.webapp.user;

import com.kadioglumf.webapp.validation.FieldMatch;
import com.kadioglumf.webapp.validation.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@FieldMatch.List({
        @FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match")
})
public class CrmUser {

    @NotNull(message = "is required")
    @Size(min = 3, message = "must be at least 3 characters")
    private String userName;

    @NotNull(message = "is required")
    @Size(min = 8, message = "must be at least 8 characters")
    private String password;

    @NotNull(message = "is required")
    @Size(min = 8, message = "must be at least 8 characters")
    private String matchingPassword;

    @NotNull(message = "is required")
    @Size(min = 3, message = "must be at least 3 characters")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 3, message = "must be at least 3 characters")
    private String lastName;

    @ValidEmail
    @NotNull(message = "is required")
    private String email;

    public CrmUser() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
