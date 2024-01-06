package com.Task_3;

import java.util.Scanner;

public class ATMServices {

	public static void main(String[] args) {

		double balance = 0.00;
		int deposit = 0;
		int withdraw = 0;
		int transfer = 0;

		Scanner sc = new Scanner(System.in);

		int id = 2377;
		int pin = 9847;
		while(true) {
			System.out.println("Enter the User ID:");
			int uid = sc.nextInt();
			System.out.println("-----------------------------------");
			if(id==uid) {
				while(true) {
					System.out.println("Enter the PIN Number:");
					int p = sc.nextInt();
					System.out.println("-----------------------------------");
					if(pin==p) {
						System.out.println("Successfully Logged into the Account");
						System.out.println("-----------------------------------");
						while(true) {
							System.out.println();
							System.out.println();
							System.out.println("WELCOME TO ATM SERVICE CENTER");
							System.out.println("-----------------------------------");
							System.out.println("1. Deposit");
							System.out.println("2. Withdraw");
							System.out.println("3. Transfer");
							System.out.println("4. Transaction History");
							System.out.println("5. Exit");
							System.out.println("-----------------------------------");
							System.out.println("Select one option from above:");

							int o = sc.nextInt();
							System.out.println("-----------------------------------");
							switch(o) {
							case 1:
								System.out.println("Enter amount to deposit: ");
								int d = sc.nextInt();
								if(d>0) {
									deposit += d;
									balance += d;
									System.out.println("Amount deposited successfully");
									System.out.println("Current Balance= " + balance);
									System.out.println("-----------------------------------");
								}
								else {
									System.out.println("Amount can't be negative");
									System.out.println("-----------------------------------");
								}
								break;

							case 2:
								System.out.println("Enter amount to withdraw: ");
								int w = sc.nextInt();
								if(balance>=w) {
									withdraw += w;
									balance -= w;
									System.out.println("Amount withdrawn successfully");
									System.out.println("Current Balance= " + balance);
									System.out.println("-----------------------------------");
								}
								else {
									System.out.println("-----------------------------------");
									System.out.println("Oops..,Insufficient Funds,U can withdraw upto= " + balance);
									System.out.println("-----------------------------------");
								}	
								break;

							case 3:
								while(true) {
									System.out.println("plz,Enter the Account Number");
									int accN1 = sc.nextInt();
									System.out.println("Enter the IFSC code");
									int ifsc = sc.nextInt();
									System.out.println("plz,Confirm the Account Number");
									int accN2 = sc.nextInt();
									if(accN1!=accN2) {
										System.out.println("-----------------------------------");
										System.out.println("Plz,Enter same Account Number");
										System.out.println("-----------------------------------");
									}
									else {
										System.out.println("Enter the amount to transfer");
										int t =sc.nextInt();
										if(balance>=t) {
											transfer +=t;
											balance -= t;
											System.out.println("Amount transferred successfully");
											System.out.println("Current balance= " + balance);
											System.out.println("-----------------------------------");
											break;
										}
										else {
											System.out.println("Insufficient Funds, U can withdarw upto= "+ balance);
											System.out.println("-----------------------------------");
										}
									}
								}
								break;

							case 4:
								int amount = withdraw + transfer;
								System.out.println("Transfer History");
								System.out.println("-----------------------------------");
								System.out.println("Current Balance= " + balance);
								System.out.println("Credited(+)= " + deposit );
								System.out.println("Debited(-)= " + amount);
								System.out.println("-----------------------------------");
								break;

							case 5:
								System.out.println("Tq for comming. Plz visit again.....");
								System.exit(0);
								break;

							default:
								System.out.println("please choose the correct option.....");
								System.out.println("-----------------------------------");
							}
						}
					}
					else {
						System.out.println("Plz,Enter the correct PIN Number");
						System.out.println("-----------------------------------");
					}
				}
			}
			else {
				System.out.println("Plz,Enter the Correct ID");
				System.out.println("-----------------------------------");
			}
		}
	}
}