package msgDecode.copy;

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
		
		//System.out.println(LStestByte.length);
		
		LightStatusMsg lightTest = new LightStatusMsg(LSCtestByte);
	}

}
