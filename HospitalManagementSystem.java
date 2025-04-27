import java.util.*;

public class HospitalManagementSystem {
    private static List<Patient> patients = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hospital Management System is running!");
        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Add Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: addPatient(); break;
                case 2: viewPatients(); break;
                case 3: addDoctor(); break;
                case 4: viewDoctors(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid option!");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        patients.add(new Patient(id, name, age, gender));
        System.out.println("Patient added successfully!");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    private static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();
        doctors.add(new Doctor(id, name, specialization));
        System.out.println("Doctor added successfully!");
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor d : doctors) {
                System.out.println(d);
            }
        }
    }
}
