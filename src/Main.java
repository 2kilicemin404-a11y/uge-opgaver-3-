// Opgave 1 bankkonto "Emin"

double balance = 0;

String accountName = "Emin";

void main(){
    accountName = "Emin";
deposit100();
deposit100();
withdraw50();
printBalance();

}

void printBalance(){
System.out.println("saldo: " + accountName);
   System.out.println("kr: " + balance);;
}

void deposit100(){
balance = balance +100;
}

void withdraw50(){
balance = balance -50;
}

