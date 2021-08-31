package model;

public class Person {
    long id;
    String name;
    String address;
    String phone;

    public void setId (long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public void setPhone (String phone){
        this.phone = phone;
    }

    public long getId (){
        return this.id;
    }
    public String getName (){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone (){
        return this.phone;
    }

}
