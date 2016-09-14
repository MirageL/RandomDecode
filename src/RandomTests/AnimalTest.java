package RandomTests;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println((byte)1);

		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		//a bit confused why i can initiate a type animal but i can initialize
		//a an ArrayList of type Animal
		
		AnimalList.add(new Cow());
		AnimalList.add(new Dog());
		AnimalList.add(new Cat());
		
		
		Date date = new Date(0);
		
		byte[] testbyte = new byte[10];
		System.out.println(testbyte.length);
		byte[] test2byte = {2, 3, 4};
		//testbyte[2] = test2byte;
		System.out.println(test2byte[1]==3);
		
		for(Animal animal: AnimalList) {
			animal.makenoise();
		}*/
		
		Animal miragetest = new Cat();
		
		String hexString = "AA0100000156D8AD1C5301FF";
		byte[] byteArray1 = hexStringToByteArray(hexString);
		
		System.out.println(byteArray1[0]);
		System.out.println(byteArray1);
		System.out.println(hexStringToByteArray("AA0100000156D8AD1C5301FF"));
		System.out.println("string " + new String(new byte[] {0x63}));
		System.out.println(new byte[] {0x63});
		System.out.println("string " + Byte.toString((byte)0x63));
		System.out.println("string " + Byte.toString(byteArray1[0]));
		//System.out.println(hexString);
		System.out.println(Long.decode("0x00000156D8AD1C53"));
		System.out.println(byteArray1.length);
		//Date date = new Date((long)"00000156D8AD1C53");
	}
	
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}

}
