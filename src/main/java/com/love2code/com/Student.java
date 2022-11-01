package com.love2code.com;
import java.util.LinkedHashMap;

public class Student {

    private String firstName;
//    @NotNull(message = "is required")
//    @Size(min = 1 , message = "is required")
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;

    private String favoriteLanguage;

    private String[] operatingSystems;
    public Student() {
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "United States of America");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}
