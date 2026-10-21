/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author aroli
 */
public class TestUserprofile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your user ID: ");
        String userID = input.nextLine();

        System.out.println("Choose your favourite genre:");
        System.out.println("1. Science");
        System.out.println("2. Drama");
        System.out.println("3. Pet");
        System.out.println("4. Vlog");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        String genre;

        switch (choice) {
            case 1:
                genre = "Science";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Pet";
                break;
            case 4:
                genre = "Vlog";
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                return;
        }

        UserProfile userProfile = new UserProfile(userID, genre);

        System.out.println("\nUser profile was created successfully!");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favourite Genre: " + userProfile.getGenre());

    }
}
