public class ItemDef extends CacheableEntry {

	public static int anInt2111;
	static IndexDescriptor configIndex2;
	public int id;
	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array2140;
	int inventoryModel;
	public String name = "null";
	public int zoom2d = -1530229008;
	public int xan2d = 0;
	public int yan2d = 0;
	public int xof2d = 0;
	public int yof2d = 0;
	public int stackable = 0;
	public int cost = -634828929;
	public boolean members = false;
	int anInt2128;
	int anInt2134;
	int anInt2137;
	int anInt2161;
	int anInt2148;
	int anInt2141;
	short[] recol_s;
	short[] recol_d;
	short[] retex_s;
	short[] retex_d;
	public boolean grandexchange;
	int maleModel2;
	int anInt2143;
	int anInt2144;
	int anInt2146;
	int anInt2145;
	int anInt2147;
	public int anInt2114 = 0;
	public int anInt2120;
	public int anInt2151;
	int anInt2158;
	int[] countobj;
	int[] countco;
	int anInt2153;
	int anInt2127;
	public int anInt2155;
	public int anInt2156;
	public int anInt2157;
	int anInt2159;
	int anInt2150;
	public String[] options;
	public String[] ioptions;
	static Class128 cache = new Class128(64);
	static Class128 aClass128_2116 = new Class128(50);
	static Class128 aClass128_2117 = new Class128(200);

	void decode(DataBuffer buffer) {
		while (true) {
			int code = buffer.readUByte();
			if (code == 0) {
				return;
			}

			decode(buffer, code);
		}
	}

