package _this;

public class Student {
        private String name;
        private String schoolName;

        //无参构造器
        public Student(){
        }

        //如果不填写学校，则默认为 黑马程序员
        public Student(String name){
            //已经没有super();
            this(name,"黑马程序员");//借用本类兄弟构造器
        }

        //有参构造器
        public Student(String name, String schoolName){
            //super(); //默认有，必须先初始化父类，在初始化自己
            this.name = name;
            this.schoolName = schoolName;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
