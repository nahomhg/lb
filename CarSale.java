import java.util.*;
public class CarSale {
    public static void main(String[]args)
    {

    }
    public static Sale records(int value)
    {
        Sale sale = new Sale();
        sale = setBasePrice(sale, value);
        sale = setHybrid(sale, 0);
        sale = setElectric(sale, -1000);
        sale = setSunRoof(sale, 500);
        return sale;
    }

    //GETTERS
    public static int getBasePrice(Sale s)
    {
        return s.basePrice;
    }
    public static int getHybrid(Sale s)
    {
        return s.hybrid;
    }
    public static int getElectric(Sale s)
    {
        return s.electric;
    }
    public static int getSunRoof(Sale s)
    {
        return s.sunRoof;
    }
    public static int total(Sale s)
    {
        return s.total;
    }
    //SETTERS
    public static Sale setBasePrice(Sale s, int price)
    {
        s.basePrice = price;
        return s;
    }
    public static Sale setHybrid(Sale s, int hybrid)
    {
        s.hybrid = hybrid;
        return s;
    }
    public static Sale setElectric(Sale s, int electric)
    {
        s.electric = electric;
        return s;
    }
    public static Sale setSunRoof(Sale s, int sunRf)
    {
        s.sunRoof = sunRf;
        return s;
    }

    public static int input()
    {
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        return response;
    }
    public static String strInput()
    {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response;
    }
    public static int getTotal(Sale s)
    {
        s.total = s.basePrice + s.hybrid + s.electric + s.sunRoof;
        return s.total; //Gets and returns the value of the total by adding the values of silver, gold and bronze.
    }
}
class Sale
{
    int basePrice;
    int hybrid;
    int electric;
    int sunRoof;
    int total;

}