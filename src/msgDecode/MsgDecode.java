package msgDecode;

public class MsgDecode {

	/*public String Message (byte[] decodeByte) {
	    StringBuilder hexByte = new StringBuilder();
	    for (byte b : decodeByte) {
	        hexByte.append(String.format("%02X ", b));
	    }
	    System.out.println(sb.toString());
		if(decodeByte[0] != 0xAA && decodeByte[decodeByte.length-1] != 0xFF){
			return "I can't read this code";
		}
		String message = null;
		String[] msgCode = {"Light Status","Light Status and Color","Temperature","Random Message"};
		return message;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		/*int x = 10;
		byte[] message = new byte[]{(byte)0xAA};
		System.out.println((byte)0xA0);
		if (message[0] == (byte)0xAA){
			System.out.println(true);
		}
		//message[0] = 0xAA;
		System.out.println(message.length);
		System.out.println(message);
		System.out.println((byte)0xAA);
		byte[] bytes = {(byte) 130, 0, 1, 2, 3, (byte) 160 };
	    StringBuilder sb = new StringBuilder();
	    for (byte b : bytes) {
	        sb.append(String.format("%02X ", b));
	    }
	    char[] str = new char[2];
	    System.out.println(sb.toString().getClass().getSimpleName());
	    sb.toString().getChars(0, 2, str, 0);
	    System.out.println(str);
	    for (char test:sb.toString().toCharArray()){
	    	System.out.print(test);*/
	    }
	
	public int ParseMessage(byte[] Message){
		
		//ArrayList<MessageCode> 
	    return 0;
	}

}
