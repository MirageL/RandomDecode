package msgDecode;

public class LightStatusMsg {

	byte[] decodeByte;
	byte endByte = (byte)0xFF;
	
	public LightStatusMsg(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		EndByte();
		//System.out.println(StatusCodeMsg());
	}

	public String StatusCodeMsg() throws Exception {
		String statusCode = null;
		switch(this.decodeByte[10]){
		case 0: statusCode = "ON";
		break;
		case 1: statusCode = "OFF";
		break;
		default: throw new Exception("This status code is unavailable");
		}
		return statusCode;
	}
	
	public void EndByte () throws Exception {
		if(this.decodeByte[11] != endByte) {
			throw new Exception("End byte " + this.decodeByte[11] + " not readable");
		}
	}
}
