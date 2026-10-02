package Entity;

public class empDeptDtls {
    public empDeptDtls(String deptName, deptAddr deptAddrDtls) {
        this.deptName = deptName;
        this.deptAddrDtls = deptAddrDtls;
    }

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public deptAddr getDeptAddrDtls() {
        return deptAddrDtls;
    }

    public void setDeptAddrDtls(deptAddr deptAddrDtls) {
        this.deptAddrDtls = deptAddrDtls;
    }

    private deptAddr deptAddrDtls;

}
