package encapsulation.demo;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100]; //定义购物车对象数组
        while (true) {
            System.out.println("please choose: ");
            System.out.println("添加商品： add");
            System.out.println("查询商品： query");
            System.out.println("修改商品数量： update");
            System.out.println("结算商品金额： pay");
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入命令：");
            String command = sc.next();
            switch(command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updates(shopCar,sc);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
            }
        }

    }
    public static void pay(Goods[] shopCar){
        queryGoods(shopCar);
        double sumPrice =0;
        for(int i =0;i<shopCar.length;i++){
            Goods g = shopCar[i];
            if(g!=null) {
                sumPrice += g.getPrice() * g.getBuyNumber();
            }
            else{
                break;
            }
        }
        System.out.println("您所需支付的商品总金额为： "+sumPrice);

    }
    public static void updates(Goods[] shopCar,Scanner sc){
        /*让用户输入修改商品的id，根据Id查询出商品对象*/
        while (true) {
            System.out.println("请输入您查找商品的id： ");
            int id = sc.nextInt();
            Goods g = getGoodsBuyId(shopCar,id);
            if(g==null){
                //没有该商品
                System.out.println("对不起，没有添加该商品");
            }
            else{
                //存在该商品
                System.out.println("请您输入: "+g.getName()+" 的最新购买数量： ");
                g.setBuyNumber(sc.nextInt());
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }
    public static Goods getGoodsBuyId(Goods[] shopCar,int id){
        //shopCar = [g1,g2,g3,null,null.....]
        for(int i=0;i<shopCar.length;i++){
            Goods g = shopCar[i];
            if(g!=null) {
                if (g.getId() == id) {
                    return g;
                }
            }else{
                return null;  //找完了前面存在的商品都没有找到，后面都是Null
            }
        }
        return null;        //找了100个商品也没有匹配的

    }
    public static void queryGoods(Goods[] shopCar){
        /*查询商品对象信息*/
        System.out.println("=========查询购物车信息如下===========");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        for(int i=0;i<shopCar.length;i++){
            Goods g = shopCar[i];
            if(g!=null){
                System.out.println(g.getName()+"\t\t"+g.getPrice()+"\t\t"+
                        g.getPrice()+"\t\t\t"+g.getBuyNumber());
            }else{

                break;
            }
        }
    }
    public static void addGoods(Goods[] shopCar,Scanner sc){
        //录入购买商品的信息
        System.out.println("请输入购买商品的编号（不重复）： ");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称：  ");
        String name = sc.next();
        System.out.println("请输入购买商品的数量：  ");
        int buyNumber = sc.nextInt();
        System.out.println("请输入购买商品的价格：  ");
        double price = sc.nextDouble();

        //把商品信息封装成一个商品对象
        Goods g = new Goods();
        g.setId(id);
        g.setName(name);
        g.setPrice(price);
        g.setBuyNumber(buyNumber);

        //把商品对象添加到购物车数组中
        for(int i=0;i<shopCar.length;i++){
            if(shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("您的商品 "+g.getName()+" 已加入购物车");
    }
}
