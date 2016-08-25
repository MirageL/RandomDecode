package msgDecode;

public class LightStatusColor extends MessageCode {

	public LightStatusColor(byte[] decodeByte) {
		super(decodeByte);
		// TODO Auto-generated constructor stub
	}
	int ByteSize = 6;
	@Override
	public int getByteSize() {
		// TODO Auto-generated method stub
		return this.ByteSize;
	}

}
