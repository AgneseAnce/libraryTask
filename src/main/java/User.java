import java.util.Set;

public class Users {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String userID;

    public Users(){
    }

    public Users(String firstName, String lastName, String phone, String address, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.userID = userID;
    }

//    public String generateUserID(String firstName, String lastName){
//        String userInitials = String.valueOf(getFirstName().charAt(0) + getLastName().charAt(0));
//        String genUserID;
//
//        do {
//            String randomIDNumber = String.valueOf((int) (Math.random() * 100) + 1);
//            genUserID = userInitials + randomIDNumber;
//        } while (generatedUserIDs.contains(genUserID));
//
//        generatedUserIDs.add(genUserID);
//        return genUserID;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstNameName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastNameName(String lastName) {
        this.firstName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
