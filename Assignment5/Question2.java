package assignment5;

class Customer{
    String name,address;
    int age,accountNo;
    Customer(String name,String address,int accountNo, int age){
        this.name=name;
        this.address=address;
        this.accountNo=accountNo;
        this.age=age;
    }
    public void printDetails(){
        System.out.println("Customer Details: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Account No: "+accountNo);
        System.out.println("Age: "+age);
    }
}

class Account{
    String accType,branchType;
    int accountNo;
    Account(int accountNo, String accType, String branchType){
        this.accountNo=accountNo;
        this.accType=accType;
        this.branchType=branchType;
    }
    public void printDetails(){
        System.out.println("Account Details: ");
        System.out.println("Account No.: "+accountNo);
        System.out.println("Type: "+accType);
        System.out.println("Branch Type: "+branchType);

    }
}

class RBI{ // Base class
    int withLimit;
    double A,P,r=4;
    float t;
    String actype,brtype;

    RBI(Account obj){
        actype=obj.accType;
        brtype=obj.branchType;
    }

    int setWithdrawalLimit() {

        if(actype=="SAVINGS" && brtype=="METRO") {
            withLimit = 5000;
        }else {
            withLimit = 4000;
        }

        return withLimit;
    }

    double setInterestRate() {
        A=(P*r*t)/100;
        return A;
    }

    double setMAB() {

        return 2000;
    }
}

class SBI extends RBI { // Child class1
    SBI(Account obj){
        super(obj);
    }
    double setInterestRate() {
        A=P*(Math.pow((1+r/100),t)-1);
        return A;
    }
    double setMAB() {

        return 2500;
    }
}

class ICICI extends RBI { // Child class2
    ICICI(Account obj){
        super(obj);
    }
    double setInterestRate() {
        A=(P*r*t)/75;
        return A;
    }

    int setWithdrawalLimit() {
        withLimit=7000;
        return withLimit;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Customer c = new Customer("Jatin Bansal", "Ludhiana",001,20);
        c.printDetails();
        System.out.println();
        Account a = new Account(001,"SAVINGS","METRO");
        a.printDetails();
        System.out.println();
        SBI sbi = new SBI(a);
        ICICI icici = new ICICI(a);
        sbi.P=100;
        sbi.r=8;
        sbi.t=7;
        Double sbiInt=sbi.setInterestRate();
        int sbiWL=sbi.setWithdrawalLimit();
        System.out.println("SBI interest amount is:"+String.format("%.2f",sbiInt)) ;
        System.out.println("SBI withdraw limit is:"+sbiWL);
        System.out.println();
        icici.P=100;
        icici.r=8;
        icici.t=7;
        Double iciInt=icici.setInterestRate();
        int iciciWL= icici.setWithdrawalLimit();
        System.out.println("ICICI interest amount is:"+String.format("%.2f",iciInt));
        System.out.println("ICICI withdraw limit is:"+iciciWL);
    }

}