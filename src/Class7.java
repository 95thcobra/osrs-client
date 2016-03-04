import java.awt.*;

public abstract class Class7 {

	public int anInt108;
	public int[] anIntArray109;
	int anInt110;
	public Image anImage111;
	static final int anInt112 = 512;
	public static final int anInt113 = 230;

	public final void method158(int var1) {
		CacheableEntry_Sub23_Sub14.method2710(anIntArray109, anInt108 * -568569227, anInt110 * 774678777);
	}

	public static int method159(char var0, int var1, int var2) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = (var0 << 4) + 1;
		}

		return var3;
	}

	public abstract void method160(Graphics var1, int var2, int var3, int var4);

	public abstract void method164(Graphics var1, int var2, int var3, int var4, int var5, byte var6);

	static CacheableEntry_Sub23_Sub14_Sub4_Sub1 method166(byte[] var0, int var1) {
		if (var0 != null) {
			CacheableEntry_Sub23_Sub14_Sub4_Sub1 var2 = new CacheableEntry_Sub23_Sub14_Sub4_Sub1(var0, Class18.anIntArray218, Class18.anIntArray219, Class58.anIntArray756, PacketDecoder.anIntArray341, CacheableEntry_Sub23_Sub10.anIntArray2316, Class42.aByteArrayArray603);
			CacheableEntry_Sub23_Sub10.method2474(826864731);
			return var2;
		} else {
			return null;
		}
	}

	public static String method176(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var4 = var0; var4 != 0L; var4 /= 37L) {
					++var2;
				}

				char var3;
				StringBuilder var6;
				for (var6 = new StringBuilder(var2); var0 != 0L; var6.append(var3)) {
					long var8 = var0;
					var0 /= 37L;
					var3 = Class76.aCharArray923[(int) (var8 - 37L * var0)];
					if (var3 == 95) {
						int var7 = var6.length() - 1;
						var6.setCharAt(var7, Character.toUpperCase(var6.charAt(var7)));
						var3 = 160;
					}
				}

				var6.reverse();
				var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
				return var6.toString();
			}
		} else {
			return null;
		}
	}

	abstract void method177(int var1, int var2, Component var3, byte var4);

	static CacheableEntry_Sub23_Sub14_Sub1[] method178(byte var0) {
		CacheableEntry_Sub23_Sub14_Sub1[] var1 = new CacheableEntry_Sub23_Sub14_Sub1[Class18.anInt216 * -877080713];

		for (int var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			CacheableEntry_Sub23_Sub14_Sub1 var2 = var1[var3] = new CacheableEntry_Sub23_Sub14_Sub1();
			var2.anInt2579 = Class18.anInt220 * 1155403717;
			var2.anInt2580 = Class18.anInt215 * 1186444245;
			var2.anInt2583 = Class18.anIntArray218[var3];
			var2.anInt2584 = Class18.anIntArray219[var3];
			var2.anInt2585 = Class58.anIntArray756[var3];
			var2.anInt2582 = PacketDecoder.anIntArray341[var3];
			var2.anIntArray2581 = CacheableEntry_Sub23_Sub10.anIntArray2316;
			var2.aByteArray2586 = Class42.aByteArrayArray603[var3];
		}

		CacheableEntry_Sub23_Sub10.method2474(-1555455305);
		return var1;
	}

	static final LinkedEntry_Sub13 method179(int var0, int var1, int var2, int var3) {
		LinkedEntry_Sub13 var4 = new LinkedEntry_Sub13();
		var4.anInt1819 = var1 * 1961576715;
		var4.anInt1823 = var2 * -169279215;
		GameClient.aJagexMap_3073.put(var4, (long) var0);
		CacheableEntry_Sub23_Sub10.method2487(var1, 2005546330);
		InterfaceDef var5 = Class50.method713(var0, (byte) -69);
		Class35.method484(var5, -276175616);
		if (GameClient.aInterfaceDef_3029 != null) {
			Class35.method484(GameClient.aInterfaceDef_3029, -1392598176);
			GameClient.aInterfaceDef_3029 = null;
		}

		Class44.method680((byte) 127);
		Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var0 >> 16], var5, false, 414190005);
		Class85.method1092(var1, -552139166);
		if (GameClient.activeRoot * 1787246131 != -1) {
			Class5.method138(GameClient.activeRoot * 1787246131, 1, (byte) 35);
		}

		return var4;
	}

}
