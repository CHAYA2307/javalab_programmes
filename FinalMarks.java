import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i+1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            System.out.println("Enter 5 Internal Marks:");
            int[] im = new int[5];
            for (int j = 0; j < 5; j++)
                im[j] = sc.nextInt();

            internals[i] = new Internals(im);

            System.out.println("Enter 5 SEE Marks:");
            int[] se = new int[5];
            for (int j = 0; j < 5; j++)
                se[j] = sc.nextInt();

            externals[i] = new External(usn, name, sem, se);
        }

        System.out.println("\n---- FINAL MARKS OF STUDENTS ----");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i+1));
            System.out.println("USN: " + externals[i].usn);
            System.out.println("Name: " + externals[i].name);
            System.out.println("Semester: " + externals[i].sem);

            System.out.println("Final Marks in 5 Courses:");
            for (int j = 0; j < 5; j++) {
                int finalMarks = internals[i].internalMarks[j] + externals[i].seeMarks[j];
                System.out.println("Course " + (j+1) + ": " + finalMarks);
            }
        }
    }
}
