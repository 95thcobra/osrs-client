import java.io.IOException;

public class Class59 {

	public static final int anInt761 = 120;
	static final int anInt765 = 50;
	public static short[] aShortArray766;
	static final int anInt767 = 400;
	public int anInt764;
	static Class59 aClass59_763 = new Class59(0);
	public static Class59 aClass59_768 = new Class59(1);
	static Class59 aClass59_762 = new Class59(2);

	Class59(int var1) {
		anInt764 = var1 * -921122911;
	}

	public static void writeRandomDat(DataBuffer buffer, int var1) {
		byte[] randomDatBytes = new byte[24];

		try {
			Class83.aClass139_989.method1659(0L);
			Class83.aClass139_989.method1678(randomDatBytes, -1830055126);

			int var3;
			for (var3 = 0; var3 < 24 && randomDatBytes[var3] == 0; var3++) {
				;
			}

			if (var3 >= 24) {
				throw new IOException();
			}
		} catch (Exception var5) {
			for (int var4 = 0; var4 < 24; var4++) {
				randomDatBytes[var4] = -1;
			}
		}

		buffer.writeBytes(randomDatBytes, 0, 24);
	}

}
