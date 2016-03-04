public class Class126_Sub1 extends Class126 {

	static IndexDescriptor_Sub1 aClass94_Sub1_1643;
	static String aString1646;
	static final int anInt1647 = 5;
	public static final int anInt1648 = 124;
	public static final int anInt1649 = 59;
	public static final int anInt1650 = 9;
	int anInt1651 = (int) (Class10.method216((short) 255) / 1000L) * -82431487;
	String aString1644;
	short aShort1645;

	static final void method1721(String var0, int var1, int var2) {
		GameClient.secureBuffer.writeOpcode(38);
		GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var0) + 1);
		GameClient.secureBuffer.writeByte(var1);
		GameClient.secureBuffer.writeStr(var0);
	}

	Class126_Sub1(String var1, int var2) {
		aString1644 = var1;
		aShort1645 = (short) var2;
	}

}
