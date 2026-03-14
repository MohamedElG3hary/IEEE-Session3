package org.example;


import java.util.Scanner;

public class Main {


    public static void menu(){
        System.out.println("=======================");
        System.out.println("Select Your Program !");
        System.out.println("1 - BankApp");
        System.out.println("2 - Purchase App");
        System.out.println("0 - Exit ");
        System.out.println("=======================");
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

       do {
           menu();
           choice =scanner.nextInt();
           switch (choice){
                case 1 -> {
                    // BankAccount
                    BankAccount bankAccount1 = new BankAccount();
                    bankAccount1.setAccountHolder("Mohamed");
                    bankAccount1.setBalance(1000);

                    BankAccount bankAccount2 = new BankAccount();
                    bankAccount2.setAccountHolder("Ahmed");
                    bankAccount2.setBalance(1000);

                    System.out.println("Before Transfer .");
                    System.out.println("BankAccount 1 : " + bankAccount1.getAccountHolder() + " and Him Balance : "+bankAccount1.getBalance());
                    System.out.println("BankAccount 2 : " + bankAccount2.getAccountHolder() + " and Him Balance : "+bankAccount2.getBalance());
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Number of Transfer would be Perform : ");
                    int number = scanner.nextInt();

                    for (int i = 0; i < number; i++) {
                        System.out.print("Enter Your Amount to be Transfer : ");
                        int amount = scanner.nextInt();
                        BankAccount.transfer(bankAccount1,bankAccount2,amount);
                    }

                    System.out.println("After Transfer .");
                    System.out.println("BankAccount 1 : " + bankAccount1.getAccountHolder() + " and Him Balance : "+bankAccount1.getBalance());
                    System.out.println("BankAccount 2 : " + bankAccount2.getAccountHolder() + " and Him Balance : "+bankAccount2.getBalance());


                }
                case 2 -> {

                    Customer customer = new Customer();
                    customer.setBalance(100);

                    Product product1 = new Product();
                    product1.setProductName("Phone");
                    product1.setPrice(30);
                    product1.setInStock(false);

                    customer.purchase(product1);
                }
                case 0 ->  {
                    System.out.println("Exiting Program !!");
               }
               default -> {

                   System.out.println("Invalid Choice !! ");
               }


           }


       }while (choice !=0);











        }
    }

