public class OverLoad {
    public static void main(String[] args) {
        //方法重载
        fire();
      //  fire("japan");
       //  fire("japan",100000);


    }
    public static void fire(){
        fire("japan");
       // System.out.println("launch a egg");
    }
    public static void fire(String location){
        fire("japan",10000);
        //System.out.println("launch a egg in "+location);
    }
    public static void fire(String location,int num){
        System.out.println("launch "+num+" eggs in "+location);
    }

    }
