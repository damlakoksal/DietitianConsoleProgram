
public class Test{

	public static void main(String[]args) {
		Patient d=new Patient("Damla","Koksal",51,1.61);
		d.setBirthdate("10/10/1996");
		d.setBmi();
		d.setpId();
		d.setUsername();
		System.out.println("Username: "+ d.getUsername() +
						   "\nName: "+ d.getpName() +
						   "\nSurname: "+ d.getpSurname() +
						   "\nBirthdate: " + d.getBirthdate() +
						   "\nAge: " + d.getAge() +
						   "\nWeight: " + d.getWeight() +
						   "\nHeight: " + d.getHeight() +
						   "\nBmi: " + d.getBmi() +
						   "\nId: " + d.getpId());
	}
}