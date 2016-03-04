public class NpcDef extends CacheableEntry {

	public static IndexDescriptor aIndexDescriptor_2217;
	public int id;
	static int anInt2239;
	static int anInt2245;
	public static IndexDescriptor aIndexDescriptor_2253;
	protected static boolean aBool2258;
	int[] anIntArray2248;
	public String aString2221 = "null";
	public int anInt2222 = 1718814713;
	public int anInt2225 = 1071081845;
	public int anInt2256 = 1248855625;
	public int anInt2233 = 2029694883;
	public int anInt2238 = 743030905;
	public int anInt2229 = -1049662297;
	public int anInt2230 = -2108174335;
	public int anInt2231 = -1551627733;
	short[] aShortArray2241;
	short[] aShortArray2220;
	short[] aShortArray2234;
	short[] aShortArray2235;
	int[] anIntArray2224;
	public boolean showDot = true;
	public int anInt2254 = -1335533653;
	int anInt2232 = -235447680;
	int anInt2216 = -530429824;
	public boolean aBool2219 = false;
	int anInt2242 = 0;
	int anInt2243 = 0;
	public int anInt2244 = -1549806575;
	public int anInt2223 = -1830636768;
	int anInt2247 = 758679315;
	public boolean aBool2249 = true;
	int anInt2226 = -1720135211;
	public boolean aBool2227 = true;
	public int[] anIntArray2246;
	public boolean aBool2251 = false;
	public int anInt2252 = -1487997722;
	public String[] aStringArray2236 = new String[5];
	public static Class128 definitionCache = new Class128(64);
	public static Class128 aClass128_2250 = new Class128(50);

	public final NpcDef method2400(int var1) {
		int var2 = -1;
		if (anInt2247 * 744334565 != -1) {
			var2 = GfxDef.method2521(anInt2247 * 744334565, 1906569988);
		} else if (anInt2226 * 808067203 != -1) {
			var2 = Class106.varps[anInt2226 * 808067203];
		}

		return var2 >= 0 && var2 < anIntArray2246.length && anIntArray2246[var2] != -1 ? Class50.getNpcDef(anIntArray2246[var2]) : null;
	}

	void decode(DataBuffer var1, int code) {
		int var4;
		int var5;
		if (code == 1) {
			var5 = var1.readUByte();
			anIntArray2248 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2248[var4] = var1.readUShort();
			}
		} else if (code == 2) {
			aString2221 = var1.readString();
		} else if (code == 12) {
			anInt2222 = var1.readUByte() * 1718814713;
		} else if (code == 13) {
			anInt2225 = var1.readUShort() * -1071081845;
		} else if (code == 14) {
			anInt2256 = var1.readUShort() * -1248855625;
		} else if (code == 15) {
			anInt2233 = var1.readUShort() * -2029694883;
		} else if (code == 16) {
			anInt2238 = var1.readUShort() * -743030905;
		} else if (code == 17) {
			anInt2256 = var1.readUShort() * -1248855625;
			anInt2229 = var1.readUShort() * 1049662297;
			anInt2230 = var1.readUShort() * 2108174335;
			anInt2231 = var1.readUShort() * 1551627733;
		} else if (code >= 30 && code < 35) {
			aStringArray2236[code - 30] = var1.readString();
			if (aStringArray2236[code - 30].equalsIgnoreCase(Class90.aString1058)) {
				aStringArray2236[code - 30] = null;
			}
		} else if (code == 40) {
			var5 = var1.readUByte();
			aShortArray2241 = new short[var5];
			aShortArray2220 = new short[var5];

			for (var4 = 0; var4 < var5; var4++) {
				aShortArray2241[var4] = (short) var1.readUShort();
				aShortArray2220[var4] = (short) var1.readUShort();
			}
		} else if (code == 41) {
			var5 = var1.readUByte();
			aShortArray2234 = new short[var5];
			aShortArray2235 = new short[var5];

			for (var4 = 0; var4 < var5; var4++) {
				aShortArray2234[var4] = (short) var1.readUShort();
				aShortArray2235[var4] = (short) var1.readUShort();
			}
		} else if (code == 60) {
			var5 = var1.readUByte();
			anIntArray2224 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2224[var4] = var1.readUShort();
			}
		} else if (code == 93) {
			showDot = false;
		} else if (code == 95) {
			anInt2254 = var1.readUShort() * 1335533653;
		} else if (code == 97) {
			anInt2232 = var1.readUShort() * 870575797;
		} else if (code == 98) {
			anInt2216 = var1.readUShort() * -440351599;
		} else if (code == 99) {
			aBool2219 = true;
		} else if (code != 100) {
			if (code == 101) {
				anInt2243 = var1.readByte() * 1814026781;
			} else if (code == 102) {
				anInt2244 = var1.readUShort() * 1549806575;
			} else if (code == 103) {
				anInt2223 = var1.readUShort() * -1533602407;
			} else if (code == 106) {
				anInt2247 = var1.readUShort() * -758679315;
				if (anInt2247 * 744334565 == 65535) {
					anInt2247 = 758679315;
				}

				anInt2226 = var1.readUShort() * 1720135211;
				if (anInt2226 * 808067203 == 65535) {
					anInt2226 = -1720135211;
				}

				var5 = var1.readUByte();
				anIntArray2246 = new int[var5 + 1];

				for (var4 = 0; var4 <= var5; var4++) {
					anIntArray2246[var4] = var1.readUShort();
					if (anIntArray2246[var4] == 65535) {
						anIntArray2246[var4] = -1;
					}
				}
			} else if (code == 107) {
				aBool2249 = false;
			} else if (code == 109) {
				aBool2227 = false;
			} else if (code == 111) {
				aBool2251 = true;
			} else if (code == 112) {
				anInt2252 = var1.readUByte() * -1910752419;
			}
		} else {
			anInt2242 = var1.readByte() * 139171809;
		}

	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method2404(AnimationSequence var1, int var2, AnimationSequence var3, int var4, int var5) {
		if (anIntArray2246 != null) {
			NpcDef var12 = method2400(-1179133429);
			return var12 == null ? null : var12.method2404(var1, var2, var3, var4, 2068635374);
		} else {
			CacheableEntry_Sub23_Sub16_Sub5 var8 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2250.get((long) (id * 1380254665));
			if (var8 == null) {
				boolean var9 = false;

				for (int var10 = 0; var10 < anIntArray2248.length; var10++) {
					if (!aIndexDescriptor_2217.method1221(anIntArray2248[var10], 0, 1375477207)) {
						var9 = true;
					}
				}

				if (var9) {
					return null;
				}

				CacheableEntry_Sub23_Sub16_Sub6[] var6 = new CacheableEntry_Sub23_Sub16_Sub6[anIntArray2248.length];

				int var7;
				for (var7 = 0; var7 < anIntArray2248.length; var7++) {
					var6[var7] = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2217, anIntArray2248[var7], 0);
				}

				CacheableEntry_Sub23_Sub16_Sub6 var13;
				if (var6.length == 1) {
					var13 = var6[0];
				} else {
					var13 = new CacheableEntry_Sub23_Sub16_Sub6(var6, var6.length);
				}

				if (aShortArray2241 != null) {
					for (var7 = 0; var7 < aShortArray2241.length; var7++) {
						var13.method3218(aShortArray2241[var7], aShortArray2220[var7]);
					}
				}

				if (aShortArray2234 != null) {
					for (var7 = 0; var7 < aShortArray2234.length; var7++) {
						var13.method3219(aShortArray2234[var7], aShortArray2235[var7]);
					}
				}

				var8 = var13.method3266(anInt2242 * 771681313 + 64, anInt2243 * -390162167 + 850, -30, -50, -30);
				aClass128_2250.put(var8, (long) (id * 1380254665));
			}

			CacheableEntry_Sub23_Sub16_Sub5 var11;
			if (var1 != null && var3 != null) {
				var11 = var1.method2320(var8, var2, var3, var4, -2097228551);
			} else if (var1 == null) {
				if (var3 != null) {
					var11 = var3.method2326(var8, var4, 1900259663);
				} else {
					var11 = var8.method3080(true);
				}
			} else {
				var11 = var1.method2326(var8, var2, 870470561);
			}

			if (anInt2232 * 1402081181 != 128 || anInt2216 * -654082959 != 128) {
				var11.method3093(anInt2232 * 1402081181, anInt2216 * -654082959, anInt2232 * 1402081181);
			}

			return var11;
		}
	}

	void method2405() {
	}

	public boolean method2407(int var1) {
		if (anIntArray2246 != null) {
			int var2 = -1;
			if (anInt2247 * 744334565 != -1) {
				var2 = GfxDef.method2521(anInt2247 * 744334565, 1444196624);
			} else if (anInt2226 * 808067203 != -1) {
				var2 = Class106.varps[anInt2226 * 808067203];
			}

			return var2 >= 0 && var2 < anIntArray2246.length && anIntArray2246[var2] != -1;
		} else {
			return true;
		}
	}

	void decode(DataBuffer buffer) {
		while (true) {
			int code = buffer.readUByte();
			if (code == 0) {
				return;
			}

			decode(buffer, code);
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub6 method2421(byte var1) {
		if (anIntArray2246 != null) {
			NpcDef var8 = method2400(-1807973881);
			return var8 == null ? null : var8.method2421((byte) 11);
		} else if (anIntArray2224 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var3 = 0; var3 < anIntArray2224.length; var3++) {
				if (!aIndexDescriptor_2217.method1221(anIntArray2224[var3], 0, -200970970)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				CacheableEntry_Sub23_Sub16_Sub6[] var7 = new CacheableEntry_Sub23_Sub16_Sub6[anIntArray2224.length];

				for (int var2 = 0; var2 < anIntArray2224.length; var2++) {
					var7[var2] = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2217, anIntArray2224[var2], 0);
				}

				CacheableEntry_Sub23_Sub16_Sub6 var6;
				if (var7.length == 1) {
					var6 = var7[0];
				} else {
					var6 = new CacheableEntry_Sub23_Sub16_Sub6(var7, var7.length);
				}

				int var5;
				if (aShortArray2241 != null) {
					for (var5 = 0; var5 < aShortArray2241.length; var5++) {
						var6.method3218(aShortArray2241[var5], aShortArray2220[var5]);
					}
				}

				if (aShortArray2234 != null) {
					for (var5 = 0; var5 < aShortArray2234.length; var5++) {
						var6.method3219(aShortArray2234[var5], aShortArray2235[var5]);
					}
				}

				return var6;
			}
		}
	}

	static final int method2423(int var0, int var1, int var2, int var3) {
		int var4 = var0 >> 7;
		int var6 = var1 >> 7;
		if (var4 >= 0 && var6 >= 0 && var4 <= 103 && var6 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Class32.mapSettings[1][var4][var6] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var10 = var1 & 127;
			int var9 = (128 - var7) * Class32.mapSquareHeights[var5][var4][var6] + var7 * Class32.mapSquareHeights[var5][var4 + 1][var6] >> 7;
			int var8 = Class32.mapSquareHeights[var5][var4][var6 + 1] * (128 - var7) + var7 * Class32.mapSquareHeights[var5][1 + var4][1 + var6] >> 7;
			return var9 * (128 - var10) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}

}
