package pep_task7.pep_task7;

public abstract class Template {
	public abstract void read();
	public abstract void write();
	public abstract void both();
	
	public void files() {
		read();
		write();
		both();
	}

}
