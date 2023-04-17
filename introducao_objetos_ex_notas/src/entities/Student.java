package entities;

public class Student {
	
	public String nome;
	public double primeiro;
	public double segundo;
	public double terceiro;
	
	public double finalGrade() {
		return primeiro + segundo + terceiro;
	}
	
	public double missing() {
		return 60 - finalGrade();
	}
	
}
