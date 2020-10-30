
public class Cgpa {
	
	double cgpa1 = 3.5;
	double gpa[] = {3.0, 3.2, 3.4, 3.9};
	double sum=0;
	double finalcgpa =0;

	public void printCGPA() {
		System.out.println("CGPA from method is " + cgpa1);
	}
	public void printGPA() {
		
		
		
		for(int i=0; i<gpa.length; i++) {
			System.out.println( "Sem " + (i+1) +" "+ gpa[i]);
		}
		
		
	}
	public double calculateCGPA() {
		for(int i=0; i<gpa.length; i++) {
			sum+=gpa[i];
			//sum = sum + gpa[i];
		}
		if(gpa.length !=0) { 
		finalcgpa = sum/gpa.length;
		
		} else {
			finalcgpa = 0.0;
		}
		
		return finalcgpa;	

	}
	

}
