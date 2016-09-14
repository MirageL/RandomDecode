package msgDecode;

import java.util.Date;

public class TemperatureReadingMsg {

	byte[] decodeByte;
	byte endByte = (byte)0xFF;
	
	public TemperatureReadingMsg(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		EndByte();
	}

	public int TemperatureReading() {
		String tempHexValue = new String();
		for(int i=10;i<=11;i++) {
			tempHexValue = tempHexValue + String.format("%02x", decodeByte[i]);
		}
		tempHexValue = "0x" + tempHexValue;
		return Integer.decode(tempHexValue);
	}
	
	public void EndByte () throws Exception {
		if(this.decodeByte[12] != endByte) {
			throw new Exception("End byte " + this.decodeByte[12] + " not readable");
		}
	}

}
