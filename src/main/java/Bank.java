/**
 * Implement a bank class.
 * <p>
 * In this lab we will model a bank. We have two classes: Bank and BankAccount. You should finish
 * both classes, by fixing checkstyle errors, defining constructors, getters and setters, and
 * accessing private variables.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class Bank extends BankAccount {

    /**
     * Name of the bank.
     */
    private String bankName;

    /**
     * Creates a bank.
     */
    public Bank() {
        bankName = "Illini Bank";
    }

    /**
     * Withdraw money from an account.
     * <p>
     * Subtracts the amount of money from bank account's balance. Returns true if transaction is
     * successful, false otherwise.
     *
     * @param bankAccount to withdraw money from.
     * @param amount to withdraw (double)
     * @return boolean
     */
    public boolean withdrawMoney(final BankAccount bankAccount, final double amount) {
        /*
         * Implement this function
         */
        if (amount < 0.0) {
            return false;
        }
        double currentBalance = bankAccount.getAccountBalance();
        currentBalance = currentBalance - amount;
        if (currentBalance < 0.0) {
            return false;
        }
        bankAccount.setAccountBalance(currentBalance);
        return true;
    }

    /**
     * Deposit money in an account.
     * <p>
     * Adds the amount of money to bank account's balance. Returns true if transaction is
     * successful, false otherwise.
     *
     * @param bankAccount to deposit money to.
     * @param amount to deposit
     * @return boolean
     */
    public boolean depositMoney(final BankAccount bankAccount, final double amount) {
        /*
         * Implement this function
         */
        if (amount < 0.0) {
            return false;
        }
        double currentBalance = bankAccount.getAccountBalance();
        currentBalance = currentBalance + amount;
        bankAccount.setAccountBalance(currentBalance);
        return true;
    }

    /**
     * Transfer money from one account to another.
     * <p>
     * Transfer the amount of money from one back account to another. Returns true if transaction is
     * successful, false otherwise.
     *
     * @param source bank account to transfer money from.
     * @param destination bank account to transfer money to.
     * @param amount to transfer
     * @return boolean
     */

    public boolean transferMoney(final BankAccount source, final BankAccount destination,
            final double amount) {
        /*
         * Implement this function
         */
        if (amount < 0.0) {
            return false;
        }
        double balance1 = source.getAccountBalance();
        double balance2 = destination.getAccountBalance();
        balance1 = balance1 - amount;
        balance2 = balance2 + amount;
        if (balance1 < 0.0) {
            return false;
        }
        source.setAccountBalance(balance1);
        destination.setAccountBalance(balance2);
        return true;
    }

    /**
     * Change back account owner name.
     *
     * @param bankAccount to change
     * @param name new name to set
     */

    public void changeOwnerName(final BankAccount bankAccount, final String name) {
        /*
         * Implement this function
         */
        bankAccount.setOwnerName(name);
    }

    /**
     * Number of bank accounts opened.
     */
    private static int totalAccounts = 0;
    /**
     * Uses static variable to get number of bank accounts opened.
     *
     * @return the total number of accounts
     */

    public static int getNumberOfAccount() {
        /*
         * Implement this function
         */
        return totalAccounts;
    }

    /**
     * Main method for testing.
     *
     * @param unused unused input arguments
     */
    @SuppressWarnings("checkstyle:magicnumber")
    public static void main(final String[] unused) {
        Bank bank = new Bank();
        System.out.println("Welcome to " + bank.bankName);
        System.out.println("We are excited to have you banking with us!\n\n");

        // Create Bank Accounts
        BankAccount account1 = new BankAccount("John Doe", BankAccountType.CHECKINGS);
        totalAccounts += 1;
        System.out.println("Bank account for John Doe created");

        BankAccount account2 = new BankAccount("Jony Ive", BankAccountType.STUDENT);
        totalAccounts += 1;
        System.out.println("Bank account for Jony Ive created\n\n");

        // Deposit money to both accounts and print new balance
        bank.depositMoney(account1, 1000.0);
        bank.depositMoney(account2, 5000.0);
        System.out.printf("Account balance for John Doe: %.2f", account1.getAccountBalance());
        System.out.println();
        System.out.printf("Account balance for Jony Ive: %.2f", account2.getAccountBalance());
        System.out.println();
        // Withdraw money from Account 2 and print new balance
        bank.withdrawMoney(account2, 200.0);
        System.out.printf("New account balance for Jony Ive: %.2f", account2.getAccountBalance());
        System.out.println();

        // Transfer money from Account 2 to Account 1 and print new balances
        bank.transferMoney(account2, account1, 350.0);
        System.out.printf("New account balance for John Doe: %.2f", account1.getAccountBalance());
        System.out.println();
        System.out.printf("New account balance for Jony Ive: %.2f", account2.getAccountBalance());
        System.out.println("\n\n");

        // Print number of accounts
        System.out.print("Number of active accounts at " + bank.bankName + " are ");
        System.out.println(Bank.totalAccounts);
    }
}
