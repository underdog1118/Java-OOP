package d4_polymorphic_case;

public class Keyboard implements Usb{
    private String name;

    public Keyboard(String name) {
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
        System.out.println("打字功能启动");

    }
}
