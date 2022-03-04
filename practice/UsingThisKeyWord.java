import java.io.*;

class UsingThisKeyWord {
    int a = 8;
    int b = 9;

    public void setData(int a ,int b){
        this.a = a;
        this.b = b;
    }

    public void getData(){
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }

    public static void main(String args[]){
        UsingThisKeyWord obj = new UsingThisKeyWord();
        obj.setData(10,20);
        obj.getData();
    }
}