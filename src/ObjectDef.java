public class ObjectDef extends CacheableEntry {

	public int id;
	static int mapPacketBaseZ;
	public String name = "null";
	int[] anIntArray2273;
	int[] anIntArray2300;
	public int anInt2277 = -275442441;
	public int anInt2274 = -1373937319;
	public int anInt2275 = 503994170;
	public boolean aBool2276 = true;
	public int anInt2292 = 1009648759;
	int anInt2296 = -1977563929;
	boolean aBool2279 = false;
	public boolean aBool2280 = false;
	public int anInt2281 = 81554395;
	public int anInt2291 = -455979568;
	int anInt2283 = 0;
	int anInt2285 = 0;
	short[] aShortArray2269;
	short[] aShortArray2301;
	short[] aShortArray2271;
	short[] aShortArray2272;
	public int anInt2286 = -1896577965;
	boolean aBool2288 = false;
	public boolean aBool2284 = true;
	int anInt2259 = -1188000384;
	int anInt2297 = -732338560;
	int anInt2293 = -1557873024;
	public int anInt2287 = -2079915545;
	int anInt2307 = 0;
	int anInt2294 = 0;
	int anInt2295 = 0;
	public boolean aBool2264 = false;
	boolean aBool2282 = false;
	public int anInt2298 = -1217661063;
	int anInt2270 = -1206554987;
	public int anInt2302 = 1581974417;
	public int anInt2303 = 0;
	int anInt2266 = -1286125569;
	public int anInt2304 = 0;
	public int anInt2290 = 0;
	public int[] anIntArray2306;
	public int[] anIntArray2299;
	public String[] options = new String[5];
	public static boolean aBool2267 = false;
	public static Class128 aClass128_2260 = new Class128(64);
	public static Class128 aClass128_2261 = new Class128(500);
	public static Class128 aClass128_2262 = new Class128(30);
	public static Class128 aClass128_2263 = new Class128(30);
	static CacheableEntry_Sub23_Sub16_Sub6[] aClass109_Sub23_Sub16_Sub6Array2278 = new CacheableEntry_Sub23_Sub16_Sub6[4];

	void method2427(DataBuffer buffer, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var5 = buffer.readUByte();
			if (var5 > 0) {
				if (anIntArray2300 != null && !aBool2267) {
					buffer.pos += var5 * -383076877;
				} else {
					anIntArray2273 = new int[var5];
					anIntArray2300 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2300[var4] = buffer.readUShort();
						anIntArray2273[var4] = buffer.readUByte();
					}
				}
			}
		} else if (var2 == 2) {
			name = buffer.readString();
		} else if (var2 == 5) {
			var5 = buffer.readUByte();
			if (var5 > 0) {
				if (anIntArray2300 != null && !aBool2267) {
					buffer.pos += var5 * -1687040350;
				} else {
					anIntArray2273 = null;
					anIntArray2300 = new int[var5];

					for (var4 = 0; var4 < var5; var4++) {
						anIntArray2300[var4] = buffer.readUShort();
					}
				}
			}
		} else if (var2 == 14) {
			anInt2277 = buffer.readUByte() * -275442441;
		} else if (var2 == 15) {
			anInt2274 = buffer.readUByte() * -1373937319;
		} else if (var2 == 17) {
			anInt2275 = 0;
			aBool2276 = false;
		} else if (var2 == 18) {
			aBool2276 = false;
		} else if (var2 == 19) {
			anInt2292 = buffer.readUByte() * -1009648759;
		} else if (var2 == 21) {
			anInt2296 = 0;
		} else if (var2 == 22) {
			aBool2279 = true;
		} else if (var2 == 23) {
			aBool2280 = true;
		} else if (var2 == 24) {
			anInt2281 = buffer.readUShort() * -81554395;
			if (anInt2281 * 181561261 == 65535) {
				anInt2281 = 81554395;
			}
		} else if (var2 == 27) {
			anInt2275 = -1895486563;
		} else if (var2 == 28) {
			anInt2291 = buffer.readUByte() * -28498723;
		} else if (var2 == 29) {
			anInt2283 = buffer.readByte() * 908961459;
		} else if (var2 == 39) {
			anInt2285 = buffer.readByte() * -2049626657;
		} else if (var2 >= 30 && var2 < 35) {
			options[var2 - 30] = buffer.readString();
			if (options[var2 - 30].equalsIgnoreCase(Class90.aString1058)) {
				options[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var5 = buffer.readUByte();
			aShortArray2269 = new short[var5];
			aShortArray2301 = new short[var5];

			for (var4 = 0; var4 < var5; var4++) {
				aShortArray2269[var4] = (short) buffer.readUShort();
				aShortArray2301[var4] = (short) buffer.readUShort();
			}
		} else if (var2 == 41) {
			var5 = buffer.readUByte();
			aShortArray2271 = new short[var5];
			aShortArray2272 = new short[var5];

			for (var4 = 0; var4 < var5; var4++) {
				aShortArray2271[var4] = (short) buffer.readUShort();
				aShortArray2272[var4] = (short) buffer.readUShort();
			}
		} else if (var2 == 60) {
			anInt2286 = buffer.readUShort() * 1896577965;
		} else if (var2 == 62) {
			aBool2288 = true;
		} else if (var2 == 64) {
			aBool2284 = false;
		} else if (var2 == 65) {
			anInt2259 = buffer.readUShort() * 1232232731;
		} else if (var2 == 66) {
			anInt2297 = buffer.readUShort() * -676810035;
		} else if (var2 == 67) {
			anInt2293 = buffer.readUShort() * -247051907;
		} else if (var2 == 68) {
			anInt2287 = buffer.readUShort() * 2079915545;
		} else if (var2 == 69) {
			buffer.readUByte(); // clip access flag
		} else if (var2 == 70) {
			anInt2307 = buffer.readShort() * 457409289;
		} else if (var2 == 71) {
			anInt2294 = buffer.readShort() * -1130433297;
		} else if (var2 == 72) {
			anInt2295 = buffer.readShort() * -1658470671;
		} else if (var2 == 73) {
			aBool2264 = true;
		} else if (var2 == 74) {
			aBool2282 = true;
		} else if (var2 == 75) {
			anInt2298 = buffer.readUByte() * 1217661063;
		} else if (var2 == 77) {
			anInt2270 = buffer.readUShort() * 1206554987;
			if (anInt2270 * 95621955 == 65535) {
				anInt2270 = -1206554987;
			}

			anInt2266 = buffer.readUShort() * 1286125569;
			if (anInt2266 * -1214822399 == 65535) {
				anInt2266 = -1286125569;
			}

			var5 = buffer.readUByte();
			anIntArray2299 = new int[1 + var5];

			for (var4 = 0; var4 <= var5; var4++) {
				anIntArray2299[var4] = buffer.readUShort();
				if (anIntArray2299[var4] == 65535) {
					anIntArray2299[var4] = -1;
				}
			}
		} else if (var2 == 78) {
			anInt2302 = buffer.readUShort() * -1581974417;
			anInt2303 = buffer.readUByte() * -619321955;
		} else if (var2 == 79) {
			anInt2304 = buffer.readUShort() * 1431688575;
			anInt2290 = buffer.readUShort() * -1631855545;
			anInt2303 = buffer.readUByte() * -619321955;
			var5 = buffer.readUByte();
			anIntArray2306 = new int[var5];

			for (var4 = 0; var4 < var5; var4++) {
				anIntArray2306[var4] = buffer.readUShort();
			}
		} else if (var2 == 81) {
			anInt2296 = buffer.readUByte() * -549775104;
		}
	}

	void method2428(byte var1) {
		if (anInt2292 * -1087968583 == -1) {
			anInt2292 = 0;
			if (anIntArray2300 != null && (anIntArray2273 == null || anIntArray2273[0] == 10)) {
				anInt2292 = -1009648759;
			}

			for (int var2 = 0; var2 < 5; var2++) {
				if (options[var2] != null) {
					anInt2292 = -1009648759;
				}
			}
		}

		if (anInt2298 * 1493581111 == -1) {
			anInt2298 = 1217661063 * (anInt2275 * 445231797 != 0 ? 1 : 0);
		}

	}

	public boolean method2429(byte var1) {
		if (anIntArray2299 == null) {
			return anInt2302 * 1816388239 != -1 || anIntArray2306 != null;
		} else {
			for (int var2 = 0; var2 < anIntArray2299.length; var2++) {
				if (anIntArray2299[var2] != -1) {
					ObjectDef var3 = Class56.getObjectDef(anIntArray2299[var2]);
					if (var3.anInt2302 * 1816388239 != -1 || var3.anIntArray2306 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public final boolean method2430(int var1) {
		if (anIntArray2300 == null) {
			return true;
		} else {
			boolean var3 = true;

			for (int var2 = 0; var2 < anIntArray2300.length; var2++) {
				var3 &= Class56.aIndexDescriptor_734.method1221(anIntArray2300[var2] & 65535, 0, 877184506);
			}

			return var3;
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method2431(int var1, int var2, int[][] var3, int var4, int var5, int var6, AnimationSequence var7, int var8, byte var9) {
		long var10;
		if (anIntArray2273 == null) {
			var10 = (long) ((id * 1944152765 << 10) + var2);
		} else {
			var10 = (long) ((var1 << 3) + (id * 1944152765 << 10) + var2);
		}

		CacheableEntry_Sub23_Sub16_Sub5 var12 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2263.get(var10);
		if (var12 == null) {
			CacheableEntry_Sub23_Sub16_Sub6 var13 = method2432(var1, var2, (byte) -125);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method3266(anInt2283 * 887060603 + 64, 768 + anInt2285 * -939646713, -50, -10, -50);
			aClass128_2263.put(var12, var10);
		}

		if (var7 == null && anInt2296 * -1641680599 == -1) {
			return var12;
		} else {
			if (var7 != null) {
				var12 = var7.method2311(var12, var8, var2, (byte) -106);
			} else {
				var12 = var12.method3080(true);
			}

			if (anInt2296 * -1641680599 >= 0) {
				var12 = var12.method3079(var3, var4, var5, var6, false, anInt2296 * -1641680599);
			}

			return var12;
		}
	}

	final CacheableEntry_Sub23_Sub16_Sub6 method2432(int var1, int var2, byte var3) {
		CacheableEntry_Sub23_Sub16_Sub6 var4 = null;
		boolean var5;
		int var7;
		int var8;
		if (anIntArray2273 == null) {
			if (var1 != 10) {
				return null;
			}

			if (anIntArray2300 == null) {
				return null;
			}

			var5 = aBool2288;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var7 = anIntArray2300.length;

			for (int var6 = 0; var6 < var7; var6++) {
				var8 = anIntArray2300[var6];
				if (var5) {
					var8 += 65536;
				}

				var4 = (CacheableEntry_Sub23_Sub16_Sub6) aClass128_2261.get((long) var8);
				if (var4 == null) {
					var4 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class56.aIndexDescriptor_734, var8 & 65535, 0);
					if (var4 == null) {
						return null;
					}

					if (var5) {
						var4.method3220();
					}

					aClass128_2261.put(var4, (long) var8);
				}

				if (var7 > 1) {
					aClass109_Sub23_Sub16_Sub6Array2278[var6] = var4;
				}
			}

			if (var7 > 1) {
				var4 = new CacheableEntry_Sub23_Sub16_Sub6(aClass109_Sub23_Sub16_Sub6Array2278, var7);
			}
		} else {
			int var9 = -1;

			for (var7 = 0; var7 < anIntArray2273.length; var7++) {
				if (anIntArray2273[var7] == var1) {
					var9 = var7;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var7 = anIntArray2300[var9];
			boolean var10 = aBool2288 ^ var2 > 3;
			if (var10) {
				var7 += 65536;
			}

			var4 = (CacheableEntry_Sub23_Sub16_Sub6) aClass128_2261.get((long) var7);
			if (var4 == null) {
				var4 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class56.aIndexDescriptor_734, var7 & 65535, 0);
				if (var4 == null) {
					return null;
				}

				if (var10) {
					var4.method3220();
				}

				aClass128_2261.put(var4, (long) var7);
			}
		}

		if (anInt2259 * 758124819 == 128 && anInt2297 * 1922730501 == 128 && anInt2293 * 1721186261 == 128) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var12;
		if (anInt2307 * -2112947399 == 0 && anInt2294 * -85542385 == 0 && anInt2295 * -689475055 == 0) {
			var12 = false;
		} else {
			var12 = true;
		}

		CacheableEntry_Sub23_Sub16_Sub6 var11 = new CacheableEntry_Sub23_Sub16_Sub6(var4, var2 == 0 && !var5 && !var12, aShortArray2269 == null, aShortArray2271 == null, true);
		if (var1 == 4 && var2 > 3) {
			var11.method3216(256);
			var11.method3217(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var11.method3246();
		} else if (var2 == 2) {
			var11.method3240();
		} else if (var2 == 3) {
			var11.method3215();
		}

		if (aShortArray2269 != null) {
			for (var8 = 0; var8 < aShortArray2269.length; var8++) {
				var11.method3218(aShortArray2269[var8], aShortArray2301[var8]);
			}
		}

		if (aShortArray2271 != null) {
			for (var8 = 0; var8 < aShortArray2271.length; var8++) {
				var11.method3219(aShortArray2271[var8], aShortArray2272[var8]);
			}
		}

		if (var5) {
			var11.method3245(anInt2259 * 758124819, anInt2297 * 1922730501, anInt2293 * 1721186261);
		}

		if (var12) {
			var11.method3217(anInt2307 * -2112947399, anInt2294 * -85542385, anInt2295 * -689475055);
		}

		return var11;
	}

	public final ObjectDef method2433(int var1) {
		int var2 = -1;
		if (anInt2270 * 95621955 != -1) {
			var2 = GfxDef.method2521(anInt2270 * 95621955, -61239568);
		} else if (anInt2266 * -1214822399 != -1) {
			var2 = Class106.varps[anInt2266 * -1214822399];
		}

		return var2 >= 0 && var2 < anIntArray2299.length && anIntArray2299[var2] != -1 ? Class56.getObjectDef(anIntArray2299[var2]) : null;
	}

	public final CacheableEntry_Sub23_Sub16 method2444(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
		long var9;
		if (anIntArray2273 == null) {
			var9 = (long) (var2 + (id * 1944152765 << 10));
		} else {
			var9 = (long) (var2 + (id * 1944152765 << 10) + (var1 << 3));
		}

		Object var11 = (CacheableEntry_Sub23_Sub16) aClass128_2262.get(var9);
		if (var11 == null) {
			CacheableEntry_Sub23_Sub16_Sub6 var8 = method2432(var1, var2, (byte) -99);
			if (var8 == null) {
				return null;
			}

			if (!aBool2279) {
				var11 = var8.method3266(anInt2283 * 887060603 + 64, 768 + anInt2285 * -939646713, -50, -10, -50);
			} else {
				var8.aShort2755 = (short) (64 + anInt2283 * 887060603);
				var8.aShort2730 = (short) (768 + anInt2285 * -939646713);
				var8.method3222();
				var11 = var8;
			}

			aClass128_2262.put((CacheableEntry) var11, var9);
		}

		if (aBool2279) {
			var11 = ((CacheableEntry_Sub23_Sub16_Sub6) var11).method3210();
		}

		if (anInt2296 * -1641680599 >= 0) {
			if (var11 instanceof CacheableEntry_Sub23_Sub16_Sub5) {
				var11 = ((CacheableEntry_Sub23_Sub16_Sub5) var11).method3079(var3, var4, var5, var6, true, anInt2296 * -1641680599);
			} else if (var11 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
				var11 = ((CacheableEntry_Sub23_Sub16_Sub6) var11).method3211(var3, var4, var5, var6, true, anInt2296 * -1641680599);
			}
		}

		return (CacheableEntry_Sub23_Sub16) var11;
	}

	void decode(DataBuffer buffer) {
		while (true) {
			int var3 = buffer.readUByte();
			if (var3 == 0) {
				return;
			}

			method2427(buffer, var3);
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method2446(int var1, int var2, int[][] var3, int var4, int var5, int var6, short var7) {
		long var9;
		if (anIntArray2273 == null) {
			var9 = (long) (var2 + (id * 1944152765 << 10));
		} else {
			var9 = (long) ((id * 1944152765 << 10) + (var1 << 3) + var2);
		}

		CacheableEntry_Sub23_Sub16_Sub5 var11 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2263.get(var9);
		if (var11 == null) {
			CacheableEntry_Sub23_Sub16_Sub6 var8 = method2432(var1, var2, (byte) 6);
			if (var8 == null) {
				return null;
			}

			var11 = var8.method3266(64 + anInt2283 * 887060603, 768 + anInt2285 * -939646713, -50, -10, -50);
			aClass128_2263.put(var11, var9);
		}

		if (anInt2296 * -1641680599 >= 0) {
			var11 = var11.method3079(var3, var4, var5, var6, true, anInt2296 * -1641680599);
		}

		return var11;
	}

	public final boolean method2464(int var1, byte var2) {
		if (anIntArray2273 != null) {
			for (int var5 = 0; var5 < anIntArray2273.length; var5++) {
				if (anIntArray2273[var5] == var1) {
					return Class56.aIndexDescriptor_734.method1221(anIntArray2300[var5] & 65535, 0, -2027278296);
				}
			}

			return true;
		} else if (anIntArray2300 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var4 = true;

			for (int var3 = 0; var3 < anIntArray2300.length; var3++) {
				var4 &= Class56.aIndexDescriptor_734.method1221(anIntArray2300[var3] & 65535, 0, 661284148);
			}

			return var4;
		}
	}

	public static int method2467(int var0, int var1) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var0 + var2;
	}

	static final void method2468(CacheableEntry_Sub23_Sub16_Sub2 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 != null && var0.method2945(-1882572939)) {
			NpcDef var7;
			if (var0 instanceof Npc) {
				var7 = ((Npc) var0).definition;
				if (var7.anIntArray2246 != null) {
					var7 = var7.method2400(-1972187351);
				}

				if (var7 == null) {
					return;
				}
			}

			int var9;
			if (var1 < GameClient.anInt3091 * -796710281) {
				var9 = 30;
				Player var8 = (Player) var0;
				if (var8.aBool2822) {
					return;
				}

				if (var8.anInt2816 * -1470097365 != -1 || var8.anInt2814 * -1015290317 != -1) {
					LinkedEntry_Sub5_Sub4.method2934(var0, 15 + var0.anInt2554 * -1416784945, (byte) 1);
					if (GameClient.anInt2968 * 972236853 > -1) {
						if (var8.anInt2816 * -1470097365 != -1) {
							Player.aClass109_Sub23_Sub14_Sub2Array2836[var8.anInt2816 * -1470097365].method2997(var2 + GameClient.anInt2968 * 972236853 - 12, GameClient.anInt2969 * 1023916389 + var3 - var9);
							var9 += 25;
						}

						if (var8.anInt2814 * -1015290317 != -1) {
							Class29.aClass109_Sub23_Sub14_Sub2Array359[var8.anInt2814 * -1015290317].method2997(var2 + GameClient.anInt2968 * 972236853 - 12, GameClient.anInt2969 * 1023916389 + var3 - var9);
							var9 += 25;
						}
					}
				}

				if (var1 >= 0 && GameClient.anInt3113 * 1066731469 == 10 && GameClient.anIntArray3107[var1] == GameClient.anInt3026 * -1467260517) {
					LinkedEntry_Sub5_Sub4.method2934(var0, var0.anInt2554 * -1416784945 + 15, (byte) 1);
					if (GameClient.anInt2968 * 972236853 > -1) {
						Class40.aClass109_Sub23_Sub14_Sub2Array580[1].method2997(var2 + GameClient.anInt2968 * 972236853 - 12, GameClient.anInt2969 * 1023916389 + var3 - var9);
					}
				}
			} else {
				var7 = ((Npc) var0).definition;
				if (var7.anIntArray2246 != null) {
					var7 = var7.method2400(-1941506922);
				}

				if (var7.anInt2244 * 278946575 >= 0 && var7.anInt2244 * 278946575 < Class29.aClass109_Sub23_Sub14_Sub2Array359.length) {
					LinkedEntry_Sub5_Sub4.method2934(var0, 15 + var0.anInt2554 * -1416784945, (byte) 1);
					if (GameClient.anInt2968 * 972236853 > -1) {
						Class29.aClass109_Sub23_Sub14_Sub2Array359[var7.anInt2244 * 278946575].method2997(GameClient.anInt2968 * 972236853 + var2 - 12, GameClient.anInt2969 * 1023916389 + var3 - 30);
					}
				}

				if (GameClient.anInt3113 * 1066731469 == 1 && GameClient.anInt2879 * -1890256937 == GameClient.npcIndices[var1 - GameClient.anInt3091 * -796710281] && GameClient.cycle * 1026470457 % 20 < 10) {
					LinkedEntry_Sub5_Sub4.method2934(var0, var0.anInt2554 * -1416784945 + 15, (byte) 1);
					if (GameClient.anInt2968 * 972236853 > -1) {
						Class40.aClass109_Sub23_Sub14_Sub2Array580[0].method2997(var2 + GameClient.anInt2968 * 972236853 - 12, var3 + GameClient.anInt2969 * 1023916389 - 28);
					}
				}
			}

			if (var0.aString2523 != null && (var1 >= GameClient.anInt3091 * -796710281 || !var0.aBool2519 && (GameClient.anInt3039 * 500271761 == 4 || !var0.aBool2518 && (GameClient.anInt3039 * 500271761 == 0 || GameClient.anInt3039 * 500271761 == 3 || GameClient.anInt3039 * 500271761 == 1 && Class57.method794(((Player) var0).aString2835, false, 1407840630))))) {
				LinkedEntry_Sub5_Sub4.method2934(var0, var0.anInt2554 * -1416784945, (byte) 1);
				if (GameClient.anInt2968 * 972236853 > -1 && GameClient.anInt2956 * -738319905 < GameClient.anInt2957 * 2060170727) {
					GameClient.anIntArray2961[GameClient.anInt2956 * -738319905] = Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3311(var0.aString2523) / 2;
					GameClient.anIntArray2959[GameClient.anInt2956 * -738319905] = Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.anInt2807;
					GameClient.anIntArray2958[GameClient.anInt2956 * -738319905] = GameClient.anInt2968 * 972236853;
					GameClient.anIntArray2891[GameClient.anInt2956 * -738319905] = GameClient.anInt2969 * 1023916389;
					GameClient.anIntArray2962[GameClient.anInt2956 * -738319905] = var0.anInt2513 * -726164577;
					GameClient.anIntArray2963[GameClient.anInt2956 * -738319905] = var0.anInt2522 * 997113459;
					GameClient.anIntArray2932[GameClient.anInt2956 * -738319905] = var0.anInt2511 * -1182929285;
					GameClient.aStringArray2965[GameClient.anInt2956 * -738319905] = var0.aString2523;
					GameClient.anInt2956 -= 186721761;
				}
			}

			if (var0.anInt2527 * -243623201 > GameClient.cycle * 1026470457) {
				LinkedEntry_Sub5_Sub4.method2934(var0, 15 + var0.anInt2554 * -1416784945, (byte) 1);
				if (GameClient.anInt2968 * 972236853 > -1) {
					if (var1 < GameClient.anInt3091 * -796710281) {
						var9 = 30;
					} else {
						NpcDef var10 = ((Npc) var0).definition;
						var9 = var10.anInt2252 * 1130688757;
					}

					int var11 = var0.anInt2528 * -1406670123 * var9 / (var0.anInt2529 * 1012550093);
					if (var11 > var9) {
						var11 = var9;
					} else if (var11 == 0 && var0.anInt2528 * -1406670123 > 0) {
						var11 = 1;
					}

					CacheableEntry_Sub23_Sub14.method2718(GameClient.anInt2968 * 972236853 + var2 - var9 / 2, var3 + GameClient.anInt2969 * 1023916389 - 3, var11, 5, 65280);
					CacheableEntry_Sub23_Sub14.method2718(GameClient.anInt2968 * 972236853 + var2 - var9 / 2 + var11, var3 + GameClient.anInt2969 * 1023916389 - 3, var9 - var11, 5, 16711680);
				}
			}

			for (var9 = 0; var9 < 4; var9++) {
				if (var0.hitDelays[var9] > GameClient.cycle * 1026470457) {
					LinkedEntry_Sub5_Sub4.method2934(var0, var0.anInt2554 * -1416784945 / 2, (byte) 1);
					if (GameClient.anInt2968 * 972236853 > -1) {
						if (var9 == 1) {
							GameClient.anInt2969 -= 509626500;
						}

						if (var9 == 2) {
							GameClient.anInt2968 += 303450189;
							GameClient.anInt2969 += 1892670398;
						}

						if (var9 == 3) {
							GameClient.anInt2968 -= 303450189;
							GameClient.anInt2969 += 1892670398;
						}

						CacheableEntry_Sub23_Sub11.aClass109_Sub23_Sub14_Sub2Array2338[var0.hitTypes[var9]].method2997(var2 + GameClient.anInt2968 * 972236853 - 12, var3 + GameClient.anInt2969 * 1023916389 - 12);
						Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309.method3381(Integer.toString(var0.hitValues[var9]), var2 + GameClient.anInt2968 * 972236853 - 1, 3 + var3 + GameClient.anInt2969 * 1023916389, 16777215, 0);
					}
				}
			}

		}
	}

	static final void method2469(int var0) {
		Class37.method495(847197597);
		CacheableEntry_Sub23_Sub6.aClass128_2201.method1579();
		CacheableEntry_Sub23_Sub2.aClass128_2097.method1579();
		aClass128_2260.method1579();
		aClass128_2261.method1579();
		aClass128_2262.method1579();
		aClass128_2263.method1579();
		NpcDef.definitionCache.method1579();
		NpcDef.aClass128_2250.method1579();
		Class26.method369(-151518994);
		AnimationSequence.aClass128_2167.method1579();
		AnimationSequence.aClass128_2168.method1579();
		CacheableEntry_Sub23_Sub17.method2797(-129675959);
		Class48.method705(1028119334);
		Class4.method133(118802121);
		Class108.aClass128_1500.method1579();
		InterfaceDef.aClass128_1933.method1579();
		InterfaceDef.aClass128_2035.method1579();
		InterfaceDef.aClass128_2065.method1579();
		InterfaceDef.aClass128_1936.method1579();
		((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method686((byte) 89);
		CacheableEntry_Sub23_Sub17.aClass128_2415.method1579();
		Class54.aClass94_Sub1_724.method1199(-669970278);
		Class88.aClass94_Sub1_1046.method1199(1608683902);
		Class35.aClass94_Sub1_477.method1199(1885095067);
		GameClient.aClass94_Sub1_3134.method1199(-2049641598);
		Class126_Sub1.aClass94_Sub1_1643.method1199(-41205488);
		Class46.aClass94_Sub1_652.method1199(-411286526);
		Class22.aClass94_Sub1_288.method1199(1589042013);
		Class18.aClass94_Sub1_217.method1199(-507048750);
		ScriptInvocation.aClass94_Sub1_1783.method1199(-374052206);
		IndexDescriptor.aClass94_Sub1_1369.method1199(1816423067);
		Class44.aClass94_Sub1_634.method1199(1867178164);
		Connection.aClass94_Sub1_972.method1199(-1296203819);
	}

}
