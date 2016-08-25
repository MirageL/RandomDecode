package msgDecode;

public class TemperatureReading extends MessageCode {

	public TemperatureReading(byte[] decodeByte) {
		super(decodeByte);
		// TODO Auto-generated constructor stub
	}

	int ByteSize = 4;
	@Override
	public int getByteSize() {
		return this.ByteSize;
	}

}
