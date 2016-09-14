package msgDecode.copy;

public class TemperatureReadingMsg extends MessageCode {

	public TemperatureReadingMsg(byte[] decodeByte) throws Exception {
		super(decodeByte);
	}

	public int TemperatureReading() {
		int temperatureMsg;
		temperatureMsg = (int)this.decodeByte[3];
		return temperatureMsg;
	}

}
