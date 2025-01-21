public class PraktekJava {
	public static void test(String[] args) {

	//perubahan data variable
	//secara default nilai data bisa di ubah ubah
	
		String name;
		int age;
		String address;

		name = "lospaulos";
		age = 16;
		address = "indonesia";

		//pergantian data dengan variable yang sama
		//ini akan menimpah data yang pertama

		name = "gantilos";
		age = 17;
		address = "gantiindo";

	//nilai yang ditetetapkan sifatnya
	//jika nilai ingin berifat tetap bisa memakai final


		final String namatetap;
		final int agetetap;
		final String addresstetap;

		namatetap = "tetaplos";
		agetetap = 30;
		addresstetap = "tetapindo";
		
		//note : nilai tidak akan bisa di ganti ganti

	//bisa langsung di isi nilai nya

		String name2 = "langsunglos";
		final String name3 = "lansungfinallos";

		//atau dengan var
		/*dengan var kita bisa membuat variable 
		 * tanpa disebut nama tipe data nya*/
		var name4 = "var harus langsung";
		var nomor = 80;
		var huruf = 'C';
		//note : var harus langsung di isi datanya
		
		

		

	
	}

	public static void main(String[] args) {

	//pengisian data dengan tipeDataObject
	
		final var pagename = "Your Data";
		System.out.println(pagename);

		String username;
		Integer ageuser;
		String statuser;

		//InputValue

		username = "lospaulos";
		ageuser = 16;
		statuser = "Student";
		//OutputValue
		System.out.println(username);
		System.out.println(ageuser);
		System.out.println(statuser);

	//perubahan tipeDataObject
	
		Byte nilly = 40;
		Integer convr = nilly - 10_000;
		System.out.println(convr);
		//bisa dilakukan di tipeDataPrimitive

		//perubahan tipeDataObject
		//dengan tipeDataPrimitive

		byte prim = 20;
		short convr5 = prim;
		Short endress = convr5;



	}

}
