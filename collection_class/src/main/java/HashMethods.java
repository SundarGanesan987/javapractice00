import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMethods {

    private HashMap<String, String> empCountryCodeMap = new HashMap<String, String>();

    private LinkedHashMap<String, String> empZipAreaMap = new LinkedHashMap<String, String>();


    //--------- HASH MAP ------------------//

    public HashMap<String, String> setEmpCountryCodeMap(String keyItem, String valueItem){
        empCountryCodeMap.put(keyItem, valueItem);
        return empCountryCodeMap;
    }

    public HashMap<String, String> getAllEmpCountryCodeMap(){
        return empCountryCodeMap;
    }

    public String getEmpCountryCodeMap(String keyItem){
        return empCountryCodeMap.get(keyItem);
    }

    //-------- LINKED HASH MAP -----------//

    public LinkedHashMap<String, String> setEmpZipAreaMap(String keyItem, String valueItem){
        empZipAreaMap.put(keyItem, valueItem);
        return empZipAreaMap;
    }

    public LinkedHashMap<String, String> getAllEmpZipArea(){
        return empZipAreaMap;
    }

    public String getEmpZipArea(String keyItem){
        return empZipAreaMap.get(keyItem);
    }

}
