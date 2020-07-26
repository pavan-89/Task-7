package pep_task7.pep_task7;


public class File2 extends Template{
	@Override
	public void read() {
		System.out.println("This File is readable");
	}

	@Override
	public void write() {
		System.out.println("This File cannot be edited");
	}

	@Override
	public void both() {
		System.out.println("This file has only read acsess");
		System.out.println();
		
	}

}