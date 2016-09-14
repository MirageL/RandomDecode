package msgDecode;

import java.util.Date;

public class MessageCode {

	byte[] decodeByte;
	byte startByte = (byte)0xAA;
	byte endByte = (byte)0xFF;
	Date date = null;
	
	public MessageCode(byte[] decodeByte) throws Exception {
		this.decodeByte = decodeByte;
		StartEndByte();
		this.date = EpochConvert();
		msgCode();
		}
	
	public void StartEndByte () throws Exception {
		if(decodeByte[0] != startByte) {
			throw new Exception("End or start byte is unreadable");
		}
	}
	
	public void msgCode() throws Exception{
		if (decodeByte[1] == 1) {
			LightStatusMsg msgCode = new LightStatusMsg(decodeByte);
			System.out.println("Light Status on " + this.date + " is " + msgCode.StatusCodeMsg());
		} else if (decodeByte[1] == 2) {
			LightStatusColorMsg msgCode = new LightStatusColorMsg(decodeByte);
			System.out.println("Light Status and Color on " + this.date + " is " 
			+ msgCode.StatusCodeMsg() + " with the color " + msgCode.LightColor());
		} else if (decodeByte[1] == 3) { 
			TemperatureReadingMsg msgCode = new TemperatureReadingMsg(decodeByte);
			System.out.println("Temperature Reading on " + this.date + " is "
			+ msgCode.TemperatureReading() + " C");
		} else if (decodeByte[1] == 4) {
			RandomMessage msgCode = new RandomMessage(decodeByte);
			System.out.println("Random Message on " + this.date + " is " + msgCode.MessageLength() 
			+ " characters long and says " + msgCode.CharacterMessage());
		} else { System.out.println("That message code does not exist!");
		}
	}
	
	public Date EpochConvert() {
		String hexValue = new String();
		for(int i=2;i<=9;i++) {
			hexValue = hexValue + String.format("%02x", decodeByte[i]);
		}
		hexValue = "0x" + hexValue;
		Date date = new Date(Long.decode(hexValue));
		return date;
	}
	
}
