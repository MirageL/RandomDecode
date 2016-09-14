package msgDecode;

public class MsgDecode {
	
	public static void main(String[] args) throws Exception {

		byte[] LStestByte = {(byte)0xAA, 1, (byte)121234, 0, (byte)0xFF};
		/*Same as below:		 * 
		 * 
		 * byte[] LStestByte = new byte[5];
		LStestByte[0] = (byte)0xAA;
		LStestByte[1] = 1;
		LStestByte[2] = (byte)1256789;
		LStestByte[3] = 0;
		LStestByte[4] = (byte)0xAF;*/
		
		byte[] LSCtestByte = {(byte)0xAA, 2, (byte)121234, 0, 1, (byte)0xFF};
		
		//Light Status Message
		byte[] test1 = hexStringToByteArray("AA0100000156D8AD1C5301FF");
		//Light Status and Color Message
		byte[] test2 = hexStringToByteArray("AA0200000156D8AD1C530100FF");
		//Temperature Message
		byte[] test3 = hexStringToByteArray("AA0300000156D8AD1C530130FF");
		//Random Message
		byte[] test4 = hexStringToByteArray("AA0400000156D8B1FCBD0018594F55204445434F4445442054484520535452494E47212121FF");
		
		MessageCode lightTest1 = new MessageCode(test1);
		MessageCode lightTest2 = new MessageCode(test2);
		MessageCode lightTest3 = new MessageCode(test3);
		MessageCode lightTest4 = new MessageCode(test4);
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
