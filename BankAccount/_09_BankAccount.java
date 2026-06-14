import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.nio.charset.StandardCharsets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;

public class _09_BankAccount {
    public static void main(String args[]) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);

        List<BankAccount> allUsers = DatabaseHandler.loadUsers();

        if (allUsers.isEmpty()) {
            allUsers.add(new BankAccount("mehdiali_mk", "Mehdiali@123", 100000));
            allUsers.add(new BankAccount("ahesanali", "Ahesanali@123", 10000));
        }

        int numberOfUsersReleased = 0;
        for (BankAccount user : allUsers) {
            if (user.getStatus()) {
                boolean isReleased = user.changeReleaseDate();
                if (isReleased) {
                    numberOfUsersReleased++;
                }
            }
        }

        if (numberOfUsersReleased != 0) {
            System.out.println("\n(" + numberOfUsersReleased + ") users released.\n\n");
        }

        int round = 2;

        clearConsole();
        while (round != -1) {
            System.out.println("\n\n--- Welcome to the Bank ---");
            System.out.println("\n1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Exit");

            System.out.print("\n\nEnter your choice: ");
            int userChoice = sc.nextInt();
            sc.nextLine();

            clearConsole();

            switch (userChoice) {
                case 1:
                    System.out.println("\n\n--- Login to the Bank ---");
                    System.out.print("Username: ");
                    String inputUsername = sc.next();
                    System.out.print("Password: ");
                    String inputPassword = sc.next();

                    BankAccount activeUser = null;
                    for (BankAccount user : allUsers) {
                        if (user.checkUsernameAndPassword(inputUsername, inputPassword)) {
                            activeUser = user;
                            break;
                        }
                    }

                    if (activeUser == null) {
                        System.out.println("Invalid credentials. Try Again...");
                        return;
                    }
                    clearConsole();
                    if (activeUser.getActive()) {
                        while (round != 0) {

                            System.out.flush();
                            System.out.println("\n\nWelcome " + activeUser.username + ", to the bank.");
                            System.out.println("\n1. Change Username");
                            System.out.println("2. Change Password");
                            System.out.println("3. Get Account Number");
                            System.out.println("4. Check Balance");
                            System.out.println("5. Credit Amount");
                            System.out.println("6. Debit Amount");
                            System.out.println("7. View Mini Statement");
                            System.out.println("8. Logout");

                            System.out.print("\nEnter your choice: ");
                            userChoice = sc.nextInt();
                            sc.nextLine();

                            clearConsole();
                            switch (userChoice) {
                                case 1:
                                    activeUser.changeUsername(sc);
                                    break;
                                case 2:
                                    activeUser.changePassword(sc);
                                    break;
                                case 3:
                                    activeUser.getAccountNumber(sc);
                                    break;
                                case 4:
                                    activeUser.checkBalance(sc);
                                    break;
                                case 5:
                                    activeUser.creditAmount(sc);
                                    break;
                                case 6:
                                    activeUser.debitAmount(sc);
                                    break;
                                case 7:
                                    activeUser.viewStatement();
                                    break;
                                case 8:
                                    round = 0;
                                    break;
                                default:
                                    System.out.println("\n\nPlease enter the correct choice.");
                                    break;
                            }
                        }
                    } else {
                        while (round != 0) {
                            clearConsole();
                            System.out.flush();
                            System.out.println("\n\nWelcome " + activeUser.username + ", to the bank.");
                            System.out.println("Unfortunately your account is Seized.");

                            System.out.println("\n1. To release account.");
                            System.out.println("2. Logout");

                            System.out.print("\nEnter your choice: ");
                            userChoice = sc.nextInt();
                            sc.nextLine();

                            clearConsole();
                            switch (userChoice) {
                                case 1:
                                    activeUser.releaseAccount(sc);
                                    round = 0;
                                    break;
                                case 2:
                                    round = 0;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    break;

                case 2:
                    clearConsole();
                    System.out.println("\n\n--- Signup to the Bank ---");
                    System.out.print("Username: ");
                    String signupUsername = sc.next();
                    System.out.print("Password: ");
                    String signupPassword = sc.next();
                    System.out.print("Opening Balance: ");
                    double signupOpeningBalance = sc.nextDouble();

                    BankAccount newUser = new BankAccount(signupUsername, signupPassword, signupOpeningBalance);

                    allUsers.add(newUser);
                    System.out.println("\n\n" + signupUsername + " your account is signed up successfully.");
                    System.out.println("Now login to the system.");

                    break;
                case 3:
                    round = -1;
                    break;
                default:
                    break;
            }
        }

        DatabaseHandler.saveUsers(allUsers);
        System.out.println("Data saved successfully. Goodbye!");

        System.out.println("\n\n\nThanks for using program.");
        System.out.println("\n\t-- Created by Mehdiali Kadiwala --");
    }

    public static void clearConsole() {
        try {
            // Method 1: ANSI Escape Codes (Best for modern terminals)
            System.out.print("\033[H\033[2J");
            System.out.print("\033[3J"); // Clear scrollback buffer (extra clean)
            System.out.flush();

            // Method 2: Alternative full reset
            if (System.console() != null) {
                System.out.print("\033c");
                System.out.flush();
            }

            // Method 3: Platform-specific command (very reliable)
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        } catch (Exception e) {
            // Ultimate fallback - print many new lines
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
    }
}

class BankAccount {
    String username;
    long accountNumber;
    private boolean active;
    private int releaseDaysLeft;
    private boolean releaseAppealed;
    private String password;
    private double balance;
    private List<String> transactions;

    BankAccount(String username, String password, double balance) {
        this.username = username;
        this.accountNumber = ThreadLocalRandom.current().nextLong(100_000_000_000L, 1000_000_000_000L);
        this.password = password;
        this.balance = balance;
        this.releaseDaysLeft = 0;
        this.releaseAppealed = false;
        this.active = true;
        this.transactions = new ArrayList<>();
        logTransaction("Opening balance: " + balance);
    }

    boolean getActive() {
        return this.active;
    }

    boolean getStatus() {
        return !this.active && this.releaseAppealed;
    }

    boolean changeReleaseDate() {
        if (!this.active && this.releaseDaysLeft == 0) {
            this.active = true;
            this.releaseAppealed = false;
            return true;
        }
        this.releaseDaysLeft--;
        return false;
    }

    void releaseAccount(Scanner sc) {
        if (this.releaseAppealed) {
            System.out.println("\nAlready requested for account release");
            System.out.println("Your account is released after (" + this.releaseDaysLeft + ").");
            return;
        }
        System.out.print("\n\nEnter your account number: ");
        long enteredAccountNumber = sc.nextLong();
        System.out.print("Enter your username: ");
        String enteredUsername = sc.next();
        System.out.print("Enter your password: ");
        String enteredPassword = sc.next();
        System.out.print("Enter your balance (Guess): ");
        double enteredBalance = sc.nextDouble();

        boolean isAccountSame = enteredAccountNumber == this.accountNumber;
        boolean isUsernameAndPasswordSame = this.checkUsernameAndPassword(enteredUsername, enteredPassword);
        boolean isBalanceSame = enteredBalance > (this.balance - 5000) && enteredBalance < (this.balance + 5000);

        if (isAccountSame && isUsernameAndPasswordSame && isBalanceSame) {
            System.out.println("\n\nYour request to release account is sent successfully.");
            this.releaseDaysLeft = 3;
            System.out.println("Your account is released after (" + this.releaseDaysLeft + ").");
            this.releaseAppealed = true;
        }
    }

    void creditAmount(Scanner sc) {
        if (active) {
            int attempts = 3;
            while (attempts != 0) {

                System.out.print("\nEnter the password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    System.out.print("\nEnter the credit amount = ");
                    double creditAmount = sc.nextDouble();
                    this.balance += creditAmount;
                    printBalance();
                    logTransaction("(+) Credit Amount: " + creditAmount);
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attempts + " attempts left).");
                    attempts--;
                }
            }
            if (attempts == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void debitAmount(Scanner sc) {
        if (active) {
            int attempts = 3;
            while (attempts != 0) {

                System.out.print("\nEnter the password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    System.out.print("\nEnter the debit amount = ");
                    double debitAmount = sc.nextDouble();
                    this.balance -= debitAmount;
                    printBalance();
                    logTransaction("(-) Debit Amount: " + debitAmount);
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attempts + " attempts left).");
                    attempts--;
                }
            }
            if (attempts == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void changeUsername(Scanner sc) {
        if (active) {
            int attempts = 3;
            while (attempts != 0) {

                System.out.print("\nEnter the password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    System.out.print("\nEnter the new username: ");
                    String newUsername = sc.next();
                    logTransaction("Username Change: " + this.username + " -> " + newUsername);
                    this.username = newUsername;
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attempts + " attempts left).");
                    attempts--;
                }
            }
            if (attempts == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void changePassword(Scanner sc) {
        if (active) {
            int attemptsToChangePassword = 3;
            while (attemptsToChangePassword != 0) {

                System.out.print("\nEnter the current password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    while (true) {
                        System.out.print("\nEnter the new password: ");
                        String newPassword = sc.next();
                        System.out.print("Confirm the entered password: ");
                        String confirmPassword = sc.next();

                        if (newPassword.equals(confirmPassword)) {
                            logTransaction("Password Change: " + this.password + " -> " + newPassword);
                            this.password = newPassword;
                            System.out.println("\nPassword has been changed.");
                            break;
                        } else {
                            System.out.println("\nPlease enter the same password.");
                        }
                    }
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attemptsToChangePassword + " attempts left).");
                    attemptsToChangePassword--;
                }
            }
            if (attemptsToChangePassword == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void getAccountNumber(Scanner sc) {
        if (active) {
            int attemptsToChangePassword = 3;
            while (attemptsToChangePassword != 0) {

                System.out.print("\nEnter the current password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    System.out.println("\nYour account number = " + this.accountNumber);
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attemptsToChangePassword + " attempts left).");
                    attemptsToChangePassword--;
                }
            }
            if (attemptsToChangePassword == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void checkBalance(Scanner sc) {
        if (active) {
            int attemptsToChangePassword = 3;
            while (attemptsToChangePassword != 0) {

                System.out.print("\nEnter the current password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    printBalance();
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attemptsToChangePassword + " attempts left).");
                    attemptsToChangePassword--;
                }
            }
            if (attemptsToChangePassword == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void transferMoney(Scanner sc, List<BankAccount> allUsers) {
        if (active) {
            int attemptsToChangePassword = 3;
            while (attemptsToChangePassword != 0) {

                System.out.print("\nEnter the current password: ");
                String checkPassword = sc.next();

                if (checkPassword.equals(this.password)) {
                    System.out.print("\nEnter recipient's account number = ");
                    long recipientAccountNumber = sc.nextLong();

                    BankAccount recipientUser = null;
                    for (BankAccount user : allUsers) {
                        if (user.accountNumber == recipientAccountNumber) {
                            recipientUser = user;
                            break;
                        }
                    }

                    if (recipientUser == null) {
                        System.out.println("Account not found!");
                        return;
                    }

                    System.out.println("\nEnter amount to transfer = ");
                    double transferAmount = sc.nextDouble();

                    if (transferAmount > this.balance) {
                        System.out.println("\nInsufficient Balance! :(");
                    } else {
                        // Deduct from you
                        this.balance -= transferAmount;
                        this.logTransaction("Transferred ₹" + transferAmount + " to Acc: " + recipientAccountNumber);

                        // Add to them
                        recipientUser.balance += transferAmount;
                        recipientUser.logTransaction(
                                "Received ₹" + transferAmount + " from Acc: " + this.accountNumber);

                        System.out.println("Transfer Successful!");
                        printBalance();
                    }
                    break;
                } else {
                    System.out
                            .println("\nWrong Password Try Again. ( " + attemptsToChangePassword + " attempts left).");
                    attemptsToChangePassword--;
                }
            }
            if (attemptsToChangePassword == 0) {
                System.out.println("\n\nAccount Seized.");
                this.active = false;
            }
        } else {
            System.out.println("\n\nAccount Seized.");
        }
    }

    void printBalance() {
        // Notice the single quotes surrounding 'Rs.'
        DecimalFormat indianFormat = new DecimalFormat("'Rs.' ##,##,##,##0.00");

        System.out.println("\nYour current balance = " + indianFormat.format(this.balance));
    }

    void logTransaction(String logMessage) {
        this.transactions.add(logMessage);
    }

    boolean checkUsernameAndPassword(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    void viewStatement() {
        System.out.println("\n--- Mini Statement ---");
        for (String t : this.transactions) {
            System.out.println(t);
        }
        System.out.println("----------------------");
    }
}

class DatabaseHandler {
    private static final String FILE_NAME = "users.json";

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static List<BankAccount> loadUsers() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type listType = new TypeToken<ArrayList<BankAccount>>() {
            }.getType();
            List<BankAccount> users = gson.fromJson(reader, listType);
            return users != null ? users : new ArrayList<>();
        } catch (FileNotFoundException e) {

            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void saveUsers(List<BankAccount> users) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }
}

// javac -cp gson-2.10.1.jar _09_BankAccount.java
// java -cp ".;gson-2.10.1.jar" _09_BankAccount