package Entity;

import javax.lang.model.type.NullType;

public class deptAddr {

    private String deptCity;
    private String deptState = null;
    private String deptCountry = null;
    private String deptContinent = null;

    public String getDeptCity() {
        return deptCity;
    }

    public deptAddr(String deptCity, String deptState, String deptCountry, String deptContinent) {
        this.deptCity = deptCity;
        this.deptState = deptState;
        this.deptCountry = deptCountry;
        this.deptContinent = deptContinent;
    }

    public void setDeptCity(String deptCity) {
        this.deptCity = deptCity;
    }

    public String getDeptState() {
        return deptState;
    }

    public void setDeptState(String deptState) {
        this.deptState = deptState;
    }

    public String getDeptCountry() {
        return deptCountry;
    }

    public void setDeptCountry(String deptCountry) {
        this.deptCountry = deptCountry;
    }

    public String getDeptContinent() {
        return deptContinent;
    }

    public void setDeptContinent(String deptContinent) {
        this.deptContinent = deptContinent;
    }
}
