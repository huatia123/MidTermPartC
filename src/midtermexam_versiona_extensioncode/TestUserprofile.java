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
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        String genre;

        switch (choice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Mystery";
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
