package msgDecode;

public class RandomMessage {

	byte[] decodeByte;
	byte endByte = (byte)0xFF;
	int RanMesLength;
	
	public RandomMessage(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		this.RanMesLength = MessageLength();
		EndByte();
	}

	public int MessageLength() {
		String tempHexValue = new String();
		for(int i=10;i<=11;i++) {
			tempHexValue = tempHexValue + String.format("%02x", decodeByte[i]);
		}
		tempHexValue = "0x" + tempHexValue;
		return Integer.decode(tempHexValue);
	}
	
	public String CharacterMessage() {
		StringBuilder RandoMessage = new StringBuilder();
		for(int i=12;i<=12+this.RanMesLength;i++){
			RandoMessage.append((char)this.decodeByte[i]);
		}
		return RandoMessage.toString();
	}
	
	public void EndByte () throws Exception {
		if(this.decodeByte[12+RanMesLength+1] != endByte) {
			throw new Exception("End byte " + this.decodeByte[12+RanMesLength+1] + " not readable");
		}
	}

}
