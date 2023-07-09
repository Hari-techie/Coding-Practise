package Thoughworks_car;
import java.util.*;
class Show
{
    ArrayList<String>availableseat;
    Show()
    {
        availableseat = new ArrayList<>();
    }
    void addseat(String[] seats)
    {
        for(String seat:seats)
        {
            availableseat.add(seat);
        }
    }
    void printAvailSeat()
    {
        for(String seat:availableseat)
        {
            System.out.print(seat+" ");
        }
        System.out.println("");
    }
    void bookshow(String[] bookseats)
    {
        for(int i=0;i<bookseats.length;i++)
        {
            if(availableseat.contains(bookseats[i]))
            {
                availableseat.remove(bookseats[i]);
            }
            else
            {
                System.out.println("Seat "+bookseats[i]+" not available please try again");
                return;
            }
        }
        System.out.println("Successfully booked");
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show 1 :");
        String show1[] = sc.nextLine().split(" ");
        System.out.println("Show 2 :");
        String show2[] = sc.nextLine().split(",");
        ArrayList<Show>show = new ArrayList<>();
        for(int i=1;i<=2;i++)
        {
            show.add(new Show());
        }
        Show show_1 = show.get(0);
        show_1.addseat(show1);
        Show show_2 = show.get(1);
        show_2.addseat(show2);
        for(int i=0;i<=1;i++)
        {
            System.out.println("Show 1 :");
            show.get(0).printAvailSeat();
            System.out.println("Show 2 :");
            show.get(1).printAvailSeat();
            System.out.println("Group"+(i+1)+":"); 
            System.out.print("Enter show no: ");
            int show_no = sc.nextInt();
            sc.nextLine();
            if(show_no>show.size())
            {
                System.out.println("Invalid show number");
            }
            System.out.print("Enter seats: ");
            String bookingseat[] = sc.nextLine().split(" ");
            show.get(show_no-1).bookshow(bookingseat);
        }
    }
}
