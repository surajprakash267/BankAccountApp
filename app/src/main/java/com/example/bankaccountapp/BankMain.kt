package com.example.bankaccountapp

fun main(){
    // kathanBankAccount & mehsiBankAccount are the objects of BankAccount Class
    val kathanBankAccount = BankAccount("Surendra",12000.0)
    val mehsiBankAccount = BankAccount("Sarah",0.0)

    //kathan bank account object
    println("The opening balance of ${kathanBankAccount.accountHolder}'s account is : $${kathanBankAccount.balance}.")
    kathanBankAccount.deposit(10000.0) //accessing the properties of BankAccount class
    kathanBankAccount.withdraw(2000.0)
    kathanBankAccount.deposit(1000.0)
    kathanBankAccount.withdraw(2000.0)
    kathanBankAccount.displaytransactionHistory()
    kathanBankAccount.acctBalance()
 //  println("${kathanBankAccount.accountHolder}'s balance is $${kathanBankAccount.balance}")

    // Mehsi bank account object

    println("The opening balance of ${mehsiBankAccount.accountHolder}'s account is : $${mehsiBankAccount.balance}.")
    mehsiBankAccount.deposit(100.0) //accessing the properties of BankAccount class
    mehsiBankAccount.withdraw(10.0)
    mehsiBankAccount.deposit(300.0)
    mehsiBankAccount.withdraw(1000.0)
    mehsiBankAccount.deposit(3000.0)


    mehsiBankAccount.displaytransactionHistory()
    mehsiBankAccount.acctBalance()
}