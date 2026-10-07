public class HotelApp {

    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Hotel Management System ===");

        frontDesk.pickUpVehicle("ABC-1234");
        frontDesk.cleanRoom(205);
        frontDesk.requestCart(2);
    }
}