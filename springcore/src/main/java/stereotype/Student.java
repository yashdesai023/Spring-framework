package stereotype;
import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component("obj")
public class Student {
    @Value("Yash")
    private String studentName;
    @Value("Pune")
    private String studentCity;
    @Value("#{temp}")
    private List<String> studentAddress;

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return this.studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public List<String> getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(List<String> studentAddress) {
        this.studentAddress = studentAddress;
    }
    
    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", studentCity='" + getStudentCity() + "'" +
            ", studentAddress='" + getStudentAddress() + "'" +
            "}";
    }
    
}
