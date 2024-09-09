package com.example.bankaccountapp

class BankAccount(
    var accountHolder : String,// properties of the bankaccount class
    var balance : Double
)
{
    private val transactionHistory = mutableListOf<String>() //declaring a private type empty list

    fun deposit(amount : Double){ //amount will be deposited in the bank(here amount is parameter)
        balance+= amount // balance = balance + amount
        transactionHistory.add("$accountHolder deposited  $$amount")
    }

    fun withdraw(amount: Double){ //method of BankAccount class
        if(amount<=balance){
            // we can withdraw
            balance-= amount // balance= balance - amount
            transactionHistory.add("$accountHolder withdrew  $$amount")
        }else{
            // we can't withdraw
            //println("You don't have the funds to withdraw $$amount")
            transactionHistory.add("$accountHolder tried to withdrew  $$amount , but this transaction failed due to Insufficient balance.")
        }
    }

    fun displaytransactionHistory(){
        println("Transaction history for the $accountHolder ---")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

    fun acctBalance(){
        println("The current balance in the ${accountHolder}'s bank account is : $${balance}")
    }

}