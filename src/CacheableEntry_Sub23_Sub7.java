public class CacheableEntry_Sub23_Sub7 extends CacheableEntry {

	static int[] anIntArray2211;
	public static int anInt2212;
	public static IndexDescriptor aIndexDescriptor_2213;
	public int anInt2215 = 0;
	static Class128 aClass128_2214 = new Class128(64);

	void method2381(DataBuffer var1, int var2, byte var3) {
		if (var2 == 5) {
			anInt2215 = var1.readUShort() * 687270953;
		}

	}

	void method2386(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2381(var1, var3, (byte) 6);
		}
	}

	static final void method2389(byte var0) {
		if (IndexDescriptor.aClass2_1353 != null) {
			IndexDescriptor.aClass2_1353.method49(2108784567);
		}

		if (CacheableEntry_Sub23_Sub6.aClass2_2200 != null) {
			CacheableEntry_Sub23_Sub6.aClass2_2200.method49(81692230);
		}

	}

	public static Interface3 method2390(Interface3[] var0, int var1, int var2) {
		Interface3[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; var4++) {
			Interface3 var5 = var3[var4];
			if (var1 == var5.method34(444164781)) {
				return var5;
			}
		}

		return null;
	}

	static final void method2393(byte var0) {
		for (int var1 = 0; var1 < GameClient.numLocalNpcs * 1974577941; var1++) {
			int var2 = GameClient.npcIndices[var1];
			Npc var3 = GameClient.sceneNpcs[var2];
			if (var3 != null) {
				Class41.method672(var3, var3.definition.anInt2222 * 951781961, 4192974);
			}
		}

	}

	public static void method2395(int var0) {
		try {
			Class83.aClass139_994.method1658(1342412894);

			for (int var1 = 0; var1 < Class83.anInt986 * 1014582983; var1++) {
				Class58.aClass139Array757[var1].method1658(1697522513);
			}

			Class83.aClass139_991.method1658(1680338613);
			Class83.aClass139_989.method1658(1839792503);
		} catch (Exception var2) {
			;
		}

	}

	public static CacheableEntry_Sub23_Sub14_Sub4_Sub1 method2396(IndexDescriptor var0, IndexDescriptor var1, int var2, int var3, byte var4) {
		return !CacheableEntry_Sub23_Sub16_Sub2.method2962(var0, var2, var3, 1906089977) ? null : Class7.method166(var1.getFileData(var2, var3), -2101591913);
	}

	static final void method2397(String var0, byte var1) {
		if (var0 != null) {
			String var4 = Class38.method497(var0, GameClient.aClass119_2919, -1903418053);
			if (var4 != null) {
				for (int var6 = 0; var6 < GameClient.anInt3138 * 601840989; var6++) {
					Class41 var2 = GameClient.aClass41Array2895[var6];
					String var3 = var2.aString597;
					String var7 = Class38.method497(var3, GameClient.aClass119_2919, -1713077817);
					boolean var5;
					if (var0 != null && var3 != null) {
						if (!var0.startsWith("#") && !var3.startsWith("#")) {
							var5 = var4.equals(var7);
						} else {
							var5 = var0.equals(var3);
						}
					} else {
						var5 = false;
					}

					if (var5) {
						GameClient.anInt3138 -= 1879695093;

						for (int var8 = var6; var8 < GameClient.anInt3138 * 601840989; var8++) {
							GameClient.aClass41Array2895[var8] = GameClient.aClass41Array2895[1 + var8];
						}

						GameClient.anInt2990 = GameClient.anInt3050 * 1609802529;
						GameClient.secureBuffer.writeOpcode(59);
						GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var0));
						GameClient.secureBuffer.writeStr(var0);
						break;
					}
				}

			}
		}
	}

	static final int method2399(int var0, int var1, byte var2) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

}
