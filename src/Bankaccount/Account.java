package Bankaccount;

import java.util.ArrayList;

public class Account {
	    private String accountHolder;
	    private double balance;
	    private ArrayList<String> transactionHistory;
	    
	    
	    
	    
	    
	    public String getAccountHolder() {
			return accountHolder;
		}





		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}
		   // Constructor
	    public Account(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	        this.transactionHistory = new ArrayList<>();
	        transactionHistory.add("Account created with balance: ₹" + initialBalance);
	    }





		public double getBalance() {
			return balance;
		}





		public void setBalance(double balance) {
			this.balance = balance;
		}





		public ArrayList<String> getTransactionHistory() {
			return transactionHistory;
		}





		public void setTransactionHistory(ArrayList<String> transactionHistory) {
			this.transactionHistory = transactionHistory;
		}
		public Account(String accountHolder, double balance, ArrayList<String> transactionHistory) {
			super();
			this.accountHolder = accountHolder;
			this.balance = balance;
			this.transactionHistory = transactionHistory;
		}
	

		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		 public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            transactionHistory.add("Deposited: ₹" + amount + " | Balance: ₹" + balance);
		            System.out.println("₹" + amount + " deposited successfully!");
		        } else {
		            System.out.println("Invalid deposit amount!");
		        }
		    }
		 
		 
		 // Withdraw method
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		            balance -= amount;
		            transactionHistory.add("Withdrawn: ₹" + amount + " | Balance: ₹" + balance);
		            System.out.println("₹" + amount + " withdrawn successfully!");
		        } else if (amount > balance) {
		            System.out.println("Insufficient balance!");
		        } else {
		            System.out.println("Invalid withdrawal amount!");
		        }
		    }
		    
		    
		    public void showBalance() {
		        System.out.println("Current Balance: ₹" + balance);
		    }

		    // Show transaction history
		    public void showTransactionHistory() {
		        System.out.println("\nTransaction History:");
		        for (String transaction : transactionHistory) {
		            System.out.println(transaction);
		        }
		    }
    
	    
}
