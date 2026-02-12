//// Opgave 1 bankkonto "Emin"
//
//double balance = 0;
//
//String accountName = "Emin";
//
//void main(){
//    accountName = "Emin";
//deposit100();
//deposit100();
//withdraw50();
//printBalance();
//
//}
//
//void printBalance(){
//System.out.println("saldo: " + accountName);
//   System.out.println("kr: " + balance);;
//}
//
//void deposit100(){
//balance = balance +100;
//}
//
//void withdraw50(){
//balance = balance -50;
//}





        // opgave 2 Karakter - beregner
int assignmentPoints = 0;

int examPoints = 0;

int projectPoints = 0;




void main(){
addAssignmentsPoints(25);
addExamPoints(40);
addProjectPoints(30);
printTotal();
}

void addAssignmentsPoints(int points) {
 assignmentPoints = assignmentPoints + points;
}

void addExamPoints(int points){
 examPoints = examPoints + points;
}

void addProjectPoints(int points){
    projectPoints = projectPoints + points;
}

void printTotal(){
 int total = projectPoints + examPoints + assignmentPoints;
 System.out.println("score: " + total);

}