	void decode(DataBuffer buffer, int code) {
		if (code == 1) {
			inventoryModel = buffer.readUShort() * -1054390825;
		} else if (code == 2) {
			name = buffer.readString();
		} else if (code == 4) {
			zoom2d = buffer.readUShort() * 1014994651;
		} else if (code == 5) {
			xan2d = buffer.readUShort() * -263973679;
		} else if (code == 6) {
			yan2d = buffer.readUShort() * 78727147;
		} else if (code == 7) {
			xof2d = buffer.readUShort() * 63991361;
			if (xof2d * 889627073 > 32767) {
				xof2d -= 1849753600;
			}
		} else if (code == 8) {
			yof2d = buffer.readUShort() * 2102295875;
			if (yof2d * -722274453 > 32767) {
				yof2d -= 2101542912;
			}
		} else if (code == 11) {
			stackable = -1951064907;
		} else if (code == 12) {
			cost = buffer.readInt() * -634828929;
		} else if (code == 16) {
			members = true;
		} else if (code == 23) {
			anInt2128 = buffer.readUShort() * -492117005;
			anInt2134 = buffer.readUByte() * -1813776585;
		} else if (code == 24) {
			anInt2137 = buffer.readUShort() * -959436883;
		} else if (code == 25) {
			anInt2161 = buffer.readUShort() * 1976830921;
			anInt2148 = buffer.readUByte() * -2010187323;
		} else if (code == 26) {
			anInt2141 = buffer.readUShort() * -277653161;
		} else if (code >= 30 && code < 35) {
			options[code - 30] = buffer.readString();
			if (options[code - 30].equalsIgnoreCase(Class90.aString1058)) {
				options[code - 30] = null;
			}
		} else if (code >= 35 && code < 40) {
			ioptions[code - 35] = buffer.readString();
		} else {
			int var4;
			int var5;
			if (code == 40) {
				var5 = buffer.readUByte();
				recol_s = new short[var5];
				recol_d = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					recol_s[var4] = (short) buffer.readUShort();
					recol_d[var4] = (short) buffer.readUShort();
				}
			} else if (code == 41) {
				var5 = buffer.readUByte();
				retex_s = new short[var5];
				retex_d = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					retex_s[var4] = (short) buffer.readUShort();
					retex_d[var4] = (short) buffer.readUShort();
				}
			} else if (code == 65) {
				grandexchange = true;
			} else if (code == 78) {
				maleModel2 = buffer.readUShort() * -112306683;
			} else if (code == 79) {
				anInt2143 = buffer.readUShort() * 1830515813;
			} else if (code == 90) {
				anInt2144 = buffer.readUShort() * 1209387861;
			} else if (code == 91) {
				anInt2146 = buffer.readUShort() * -2123626629;
			} else if (code == 92) {
				anInt2145 = buffer.readUShort() * 16960105;
			} else if (code == 93) {
				anInt2147 = buffer.readUShort() * -522275853;
			} else if (code == 95) {
				anInt2114 = buffer.readUShort() * -147237813;
			} else if (code == 97) {
				anInt2120 = buffer.readUShort() * -1297858855;
			} else if (code == 98) {
				anInt2151 = buffer.readUShort() * -1236475361;
			} else if (code >= 100 && code < 110) {
				if (countobj == null) {
					countobj = new int[10];
					countco = new int[10];
				}

				countobj[code - 100] = buffer.readUShort();
				countco[code - 100] = buffer.readUShort();
			} else if (code == 110) {
				anInt2158 = buffer.readUShort() * 1977933367;
			} else if (code == 111) {
				anInt2153 = buffer.readUShort() * 1935238391;
			} else if (code == 112) {
				anInt2127 = buffer.readUShort() * -442090155;
			} else if (code == 113) {
				anInt2155 = buffer.readByte() * -437318773;
			} else if (code == 114) {
				anInt2156 = buffer.readByte() * 859393051;
			} else if (code == 115) {
				anInt2157 = buffer.readUByte() * 2016092763;
			} else if (code == 139) {
				anInt2159 = buffer.readUShort() * -1221893825;
			} else if (code == 140) {
				anInt2150 = buffer.readUShort() * 1053045751;
			}
		}

	}

	void method2250(ItemDef var1, ItemDef var2, int var3) {
		inventoryModel = var1.inventoryModel * 1;
		zoom2d = var1.zoom2d * 1;
		xan2d = var1.xan2d * 1;
		yan2d = var1.yan2d * 1;
		anInt2114 = var1.anInt2114 * 1;
		xof2d = var1.xof2d * 1;
		yof2d = var1.yof2d * 1;
		recol_s = var1.recol_s;
		recol_d = var1.recol_d;
		retex_s = var1.retex_s;
		retex_d = var1.retex_d;
		name = var2.name;
		members = var2.members;
		cost = var2.cost * 1;
		stackable = -1951064907;
	}

	void method2251(ItemDef var1, ItemDef var2, int var3) {
		inventoryModel = var1.inventoryModel * 1;
		zoom2d = var1.zoom2d * 1;
		xan2d = var1.xan2d * 1;
		yan2d = var1.yan2d * 1;
		anInt2114 = var1.anInt2114 * 1;
		xof2d = var1.xof2d * 1;
		yof2d = var1.yof2d * 1;
		recol_s = var2.recol_s;
		recol_d = var2.recol_d;
		retex_s = var2.retex_s;
		retex_d = var2.retex_d;
		name = var2.name;
		members = var2.members;
		stackable = var2.stackable * 1;
		anInt2128 = var2.anInt2128 * 1;
		anInt2137 = var2.anInt2137 * 1;
		maleModel2 = var2.maleModel2 * 1;
		anInt2161 = var2.anInt2161 * 1;
		anInt2141 = var2.anInt2141 * 1;
		anInt2143 = var2.anInt2143 * 1;
		anInt2144 = var2.anInt2144 * 1;
		anInt2145 = var2.anInt2145 * 1;
		anInt2146 = var2.anInt2146 * 1;
		anInt2147 = var2.anInt2147 * 1;
		anInt2157 = var2.anInt2157 * 1;
		options = var2.options;
		ioptions = new String[5];
		if (var2.ioptions != null) {
			for (int var4 = 0; var4 < 4; var4++) {
				ioptions[var4] = var2.ioptions[var4];
			}
		}

		ioptions[4] = Class90.aString1235;
		cost = 0;
	}

	public final CacheableEntry_Sub23_Sub16_Sub6 method2252(int var1, int var2) {
		int var4;
		if (countobj != null && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; var4++) {
				if (var1 >= countco[var4] && countco[var4] != 0) {
					var3 = countobj[var4];
				}
			}

			if (var3 != -1) {
				return PacketDecoder.getItemDef(var3).method2252(1, -1415287431);
			}
		}

		CacheableEntry_Sub23_Sub16_Sub6 var5 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, inventoryModel * -1065714201, 0);
		if (var5 == null) {
			return null;
		} else {
			if (anInt2158 * 192362375 != 128 || anInt2153 * -1864065849 != 128 || anInt2127 * -1066936323 != 128) {
				var5.method3245(anInt2158 * 192362375, anInt2153 * -1864065849, anInt2127 * -1066936323);
			}

			if (recol_s != null) {
				for (var4 = 0; var4 < recol_s.length; var4++) {
					var5.method3218(recol_s[var4], recol_d[var4]);
				}
			}

			if (retex_s != null) {
				for (var4 = 0; var4 < retex_s.length; var4++) {
					var5.method3219(retex_s[var4], retex_d[var4]);
				}
			}

			return var5;
		}
	}

	public ItemDef method2254(int var1, int var2) {
		if (countobj != null && var1 > 1) {
			int var4 = -1;

			for (int var3 = 0; var3 < 10; var3++) {
				if (var1 >= countco[var3] && countco[var3] != 0) {
					var4 = countobj[var3];
				}
			}

			if (var4 != -1) {
				return PacketDecoder.getItemDef(var4);
			}
		}

		return this;
	}

	public final boolean method2255(boolean var1, byte var2) {
		int var3 = anInt2144 * 581949949;
		int var4 = anInt2145 * -1515231783;
		if (var1) {
			var3 = anInt2146 * -1056522317;
			var4 = anInt2147 * 957226299;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!Class79.aIndexDescriptor_950.method1221(var3, 0, 183776178)) {
				var5 = false;
			}

			if (var4 != -1 && !Class79.aIndexDescriptor_950.method1221(var4, 0, 913249120)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub6 method2256(boolean var1, byte var2) {
		int var3 = anInt2128 * -923439813;
		int var6 = anInt2137 * 1026282533;
		int var5 = maleModel2 * 135071437;
		if (var1) {
			var3 = anInt2161 * -219283847;
			var6 = anInt2141 * 1201840743;
			var5 = anInt2143 * -257942163;
		}

		if (var3 == -1) {
			return null;
		} else {
			CacheableEntry_Sub23_Sub16_Sub6 var8 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, var3, 0);
			if (var6 != -1) {
				CacheableEntry_Sub23_Sub16_Sub6 var4 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, var6, 0);
				if (var5 != -1) {
					CacheableEntry_Sub23_Sub16_Sub6 var7 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, var5, 0);
					CacheableEntry_Sub23_Sub16_Sub6[] var9 = new CacheableEntry_Sub23_Sub16_Sub6[]{var8, var4, var7};
					var8 = new CacheableEntry_Sub23_Sub16_Sub6(var9, 3);
				} else {
					CacheableEntry_Sub23_Sub16_Sub6[] var11 = new CacheableEntry_Sub23_Sub16_Sub6[]{var8, var4};
					var8 = new CacheableEntry_Sub23_Sub16_Sub6(var11, 2);
				}
			}

			if (!var1 && anInt2134 * 527003271 != 0) {
				var8.method3217(0, anInt2134 * 527003271, 0);
			}

			if (var1 && anInt2148 * 891952397 != 0) {
				var8.method3217(0, anInt2148 * 891952397, 0);
			}

			int var10;
			if (recol_s != null) {
				for (var10 = 0; var10 < recol_s.length; var10++) {
					var8.method3218(recol_s[var10], recol_d[var10]);
				}
			}

			if (retex_s != null) {
				for (var10 = 0; var10 < retex_s.length; var10++) {
					var8.method3219(retex_s[var10], retex_d[var10]);
				}
			}

			return var8;
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub6 method2258(boolean var1, int var2) {
		int var3 = anInt2144 * 581949949;
		int var7 = anInt2145 * -1515231783;
		if (var1) {
			var3 = anInt2146 * -1056522317;
			var7 = anInt2147 * 957226299;
		}

		if (var3 == -1) {
			return null;
		} else {
			CacheableEntry_Sub23_Sub16_Sub6 var6 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, var3, 0);
			if (var7 != -1) {
				CacheableEntry_Sub23_Sub16_Sub6 var4 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, var7, 0);
				CacheableEntry_Sub23_Sub16_Sub6[] var5 = new CacheableEntry_Sub23_Sub16_Sub6[]{var6, var4};
				var6 = new CacheableEntry_Sub23_Sub16_Sub6(var5, 2);
			}

			int var8;
			if (recol_s != null) {
				for (var8 = 0; var8 < recol_s.length; var8++) {
					var6.method3218(recol_s[var8], recol_d[var8]);
				}
			}

			if (retex_s != null) {
				for (var8 = 0; var8 < retex_s.length; var8++) {
					var6.method3219(retex_s[var8], retex_d[var8]);
				}
			}

			return var6;
		}
	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method2263(int var1, int var2) {
		if (countobj != null && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; var4++) {
				if (var1 >= countco[var4] && countco[var4] != 0) {
					var3 = countobj[var4];
				}
			}

			if (var3 != -1) {
				return PacketDecoder.getItemDef(var3).method2263(1, -1483066466);
			}
		}

		CacheableEntry_Sub23_Sub16_Sub5 var6 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2116.get((long) (id * 1539412267));
		if (var6 != null) {
			return var6;
		} else {
			CacheableEntry_Sub23_Sub16_Sub6 var7 = CacheableEntry_Sub23_Sub16_Sub6.method3283(Class79.aIndexDescriptor_950, inventoryModel * -1065714201, 0);
			if (var7 == null) {
				return null;
			} else {
				if (anInt2158 * 192362375 != 128 || anInt2153 * -1864065849 != 128 || anInt2127 * -1066936323 != 128) {
					var7.method3245(anInt2158 * 192362375, anInt2153 * -1864065849, anInt2127 * -1066936323);
				}

				int var5;
				if (recol_s != null) {
					for (var5 = 0; var5 < recol_s.length; var5++) {
						var7.method3218(recol_s[var5], recol_d[var5]);
					}
				}

				if (retex_s != null) {
					for (var5 = 0; var5 < retex_s.length; var5++) {
						var7.method3219(retex_s[var5], retex_d[var5]);
					}
				}

				var6 = var7.method3266(64 + anInt2155 * 1037157411, 768 + anInt2156 * 517891679, -50, -10, -50);
				var6.aBool2648 = true;
				aClass128_2116.put(var6, (long) (id * 1539412267));
				return var6;
			}
		}
	}

	static RenderedItemImage[] method2271(int var0) {
		RenderedItemImage[] var1 = new RenderedItemImage[Class18.anInt216 * -877080713];

		for (int var2 = 0; var2 < Class18.anInt216 * -877080713; var2++) {
			RenderedItemImage var3 = var1[var2] = new RenderedItemImage();
			var3.anInt2595 = Class18.anInt220 * 1155403717;
			var3.anInt2593 = Class18.anInt215 * 1186444245;
			var3.anInt2590 = Class18.anIntArray218[var2];
			var3.anInt2591 = Class18.anIntArray219[var2];
			var3.width = Class58.anIntArray756[var2];
			var3.height = PacketDecoder.anIntArray341[var2];
			int var6 = var3.height * var3.width;
			byte[] var5 = Class42.aByteArrayArray603[var2];
			var3.pixels = new int[var6];

			for (int var4 = 0; var4 < var6; var4++) {
				var3.pixels[var4] = CacheableEntry_Sub23_Sub10.anIntArray2316[var5[var4] & 255];
			}
		}

		CacheableEntry_Sub23_Sub10.method2474(-884631494);
		return var1;
	}

	ItemDef() {
		options = new String[]{null, null, Class90.TAKE, null, null};
		ioptions = new String[]{null, null, null, null, Class90.aString1057};
		anInt2128 = 492117005;
		anInt2137 = 959436883;
		anInt2134 = 0;
		anInt2161 = -1976830921;
		anInt2141 = 277653161;
		anInt2148 = 0;
		maleModel2 = 112306683;
		anInt2143 = -1830515813;
		anInt2144 = -1209387861;
		anInt2145 = -16960105;
		anInt2146 = 2123626629;
		anInt2147 = 522275853;
		anInt2120 = 1297858855;
		anInt2151 = 1236475361;
		anInt2158 = -227599488;
		anInt2153 = -1397589120;
		anInt2127 = -752964992;
		anInt2155 = 0;
		anInt2156 = 0;
		anInt2157 = 0;
		grandexchange = false;
		anInt2159 = 1221893825;
		anInt2150 = -1053045751;
	}

	public final boolean method2279(boolean var1, int var2) {
		int var3 = anInt2128 * -923439813;
		int var4 = anInt2137 * 1026282533;
		int var6 = maleModel2 * 135071437;
		if (var1) {
			var3 = anInt2161 * -219283847;
			var4 = anInt2141 * 1201840743;
			var6 = anInt2143 * -257942163;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!Class79.aIndexDescriptor_950.method1221(var3, 0, 839387507)) {
				var5 = false;
			}

			if (var4 != -1 && !Class79.aIndexDescriptor_950.method1221(var4, 0, -1673125648)) {
				var5 = false;
			}

			if (var6 != -1 && !Class79.aIndexDescriptor_950.method1221(var6, 0, -180792512)) {
				var5 = false;
			}

			return var5;
		}
	}

	static RenderedItemImage renderItemSnapshot() {
		RenderedItemImage var1 = new RenderedItemImage();
		var1.anInt2595 = Class18.anInt220 * 1155403717;
		var1.anInt2593 = Class18.anInt215 * 1186444245;
		var1.anInt2590 = Class18.anIntArray218[0];
		var1.anInt2591 = Class18.anIntArray219[0];
		var1.width = Class58.anIntArray756[0];
		var1.height = PacketDecoder.anIntArray341[0];
		int var2 = var1.height * var1.width;
		byte[] var3 = Class42.aByteArrayArray603[0];
		var1.pixels = new int[var2];

		for (int var4 = 0; var4 < var2; var4++) {
			var1.pixels[var4] = CacheableEntry_Sub23_Sub10.anIntArray2316[var3[var4] & 255];
		}

		CacheableEntry_Sub23_Sub10.method2474(-671442609);
		return var1;
	}

	void method2291(byte var1) {
	}

}
