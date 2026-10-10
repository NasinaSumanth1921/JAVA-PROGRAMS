import java.util.Scanner;

class Hospital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, patientId, doctor;
        int age, choice;
        double bill = 0;

        System.out.println("===== PATIENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Patient id:143");
        patientId = sc.nextLine();

        System.out.print("Enter Patient Name: sumanth");
        name = sc.nextLine();

        System.out.print("Enter Age:19 ");
        age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Doctor Name:king ");
        doctor = sc.nextLine();

        System.out.println("\n===== APPOINTMENT =====");

        System.out.println("1. General Checkup - Rs.500");
        System.out.println("2. Specialist - Rs.1000");
        System.out.print("Select Appointment: ");

        choice = sc.nextInt();

        if (choice == 1) {
            bill = 500;
        }
        else if (choice == 2) {
            bill = 1000;
        }
        else {
            System.out.println("Invalid choice");
        }

        System.out.println("\n===== PATIENT RECORD =====");

        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Doctor     : " + doctor);
        System.out.println("Bill       : Rs." + bill);

        System.out.println("\nAppointment booked successfully!");

        System.out.println("\n===== BILL =====");
        System.out.println("Patient Name : " + name);
        System.out.println("Doctor       : " + doctor);
        System.out.println("Total Bill   : Rs." + bill);

        System.out.println("\nThank you!");

        sc.close();
    }
}
