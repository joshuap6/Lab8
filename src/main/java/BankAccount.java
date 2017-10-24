//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /**
     * Creates a bank account.
     */
    public BankAccount() {
    }
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Properties of the bank account.
     */
    public enum BankAccountType {
        /**
         * An account used for everyday transactions, used with debit cards, checks, and cash
         * withdrawals.
         */
        CHECKINGS,
        /**
         * An account used with long term saving in mind. Has an interest rate that accumulates
         * more money over time.
         */
        SAVINGS,
        /**
         * Checking accounts for students that usually have no monthly fees.
         */
        STUDENT,
        /**
         * Accounts with a set amount of credit tha can be used.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;
    /**
     * Type of account.
     */
    private BankAccountType accountType;
    /**
     * Current balance of the account.
     */
    private double accountBalance;
    /**
     * Name of the owner.
     */
    private String ownerName;
    /**
     * Rate of interest.
     */
    private double interestRate;
    /**
     * Amount of interest earned.
     */
    private double interestEarned;

    /**
     * Creates a bank account with a name and the type of account.
     * @param name The name of the owner of the bank account
     * @param accountCategory The type of bank account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * Obtains account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Obtains type of account.
     * @return type of account
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }
    /**
     * Gets the balance of the account.
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * Gets the name of the owner.
     * @return the account owner
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Gets the rate of interest.
     * @return the rate of interest
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * Gets the total amount of interest earned.
     * @return the interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * Sets the account number.
     * @param a the account number
     */
    public void setAccountNumber(final int a) {
        accountNumber = a;
    }
    /**
     * Sets the bank account type.
     * @param a the account type
     */
    public void setBankAccountType(final BankAccountType a) {
        accountType = a;
    }
    /**
     * Sets the account balance.
     * @param a the account balance
     */
    public void setAccountBalance(final double a) {
        accountBalance = a;
    }
    /**
     * Sets the owner name.
     * @param a the owner's name
     */
    public void setOwnerName(final String a) {
        ownerName = a;
    }
    /**
     * Sets the rate of interest.
     * @param a the rate of interest
     */
    public void setInterestRate(final double a) {
        interestRate = a;
    }
    /**
     * Sets the total interest earned.
     * @param a the total interest earned
     */
    public void setInterestEarned(final double a) {
        interestEarned = a;
    }
}
