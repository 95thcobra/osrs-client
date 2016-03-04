public class CacheableEntry_Sub23_Sub2 extends CacheableEntry {

	public static final int anInt2096 = 192;
	static IndexDescriptor aIndexDescriptor_2100;
	public static final int anInt2102 = 231;
	public static final int anInt2105 = 244;
	static int anInt2106;
	public static int anInt2107;
	static IndexDescriptor aIndexDescriptor_2108;
	public int anInt2098 = 930688349;
	int[] anIntArray2099;
	public boolean aBool2109 = false;
	short[] aShortArray2104;
	short[] aShortArray2101;
	short[] aShortArray2095;
	short[] aShortArray2103;
	public static Class128 aClass128_2097 = new Class128(64);
	int[] anIntArray2094 = new int[]{-1, -1, -1, -1, -1};

	void method2223(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2225(var1, var3, 1255795351);
		}
	}

	public static void method2224(int var0, int var1) {
		if (Class104.anInt1454 * 216145519 == 0) {
			Class104.aClass109_Sub5_Sub4_1453.method2837(var0, (byte) 0);
		} else {
			Class104.anInt1450 = var0 * 1862121751;
		}

	}

	void method2225(DataBuffer var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2098 = var1.readUByte() * -930688349;
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.readUByte();
				anIntArray2099 = new int[var4];

				for (var5 = 0; var5 < var4; var5++) {
					anIntArray2099[var5] = var1.readUShort();
				}
			} else if (var2 == 3) {
				aBool2109 = true;
			} else if (var2 == 40) {
				var4 = var1.readUByte();
				aShortArray2104 = new short[var4];
				aShortArray2101 = new short[var4];

				for (var5 = 0; var5 < var4; var5++) {
					aShortArray2104[var5] = (short) var1.readUShort();
					aShortArray2101[var5] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUByte();
				aShortArray2095 = new short[var4];
				aShortArray2103 = new short[var4];

				for (var5 = 0; var5 < var4; var5++) {
					aShortArray2095[var5] = (short) var1.readUShort();
					aShortArray2103[var5] = (short) var1.readUShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				anIntArray2094[var2 - 60] = var1.readUShort();
			}
		}

	}

	public CacheableEntry_Sub23_Sub16_Sub6 method2226(byte var1) {
		if (anIntArray2099 == null) {
			return null;
		} else {
			CacheableEntry_Sub23_Sub16_Sub6[] var3 = new CacheableEntry_Sub23_Sub16_Sub6[anIntArray2099.length];

			for (int var4 = 0; var4 < anIntArray2099.length; var4++) {
				var3[var4] = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2100, anIntArray2099[var4], 0);
			}

			CacheableEntry_Sub23_Sub16_Sub6 var5;
			if (var3.length != 1) {
				var5 = new CacheableEntry_Sub23_Sub16_Sub6(var3, var3.length);
			} else {
				var5 = var3[0];
			}

			int var2;
			if (aShortArray2104 != null) {
				for (var2 = 0; var2 < aShortArray2104.length; var2++) {
					var5.method3218(aShortArray2104[var2], aShortArray2101[var2]);
				}
			}

			if (aShortArray2095 != null) {
				for (var2 = 0; var2 < aShortArray2095.length; var2++) {
					var5.method3219(aShortArray2095[var2], aShortArray2103[var2]);
				}
			}

			return var5;
		}
	}

	public boolean method2227(byte var1) {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; var3++) {
			if (anIntArray2094[var3] != -1 && !aIndexDescriptor_2100.method1221(anIntArray2094[var3], 0, 794201586)) {
				var2 = false;
			}
		}

		return var2;
	}

	public CacheableEntry_Sub23_Sub16_Sub6 method2228(int var1) {
		CacheableEntry_Sub23_Sub16_Sub6[] var2 = new CacheableEntry_Sub23_Sub16_Sub6[5];
		int var4 = 0;

		for (int var3 = 0; var3 < 5; var3++) {
			if (anIntArray2094[var3] != -1) {
				var2[var4++] = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2100, anIntArray2094[var3], 0);
			}
		}

		CacheableEntry_Sub23_Sub16_Sub6 var6 = new CacheableEntry_Sub23_Sub16_Sub6(var2, var4);
		int var5;
		if (aShortArray2104 != null) {
			for (var5 = 0; var5 < aShortArray2104.length; var5++) {
				var6.method3218(aShortArray2104[var5], aShortArray2101[var5]);
			}
		}

		if (aShortArray2095 != null) {
			for (var5 = 0; var5 < aShortArray2095.length; var5++) {
				var6.method3219(aShortArray2095[var5], aShortArray2103[var5]);
			}
		}

		return var6;
	}

	public boolean method2243(int var1) {
		if (anIntArray2099 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < anIntArray2099.length; var3++) {
				if (!aIndexDescriptor_2100.method1221(anIntArray2099[var3], 0, -329031927)) {
					var2 = false;
				}
			}

			return var2;
		} else {
			return true;
		}
	}

	public static CacheableEntry_Sub23_Sub6 method2245(int var0, int var1) {
		CacheableEntry_Sub23_Sub6 var2 = (CacheableEntry_Sub23_Sub6) CacheableEntry_Sub23_Sub6.aClass128_2201.get((long) var0);
		if (var2 == null) {
			byte[] var3 = CacheableEntry_Sub23_Sub6.aIndexDescriptor_2208.getFileData(1, var0);
			var2 = new CacheableEntry_Sub23_Sub6();
			if (var3 != null) {
				var2.method2361(new DataBuffer(var3), var0, -271003405);
			}

			var2.method2356(-1249115983);
			CacheableEntry_Sub23_Sub6.aClass128_2201.put(var2, (long) var0);
			return var2;
		} else {
			return var2;
		}
	}

}
