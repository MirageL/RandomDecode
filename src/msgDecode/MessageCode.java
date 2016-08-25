package msgDecode;

public abstract class MessageCode {

	byte[] decodeByte = new byte[getByteSize()];
	byte startByte = (byte)0xAA;
	byte endByte = (byte)0xFF;
	
	
	public MessageCode(byte[] decodeByte){
		if(decodeByte.length != getByteSize() || decodeByte[0] != startByte || 
				decodeByte[decodeByte.length-1] != endByte) {
			System.out.println("This is not a parsable message");
		}
		this.decodeByte = decodeByte;
	}
	
	public String msgCode(byte[] decodeByte){
		String msgCode = null;
		switch(decodeByte[1]){
		case 1: msgCode = "Light Status";
		break;
		case 2: msgCode = "Light Status and Temperature";
		break;
		case 3: msgCode = "Temperature Reading";
		break;
		case 4: msgCode = "Random Message";
		break;
		}
		return msgCode;
	}
	
	public abstract int getByteSize();
	
}
