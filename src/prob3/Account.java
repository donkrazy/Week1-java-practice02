package prob3;

public class Account {
    String accountNO;
    int balance = 0;

    public Account(String accountNO){
        this.accountNO = accountNO;
        System.out.println(this.accountNO + " 계좌가 개설되었습니다.");

    }

    public void save(int gold){
        this.balance+=gold;
        System.out.println(accountNO + " 계좌에" + Integer.toString(gold) + "만 원이 입금되었습니다.");
    }

    public void deposit(int gold){
        this.balance-=gold;
        System.out.println(accountNO + " 계좌에서" + Integer.toString(gold) + " 만원이 출금되었습니다.");
    }

    public String getAccountNo(){
        return this.accountNO;
    }

    public int getBalance(){
        return this.balance;

    }

    public void setter(String accountNO, int gold){
        this.accountNO = accountNO;
        this.balance = gold;
    }
}
