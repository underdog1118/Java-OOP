package ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> acc = new ArrayList<>();
        while (true) {
            System.out.println("=============欢迎进入ATM系统==============");
            System.out.println("1.登录账户");
            System.out.println("2.注册账户");
            System.out.println("请输入命令1、2对应的操作： ");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch(command){
                case 1:
                    login(acc,sc);
                    break;
                case 2:
                    register(acc,sc);
                    break;
                default:
                    System.out.println("您的命令有误");
            }
        }

    }
/*登录账户*/
    public static void login(ArrayList<Account> accounts,Scanner sc){
        System.out.println("=============您已进入登录界面===============");
        if(accounts.size()==0){
            System.out.println("当前系统没有账户，请先开户");
            return;
        }else {
            while (true) {
                System.out.println("请输入您的卡号： ");
                String num = sc.next();
                Account acc = getAccountById(num, accounts);
                if (acc!= null) {
                    while (true) {
                        System.out.println("请输入您的密码： ");
                        String pass = sc.next();
                        if (pass.equals(acc.getPassword())) {
                            System.out.println(acc.getName() + "贵宾，欢迎进入系统，您的卡号为：" + acc.getNumber());
//                            break;
                            //展示登录后操作页
                            showUserCommand(acc,sc,accounts);
                            return;    //干掉登录方法
                        } else {
                            System.out.println("您的密码有误");
                        }
                    }
//                    break;
                } else {
                    System.out.println("不存在该卡号");
                }
            }

        }
    }
