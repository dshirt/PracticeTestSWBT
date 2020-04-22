package ie.gmit;

public class Student {

    private String name;
    private String email;

    public Student(String name, String email) {
        if(name == "" || email == "")
            throw new IllegalArgumentException("Name or email cannot be null");
        else {
            this.name = name;
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

}
