import java.util.Scanner;

public class HouseDetails {
    int house;
    int flr;
    int room;

    void houseDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter House Number");
        house = sc.nextInt();
        System.out.println("Enter Floor Number");
        house = sc.nextInt();
        System.out.println("Enter Room Number");
        house = sc.nextInt();
    }

    void showHouseDetails() {
        System.out.println("#" + house + ", " + flr + " floor, " + room + " Room No.");
    }
}