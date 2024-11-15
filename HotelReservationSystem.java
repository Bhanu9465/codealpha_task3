import java.util.*;

class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("        ====================00000000000000===================        ");
        System.out.println("                 :::: ROSE VALLEY INTERNATIONAL ::::                 ");
        System.out.println("          12/8/9 C AJC ROAD , KOLKATA , WEST BENGAL , INDIA          ");
        System.out.println("        ====================00000000000000===================        ");
        System.out.println();
        System.out.println("  RVI is an experience that welcomes you to a new approach of Hospitality  ");
        System.out.println(" Our elegancy and courteous service makes us the finest business hotel group.");
        System.out.println(" A 5-minute walk from a metro station, this upscale hotel is 2.3 km from the "); 
        System.out.println(" Victoria Memorial & National Museum and 7 km from Science City of Kolkata. ");
        System.out.println();
        System.out.println("      =======================================    ");
        System.out.println(" Elegant rooms and suites feature wood floors, free Wi-Fi and flat-screen TVs, "); 
        System.out.println(" in addition to sitting areas, stocked minibars, and Italian marble bathrooms. "); 
        System.out.println("        Suites add separate living rooms with coffee tables.     ");
        System.out.println("      =======================================    ");
        System.out.println();
        System.out.println("      ==================== ................... ==================    ");
        System.out.println("      !  Mobile & Internet Booking is also available  !              ");
        System.out.println("    **For Mobile Booking Call +919854245865  From Your Mobile**     ");
        System.out.println("                          PREMIUM RATES APPLY                        ");
        System.out.println("      ! For Internet Booking Visit :http://www.rvihotels.com !       ");
        System.out.println("      ==================== ................... ===================   ");
        System.out.println();
        System.out.println("                      RULES & REGULATIONS :::::>>>>>                  ");
        System.out.println(" </> Check-out time should be informed to the reception if you wish to retain. ");
        System.out.println(" </> Please present your ID proof at the time of reservation. ");
        System.out.println(" </> Bills must be settled either in Cash or Card; personal cheques will not be accepted. ");
        System.out.println();
        System.out.println(" Do you want to book a room in our hotel? \n 1. Yes    2. No ");
        System.out.print(" Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // To consume newline after integer input

        if (choice == 1) {
            System.out.println();
            System.out.println(" FILL UP THE REGISTRATION FORM GIVEN BELOW:");
            System.out.println(" ^^^^^^^   ********************   ^^^^^^^^^ ");
            System.out.print(" Full Name: ");
            String name = sc.nextLine();
            System.out.print(" Mobile Number: ");
            long mobile = sc.nextLong();
            sc.nextLine(); // To consume newline
            System.out.print(" Check-in Date (dd-mm-yyyy): ");
            String checkInDate = sc.nextLine();
            System.out.print(" No. of Days you want to stay: ");
            int days = sc.nextInt();
            System.out.print(" No. of Children Boarders (Below 18 years of age): ");
            int children = sc.nextInt();
            System.out.print(" No. of Adult Boarders (Above 18 years of age): ");
            int adults = sc.nextInt();
            System.out.print(" No. of Rooms Required: ");
            int rooms = sc.nextInt();

            System.out.println();
            System.out.println(" Types of Rooms Available:");
            System.out.println(" 1. Super Deluxe. (Rs.4500 per night)");
            System.out.println(" 2. Deluxe Room. (Rs.3800 per night)");
            System.out.println(" 3. AC Room. (Rs.3000 per night)");
            System.out.println(" 4. Non-AC. (Rs.1900 per night)");
            System.out.print(" Please enter your choice: ");
            int roomChoice = sc.nextInt();

            int roomRate = 0;

            switch (roomChoice) {
                case 1:
                    roomRate = 4500;
                    System.out.println(" You have selected Super Deluxe.");
                    break;
                case 2:
                    roomRate = 3800;
                    System.out.println(" You have selected Deluxe Room.");
                    break;
                case 3:
                    roomRate = 3000;
                    System.out.println(" You have selected AC Room.");
                    break;
                case 4:
                    roomRate = 1900;
                    System.out.println(" You have selected Non-AC Room.");
                    break;
                default:
                    System.out.println(" Invalid choice! Exiting...");
                    return;
            }

            long grossAmount = roomRate * days * adults * rooms + (roomRate * days * children * rooms) / 2;
            double vat = Math.round(0.145 * grossAmount);
            double serviceTax = Math.round(0.09 * grossAmount);
            double totalAmount = grossAmount + vat + serviceTax;

            System.out.println();
            System.out.println(" Generating The BILL...");
            System.out.println(" Please Wait ...................");
            for (long j = 0; j < 100000000; j++); // Simulate processing delay
            System.out.println(" DONE");
            System.out.println();

            System.out.println("                 :::: ROSE VALLEY INTERNATIONAL ::::                 ");
            System.out.println("          12/8/9 C AJC ROAD , KOLKATA , WEST BENGAL , INDIA          ");
            System.out.println("                          ************      BILL        ************          ");
            System.out.println(" Name: " + name);
            System.out.println(" Mobile Number: " + mobile);
            System.out.println(" Check-in Date: " + checkInDate);
            System.out.println(" Room Package Booked: " + getRoomType(roomChoice));
            System.out.println(" No. of Days for stay: " + days);
            System.out.println(" No. of Children Boarders: " + children);
            System.out.println(" No. of Adult Boarders: " + adults);
            System.out.println(" No. of Rooms Booked: " + rooms);
            System.out.println(" Gross Amount: Rs." + grossAmount);
            System.out.println(" Total Taxes: Rs." + (vat + serviceTax));
            System.out.println(" Total Amount to be Paid: Rs." + totalAmount);
            System.out.println();
            System.out.println(" Thanks for using our services!!! \n Visit Again!!");
        } else {
            System.out.println(" Thank you for visiting! Have a great day.");
        }
        sc.close();
    }

    private static String getRoomType(int roomChoice) {
        switch (roomChoice) {
            case 1:
                return "Super Deluxe";
            case 2:
                return "Deluxe Room";
            case 3:
                return "AC Room";
            case 4:
                return "Non-AC Room";
            default:
                return "Unknown Room Type";
        }
    }
}



TASK 3
