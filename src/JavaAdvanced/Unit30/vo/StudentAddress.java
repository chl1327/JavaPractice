package JavaAdvanced.Unit30.vo;

import java.io.Serializable;

/**
 * Created by chl1327 on 2018/6/18.
 */

public class StudentAddress implements Serializable {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public StudentAddress(String name, String street,String city,String state,String zip){
        this.name = name;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }


    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