//展示登录后操作页
    private static void showUserCommand(Account acc,Scanner sc,ArrayList<Account> accounts) {
        while (true) {
            System.out.println("=============用户操作页===============");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择： ");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    getMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(acc,sc,accounts);
                    break;
                case 5:
                    //修改密码
                    changePassword(acc,sc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功");
                    return;   //让当前方法停止执行，跳出
                case 7:
                    //注销账户
                    if(deleteAccount(acc,sc,accounts)){
                        return;           //销户成功，回到首页
                    }else
                        break;            //未销户，仍在首页
                default:
                    System.out.println("您输入的命令不正确");
            }
        }
    }
    //7.注销账户
    private static boolean deleteAccount(Account acc, Scanner sc,ArrayList<Account> accounts) {
        System.out.println("========（请谨慎选择）您是否需要销户？输入y(确定)/n(放弃)==========");
        String command = sc.next();
        switch(command){
            case "y":
                if(acc.getBalance()>0){
                    System.out.println("您账户中仍有存款，不能销户");
                }else {
                    System.out.println("您当前账户已成功销户，感谢您的使用");
                    accounts.remove(acc);
                    return true;
                }
                break;
            default:
                System.out.println("当前账户保留");
        }
        return false;
    }

    //5.修改密码
    private static void changePassword(Account acc, Scanner sc) {
        while (true) {
            System.out.println("==============欢迎进入用户密码修改界面===============");
            System.out.println("请输入您当前账户的密码： ");
            String password = sc.next();
            if(password.equals(acc.getPassword())){
                while (true) {
                    System.out.println("请您输入新的密码： ");
                    String newPass = sc.next();
                    System.out.println("请您再次确认新密码： ");
                    String newPass2 = sc.next();
                    if(newPass.equals(newPass2)){
                        acc.setPassword(newPass);
                        System.out.println("您已经重新修改密码，请重新登录");
                        return;
                    }else{
                        System.out.println("两次密码不一致，请重新输入");
                    }
                }
            }else{
                System.out.println("当前账户密码不正确！");
            }
        }
    }

    //4.转账
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==============欢迎进入用户转账界面=============");
        if(accounts.size()<2){
            System.out.println("当前系统账户不足2个，无法转账");
            return;
        }
        if(acc.getBalance()==0){
            System.out.println("您当前账户没有余额，无法转账");
            return;
        }

        while (true) {
            System.out.println("请输入您转账的用户卡号： ");
            String num = sc.next();
            if(num.equals(acc.getNumber())){
                System.out.println("对不起，您不能给自己转账！");
                continue;
            }
            if(getAccountById(num,accounts)==null){
                System.out.println("不存在该账户，请重新确认！");
            }else{
                Account acc2 = getAccountById(num,accounts);
                String name = acc2.getName();
                System.out.println("您当前要为*"+name.substring(1)+"转账！");
                System.out.println("请您输入姓氏确认： ");
                char checkName = sc.next().charAt(0);
                if(checkName==name.charAt(0)){
                    while (true) {
                        System.out.println("请输入您的转账金额： ");
                        double money = sc.nextDouble();
                        if(acc.getBalance()<money){
                            System.out.println("账户余额不足,最多还能转账： "+acc.getBalance()+"元");
                        }else{
                            acc.setBalance(acc.getBalance()-money);
                            acc2.setBalance(acc2.getBalance()+money);
                            System.out.println("您已成功转账"+money+"元，您的当前账户状态如下：");
                            showAccount(acc);
                            return;
                        }
                    }
                }else{
                    System.out.println("您输入的姓氏有误，请重新输入");
                }
            }
        }
    }

    //3.取款
    private static void getMoney(Account acc, Scanner sc) {
        while (true) {
            System.out.println("================欢迎进入用户取款界面================");
            if(acc.getBalance()<100.0){
                System.out.println("账户余额不足100元，请先存钱");
                return;
            }else{
                System.out.println("请输入您的取款金额： ");
                double money = sc.nextDouble();
                if(money>acc.getBalance()){
                    System.out.println("您的余额不足");
//                    continue;
                }
                else{
                    if(money>acc.getLimit()){
                        System.out.println("您当前取款已经超出限额！");
//                        continue;
                    }else{
                        acc.setBalance(acc.getBalance()-money);
                        System.out.println("您已成功取款"+money+"元");
                        showAccount(acc);
                        break;
                    }
                }
            }
        }
    }

    //2.存款
    private static void depositMoney(Account acc,Scanner sc) {
        System.out.println("===========欢迎进入用户存款界面=============");
        System.out.println("请输入您的存款金额： ");
        double money = sc.nextDouble();
        double totalMoney = money+acc.getBalance();
        acc.setBalance(totalMoney);
        System.out.println("您已经存款成功！");
        showAccount(acc);

    }

    //1.展示账户信息
    private static void showAccount(Account acc) {
        System.out.println("===========当前账户信息如下============");
        System.out.println("卡号： "+acc.getNumber());
        System.out.println("姓名： "+acc.getName());
        System.out.println("余额： "+acc.getBalance());
        System.out.println("当次取现额度： "+acc.getLimit());
    }

    /* 注册账户 */
    public static void register(ArrayList<Account> accounts,Scanner sc){
        System.out.println("============您已进入注册账户界面=============");
        System.out.println("请输入您的姓名： ");
        String name = sc.next();
        System.out.println("请输入您的密码");
        String password = sc.next();
        while (true) {
            System.out.println("请再次输入您的密码");
            String password2 = sc.next();
            if(password.equals(password2)){
                break;
            }else{
                System.out.println("两次密码不一致");
            }
        }
        System.out.println("请设置当日取现额度： ");
        double limit = sc.nextDouble();

        String id = getRandomId(accounts);

        Account ac = new Account(id,name,password,limit);
        accounts.add(ac);

        System.out.println("恭喜您开户成功！");
        System.out.println("卡号\t\t\t姓名\t\t密码\t\t\t限额");
        System.out.println(ac.getNumber()+"\t"+ac.getName()+"\t"+ac.getPassword()+"\t"+ac.getLimit());
    }
/*生成随机卡号*/
    public static String getRandomId(ArrayList<Account> accounts){
        Random r = new Random();
        while (true) {
            String id = "";
            for (int i = 0; i < 8; i++) {
                int c = r.nextInt(10);
                id  += c;
            }
//        System.out.println(id);
            if(getAccountById(id,accounts)==null){
                return id;
            }
        }
    }
/*根据卡号查询账户信息*/
    public static Account getAccountById(String id,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(id.equals(acc.getNumber())){
                return acc;
            }
        }
        return null;
    }
}
