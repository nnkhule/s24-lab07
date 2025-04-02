package frogger;

public class PlayerProfile {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String zipCode;
    private final String state;
    private final String gender;

    public PlayerProfile(String firstName, String lastName, String phoneNumber, String zipCode, String state, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getGender() {
        return gender;
    }
}
