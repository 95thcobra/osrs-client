import java.math.BigInteger;

public class Class36 {

	static final int anInt483 = 202;
	static byte[][][] aByteArrayArrayArray485;
	static short[] aShortArray486;
	public static final int anInt487 = 85;
	static Class72 aClass72_489;
	public static final int anInt490 = 8;
	public static final int anInt491 = 70;
	static BigInteger RSA_EXP = new BigInteger("10001", 16);
	static BigInteger RSA_MOD = new BigInteger("bb30dd41ab0a60b3e2072a06ebeb7a88d538d33a8be8f2046059aadab0111dc3b369d1fc044431d29e614fa02ddf18603b0727eca2941d3b2b4e21f148f831e45eaa05a994255fc3b4524356709577461ea109b5272e462dd8cf622060e46a97c29efea014eedaac599e6a706d3945a3e03d623eb55c3de64a69145f61f1567d", 16);

	public static void method486(byte var0) {
		try {
			if (Class104.anInt1454 * 216145519 == 1) {
				int var1 = Class104.aClass109_Sub5_Sub4_1453.method2838((byte) -124);
				if (var1 > 0 && Class104.aClass109_Sub5_Sub4_1453.method2844((byte) -74)) {
					var1 -= Class29.anInt362 * -1979239413;
					if (var1 < 0) {
						var1 = 0;
					}

					Class104.aClass109_Sub5_Sub4_1453.method2837(var1, (byte) 0);
					return;
				}

				Class104.aClass109_Sub5_Sub4_1453.method2843((byte) 32);
				Class104.aClass109_Sub5_Sub4_1453.method2868(-1327324416);
				if (Class104.aIndexDescriptor_1457 != null) {
					Class104.anInt1454 = -876740322;
				} else {
					Class104.anInt1454 = 0;
				}

				CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 = null;
				Class80.aClass6_956 = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			Class104.aClass109_Sub5_Sub4_1453.method2843((byte) -22);
			Class104.anInt1454 = 0;
			CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 = null;
			Class80.aClass6_956 = null;
			Class104.aIndexDescriptor_1457 = null;
		}

	}

	Class36() throws Throwable {
		throw new Error();
	}

	static RenderedItemImage[] method487(IndexDescriptor var0, int var1, int var2, byte var3) {
		return CacheableEntry_Sub23_Sub16_Sub2.method2962(var0, var1, var2, 1749018150) ? ItemDef.method2271(-1205875495) : null;
	}

	public static void method488(IndexDescriptor var0, String var1, String var2, int var3, boolean var4, byte var5) {
		int var6 = var0.method1170(var1);
		int var7 = var0.method1165(var6, var2, (byte) 10);
		Class97.method1247(var0, var6, var7, var3, var4, (byte) -104);
	}

	static final void method489(int var0) {
		GameClient.secureBuffer.writeOpcode(84);

		for (LinkedEntry_Sub13 var1 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1537(); var1 != null; var1 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1543()) {
			if (var1.anInt1823 * -1355411471 == 0 || var1.anInt1823 * -1355411471 == 3) {
				CacheableEntry_Sub23_Sub6.method2374(var1, true, 1345746199);
			}
		}

		if (GameClient.aInterfaceDef_3029 != null) {
			Class35.method484(GameClient.aInterfaceDef_3029, -914448616);
			GameClient.aInterfaceDef_3029 = null;
		}

	}

}
