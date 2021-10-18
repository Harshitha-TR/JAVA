import java.util.Scanner;
public class Address {
	HouseDetails house = new HouseDetails();
    String city;
    String state;
    int pincode;

    void address() {
        Scanner sc = new Scanner(System.in);
        house.houseDetails();
        System.out.println("Enter City");
        city = sc.next();
        System.out.println("Enter State");
        state = sc.next();
        System.out.println("Enter Pincode");
        pincode = sc.nextInt();
    }

    void showAddressDetails() {
        house.showHouseDetails();
        System.out.println(city+"- "+pincode+",");
        System.out.println(state);
    }
}
