package springcore;

public class Student {
    private int studentID;
    private String studentName;
    private String studentAddress;

    @Override
    public String toString() {
        return "{" +
            " studentID='" + getStudentID() + "'" +
            ", studentName='" + getStudentName() + "'" +
            ", studentAddress='" + getStudentAddress() + "'" +
            "}";
    }


    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }


    public Student() {
    }


    

   


}
