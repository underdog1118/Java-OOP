package d9_interface_implements;

public class Test {
    public static void main(String[] args) {
        //interface被class implements
        PingPongMan p = new PingPongMan("张继科");
        p.run();
        p.competition();
        p.rule();
    }
}
