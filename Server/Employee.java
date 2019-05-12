abstract class Employee{
	protected String username;
	protected String password;
	protected String full_name;
	protected Date birthdate;
	protected int amka;
	protected int ama;
	protected int afm;
	protected int phone_number;
	protected String email;
	protected double hours_worked;
	protected Device device;
	boolean is_new;

	Employee(String username, String password, String name, Date date, int amka, int ama, int afm, int number, String email, double hours, boolean is_new){
		this.username = username;
		this.password = password;
		this.full_name = name;
		this.birthdate = date;
		this.amka = amka;
		this.ama = ama;
		this.afm = afm;
		this.phone_number = number;
		this.email = email;
		this.hoursworked = hours;
		this.is_new = is_new;
	}

	getDevice(){

	}
}

	