// reference variable refers to the current object of a method or a constructor
// why uing it? confusion between class attributes & parameters
// it can be used refer instance variable of class, invoke / initiate class constructor, passed as arg in method call, passed as arg in constructor call, return current class instance

class Account{
    int a;
    int b;

    public void setData(int a, int b){
        this.a = a;
        this.a = b;
    }

    public void showData(){
        System.out.println("Value of A = "+a);
        System.out.println("Value of B = "+b);
    }

    public static void main(String args[]){
        Account obj = new Account();
        obj.setData(2, 3);
        obj.showData();
    }

}