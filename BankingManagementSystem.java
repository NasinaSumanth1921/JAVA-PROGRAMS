import java.util.Scanner;
class Main{
 static int ammount = 1000;
 void entry(){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE ACCOUNT NUMBER :123456789 ");
    String accountnumber = sc.nextLine();
    System.out.print("ENTER THE CUSTOMER NAME :nasina sumanth ");
    String customername = sc.nextLine();
    System.out.println("");
    System.out.println("ACCOUNT NUMBER : "+accountnumber);
    System.out.println("CUSTOMER NAME : "+customername);
    System.out.println("INITIAL BALANCE : "+ammount);
 }
 void deposit(){
    Scanner sc1 = new Scanner(System.in);
    System.out.println("");
    System.out.println("========== WELCOME TO DEPOSIT SECTION ==========");
    System.out.print("ENTER THE AMOUNT TO DEPOSIT :5000 ");
    int depositmoney = sc1.nextInt();
    if(depositmoney > 0){
        ammount = depositmoney + ammount;
        System.out.println("=== SUCCESSFULLY DEPOSITED THE CASH ===");
        System.out.println("ACCOUNT BALANCE : "+ammount);
    }
    else{
        System.out.println("*** ENTER THE AMMOUNT GREATER THAN 0 ***");
    }

 }
 void withdraw(){
    Scanner sc2 = new Scanner(System.in);
    System.out.println("");
    System.out.println("========== WELCOME TO WITHDRAW SECTION ==========");
    System.out.print("ENTER THE AMOUNT TO WITHDRAW : ");
    int withdraw = sc2.nextInt();
    if(withdraw > 0){
        if(withdraw <= ammount){
            ammount = ammount - withdraw;
            System.out.println("=== AMOUNT WITHDRAWED SUCCESSFULLY ===");
            System.out.println("ACCOUNT BALANCE : "+ammount);
        }
        else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
 }
 int returnbalance(){
    System.out.println("");
    System.out.println("CURRENT ACCOUNT BALANCE : "+ammount);
    return ammount;
 }
void exit(){
    System.out.println("");
    System.out.println("========== THANK-YOU VISIT AGAIN ==========");
}
public static void main(String[] args){
    Main atm = new Main();
    atm.entry();
   Scanner sc2 = new Scanner(System.in);
   boolean running = true;
   while(running){
        System.out.println("");
        System.out.println("========== ATM MENU ==========");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.print("ENTER YOUR CHOICE : ");
        int choice = sc2.nextInt();
        if(choice == 1){
            atm.deposit();
        }
        else if(choice == 2){
            atm.withdraw();
        }
        else if(choice == 3){
            atm.returnbalance();
        }
        else if(choice == 4){
            atm.exit();
            running = false;
        }
        else{
            System.out.println("*** INVALID CHOICE ***");
        }
   }
}
}
