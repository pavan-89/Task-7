package pep_task7.pep_task7;


public class Singleton {
	private int id;
	private String data;
	private String dept;
	private static final Singleton object=new Singleton(570,"arya","CSE");
	
	private Singleton(int id, String data,String dept) {
		this.id = id;
		this.data = data;
		this.dept=dept;
	}
	
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}
	public String getDept()
	{
		return dept;
	}

	public static Singleton getInstance(){
		return object;
	}
}