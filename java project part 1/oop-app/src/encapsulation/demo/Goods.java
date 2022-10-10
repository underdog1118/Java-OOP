package encapsulation.demo;

public class Goods {
    private int id; //编号
    private String name;
    private double price;
    private int buyNumber;
//无参构造器
    public Goods(){

    }
//有参构造器
    public Goods(int id, String name, double price, int buyNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.buyNumber = buyNumber;
    }
//getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

/*   public Goods(){
        //无参构造器
    }

    public Goods(String n,String b){
        //有参构造器
    }*/

}
