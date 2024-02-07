package rvt;

public class Person {
    public String FullName;
    public String address;
    
    public Person(String FullName, String address){
        this.FullName = FullName;
        this.address = address;
    }

    public String getName() {
        return FullName;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return FullName + " " + address;
    }

}
