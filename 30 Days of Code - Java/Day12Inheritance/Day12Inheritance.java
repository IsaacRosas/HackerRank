import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

  
    public Student(String firstName, String lastName, int identification,int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    public char calculate(){
        int n = testScores.length;
        int suma = 0;
        char s = 0;
        double promedio = 0;
        
        for(int i = 0;i < n;i++){
            suma += testScores[i];
        }
        promedio = suma / n;
        if(promedio >= 90 && promedio<=100){
            s = 'O';
        }else if(promedio >= 80 && promedio < 90){
            s = 'E';
        }else if(promedio >= 70 && promedio < 80){
            s = 'A';
        }else if(promedio >= 55 && promedio < 70){
            s = 'P';
        }else if(promedio >= 40 && promedio < 55){
            s = 'D';
        }else if(promedio < 40){
            s = 'T';
        }
        return s;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}