package extends_override;

public class Test {
    public static void main(String[] args) {
        //方法重写override
        NewPhone hw =new NewPhone();
        hw.call();
        hw.sendMessage();
    }
}
class Phone{
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}

class NewPhone extends Phone{
    @Override  //1 重写检验注解,方法必须是正确重写的  2 提高可读性
    public void call(){
        super.call();
        System.out.println("开始视频通话");
    }
    @Override
    public void sendMessage(){
        super.sendMessage();
        System.out.println("发送图片和语音");
    }
}