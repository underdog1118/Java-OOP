package d6_innerclass;

public class Test2 {
    public static void main(String[] args) {
        People.Heart ht = new People().new Heart();
        ht.show();
    }
}

class People{
    private int heartbeat = 150;
    public class Heart{
        private int heartbeat = 110;
        public void show(){
            int heartbeat = 78;
            System.out.println(heartbeat);  //78
            System.out.println(this.heartbeat);  //110
            System.out.println(People.this.heartbeat);  //150
        }
    }
}
