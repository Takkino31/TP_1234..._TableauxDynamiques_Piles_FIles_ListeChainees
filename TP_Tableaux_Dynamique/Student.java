public class Student {
    private String firstName,lastName;
    private int age;

    Student(String firstName, String lastName,int age){
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public int getAge(){
        return this.age;
    }

    public void seAge(int age){
        this.age = age;
    }

}
