
public class AirlinePassenger {
    private String title;
    private String FN;
    private String LN;
    private String dob;
    private String phone;
    private String FFN;
    private String miles;
    private String nationality;
    private String passport;
    private String passportExp;
    private String passportCountry;
    private String passportIss;

    /*--------------------------------------------------------------------------------------------------------------------*/
    //Getters
    public String gettitle() {
        return title;
    }
    public String getFN() {
        return FN;
    }
    public String getLN() {
        return LN;
    }
    public String getdob() {
        return dob;
    }
    public String getphone() {
        return phone;
    }
    public String getFFN() {
        return FFN;
    }
    public String getmiles() {
        return miles;
    }
    public String getNationality() {
        return nationality;
    }
    public String getPassport() {
        return passport;
    }
    public String getPassportExp() {
        return passportExp;
    }
    public String getPassportCountry() {
        return passportCountry;
    }
    public String getPassportIss() {
        return passportIss;
    }
/*--------------------------------------------------------------------------------------------------------------------*/
    //Setters
    public void settitle(String title) {
        this.title = title;
    }
    public void setFN(String FN) {
        this.FN = FN;
    }
    public void setLN(String LN) {
        this.LN = LN;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public void setFFN(String FFN) {
        this.FFN = FFN;
    }
    public void setmiles(String miles) {
        this.miles = miles;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public void setPassportExp(String passportExp) {
        this.passportExp = passportExp;
    }
    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }
    public void setPassportIss(String passportIss) {
        this.passportIss = passportIss;
    }
/*--------------------------------------------------------------------------------------------------------------------*/

    public String toString() {
    return "AirlinePassenger " +
             title + " " +  FN + " " + LN + '\n' +
            "Born: " + dob + '\n' +
            "Cell Phone Number: " + phone + '\n' +
            "Frequent Flyer Number: " + FFN + '\n' +
            "Miles Flown: " + miles + '\n' +
            "Country of Nationality?: " + nationality + '\n' +
            "Passport ID Number: " + passport + '\n' +
            "Passport Expiration Date: " + passportExp + '\n' +
            "Passport Country: " + passportCountry + '\n' +
            "Date Passport Issued: " + passportIss;
    }
}