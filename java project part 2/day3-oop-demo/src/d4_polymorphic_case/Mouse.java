package d4_polymorphic_case;

public class Mouse implements Usb{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//公有
    @Override
    public void In() {
        System.out.println(name+"接入电脑");
    }

    @Override
    public void Out() {
        System.out.println(name+"拔出电脑");
    }
//独有
    public void Function() {
        System.out.println("点击功能启动");
    }
}
