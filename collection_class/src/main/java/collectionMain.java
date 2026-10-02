import Entity.deptAddr;
import Entity.empDeptDtls;

import java.util.Iterator;
import java.util.List;

public class collectionMain {

    public static void main(String[] args){

        System.out.println("Hello, there!");

        ListMethods listMet = new ListMethods();
        System.out.println(listMet);

        HashMethods hashMet = new HashMethods();
        System.out.println(hashMet);
        System.out.println(HashMethods.class.toString());

        SetMethods setMet = new SetMethods();
        System.out.println(setMet);

        // 1 ----------LIST---------------- //

        // 1.1 - ArrayList
        System.out.println(listMet.setEmp("Sundar", null));
        System.out.println(listMet.setEmp("Abinaya", 1));
        System.out.println(listMet.setEmp("Lakshya", 2));
        System.out.println(listMet.setEmp("Hrithika", null));


        System.out.println("All Value in the ArrayList  " + listMet.getEmp());
        System.out.println("Second Value in the ArrayList  " + listMet.getEmp().get(1));


            // Trying to add it again.

        System.out.println(" --- Trying to add it again. --");
        System.out.println(listMet.setEmp("Sundar", 0));
        System.out.println(listMet.setEmp("Abinaya", 3));
        System.out.println(listMet.setEmp("Lakshya", 4));
        System.out.println(listMet.setEmp("Hrithika", null));

        // Adding new ones..
        System.out.println("Adding new ones.. ");
        System.out.println(listMet.setEmp("New one", null)); // Added as a 4th element
        System.out.println(listMet.setEmp("New one 2", 4)); // But moves the already existing 4th element and inserts itself.


        // 1.2 - Linked List


        System.out.println("---------------LINKED LIST ---------------");

        System.out.println(listMet.setEmpCityLinkList("Madurai"));
        System.out.println(listMet.setEmpCityLinkList("Trichy"));
        System.out.println(listMet.setEmpCityLinkList("Chennai"));
        System.out.println(listMet.setEmpCityLinkList("Frankfurt"));

        System.out.println("Listing out Linked List");

        System.out.println(listMet.getEmpCityLinkList(null));
        System.out.println(listMet.getEmpCityLinkList(null).getCityNames());
        System.out.println(listMet.getEmpCityLinkList(1));
        System.out.println(listMet.getEmpCityLinkList(1).getCityName());
        System.out.println(listMet.getEmpCityLinkList(2));
        System.out.println(listMet.getEmpCityLinkList(2).getCityName());

        // 2 ----------MAP---------------- //


        // 2.1 - HashMap

        System.out.println("--------HASH MAP----------");
        System.out.println("Setting the HashMap");

        HashMethods hashMethod = new HashMethods();
        System.out.println(hashMethod.setEmpCountryCodeMap("IND", "India"));
        System.out.println(hashMethod.setEmpCountryCodeMap("DE", "Germany"));
        System.out.println(hashMethod.setEmpCountryCodeMap("MX", "Mexico"));


        System.out.println("Getting the Hash Map");
        System.out.println(hashMethod.getAllEmpCountryCodeMap());
        System.out.println(hashMethod.getEmpCountryCodeMap("DE"));
        System.out.println(hashMethod.getEmpCountryCodeMap("MX"));


        // 2.2 - Linked Hash Map

        System.out.println("--------LINKED HASH MAP----------");
        System.out.println("Setting the Linked HashMap");

        System.out.println(hashMet.setEmpZipAreaMap("65931","Sindlingen"));
        System.out.println(hashMet.setEmpZipAreaMap("620011", "Trichy"));
        System.out.println(hashMet.setEmpZipAreaMap("625001", "Madurai"));


        System.out.println(hashMet.getAllEmpZipArea());
        System.out.println(hashMet.getEmpZipArea("65931"));
        System.out.println(hashMet.getEmpZipArea("625932"));


        //Hash table

        System.out.println("--------HASH TABLE----------");
        System.out.println("Hash Table has become obsolete - https://www.geeksforgeeks.org/hashtable-in-java/");


        // 3 ----------SET---------------- //

        // 3.1 - Hash Set

        System.out.println("--------HASH SET----------");
        System.out.println("Setting the Hash SET");

        System.out.println(setMet.setEmpDeptDtls(
                            new empDeptDtls("Finance",
                                    new deptAddr("Trichy", "Tamilnadu","India","Asia")
                                            )
                                )
                            );

        System.out.println(setMet.setEmpDeptDtls(
                        new empDeptDtls("HR",
                                new deptAddr("Madurai", "Tamilnadu","India","Asia")
                        )
                )
        );

        System.out.println("Printing out Hash set of objects..");

        System.out.println(setMet.getAllEmpDptDtls().stream().toList());

        System.out.println("Iterating through the hashset");

        Iterator<empDeptDtls> deptDt = setMet.getAllEmpDptDtls().iterator();

        while(deptDt.hasNext()){

            System.out.println("Looping through-------");
            empDeptDtls obj = deptDt.next();
            System.out.println(obj.getDeptName());

            System.out.println(obj.getDeptAddrDtls().getDeptCity());
            System.out.println(obj.getDeptAddrDtls().getDeptState());
            System.out.println(obj.getDeptAddrDtls().getDeptCountry());
            System.out.println(obj.getDeptAddrDtls().getDeptContinent());

        }


        // 3.2 - LinkedHash set

        // 3.3 - Tree Set

    }
}
