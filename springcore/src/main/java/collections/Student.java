package collections;

import java.util.*;

public class Student {
    private String names;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String,String> getCourses() {
        return this.courses;
    }

    public void setCourses(Map<String,String> courses) {
        this.courses = courses;
    }

    public Student(String names, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        this.names = names;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Student() {
    }
    
}
