import Entity.empCityDtls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ListMethods {

    private List<String> empNameList = new ArrayList<String>();

    public List<String> setEmp(String empName, Integer indexValue){


        // ------- ARRAY LIST -----------
        // To add the value if the index is null
        if(indexValue == null){

            if(empNameList.contains(empName)){
                System.out.println(empName + " already exists!");
            }
            else {
                System.out.println(empNameList.add(empName));
            }
            return empNameList;

        }
        else { // To overwrite the value if the index is provided and value does not exist

            if(empNameList.contains(empName)){
                System.out.println(empName + " already exists!");
            }
            else {
                empNameList.add(indexValue, empName);
            }
            return empNameList;
        }

    }
    public List<String> getEmp(){
        return empNameList;
    }



    // -------------  LINKED LIST -------------------


    private List<String> empCityLinkList = new LinkedList<String>();

    public List<String> setEmpCityLinkList(String cityNme){

        System.out.println(empCityLinkList.add(cityNme));

        return empCityLinkList;

    }


    public empCityDtls getEmpCityLinkList(Integer indexNum){

        empCityDtls empCity = new empCityDtls();

        if(indexNum != null) {
            empCity.setCityName(empCityLinkList.get(indexNum));
        }
        else{
           empCity.setCityNames(empCityLinkList);
        }
        return empCity;
    }



}
