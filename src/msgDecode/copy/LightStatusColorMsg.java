package msgDecode.copy;

public class LightStatusColorMsg extends LightStatusMsg {

	public LightStatusColorMsg(byte[] decodeByte) throws Exception {
		super(decodeByte);
	}

	public String LightColor(){
		String statusCode = null;
		switch(this.decodeByte[4]){
		case 0: statusCode = "Blue";
		break;
		case 1: statusCode = "Green";
		break;
		case 2: statusCode = "Red";
		break;
		}
		return statusCode;
	}

}
