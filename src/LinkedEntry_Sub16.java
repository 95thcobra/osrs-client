public class LinkedEntry_Sub16 extends LinkedEntry {

	static byte aByte1888;
	public static String aString1890;
	static final int anInt1891 = 7;
	int[] anIntArray1887 = new int[128];
	LinkedEntry_Sub1_Sub1[] aClass109_Sub1_Sub1Array1882 = new LinkedEntry_Sub1_Sub1[128];
	short[] aShortArray1883 = new short[128];
	byte[] aByteArray1884 = new byte[128];
	byte[] aByteArray1885 = new byte[128];
	Class102[] aClass102Array1886 = new Class102[128];
	byte[] aByteArray1881 = new byte[128];
	int anInt1889;

	boolean method2106(Class6 var1, byte[] var2, int[] var3, byte var4) {
		boolean var5 = true;
		int var7 = 0;
		LinkedEntry_Sub1_Sub1 var8 = null;

		for (int var9 = 0; var9 < 128; var9++) {
			if (var2 == null || var2[var9] != 0) {
				int var6 = anIntArray1887[var9];
				if (var6 != 0) {
					if (var6 != var7) {
						var7 = var6--;
						if ((var6 & 1) == 0) {
							var8 = var1.method142(var6 >> 2, var3, (byte) -107);
						} else {
							var8 = var1.method151(var6 >> 2, var3, (byte) 48);
						}

						if (var8 == null) {
							var5 = false;
						}
					}

					if (var8 != null) {
						aClass109_Sub1_Sub1Array1882[var9] = var8;
						anIntArray1887[var9] = 0;
					}
				}
			}
		}

		return var5;
	}

	void method2107(int var1) {
		anIntArray1887 = null;
	}

	LinkedEntry_Sub16(byte[] var1) {
		DataBuffer var9 = new DataBuffer(var1);

		int var8;
		for (var8 = 0; var9.data[var8 + var9.pos * 1736753585] != 0; var8++) {
			;
		}

		byte[] var10 = new byte[var8];

		int var11;
		for (var11 = 0; var11 < var8; var11++) {
			var10[var11] = var9.readByte();
		}

		var9.pos += 1303963473;
		++var8;
		var11 = var9.pos * 1736753585;
		var9.pos += var8 * 1303963473;

		int var18;
		for (var18 = 0; var9.data[var9.pos * 1736753585 + var18] != 0; var18++) {
			;
		}

		byte[] var19 = new byte[var18];

		int var20;
		for (var20 = 0; var20 < var18; var20++) {
			var19[var20] = var9.readByte();
		}

		var9.pos += 1303963473;
		++var18;
		var20 = var9.pos * 1736753585;
		var9.pos += var18 * 1303963473;

		int var6;
		for (var6 = 0; var9.data[var9.pos * 1736753585 + var6] != 0; var6++) {
			;
		}

		byte[] var5 = new byte[var6];

		for (int var7 = 0; var7 < var6; var7++) {
			var5[var7] = var9.readByte();
		}

		var9.pos += 1303963473;
		++var6;
		byte[] var36 = new byte[var6];
		int var25;
		int var27;
		if (var6 > 1) {
			var36[1] = 1;
			int var22 = 1;
			var25 = 2;

			for (var27 = 2; var27 < var6; var27++) {
				int var12 = var9.readUByte();
				if (var12 == 0) {
					var22 = var25++;
				} else {
					if (var12 <= var22) {
						--var12;
					}

					var22 = var12;
				}

				var36[var27] = (byte) var22;
			}
		} else {
			var25 = var6;
		}

		Class102[] var42 = new Class102[var25];

		Class102 var37;
		for (var27 = 0; var27 < var42.length; var27++) {
			var37 = var42[var27] = new Class102();
			int var28 = var9.readUByte();
			if (var28 > 0) {
				var37.aByteArray1444 = new byte[var28 * 2];
			}

			var28 = var9.readUByte();
			if (var28 > 0) {
				var37.aByteArray1443 = new byte[2 + var28 * 2];
				var37.aByteArray1443[1] = 64;
			}
		}

		var27 = var9.readUByte();
		byte[] var38 = var27 > 0 ? new byte[var27 * 2] : null;
		var27 = var9.readUByte();
		byte[] var45 = var27 > 0 ? new byte[var27 * 2] : null;

		int var3;
		for (var3 = 0; var9.data[var9.pos * 1736753585 + var3] != 0; var3++) {
			;
		}

		byte[] var31 = new byte[var3];

		int var2;
		for (var2 = 0; var2 < var3; var2++) {
			var31[var2] = var9.readByte();
		}

		var9.pos += 1303963473;
		++var3;
		var2 = 0;

		int var17;
		for (var17 = 0; var17 < 128; var17++) {
			var2 += var9.readUByte();
			aShortArray1883[var17] = (short) var2;
		}

		var2 = 0;

		for (var17 = 0; var17 < 128; var17++) {
			var2 += var9.readUByte();
			aShortArray1883[var17] = (short) (aShortArray1883[var17] + (var2 << 8));
		}

		var17 = 0;
		int var4 = 0;
		int var32 = 0;

		int var23;
		for (var23 = 0; var23 < 128; var23++) {
			if (var17 == 0) {
				if (var4 < var31.length) {
					var17 = var31[var4++];
				} else {
					var17 = -1;
				}

				var32 = var9.method2075(-2040339769);
			}

			aShortArray1883[var23] = (short) (aShortArray1883[var23] + ((var32 - 1 & 2) << 14));
			anIntArray1887[var23] = var32;
			--var17;
		}

		var17 = 0;
		var4 = 0;
		var23 = 0;

		int var29;
		for (var29 = 0; var29 < 128; var29++) {
			if (anIntArray1887[var29] != 0) {
				if (var17 == 0) {
					if (var4 < var10.length) {
						var17 = var10[var4++];
					} else {
						var17 = -1;
					}

					var23 = var9.data[var11++] - 1;
				}

				aByteArray1881[var29] = (byte) var23;
				--var17;
			}
		}

		var17 = 0;
		var4 = 0;
		var29 = 0;

		for (int var24 = 0; var24 < 128; var24++) {
			if (anIntArray1887[var24] != 0) {
				if (var17 == 0) {
					if (var4 < var19.length) {
						var17 = var19[var4++];
					} else {
						var17 = -1;
					}

					var29 = var9.data[var20++] + 16 << 2;
				}

				aByteArray1885[var24] = (byte) var29;
				--var17;
			}
		}

		var17 = 0;
		var4 = 0;
		Class102 var43 = null;

		int var30;
		for (var30 = 0; var30 < 128; var30++) {
			if (anIntArray1887[var30] != 0) {
				if (var17 == 0) {
					var43 = var42[var36[var4]];
					if (var4 < var5.length) {
						var17 = var5[var4++];
					} else {
						var17 = -1;
					}
				}

				aClass102Array1886[var30] = var43;
				--var17;
			}
		}

		var17 = 0;
		var4 = 0;
		var30 = 0;

		int var21;
		for (var21 = 0; var21 < 128; var21++) {
			if (var17 == 0) {
				if (var4 >= var31.length) {
					var17 = -1;
				} else {
					var17 = var31[var4++];
				}

				if (anIntArray1887[var21] > 0) {
					var30 = var9.readUByte() + 1;
				}
			}

			aByteArray1884[var21] = (byte) var30;
			--var17;
		}

		anInt1889 = (var9.readUByte() + 1) * 511101199;

		int var13;
		Class102 var14;
		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.aByteArray1444 != null) {
				for (var13 = 1; var13 < var14.aByteArray1444.length; var13 += 2) {
					var14.aByteArray1444[var13] = var9.readByte();
				}
			}

			if (var14.aByteArray1443 != null) {
				for (var13 = 3; var13 < var14.aByteArray1443.length - 2; var13 += 2) {
					var14.aByteArray1443[var13] = var9.readByte();
				}
			}
		}

		if (var38 != null) {
			for (var21 = 1; var21 < var38.length; var21 += 2) {
				var38[var21] = var9.readByte();
			}
		}

		if (var45 != null) {
			for (var21 = 1; var21 < var45.length; var21 += 2) {
				var45[var21] = var9.readByte();
			}
		}

		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.aByteArray1443 != null) {
				var2 = 0;

				for (var13 = 2; var13 < var14.aByteArray1443.length; var13 += 2) {
					var2 = 1 + var2 + var9.readUByte();
					var14.aByteArray1443[var13] = (byte) var2;
				}
			}
		}

		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.aByteArray1444 != null) {
				var2 = 0;

				for (var13 = 2; var13 < var14.aByteArray1444.length; var13 += 2) {
					var2 = 1 + var2 + var9.readUByte();
					var14.aByteArray1444[var13] = (byte) var2;
				}
			}
		}

		int var15;
		byte var16;
		int var34;
		int var35;
		int var41;
		byte var44;
		if (var38 != null) {
			var2 = var9.readUByte();
			var38[0] = (byte) var2;

			for (var21 = 2; var21 < var38.length; var21 += 2) {
				var2 = 1 + var2 + var9.readUByte();
				var38[var21] = (byte) var2;
			}

			var44 = var38[0];
			byte var39 = var38[1];

			for (var13 = 0; var13 < var44; var13++) {
				aByteArray1884[var13] = (byte) (32 + aByteArray1884[var13] * var39 >> 6);
			}

			for (var13 = 2; var13 < var38.length; var13 += 2) {
				var16 = var38[var13];
				byte var33 = var38[var13 + 1];
				var34 = (var16 - var44) * var39 + (var16 - var44) / 2;

				for (var15 = var44; var15 < var16; var15++) {
					var35 = CacheableEntry_Sub23_Sub6.method2375(var34, var16 - var44, (byte) 1);
					aByteArray1884[var15] = (byte) (aByteArray1884[var15] * var35 + 32 >> 6);
					var34 += var33 - var39;
				}

				var44 = var16;
				var39 = var33;
			}

			for (var41 = var44; var41 < 128; var41++) {
				aByteArray1884[var41] = (byte) (32 + var39 * aByteArray1884[var41] >> 6);
			}

			var37 = null;
		}

		if (var45 != null) {
			var2 = var9.readUByte();
			var45[0] = (byte) var2;

			for (var21 = 2; var21 < var45.length; var21 += 2) {
				var2 = 1 + var2 + var9.readUByte();
				var45[var21] = (byte) var2;
			}

			var44 = var45[0];
			int var40 = var45[1] << 1;

			for (var13 = 0; var13 < var44; var13++) {
				var41 = (aByteArray1885[var13] & 255) + var40;
				if (var41 < 0) {
					var41 = 0;
				}

				if (var41 > 128) {
					var41 = 128;
				}

				aByteArray1885[var13] = (byte) var41;
			}

			int var47;
			for (var13 = 2; var13 < var45.length; var13 += 2) {
				var16 = var45[var13];
				var47 = var45[1 + var13] << 1;
				var34 = (var16 - var44) * var40 + (var16 - var44) / 2;

				for (var15 = var44; var15 < var16; var15++) {
					var35 = CacheableEntry_Sub23_Sub6.method2375(var34, var16 - var44, (byte) 1);
					int var26 = var35 + (aByteArray1885[var15] & 255);
					if (var26 < 0) {
						var26 = 0;
					}

					if (var26 > 128) {
						var26 = 128;
					}

					aByteArray1885[var15] = (byte) var26;
					var34 += var47 - var40;
				}

				var44 = var16;
				var40 = var47;
			}

			for (var41 = var44; var41 < 128; var41++) {
				var47 = var40 + (aByteArray1885[var41] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				aByteArray1885[var41] = (byte) var47;
			}

			Object var46 = null;
		}

		for (var21 = 0; var21 < var25; var21++) {
			var42[var21].anInt1438 = var9.readUByte() * 1148047857;
		}

		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.aByteArray1444 != null) {
				var14.anInt1439 = var9.readUByte() * 82887611;
			}

			if (var14.aByteArray1443 != null) {
				var14.anInt1442 = var9.readUByte() * -1824239391;
			}

			if (var14.anInt1438 * -2080964847 > 0) {
				var14.anInt1440 = var9.readUByte() * -512476909;
			}
		}

		for (var21 = 0; var21 < var25; var21++) {
			var42[var21].anInt1445 = var9.readUByte() * -1016419175;
		}

		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.anInt1445 * -1018763351 > 0) {
				var14.anInt1441 = var9.readUByte() * 1778739331;
			}
		}

		for (var21 = 0; var21 < var25; var21++) {
			var14 = var42[var21];
			if (var14.anInt1441 * -1310972373 > 0) {
				var14.anInt1446 = var9.readUByte() * 871211463;
			}
		}

	}

}
