package msgDecode;

public class LightStatus extends MessageCode {

	public LightStatus(byte[] decodeByte) {
		super(decodeByte);
		// TODO Auto-generated constructor stub
	}

	int ByteSize = 4;
	@Override
	public int getByteSize() {
		// TODO Auto-generated method stub
		return this.ByteSize;
	}

}
