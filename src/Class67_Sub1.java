import java.nio.ByteBuffer;

public class Class67_Sub1 extends Class67 {

	ByteBuffer aByteBuffer1834;

	void method907(byte[] var1, byte var2) {
		aByteBuffer1834 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1834.position(0);
		aByteBuffer1834.put(var1);
	}

	byte[] method896(int var1) {
		byte[] var2 = new byte[aByteBuffer1834.capacity()];
		aByteBuffer1834.position(0);
		aByteBuffer1834.get(var2);
		return var2;
	}

}
