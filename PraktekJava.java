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
	
		//convert
	}

}
