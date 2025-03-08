package stereotype;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component("obj")
public class Student {
    @Value("Yash")
    private String studentName;
    @Value("Pune")
    private String studentCity;

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

    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", studentCity='" + getStudentCity() + "'" +
            "}";
    }
    
}
