package io.github.colintimbarndt.builder;

import java.util.Date;

public class UserProfile {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Date dateOfBirth;

    private UserProfile(String userName, String firstName, String lastName, String email, Date dateOfBirth) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    // Instead of this static method I could also make the Builder constructor public.
    // This is in my opinion easier to manage because I could at any time move
    // the implementation of Builder into an outer class.
    public static Builder builder(String userName) {
        return new Builder(userName);
    }

    public static class Builder {
        private final String userName;
        private String firstName = null;
        private String lastName = null;
        private String email = null;
        private Date dateOfBirth = null;

        private Builder(String userName) {
            this.userName = userName;
        }

        public UserProfile build() {
            return new UserProfile(userName, firstName, lastName, email, dateOfBirth);
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
    }
}
