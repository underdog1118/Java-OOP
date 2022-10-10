package d8_api_object;

import java.util.Objects;

public class Student {  //extends object
    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString
    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    //自己重写equals
    @Override
    public boolean equals(Object o){
        /*
        * s1.equals(s2)
        * 比较者: s1
        * 被比较者：s2
        * */
        //1.判断o是否为Student类型
        if(o instanceof Student){
        //2.判断是否一致
            Student s2 = (Student) o;   //强转
//            if(this.name.equals(s2.name)&&this.age==s2.age
//            &&this.sex==s2.sex) {
//                return true;
//            }else{
//                return false;
            return (this.name.equals(s2.name)&&this.age==s2.age&&this.sex==s2.sex);
            }
        else {
            return false;
        }
    }

    //官方重写的equals
    public boolean equals2(Object o){
        if(this == o) return false;
        if(o==null || this.getClass() != o.getClass()) return false;
        Student s3 = (Student) o;
        return Objects.equals(name,s3.name) && this.sex == s3.sex
                && this.age==s3.age;
    }
}
