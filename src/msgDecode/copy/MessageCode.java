package msgDecode.copy;

import java.util.Date;

public class MessageCode {

	byte[] decodeByte;
	byte startByte = (byte)0xAA;
	byte endByte = (byte)0xFF;
	
	
	public MessageCode(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		StartingByte();
		String msgCode = msgCode();
		Date date = EpochConvert();
		System.out.println(msgCode + " on " + date);
	}
	
	public void StartingByte () throws Exception {
		if(this.decodeByte[0] != startByte) {
			System.out.println("This is not a parsable message");
			throw new Exception();
		}
	}
	
	public String msgCode(){
		String msgCode = null;
		switch(this.decodeByte[1]){
		case 1: msgCode = "Light Status";
		break;
		case 2: msgCode = "Light Status and Color";
		break;
		case 3: msgCode = "Temperature Reading";
		break;
		case 4: msgCode = "Random Message";
		break;
		}
		return msgCode;
	}
	
	public Date EpochConvert() {
		Date date = new Date((long)this.decodeByte[2]);
		return date;
	}
	
}
