import Entity.deptAddr;
import Entity.empDeptDtls;

import java.util.HashSet;

public class SetMethods {

    private HashSet<empDeptDtls> empDpt = new HashSet<empDeptDtls>();

    public HashSet<empDeptDtls> setEmpDeptDtls(empDeptDtls deptDtls){
        empDpt.add(deptDtls);
        return  empDpt;
    }

    public HashSet<empDeptDtls> getAllEmpDptDtls(){
        return empDpt;
    }

}
