import javax.faces.bean.ManagedBean;
@ManagedBean
public class Empolyeebean {
    private String name;
    private String address;
    private String dept;
    private String pwd;
    private int empid;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDept() {
        return dept;
    }

    public String getPwd() {
        return pwd;
    }

    public int getEmpid() {
        return empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

  
}
