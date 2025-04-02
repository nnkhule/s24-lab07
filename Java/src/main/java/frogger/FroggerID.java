package frogger;

public class FroggerID {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String zipCode;
    private final String state;
    private final String gender;

    // 6 параметрийг хүлээн авах конструктор
    public FroggerID(String firstName, String lastName, String phoneNumber, String zipCode, String state, String gender) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FroggerID froggerID = (FroggerID) obj;
        return firstName.equals(froggerID.firstName) &&
               lastName.equals(froggerID.lastName) &&
               phoneNumber.equals(froggerID.phoneNumber) &&
               zipCode.equals(froggerID.zipCode) &&
               state.equals(froggerID.state) &&
               gender.equals(froggerID.gender);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + phoneNumber.hashCode() + zipCode.hashCode() + state.hashCode() + gender.hashCode();
    }
}
