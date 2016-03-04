import java.applet.Applet;

public class CacheableEntry_Sub23_Sub6 extends CacheableEntry {

	static Class2 aClass2_2200;
	static final int anInt2206 = 51;
	static int anInt2207;
	static IndexDescriptor aIndexDescriptor_2208;
	public static final int anInt2210 = 166;
	int anInt2209 = 0;
	public int anInt2204;
	public int anInt2205;
	public int anInt2202;
	public int anInt2203;
	public static Class128 aClass128_2201 = new Class128(64);

	void method2356(int var1) {
		method2359(anInt2209 * -777226959, -311347148);
	}

	static void setLoginMessages(String var0, String var1, String var2) {
		Class3.aString58 = var0;
		Class3.aString59 = var1;
		Class3.aString60 = var2;
	}

	void method2358(DataBuffer var1, int var2, int var3, int var4) {
		if (var2 == 1) {
			anInt2209 = var1.readTriByte() * 1206961105;
		}

	}

	void method2359(int var1, int var2) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var11 = (double) (var1 >> 8 & 255) / 256.0D;
		double var5 = (double) (var1 & 255) / 256.0D;
		double var7 = var3;
		if (var11 < var3) {
			var7 = var11;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var3;
		if (var11 > var3) {
			var9 = var11;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var17 = 0.0D;
		double var15 = 0.0D;
		double var13 = (var7 + var9) / 2.0D;
		if (var7 != var9) {
			if (var13 < 0.5D) {
				var15 = (var9 - var7) / (var9 + var7);
			}

			if (var13 >= 0.5D) {
				var15 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var3) {
				var17 = (var11 - var5) / (var9 - var7);
			} else if (var11 == var9) {
				var17 = (var5 - var3) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var17 = (var3 - var11) / (var9 - var7) + 4.0D;
			}
		}

		var17 /= 6.0D;
		anInt2204 = (int) (var15 * 256.0D) * -1484271685;
		anInt2205 = (int) (var13 * 256.0D) * 1459226941;
		if (anInt2204 * 625515891 < 0) {
			anInt2204 = 0;
		} else if (anInt2204 * 625515891 > 255) {
			anInt2204 = -532157627;
		}

		if (anInt2205 * 983176725 < 0) {
			anInt2205 = 0;
		} else if (anInt2205 * 983176725 > 255) {
			anInt2205 = -1559284797;
		}

		if (var13 > 0.5D) {
			anInt2202 = (int) (512.0D * var15 * (1.0D - var13)) * 1293709677;
		} else {
			anInt2202 = (int) (var13 * var15 * 512.0D) * 1293709677;
		}

		if (anInt2202 * 496779365 < 1) {
			anInt2202 = 1293709677;
		}

		anInt2203 = (int) ((double) (anInt2202 * 496779365) * var17) * 266618867;
	}

	void method2361(DataBuffer var1, int var2, int var3) {
		while (true) {
			int var4 = var1.readUByte();
			if (var4 == 0) {
				return;
			}

			method2358(var1, var4, var2, 1991220509);
		}
	}

	public static void method2370(Applet var0, String var1, int var2) {
		Class70.anApplet854 = var0;
		Class70.aString853 = var1;
	}

	static final void method2374(LinkedEntry_Sub13 var0, boolean var1, int var2) {
		int var3 = var0.anInt1819 * -1385416029;
		int var5 = (int) var0.key;
		var0.unlink();
		if (var1) {
			Class99.method1256(var3, -1996137882);
		}

		for (InterfaceSetting var4 = (InterfaceSetting) GameClient.interfaceSettings.method1537(); var4 != null; var4 = (InterfaceSetting) GameClient.interfaceSettings.method1543()) {
			if ((long) var3 == (var4.key >> 48 & 65535L)) {
				var4.unlink();
			}
		}

		InterfaceDef var6 = Class50.method713(var5, (byte) -48);
		if (var6 != null) {
			Class35.method484(var6, -426897462);
		}

		Class44.method680((byte) 13);
		if (GameClient.activeRoot * 1787246131 != -1) {
			Class5.method138(GameClient.activeRoot * 1787246131, 1, (byte) 78);
		}

	}

	public static int method2375(int var0, int var1, byte var2) {
		int var3 = var0 >>> 31;
		return (var3 + var0) / var1 - var3;
	}

	static final void method2376(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Class39 var8, Class141[] var9, int var10) {
		DataBuffer var11 = new DataBuffer(var0);
		int var16 = -1;

		while (true) {
			int var14 = var11.readCompact();
			if (var14 == 0) {
				return;
			}

			var16 += var14;
			int var17 = 0;

			while (true) {
				int var18 = var11.readCompact();
				if (var18 == 0) {
					break;
				}

				var17 += var18 - 1;
				int var15 = var17 & 63;
				int var19 = var17 >> 6 & 63;
				int var22 = var17 >> 12;
				int var23 = var11.readUByte();
				int var24 = var23 >> 2;
				int var25 = var23 & 3;
				if (var4 == var22 && var19 >= var5 && var19 < var5 + 8 && var15 >= var6 && var15 < 8 + var6) {
					ObjectDef var27 = Class56.getObjectDef(var16);
					int var26 = var2 + DataBuffer.method2088(var19 & 7, var15 & 7, var7, var27.anInt2277 * 1832905927, var27.anInt2274 * 1221908201, var25, 675644959);
					int var28 = var19 & 7;
					int var31 = var15 & 7;
					int var21 = var27.anInt2277 * 1832905927;
					int var20 = var27.anInt2274 * 1221908201;
					int var30;
					if ((var25 & 1) == 1) {
						var30 = var21;
						var21 = var20;
						var20 = var30;
					}

					int var29 = var7 & 3;
					int var32;
					if (var29 == 0) {
						var32 = var31;
					} else if (var29 == 1) {
						var32 = 7 - var28 - (var21 - 1);
					} else if (var29 == 2) {
						var32 = 7 - var31 - (var20 - 1);
					} else {
						var32 = var28;
					}

					var30 = var32 + var3;
					if (var26 > 0 && var30 > 0 && var26 < 103 && var30 < 103) {
						int var12 = var1;
						if ((Class32.mapSettings[1][var26][var30] & 2) == 2) {
							var12 = var1 - 1;
						}

						Class141 var13 = null;
						if (var12 >= 0) {
							var13 = var9[var12];
						}

						CacheableEntry_Sub23_Sub11.method2489(var1, var26, var30, var16, var7 + var25 & 3, var24, var8, var13);
					}
				}
			}
		}
	}

}
