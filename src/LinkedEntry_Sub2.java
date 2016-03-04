public class LinkedEntry_Sub2 extends LinkedEntry {

	static int anInt1661;
	static int anInt1653;
	int anInt1663;
	int anInt1655;
	int anInt1656;
	int anInt1657;
	boolean aBool1681;
	byte[][] aByteArrayArray1658;
	static int anInt1662;
	static int anInt1680;
	static float[] aFloatArray1675;
	static Class9[] aClass9Array1664;
	static Class16[] aClass16Array1682;
	static Class17[] aClass17Array1654;
	static Class14[] aClass14Array1667;
	static boolean[] aBoolArray1671;
	static int[] anIntArray1669;
	static float[] aFloatArray1676;
	static float[] aFloatArray1677;
	static float[] aFloatArray1678;
	static int[] anIntArray1660;
	static float[] aFloatArray1685;
	static float[] aFloatArray1666;
	static float[] aFloatArray1670;
	static int[] anIntArray1683;
	float[] aFloatArray1679;
	int anInt1672;
	int anInt1673;
	boolean aBool1674;
	static boolean aBool1668 = false;
	byte[] aByteArray1684;
	int anInt1665;
	int anInt1686;
	static byte[] aByteArray1659;

	static int method1724() {
		int var0 = aByteArray1659[anInt1653] >> anInt1661 & 1;
		++anInt1661;
		anInt1653 += anInt1661 >> 3;
		anInt1661 &= 7;
		return var0;
	}

	static int method1725(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - anInt1661; var0 -= var3) {
			var3 = 8 - anInt1661;
			int var4 = (1 << var3) - 1;
			var1 += (aByteArray1659[anInt1653] >> anInt1661 & var4) << var2;
			anInt1661 = 0;
			++anInt1653;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (aByteArray1659[anInt1653] >> anInt1661 & var3) << var2;
			anInt1661 += var0;
		}

		return var1;
	}

	void method1726(byte[] var1) {
		DataBuffer var2 = new DataBuffer(var1);
		anInt1663 = var2.readInt();
		anInt1655 = var2.readInt();
		anInt1656 = var2.readInt();
		anInt1657 = var2.readInt();
		if (anInt1657 < 0) {
			anInt1657 = ~anInt1657;
			aBool1681 = true;
		}

		int var5 = var2.readInt();
		aByteArrayArray1658 = new byte[var5][];

		for (int var6 = 0; var6 < var5; var6++) {
			int var4 = 0;

			int var3;
			do {
				var3 = var2.readUByte();
				var4 += var3;
			} while (var3 >= 255);

			byte[] var7 = new byte[var4];
			var2.readBytes(var7, 0, var4);
			aByteArrayArray1658[var6] = var7;
		}

	}

	static void method1727(byte[] var0) {
		method1744(var0, 0);
		anInt1662 = 1 << method1725(4);
		anInt1680 = 1 << method1725(4);
		aFloatArray1675 = new float[anInt1680];

		int var5;
		int var6;
		int var8;
		int var9;
		int var10;
		for (var5 = 0; var5 < 2; var5++) {
			var8 = var5 != 0 ? anInt1680 : anInt1662;
			var9 = var8 >> 1;
			var6 = var8 >> 2;
			var10 = var8 >> 3;
			float[] var4 = new float[var9];

			for (int var11 = 0; var11 < var6; var11++) {
				var4[var11 * 2] = (float) Math.cos((double) (var11 * 4) * 3.141592653589793D / (double) var8);
				var4[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4) * 3.141592653589793D / (double) var8));
			}

			float[] var15 = new float[var9];

			for (int var7 = 0; var7 < var6; var7++) {
				var15[var7 * 2] = (float) Math.cos((double) (var7 * 2 + 1) * 3.141592653589793D / (double) (var8 * 2));
				var15[var7 * 2 + 1] = (float) Math.sin((double) (var7 * 2 + 1) * 3.141592653589793D / (double) (var8 * 2));
			}

			float[] var14 = new float[var6];

			for (int var1 = 0; var1 < var10; var1++) {
				var14[var1 * 2] = (float) Math.cos((double) (var1 * 4 + 2) * 3.141592653589793D / (double) var8);
				var14[var1 * 2 + 1] = -((float) Math.sin((double) (var1 * 4 + 2) * 3.141592653589793D / (double) var8));
			}

			int[] var12 = new int[var10];
			int var3 = ObjectDef.method2467(var10 - 1, 1004321507);

			for (int var2 = 0; var2 < var10; var2++) {
				var12[var2] = Player.method3399(var2, var3, -746271537);
			}

			if (var5 != 0) {
				aFloatArray1685 = var4;
				aFloatArray1666 = var15;
				aFloatArray1670 = var14;
				anIntArray1683 = var12;
			} else {
				aFloatArray1676 = var4;
				aFloatArray1677 = var15;
				aFloatArray1678 = var14;
				anIntArray1660 = var12;
			}
		}

		var5 = method1725(8) + 1;
		aClass9Array1664 = new Class9[var5];

		for (var8 = 0; var8 < var5; var8++) {
			aClass9Array1664[var8] = new Class9();
		}

		var8 = method1725(6) + 1;

		for (var9 = 0; var9 < var8; var9++) {
			method1725(16);
		}

		var8 = method1725(6) + 1;
		aClass16Array1682 = new Class16[var8];

		for (var9 = 0; var9 < var8; var9++) {
			aClass16Array1682[var9] = new Class16();
		}

		var9 = method1725(6) + 1;
		aClass17Array1654 = new Class17[var9];

		for (var6 = 0; var6 < var9; var6++) {
			aClass17Array1654[var6] = new Class17();
		}

		var6 = method1725(6) + 1;
		aClass14Array1667 = new Class14[var6];

		for (var10 = 0; var10 < var6; var10++) {
			aClass14Array1667[var10] = new Class14();
		}

		var10 = method1725(6) + 1;
		aBoolArray1671 = new boolean[var10];
		anIntArray1669 = new int[var10];

		for (int var13 = 0; var13 < var10; var13++) {
			aBoolArray1671[var13] = method1724() != 0;
			method1725(16);
			method1725(16);
			anIntArray1669[var13] = method1725(8);
		}

	}

	float[] method1728(int var1) {
		method1744(aByteArrayArray1658[var1], 0);
		method1724();
		int var7 = method1725(ObjectDef.method2467(anIntArray1669.length - 1, 601745597));
		boolean var8 = aBoolArray1671[var7];
		int var3 = var8 ? anInt1680 : anInt1662;
		boolean var10 = false;
		boolean var11 = false;
		if (var8) {
			var10 = method1724() != 0;
			var11 = method1724() != 0;
		}

		int var15 = var3 >> 1;
		int var19;
		int var21;
		int var22;
		if (var8 && !var10) {
			var19 = (var3 >> 2) - (anInt1662 >> 2);
			var22 = (var3 >> 2) + (anInt1662 >> 2);
			var21 = anInt1662 >> 1;
		} else {
			var19 = 0;
			var22 = var15;
			var21 = var3 >> 1;
		}

		int var6;
		int var24;
		int var26;
		if (var8 && !var11) {
			var24 = var3 - (var3 >> 2) - (anInt1662 >> 2);
			var6 = var3 - (var3 >> 2) + (anInt1662 >> 2);
			var26 = anInt1662 >> 1;
		} else {
			var24 = var15;
			var6 = var3;
			var26 = var3 >> 1;
		}

		Class14 var27 = aClass14Array1667[anIntArray1669[var7]];
		int var28 = var27.anInt182;
		int var13 = var27.anIntArray185[var28];
		boolean var30 = !aClass16Array1682[var13].method274();
		boolean var52 = var30;

		for (var13 = 0; var13 < var27.anInt184; var13++) {
			Class17 var4 = aClass17Array1654[var27.anIntArray183[var13]];
			float[] var29 = aFloatArray1675;
			var4.method304(var29, var3 >> 1, var52);
		}

		int var41;
		if (!var30) {
			var13 = var27.anInt182;
			var41 = var27.anIntArray185[var13];
			aClass16Array1682[var41].method297(aFloatArray1675, var3 >> 1);
		}

		int var53;
		if (var30) {
			for (var13 = var3 >> 1; var13 < var3; var13++) {
				aFloatArray1675[var13] = 0.0F;
			}
		} else {
			var13 = var3 >> 1;
			var41 = var3 >> 2;
			var53 = var3 >> 3;
			float[] var2 = aFloatArray1675;

			int var12;
			for (var12 = 0; var12 < var13; var12++) {
				var2[var12] *= 0.5F;
			}

			for (var12 = var13; var12 < var3; var12++) {
				var2[var12] = -var2[var3 - var12 - 1];
			}

			float[] var44 = var8 ? aFloatArray1685 : aFloatArray1676;
			float[] var33 = var8 ? aFloatArray1666 : aFloatArray1677;
			float[] var31 = var8 ? aFloatArray1670 : aFloatArray1678;
			int[] var34 = var8 ? anIntArray1683 : anIntArray1660;

			float var5;
			int var9;
			float var20;
			float var23;
			float var32;
			for (var9 = 0; var9 < var41; var9++) {
				var5 = var2[var9 * 4] - var2[var3 - var9 * 4 - 1];
				var32 = var2[var9 * 4 + 2] - var2[var3 - var9 * 4 - 3];
				var20 = var44[var9 * 2];
				var23 = var44[var9 * 2 + 1];
				var2[var3 - var9 * 4 - 1] = var5 * var20 - var32 * var23;
				var2[var3 - var9 * 4 - 3] = var5 * var23 + var32 * var20;
			}

			float var14;
			float var16;
			for (var9 = 0; var9 < var53; var9++) {
				var5 = var2[var13 + 3 + var9 * 4];
				var32 = var2[var13 + 1 + var9 * 4];
				var20 = var2[var9 * 4 + 3];
				var23 = var2[var9 * 4 + 1];
				var2[var13 + 3 + var9 * 4] = var5 + var20;
				var2[var13 + 1 + var9 * 4] = var32 + var23;
				var16 = var44[var13 - 4 - var9 * 4];
				var14 = var44[var13 - 3 - var9 * 4];
				var2[var9 * 4 + 3] = (var5 - var20) * var16 - (var32 - var23) * var14;
				var2[var9 * 4 + 1] = (var32 - var23) * var16 + (var5 - var20) * var14;
			}

			var9 = ObjectDef.method2467(var3 - 1, 1232779812);

			int var43;
			int var50;
			int var51;
			int var54;
			for (var43 = 0; var43 < var9 - 3; var43++) {
				var54 = var3 >> var43 + 2;
				var50 = 8 << var43;

				for (var51 = 0; var51 < 2 << var43; var51++) {
					int var47 = var3 - var54 * 2 * var51;
					int var45 = var3 - var54 * (var51 * 2 + 1);

					for (int var17 = 0; var17 < var3 >> var43 + 4; var17++) {
						int var18 = var17 * 4;
						float var38 = var2[var47 - 1 - var18];
						float var35 = var2[var47 - 3 - var18];
						float var25 = var2[var45 - 1 - var18];
						float var36 = var2[var45 - 3 - var18];
						var2[var47 - 1 - var18] = var38 + var25;
						var2[var47 - 3 - var18] = var35 + var36;
						float var37 = var44[var17 * var50];
						float var39 = var44[var17 * var50 + 1];
						var2[var45 - 1 - var18] = (var38 - var25) * var37 - (var35 - var36) * var39;
						var2[var45 - 3 - var18] = (var35 - var36) * var37 + (var38 - var25) * var39;
					}
				}
			}

			for (var43 = 1; var43 < var53 - 1; var43++) {
				var54 = var34[var43];
				if (var43 < var54) {
					var50 = var43 * 8;
					var51 = var54 * 8;
					var16 = var2[var50 + 1];
					var2[var50 + 1] = var2[var51 + 1];
					var2[var51 + 1] = var16;
					var16 = var2[var50 + 3];
					var2[var50 + 3] = var2[var51 + 3];
					var2[var51 + 3] = var16;
					var16 = var2[var50 + 5];
					var2[var50 + 5] = var2[var51 + 5];
					var2[var51 + 5] = var16;
					var16 = var2[var50 + 7];
					var2[var50 + 7] = var2[var51 + 7];
					var2[var51 + 7] = var16;
				}
			}

			for (var43 = 0; var43 < var13; var43++) {
				var2[var43] = var2[var43 * 2 + 1];
			}

			for (var43 = 0; var43 < var53; var43++) {
				var2[var3 - 1 - var43 * 2] = var2[var43 * 4];
				var2[var3 - 2 - var43 * 2] = var2[var43 * 4 + 1];
				var2[var3 - var41 - 1 - var43 * 2] = var2[var43 * 4 + 2];
				var2[var3 - var41 - 2 - var43 * 2] = var2[var43 * 4 + 3];
			}

			for (var43 = 0; var43 < var53; var43++) {
				var32 = var31[var43 * 2];
				var20 = var31[var43 * 2 + 1];
				var23 = var2[var13 + var43 * 2];
				var16 = var2[var13 + var43 * 2 + 1];
				var14 = var2[var3 - 2 - var43 * 2];
				float var48 = var2[var3 - 1 - var43 * 2];
				float var49 = var20 * (var23 - var14) + var32 * (var16 + var48);
				var2[var13 + var43 * 2] = (var23 + var14 + var49) * 0.5F;
				var2[var3 - 2 - var43 * 2] = (var23 + var14 - var49) * 0.5F;
				var49 = var20 * (var16 + var48) - var32 * (var23 - var14);
				var2[var13 + var43 * 2 + 1] = (var16 - var48 + var49) * 0.5F;
				var2[var3 - 1 - var43 * 2] = (-var16 + var48 + var49) * 0.5F;
			}

			for (var43 = 0; var43 < var41; var43++) {
				var2[var43] = var2[var43 * 2 + var13] * var33[var43 * 2] + var2[var43 * 2 + 1 + var13] * var33[var43 * 2 + 1];
				var2[var13 - 1 - var43] = var2[var43 * 2 + var13] * var33[var43 * 2 + 1] - var2[var43 * 2 + 1 + var13] * var33[var43 * 2];
			}

			for (var43 = 0; var43 < var41; var43++) {
				var2[var3 - var41 + var43] = -var2[var43];
			}

			for (var43 = 0; var43 < var41; var43++) {
				var2[var43] = var2[var41 + var43];
			}

			for (var43 = 0; var43 < var41; var43++) {
				var2[var41 + var43] = -var2[var41 - var43 - 1];
			}

			for (var43 = 0; var43 < var41; var43++) {
				var2[var13 + var43] = var2[var3 - var43 - 1];
			}

			for (var43 = var19; var43 < var22; var43++) {
				var32 = (float) Math.sin(((double) (var43 - var19) + 0.5D) / (double) var21 * 0.5D * 3.141592653589793D);
				aFloatArray1675[var43] *= (float) Math.sin(1.5707963267948966D * (double) var32 * (double) var32);
			}

			for (var43 = var24; var43 < var6; var43++) {
				var32 = (float) Math.sin(((double) (var43 - var24) + 0.5D) / (double) var26 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				aFloatArray1675[var43] *= (float) Math.sin(1.5707963267948966D * (double) var32 * (double) var32);
			}
		}

		float[] var46 = null;
		if (anInt1672 > 0) {
			var41 = anInt1672 + var3 >> 2;
			var46 = new float[var41];
			int var40;
			if (!aBool1674) {
				for (var53 = 0; var53 < anInt1673; var53++) {
					var40 = (anInt1672 >> 1) + var53;
					var46[var53] += aFloatArray1679[var40];
				}
			}

			if (!var30) {
				for (var53 = var19; var53 < var3 >> 1; var53++) {
					var40 = var46.length - (var3 >> 1) + var53;
					var46[var40] += aFloatArray1675[var53];
				}
			}
		}

		float[] var42 = aFloatArray1679;
		aFloatArray1679 = aFloatArray1675;
		aFloatArray1675 = var42;
		anInt1672 = var3;
		anInt1673 = var6 - (var3 >> 1);
		aBool1674 = var30;
		return var46;
	}

	static LinkedEntry_Sub2 method1729(IndexDescriptor var0, int var1, int var2) {
		if (!method1731(var0)) {
			var0.method1221(var1, var2, -1406635708);
			return null;
		} else {
			byte[] var3 = var0.getFileData(var1, var2);
			return var3 == null ? null : new LinkedEntry_Sub2(var3);
		}
	}

	LinkedEntry_Sub2(byte[] var1) {
		method1726(var1);
	}

	static boolean method1731(IndexDescriptor var0) {
		if (!aBool1668) {
			byte[] var1 = var0.getFileData(0, 0);
			if (var1 == null) {
				return false;
			}

			method1727(var1);
			aBool1668 = true;
		}

		return true;
	}

	LinkedEntry_Sub1_Sub1 method1736(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (aByteArray1684 == null) {
				anInt1672 = 0;
				aFloatArray1679 = new float[anInt1680];
				aByteArray1684 = new byte[anInt1655];
				anInt1665 = 0;
				anInt1686 = 0;
			}

			for (; anInt1686 < aByteArrayArray1658.length; anInt1686++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var3 = method1728(anInt1686);
				if (var3 != null) {
					int var2 = anInt1665;
					int var5 = var3.length;
					if (var5 > anInt1655 - var2) {
						var5 = anInt1655 - var2;
					}

					for (int var6 = 0; var6 < var5; var6++) {
						int var4 = (int) (128.0F + var3[var6] * 128.0F);
						if ((var4 & -256) != 0) {
							var4 = ~var4 >> 31;
						}

						aByteArray1684[var2++] = (byte) (var4 - 128);
					}

					if (var1 != null) {
						var1[0] -= var2 - anInt1665;
					}

					anInt1665 = var2;
				}
			}

			aFloatArray1679 = null;
			byte[] var7 = aByteArray1684;
			aByteArray1684 = null;
			return new LinkedEntry_Sub1_Sub1(anInt1663, var7, anInt1656, anInt1657, aBool1681);
		}
	}

	static void method1744(byte[] var0, int var1) {
		aByteArray1659 = var0;
		anInt1653 = var1;
		anInt1661 = 0;
	}

	static float method1749(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -2147483648;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

}
