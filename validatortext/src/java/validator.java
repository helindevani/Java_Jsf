import java.util.Date;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class validator {
    private double amount;
    private String uname,name,email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public String getUname() {
        return uname;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
