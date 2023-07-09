package Thoughworks_car;

import java.util.Scanner;
abstract class Service
{
    String service_code;
    int price;
    abstract int getprice(String carname);
}
class Basic_Servicing extends Service
{
    String service_code = "BS01";
    int price;
    int getprice(String carname)
    {
        if(carname.equals("Hatchback"))
        {
            price = 2000;
        }
        else if(carname.equals("Sedan"))
        {
            price = 4000;
        }
        else
        {
            price = 5000;
        }
        return price;
    }
    
}
class Engine_Problem extends Service
{
    String service_code = "EP01";
    int price;
    int getprice(String carname)
    {
        if(carname.equals("Hatchback"))
        {
            price = 5000;
        }
        else if(carname.equals("Sedan"))
        {
            price = 8000;
        }
        else
        {
            price = 10000;
        }
        return price;
    }
}
class Clutch_Problem extends Service
{
    String service_code = "CP01";
    int price;
    int getprice(String carname)
    {
        if(carname.equals("Hatchback"))
        {
            price = 2000;
        }
        else if(carname.equals("Sedan"))
        {
            price = 4000;
        }
        else
        {
            price =  6000;
        }
        return price;
    }
}
class Break_Fixing extends Service
{
    String service_code = "BF01";
    int price;
    int getprice(String carname)
    {
        if(carname.equals("Hatchback"))
        {
            price = 1000;
        }
        else if(carname.equals("Sedan"))
        {
            price = 1500;
        }
        else
        {
            price = 2500;
        }
        return price;
    }
}
class Gear_Problem extends Service
{
    String service_code = "GP01";
    int price;
    int getprice(String carname)
    {
        if(carname.equals("Hatchback"))
        {
            price = 3000;
        }
        else if(carname.equals("Sedan"))
        {
            price = 6000;
        }
        else
        {
            price = 8000;
        }
        return price;
    }
}
class ServiceFactory
{
    Service getservice(String code)
    {
        if(code.equals("BS01"))
        {
            return new Basic_Servicing();
        }
        else if(code.equals("EP01"))
        {
            return new Engine_Problem();
        }
        else if(code.equals("CP01"))
        {
            return new Clutch_Problem();
        }
        else if(code.equals("BP01"))
        {
            return new Break_Fixing();
        }
        else
        {
            return new Gear_Problem();
        }
    }
}
public class CarService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type of Car: ");
        String carname = sc.nextLine();
        System.out.println("Enter Service Code: ");
        String service_codes[] = sc.nextLine().split(",");
        int i,n = service_codes.length,total=0;
        ServiceFactory servicefactory = new ServiceFactory();
        for(i=0;i<n;i++)
        {
            Service service = servicefactory.getservice(service_codes[i]);
            total = total + service.getprice(carname);
        }
        System.out.println("Total bill : "+total);
    }
}
