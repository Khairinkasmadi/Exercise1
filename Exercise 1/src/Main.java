
public class Main {
	
	public static void main (String[] args) {
		
		Biodata b = new Biodata();
		Workskills c = new Workskills();
		Workexperiences d = new Workexperiences();
		Talents e = new Talents();
		Result f = new Result();
		Cgpa g = new Cgpa();
		
		

		b.printName(); b.printAge(); b.printAdd();
		b.printEmail(); b.printNum();
		
		c.printWorkskills();
		d.printWorkexperiences();
		e.DimArr();
		f.printResult();
		g.printCGPA(); g.printGPA();
		
		
		
		System.out.println("\n" + "Final CGPA : " +g.calculateCGPA());
		
		
	
		
		
		
		
	}

}
