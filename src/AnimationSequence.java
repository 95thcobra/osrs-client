public class AnimationSequence extends CacheableEntry {

	static IndexDescriptor aIndexDescriptor_2165;
	static IndexDescriptor aIndexDescriptor_2166;
	static IndexDescriptor aIndexDescriptor_2171;
	public static final int anInt2181 = 19136770;
	public int anInt2180 = -962573011;
	public int anInt2173 = 398814397;
	public int anInt2182 = -71042647;
	public boolean aBool2175 = false;
	public int anInt2176 = 95448973;
	public int leftHandItem = 2114784625;
	public int rightHandItem = 1711498285;
	public int anInt2179 = 1546644807;
	public int anInt2170 = 1228877402;
	public static Class128 aClass128_2167 = new Class128(64);
	public static Class128 aClass128_2168 = new Class128(100);
	public int[] anIntArray2183;
	int[] anIntArray2174;
	public int[] anIntArray2169;
	int[] anIntArray2164;
	public int[] anIntArray2172;

	void method2307(DataBuffer var1, byte var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2336(var1, var3, (byte) -118);
		}
	}

	void method2309(int var1) {
		if (anInt2180 * -1239714469 == -1) {
			if (anIntArray2174 != null) {
				anInt2180 = 1925146022;
			} else {
				anInt2180 = 0;
			}
		}

		if (anInt2173 * 1962873195 == -1) {
			if (anIntArray2174 != null) {
				anInt2173 = -797628794;
			} else {
				anInt2173 = 0;
			}
		}

	}

	CacheableEntry_Sub23_Sub16_Sub5 method2311(CacheableEntry_Sub23_Sub16_Sub5 var1, int var2, int var3, byte var4) {
		var2 = anIntArray2169[var2];
		CacheableEntry_Sub23_Sub15 var6 = Class47.method701(var2 >> 16, (byte) 90);
		var2 &= 65535;
		if (var6 == null) {
			return var1.method3080(true);
		} else {
			CacheableEntry_Sub23_Sub16_Sub5 var5 = var1.method3080(!var6.method2779(var2, 1728022975));
			var3 &= 3;
			if (var3 == 1) {
				var5.method3090();
			} else if (var3 == 2) {
				var5.method3089();
			} else if (var3 == 3) {
				var5.method3088();
			}

			var5.method3085(var6, var2);
			if (var3 == 1) {
				var5.method3088();
			} else if (var3 == 2) {
				var5.method3089();
			} else if (var3 == 3) {
				var5.method3090();
			}

			return var5;
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method2316(CacheableEntry_Sub23_Sub16_Sub5 var1, int var2, int var3) {
		int var4 = anIntArray2169[var2];
		CacheableEntry_Sub23_Sub15 var8 = Class47.method701(var4 >> 16, (byte) -12);
		var4 &= 65535;
		if (var8 == null) {
			return var1.method3080(true);
		} else {
			CacheableEntry_Sub23_Sub15 var5 = null;
			int var6 = 0;
			if (anIntArray2164 != null && var2 < anIntArray2164.length) {
				var6 = anIntArray2164[var2];
				var5 = Class47.method701(var6 >> 16, (byte) -19);
				var6 &= 65535;
			}

			CacheableEntry_Sub23_Sub16_Sub5 var7;
			if (var5 != null && var6 != 65535) {
				var7 = var1.method3080(!var8.method2779(var4, 1101402194) & !var5.method2779(var6, 1368827400));
				var7.method3085(var8, var4);
				var7.method3085(var5, var6);
				return var7;
			} else {
				var7 = var1.method3080(!var8.method2779(var4, 234964099));
				var7.method3085(var8, var4);
				return var7;
			}
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method2320(CacheableEntry_Sub23_Sub16_Sub5 var1, int var2, AnimationSequence var3, int var4, int var5) {
		var2 = anIntArray2169[var2];
		CacheableEntry_Sub23_Sub15 var7 = Class47.method701(var2 >> 16, (byte) 81);
		var2 &= 65535;
		if (var7 == null) {
			return var3.method2326(var1, var4, 682616430);
		} else {
			var4 = var3.anIntArray2169[var4];
			CacheableEntry_Sub23_Sub15 var8 = Class47.method701(var4 >> 16, (byte) 52);
			var4 &= 65535;
			CacheableEntry_Sub23_Sub16_Sub5 var6;
			if (var8 == null) {
				var6 = var1.method3080(!var7.method2779(var2, 283483624));
				var6.method3085(var7, var2);
				return var6;
			} else {
				var6 = var1.method3080(!var7.method2779(var2, 1799788922) & !var8.method2779(var4, 915222767));
				var6.method3086(var7, var2, var8, var4, anIntArray2174);
				return var6;
			}
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method2326(CacheableEntry_Sub23_Sub16_Sub5 var1, int var2, int var3) {
		var2 = anIntArray2169[var2];
		CacheableEntry_Sub23_Sub15 var5 = Class47.method701(var2 >> 16, (byte) 90);
		var2 &= 65535;
		if (var5 == null) {
			return var1.method3080(true);
		} else {
			CacheableEntry_Sub23_Sub16_Sub5 var4 = var1.method3080(!var5.method2779(var2, 1677678810));
			var4.method3085(var5, var2);
			return var4;
		}
	}

	CacheableEntry_Sub23_Sub16_Sub5 method2331(CacheableEntry_Sub23_Sub16_Sub5 var1, int var2, int var3) {
		var2 = anIntArray2169[var2];
		CacheableEntry_Sub23_Sub15 var4 = Class47.method701(var2 >> 16, (byte) 19);
		var2 &= 65535;
		if (var4 == null) {
			return var1.method3131(true);
		} else {
			CacheableEntry_Sub23_Sub16_Sub5 var5 = var1.method3131(!var4.method2779(var2, 818560561));
			var5.method3085(var4, var2);
			return var5;
		}
	}

	void method2336(DataBuffer var1, int var2, byte var3) {
		int var4;
		int var5;
		if (var2 == 1) {
			var5 = var1.readUShort();
			anIntArray2183 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2183[var4] = var1.readUShort();
			}

			anIntArray2169 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2169[var4] = var1.readUShort();
			}

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2169[var4] += var1.readUShort() << 16;
			}
		} else if (var2 == 2) {
			anInt2182 = var1.readUShort() * 71042647;
		} else if (var2 == 3) {
			var5 = var1.readUByte();
			anIntArray2174 = new int[1 + var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2174[var4] = var1.readUByte();
			}

			anIntArray2174[var5] = 9999999;
		} else if (var2 == 4) {
			aBool2175 = true;
		} else if (var2 == 5) {
			anInt2176 = var1.readUByte() * 1737076713;
		} else if (var2 == 6) {
			leftHandItem = var1.readUShort() * -2114784625;
		} else if (var2 == 7) {
			rightHandItem = var1.readUShort() * -1711498285;
		} else if (var2 == 8) {
			anInt2179 = var1.readUByte() * -1936635187;
		} else if (var2 != 9) {
			if (var2 != 10) {
				if (var2 == 11) {
					anInt2170 = var1.readUByte() * -1533044947;
				} else if (var2 == 12) {
					var5 = var1.readUByte();
					anIntArray2164 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2164[var4] = var1.readUShort();
					}

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2164[var4] += var1.readUShort() << 16;
					}
				} else if (var2 == 13) {
					var5 = var1.readUByte();
					anIntArray2172 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2172[var4] = var1.readTriByte();
					}
				}
			} else {
				anInt2173 = var1.readUByte() * -398814397;
			}
		} else {
			anInt2180 = var1.readUByte() * 962573011;
		}

	}

	public static boolean method2338(char var0, int var1) {
		return var0 >= 48 && var0 <= 57;
	}

}
