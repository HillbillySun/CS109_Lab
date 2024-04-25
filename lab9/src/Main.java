import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int budget= in.nextInt();
        System.out.println("Your budget: "+budget);
        for (PhoneModel pm:PhoneModel.values())
        {
            if (pm.getPrice()<=budget)
            {
                System.out.printf("%-12s%s%d\n",pm.getType(),"price:",pm.getPrice());
            }
        }
    }
}

enum PhoneModel {     HuaWei("HuaWei",8888),
    iPhone("iPhone",9999),
    Pixel("Pixel",6666),
    SAMSUNG("SAMSUNG",9399),
    LG("LG",5588);
    private String type;
    private int price;
    private PhoneModel(String type,int price)
    {
        this.type=type;
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
    public String getType()
    {
        return type;
    }
}