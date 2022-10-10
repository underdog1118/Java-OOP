package ArrayList;

public class E3Student {
    private int number;
    private String name;
    private int age;
    private String clas;

    public E3Student(){

    }
    public E3Student(int number, String name, int age, String clas) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.clas = clas;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
