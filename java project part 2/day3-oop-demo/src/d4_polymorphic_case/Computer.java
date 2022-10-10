package d4_polymorphic_case;

public class Computer {

    private String name ;
    public void start(){
        System.out.println(name+"开机了~");
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //提供安装USB的入口
    public void installUsb(Usb usb){
        usb.In();//公有

        /*独有功能*/
        if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;   //将父类转换为子类
            m.Function();
        }else if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.Function();
        }

        usb.Out();//公有
    }
}
