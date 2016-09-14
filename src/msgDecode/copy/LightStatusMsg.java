package msgDecode.copy;

public class LightStatusMsg extends MessageCode {

	byte[] decodeByte;
	byte endByte = (byte)0xFF;
	
	public LightStatusMsg(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		EndByte();
		System.out.println(StatusCodeMsg());
	}

	public String StatusCodeMsg(){
		String statusCode = null;
		switch(this.decodeByte[3]){
		case 0: statusCode = "ON";
		break;
		case 1: statusCode = "OFF";
		break;
		}
		return statusCode;
	}
	
	public void EndByte () throws Exception {
		if(this.decodeByte[4] != endByte) {
			System.out.println("This is not a parsable message");
			throw new Exception();
		}
	}
}
