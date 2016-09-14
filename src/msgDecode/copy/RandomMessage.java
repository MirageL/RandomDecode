package msgDecode.copy;

public class RandomMessage extends MessageCode {

	public RandomMessage(byte[] decodeByte) {
		super(decodeByte);
	}

	public int MessageLength() {
		int msgLength;
		msgLength = (int)this.decodeByte[3];
		return msgLength;
	}

}
