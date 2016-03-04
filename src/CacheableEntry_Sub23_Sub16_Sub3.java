import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class CacheableEntry_Sub23_Sub16_Sub3 extends CacheableEntry_Sub23_Sub16 {

	int anInt2569;
	int anInt2570;
	static int anInt2571;
	public static final int anInt2572 = 81;
	static final int anInt2573 = 0;
	public static final int anInt2574 = 198;
	public static final int anInt2575 = 63;
	public static final int anInt2576 = 14;
	static int anInt2577;
	public static final int anInt2578 = 58;

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		return PacketDecoder.getItemDef(anInt2570 * 1500342151).method2263(anInt2569 * 640802101, -1483066466);
	}

	public static void method2966(byte var0) {
		try {
			File var1 = new File(Class83.aString993, "random.dat");
			int var3;
			if (var1.exists()) {
				Class83.aClass139_989 = new Class139(new Class135(var1, "rw", 25L), 24, 0);
			} else {
				label33:
				for (int var2 = 0; var2 < Class83.aStringArray987.length; var2++) {
					for (var3 = 0; var3 < Class57.aStringArray747.length; var3++) {
						File var4 = new File(Class57.aStringArray747[var3] + Class83.aStringArray987[var2] + File.separatorChar + "random.dat");
						if (var4.exists()) {
							Class83.aClass139_989 = new Class139(new Class135(var4, "rw", 25L), 24, 0);
							break label33;
						}
					}
				}
			}

			if (Class83.aClass139_989 == null) {
				RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
				var3 = var6.read();
				var6.seek(0L);
				var6.write(var3);
				var6.seek(0L);
				var6.close();
				Class83.aClass139_989 = new Class139(new Class135(var1, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
			;
		}

	}

	public static CacheableEntry_Sub23_Sub7 method2967(int var0, byte var1) {
		CacheableEntry_Sub23_Sub7 var2 = (CacheableEntry_Sub23_Sub7) CacheableEntry_Sub23_Sub7.aClass128_2214.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = CacheableEntry_Sub23_Sub7.aIndexDescriptor_2213.getFileData(16, var0);
			var2 = new CacheableEntry_Sub23_Sub7();
			if (var3 != null) {
				var2.method2386(new DataBuffer(var3), 429015117);
			}

			CacheableEntry_Sub23_Sub7.aClass128_2214.put(var2, (long) var0);
			return var2;
		}
	}

	static final boolean method2968(char var0, int var1) {
		return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
	}

}
