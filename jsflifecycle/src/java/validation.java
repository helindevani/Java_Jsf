import java.util.Date;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class validation {
    String name;
    Date d1;
    public void setName(String name) {
        this.name = name;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getName() {
        return name;
    }

    public Date getD1() {
        return d1;
    }
    
}
