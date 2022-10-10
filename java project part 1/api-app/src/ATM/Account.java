package ATM;

public class Account {
    private String number;
    private String name;
    private String password;
    private double balance;
    private double limit;

//    public Account(){
//
//    }

    public Account(String number,String name, String password, double limit) {
        this.number=number;
        this.name = name;
        this.password = password;
        this.limit = limit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
