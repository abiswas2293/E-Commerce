package pageClass;

public class division {
    public int divisionMethod(int a,int b){
        return a/b;
    }

    public static void main(String args[]){
        division d=new division();
        System.out.println("The division of two number is "+d.divisionMethod(1234,78));

    }
}
