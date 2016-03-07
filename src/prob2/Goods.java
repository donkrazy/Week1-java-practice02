package prob2;

public class Goods {
    String name;
    int price;
    int n;

    public Goods(String name, int price, int n){
        this.name = name;
        this.price = price;
        this.n = n;
    }

    public void get(){
        System.out.println(this.name+"(가격: " + Integer.toString(this.price) + "원)이 " + Integer.toString(n) +"개 입고되었습니다.");
    }


}
