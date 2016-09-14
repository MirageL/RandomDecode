package msgDecode;

public class LightStatusColorMsg {

	byte[] decodeByte;
	byte endByte = (byte)0xFF;
	
	public LightStatusColorMsg(byte[] decodeByte) throws Exception {
		//super(decodeByte);
		this.decodeByte = decodeByte;
	}
	
	public String StatusCodeMsg(){
		String statusCode = null;
		switch(this.decodeByte[10]){
		case 0: statusCode = "ON";
		break;
		case 1: statusCode = "OFF";
		break;
		}
		return statusCode;
	}

	public String LightColor(){
		String colorCode = null;
		switch(this.decodeByte[11]){
		case 0: colorCode = "Blue";
		break;
		case 1: colorCode = "Green";
		break;
		case 2: colorCode = "Red";
		break;
		}
		return colorCode;
	}
	
	public void EndByte () throws Exception {
		if(this.decodeByte[12] != endByte) {
			throw new Exception("End byte " + this.decodeByte[12] + " not readable");
		}
	}

}
