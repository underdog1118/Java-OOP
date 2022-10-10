package d4_polymorphic_case;

public class Test {
    public static void main(String[] args) {
        //a.创建电脑对象
        Computer c = new Computer("qzp");
        c.start();

        //b.创建鼠标键盘对象
        Usb u1 = new Keyboard("Logitech");
        c.installUsb(u1);

        System.out.println("==================");

        Usb u2 = new Mouse("Razer");
        c.installUsb(u2);


    }
}
