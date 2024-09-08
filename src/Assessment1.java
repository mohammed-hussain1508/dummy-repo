import java.util.Scanner;

public class Assessment1 {

    public static void GradeCalculation(){
        System.out.println("IN ASSESSMENT-1");
        Scanner sc =new Scanner(System.in);

        String[] subjects = new String[5];
        int[] marks = new int[5];
        char[] grades = new char[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter the name of subject"+(i+1)+"----> ");
            subjects[i]=sc.nextLine();
        }

        for(int i=0;i<5;i++){
            System.out.print("Enter the marks----->");
            marks[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            if(marks[i]>=90){
                grades[i]='A';
            } else if (marks[i]>=70) {
                grades[i]='B';
            }
            else if (marks[i]>=50) {
                grades[i]='C';
            }
            else if (marks[i]>=40) {
                grades[i]='D';
            }
            else{
                grades[i]='F';
            }
        }
        System.out.println("FINAL MARKS SHEET");
        for(int i=0;i<5;i++){
            System.out.println(subjects[i]+"----"+marks[i]+"------"+grades[i]);
        }
    }

}
