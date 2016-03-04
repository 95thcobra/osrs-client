public class CacheableEntry_Sub23_Sub16_Sub6 extends CacheableEntry_Sub23_Sub16 {

	int[][] anIntArrayArray2750;
	int[][] anIntArrayArray2751;
	int[] anIntArray2748;
	int[] anIntArray2722;
	int anInt2727 = 0;
	int anInt2725 = 0;
	byte aByte2749 = 0;
	boolean aBool2757 = false;
	int anInt2743;
	int[] anIntArray2746;
	int[] anIntArray2723;
	int[] anIntArray2724;
	short[] aShortArray2733;
	short[] aShortArray2734;
	byte[] aByteArray2731;
	int[] anIntArray2756;
	int[] anIntArray2735;
	int[] anIntArray2728;
	byte[] aByteArray2767;
	byte[] aByteArray2758;
	byte[] aByteArray2732;
	byte[] aByteArray2737;
	short[] aShortArray2741;
	short[] aShortArray2739;
	short[] aShortArray2740;
	short[] aShortArray2736;
	short[] aShortArray2729;
	short[] aShortArray2760;
	short[] aShortArray2744;
	byte[] aByteArray2742;
	short[] aShortArray2745;
	short[] aShortArray2753;
	Class40[] aClass40Array2726;
	Class49[] aClass49Array2752;
	Class40[] aClass40Array2754;
	public short aShort2755;
	public short aShort2730;
	int anInt2747;
	int anInt2759;
	int anInt2738;
	int anInt2761;
	int anInt2762;
	static int anInt2765 = 0;
	static int[] anIntArray2763 = new int[10000];
	static int[] anIntArray2764 = new int[10000];
	static int[] anIntArray2766;
	static int[] anIntArray2721;

	void method3205() {
		int var1;
		int var2;
		int var3;
		int[] var4;
		if (anIntArray2748 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < anInt2727; var1++) {
				var3 = anIntArray2748[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			anIntArrayArray2750 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				anIntArrayArray2750[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < anInt2727; anIntArrayArray2750[var3][var4[var3]++] = var1++) {
				var3 = anIntArray2748[var1];
			}

			anIntArray2748 = null;
		}

		if (anIntArray2722 != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < anInt2725; var1++) {
				var3 = anIntArray2722[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			anIntArrayArray2751 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				anIntArrayArray2751[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < anInt2725; anIntArrayArray2751[var3][var4[var3]++] = var1++) {
				var3 = anIntArray2722[var1];
			}

			anIntArray2722 = null;
		}

	}

	public CacheableEntry_Sub23_Sub16_Sub6(CacheableEntry_Sub23_Sub16_Sub6 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		anInt2727 = var1.anInt2727;
		anInt2725 = var1.anInt2725;
		anInt2743 = var1.anInt2743;
		int var6;
		if (var2) {
			anIntArray2746 = var1.anIntArray2746;
			anIntArray2723 = var1.anIntArray2723;
			anIntArray2724 = var1.anIntArray2724;
		} else {
			anIntArray2746 = new int[anInt2727];
			anIntArray2723 = new int[anInt2727];
			anIntArray2724 = new int[anInt2727];

			for (var6 = 0; var6 < anInt2727; var6++) {
				anIntArray2746[var6] = var1.anIntArray2746[var6];
				anIntArray2723[var6] = var1.anIntArray2723[var6];
				anIntArray2724[var6] = var1.anIntArray2724[var6];
			}
		}

		if (var3) {
			aShortArray2733 = var1.aShortArray2733;
		} else {
			aShortArray2733 = new short[anInt2725];

			for (var6 = 0; var6 < anInt2725; var6++) {
				aShortArray2733[var6] = var1.aShortArray2733[var6];
			}
		}

		if (!var4 && var1.aShortArray2734 != null) {
			aShortArray2734 = new short[anInt2725];

			for (var6 = 0; var6 < anInt2725; var6++) {
				aShortArray2734[var6] = var1.aShortArray2734[var6];
			}
		} else {
			aShortArray2734 = var1.aShortArray2734;
		}

		if (var5) {
			aByteArray2731 = var1.aByteArray2731;
		} else {
			aByteArray2731 = new byte[anInt2725];
			if (var1.aByteArray2731 == null) {
				for (var6 = 0; var6 < anInt2725; var6++) {
					aByteArray2731[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < anInt2725; var6++) {
					aByteArray2731[var6] = var1.aByteArray2731[var6];
				}
			}
		}

		anIntArray2756 = var1.anIntArray2756;
		anIntArray2735 = var1.anIntArray2735;
		anIntArray2728 = var1.anIntArray2728;
		aByteArray2767 = var1.aByteArray2767;
		aByteArray2758 = var1.aByteArray2758;
		aByteArray2732 = var1.aByteArray2732;
		aByte2749 = var1.aByte2749;
		aByteArray2737 = var1.aByteArray2737;
		aShortArray2741 = var1.aShortArray2741;
		aShortArray2739 = var1.aShortArray2739;
		aShortArray2740 = var1.aShortArray2740;
		aShortArray2736 = var1.aShortArray2736;
		aShortArray2729 = var1.aShortArray2729;
		aShortArray2760 = var1.aShortArray2760;
		aShortArray2744 = var1.aShortArray2744;
		aByteArray2742 = var1.aByteArray2742;
		aShortArray2745 = var1.aShortArray2745;
		aShortArray2753 = var1.aShortArray2753;
		anIntArray2748 = var1.anIntArray2748;
		anIntArray2722 = var1.anIntArray2722;
		anIntArrayArray2750 = var1.anIntArrayArray2750;
		anIntArrayArray2751 = var1.anIntArrayArray2751;
		aClass40Array2726 = var1.aClass40Array2726;
		aClass49Array2752 = var1.aClass49Array2752;
		aClass40Array2754 = var1.aClass40Array2754;
		aShort2755 = var1.aShort2755;
		aShort2730 = var1.aShort2730;
	}

	void method3207(byte[] var1) {
		DataBuffer var2 = new DataBuffer(var1);
		DataBuffer var20 = new DataBuffer(var1);
		DataBuffer var3 = new DataBuffer(var1);
		DataBuffer var51 = new DataBuffer(var1);
		DataBuffer var16 = new DataBuffer(var1);
		DataBuffer var8 = new DataBuffer(var1);
		DataBuffer var37 = new DataBuffer(var1);
		var2.pos = (var1.length - 23) * 1303963473;
		int var10 = var2.readUShort();
		int var11 = var2.readUShort();
		int var26 = var2.readUByte();
		int var12 = var2.readUByte();
		int var32 = var2.readUByte();
		int var34 = var2.readUByte();
		int var9 = var2.readUByte();
		int var17 = var2.readUByte();
		int var18 = var2.readUByte();
		int var19 = var2.readUShort();
		int var15 = var2.readUShort();
		int var22 = var2.readUShort();
		int var56 = var2.readUShort();
		int var54 = var2.readUShort();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var13;
		if (var26 > 0) {
			aByteArray2737 = new byte[var26];
			var2.pos = 0;

			for (var13 = 0; var13 < var26; var13++) {
				byte var27 = aByteArray2737[var13] = var2.readByte();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var13 = var26 + var10;
		int var31 = var13;
		if (var12 == 1) {
			var13 += var11;
		}

		int var21 = var13;
		var13 += var11;
		int var14 = var13;
		if (var32 == 255) {
			var13 += var11;
		}

		int var50 = var13;
		if (var9 == 1) {
			var13 += var11;
		}

		int var52 = var13;
		if (var18 == 1) {
			var13 += var10;
		}

		int var33 = var13;
		if (var34 == 1) {
			var13 += var11;
		}

		int var35 = var13;
		var13 += var56;
		int var55 = var13;
		if (var17 == 1) {
			var13 += var11 * 2;
		}

		int var38 = var13;
		var13 += var54;
		int var40 = var13;
		var13 += var11 * 2;
		int var41 = var13;
		var13 += var19;
		int var29 = var13;
		var13 += var15;
		int var43 = var13;
		var13 += var22;
		int var44 = var13;
		var13 += var23 * 6;
		int var36 = var13;
		var13 += var24 * 6;
		int var45 = var13;
		var13 += var24 * 6;
		int var47 = var13;
		var13 += var24 * 2;
		int var57 = var13;
		var13 += var24;
		int var30 = var13;
		var13 += var24 * 2 + var25 * 2;
		anInt2727 = var10;
		anInt2725 = var11;
		anInt2743 = var26;
		anIntArray2746 = new int[var10];
		anIntArray2723 = new int[var10];
		anIntArray2724 = new int[var10];
		anIntArray2756 = new int[var11];
		anIntArray2735 = new int[var11];
		anIntArray2728 = new int[var11];
		if (var18 == 1) {
			anIntArray2748 = new int[var10];
		}

		if (var12 == 1) {
			aByteArray2767 = new byte[var11];
		}

		if (var32 == 255) {
			aByteArray2758 = new byte[var11];
		} else {
			aByte2749 = (byte) var32;
		}

		if (var34 == 1) {
			aByteArray2731 = new byte[var11];
		}

		if (var9 == 1) {
			anIntArray2722 = new int[var11];
		}

		if (var17 == 1) {
			aShortArray2734 = new short[var11];
		}

		if (var17 == 1 && var26 > 0) {
			aByteArray2732 = new byte[var11];
		}

		aShortArray2733 = new short[var11];
		if (var26 > 0) {
			aShortArray2741 = new short[var26];
			aShortArray2739 = new short[var26];
			aShortArray2740 = new short[var26];
			if (var24 > 0) {
				aShortArray2736 = new short[var24];
				aShortArray2729 = new short[var24];
				aShortArray2760 = new short[var24];
				aShortArray2744 = new short[var24];
				aByteArray2742 = new byte[var24];
				aShortArray2745 = new short[var24];
			}

			if (var25 > 0) {
				aShortArray2753 = new short[var25];
			}
		}

		var2.pos = var26 * 1303963473;
		var20.pos = var41 * 1303963473;
		var3.pos = var29 * 1303963473;
		var51.pos = var43 * 1303963473;
		var16.pos = var52 * 1303963473;
		int var46 = 0;
		int var48 = 0;
		int var53 = 0;

		int var4;
		int var5;
		int var6;
		int var7;
		int var49;
		for (var4 = 0; var4 < var10; var4++) {
			var49 = var2.readUByte();
			var7 = 0;
			if ((var49 & 1) != 0) {
				var7 = var20.method1881();
			}

			var5 = 0;
			if ((var49 & 2) != 0) {
				var5 = var3.method1881();
			}

			var6 = 0;
			if ((var49 & 4) != 0) {
				var6 = var51.method1881();
			}

			anIntArray2746[var4] = var46 + var7;
			anIntArray2723[var4] = var48 + var5;
			anIntArray2724[var4] = var53 + var6;
			var46 = anIntArray2746[var4];
			var48 = anIntArray2723[var4];
			var53 = anIntArray2724[var4];
			if (var18 == 1) {
				anIntArray2748[var4] = var16.readUByte();
			}
		}

		var2.pos = var40 * 1303963473;
		var20.pos = var31 * 1303963473;
		var3.pos = var14 * 1303963473;
		var51.pos = var33 * 1303963473;
		var16.pos = var50 * 1303963473;
		var8.pos = var55 * 1303963473;
		var37.pos = var38 * 1303963473;

		for (var4 = 0; var4 < var11; var4++) {
			aShortArray2733[var4] = (short) var2.readUShort();
			if (var12 == 1) {
				aByteArray2767[var4] = var20.readByte();
			}

			if (var32 == 255) {
				aByteArray2758[var4] = var3.readByte();
			}

			if (var34 == 1) {
				aByteArray2731[var4] = var51.readByte();
			}

			if (var9 == 1) {
				anIntArray2722[var4] = var16.readUByte();
			}

			if (var17 == 1) {
				aShortArray2734[var4] = (short) (var8.readUShort() - 1);
			}

			if (aByteArray2732 != null && aShortArray2734[var4] != -1) {
				aByteArray2732[var4] = (byte) (var37.readUByte() - 1);
			}
		}

		var2.pos = var35 * 1303963473;
		var20.pos = var21 * 1303963473;
		var4 = 0;
		var49 = 0;
		var7 = 0;
		var5 = 0;

		int var28;
		for (var6 = 0; var6 < var11; var6++) {
			var28 = var20.readUByte();
			if (var28 == 1) {
				var4 = var2.method1881() + var5;
				var49 = var2.method1881() + var4;
				var7 = var2.method1881() + var49;
				var5 = var7;
				anIntArray2756[var6] = var4;
				anIntArray2735[var6] = var49;
				anIntArray2728[var6] = var7;
			}

			if (var28 == 2) {
				var49 = var7;
				var7 = var2.method1881() + var5;
				var5 = var7;
				anIntArray2756[var6] = var4;
				anIntArray2735[var6] = var49;
				anIntArray2728[var6] = var7;
			}

			if (var28 == 3) {
				var4 = var7;
				var7 = var2.method1881() + var5;
				var5 = var7;
				anIntArray2756[var6] = var4;
				anIntArray2735[var6] = var49;
				anIntArray2728[var6] = var7;
			}

			if (var28 == 4) {
				int var42 = var4;
				var4 = var49;
				var49 = var42;
				var7 = var2.method1881() + var5;
				var5 = var7;
				anIntArray2756[var6] = var4;
				anIntArray2735[var6] = var42;
				anIntArray2728[var6] = var7;
			}
		}

		var2.pos = var44 * 1303963473;
		var20.pos = var36 * 1303963473;
		var3.pos = var45 * 1303963473;
		var51.pos = var47 * 1303963473;
		var16.pos = var57 * 1303963473;
		var8.pos = var30 * 1303963473;

		for (var6 = 0; var6 < var26; var6++) {
			var28 = aByteArray2737[var6] & 255;
			if (var28 == 0) {
				aShortArray2741[var6] = (short) var2.readUShort();
				aShortArray2739[var6] = (short) var2.readUShort();
				aShortArray2740[var6] = (short) var2.readUShort();
			}

			if (var28 == 1) {
				aShortArray2741[var6] = (short) var20.readUShort();
				aShortArray2739[var6] = (short) var20.readUShort();
				aShortArray2740[var6] = (short) var20.readUShort();
				aShortArray2736[var6] = (short) var3.readUShort();
				aShortArray2729[var6] = (short) var3.readUShort();
				aShortArray2760[var6] = (short) var3.readUShort();
				aShortArray2744[var6] = (short) var51.readUShort();
				aByteArray2742[var6] = var16.readByte();
				aShortArray2745[var6] = (short) var8.readUShort();
			}

			if (var28 == 2) {
				aShortArray2741[var6] = (short) var20.readUShort();
				aShortArray2739[var6] = (short) var20.readUShort();
				aShortArray2740[var6] = (short) var20.readUShort();
				aShortArray2736[var6] = (short) var3.readUShort();
				aShortArray2729[var6] = (short) var3.readUShort();
				aShortArray2760[var6] = (short) var3.readUShort();
				aShortArray2744[var6] = (short) var51.readUShort();
				aByteArray2742[var6] = var16.readByte();
				aShortArray2745[var6] = (short) var8.readUShort();
				aShortArray2753[var6] = (short) var8.readUShort();
			}

			if (var28 == 3) {
				aShortArray2741[var6] = (short) var20.readUShort();
				aShortArray2739[var6] = (short) var20.readUShort();
				aShortArray2740[var6] = (short) var20.readUShort();
				aShortArray2736[var6] = (short) var3.readUShort();
				aShortArray2729[var6] = (short) var3.readUShort();
				aShortArray2760[var6] = (short) var3.readUShort();
				aShortArray2744[var6] = (short) var51.readUShort();
				aByteArray2742[var6] = var16.readByte();
				aShortArray2745[var6] = (short) var8.readUShort();
			}
		}

		var2.pos = var13 * 1303963473;
		var6 = var2.readUByte();
		if (var6 != 0) {
			new Class31();
			var2.readUShort();
			var2.readUShort();
			var2.readUShort();
			var2.readInt();
		}

	}

	public CacheableEntry_Sub23_Sub16_Sub6(CacheableEntry_Sub23_Sub16_Sub6[] var1, int var2) {
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var4 = false;
		boolean var12 = false;
		boolean var8 = false;
		anInt2727 = 0;
		anInt2725 = 0;
		anInt2743 = 0;
		aByte2749 = -1;

		int var3;
		CacheableEntry_Sub23_Sub16_Sub6 var9;
		for (var3 = 0; var3 < var2; var3++) {
			var9 = var1[var3];
			if (var9 != null) {
				anInt2727 += var9.anInt2727;
				anInt2725 += var9.anInt2725;
				anInt2743 += var9.anInt2743;
				if (var9.aByteArray2758 != null) {
					var6 = true;
				} else {
					if (aByte2749 == -1) {
						aByte2749 = var9.aByte2749;
					}

					if (aByte2749 != var9.aByte2749) {
						var6 = true;
					}
				}

				var5 |= var9.aByteArray2767 != null;
				var7 |= var9.aByteArray2731 != null;
				var4 |= var9.anIntArray2722 != null;
				var12 |= var9.aShortArray2734 != null;
				var8 |= var9.aByteArray2732 != null;
			}
		}

		anIntArray2746 = new int[anInt2727];
		anIntArray2723 = new int[anInt2727];
		anIntArray2724 = new int[anInt2727];
		anIntArray2748 = new int[anInt2727];
		anIntArray2756 = new int[anInt2725];
		anIntArray2735 = new int[anInt2725];
		anIntArray2728 = new int[anInt2725];
		if (var5) {
			aByteArray2767 = new byte[anInt2725];
		}

		if (var6) {
			aByteArray2758 = new byte[anInt2725];
		}

		if (var7) {
			aByteArray2731 = new byte[anInt2725];
		}

		if (var4) {
			anIntArray2722 = new int[anInt2725];
		}

		if (var12) {
			aShortArray2734 = new short[anInt2725];
		}

		if (var8) {
			aByteArray2732 = new byte[anInt2725];
		}

		aShortArray2733 = new short[anInt2725];
		if (anInt2743 > 0) {
			aByteArray2737 = new byte[anInt2743];
			aShortArray2741 = new short[anInt2743];
			aShortArray2739 = new short[anInt2743];
			aShortArray2740 = new short[anInt2743];
			aShortArray2736 = new short[anInt2743];
			aShortArray2729 = new short[anInt2743];
			aShortArray2760 = new short[anInt2743];
			aShortArray2744 = new short[anInt2743];
			aByteArray2742 = new byte[anInt2743];
			aShortArray2745 = new short[anInt2743];
			aShortArray2753 = new short[anInt2743];
		}

		anInt2727 = 0;
		anInt2725 = 0;
		anInt2743 = 0;

		for (var3 = 0; var3 < var2; var3++) {
			var9 = var1[var3];
			if (var9 != null) {
				int var10;
				for (var10 = 0; var10 < var9.anInt2725; var10++) {
					if (var5 && var9.aByteArray2767 != null) {
						aByteArray2767[anInt2725] = var9.aByteArray2767[var10];
					}

					if (var6) {
						if (var9.aByteArray2758 != null) {
							aByteArray2758[anInt2725] = var9.aByteArray2758[var10];
						} else {
							aByteArray2758[anInt2725] = var9.aByte2749;
						}
					}

					if (var7 && var9.aByteArray2731 != null) {
						aByteArray2731[anInt2725] = var9.aByteArray2731[var10];
					}

					if (var4 && var9.anIntArray2722 != null) {
						anIntArray2722[anInt2725] = var9.anIntArray2722[var10];
					}

					if (var12) {
						if (var9.aShortArray2734 != null) {
							aShortArray2734[anInt2725] = var9.aShortArray2734[var10];
						} else {
							aShortArray2734[anInt2725] = -1;
						}
					}

					if (var8) {
						if (var9.aByteArray2732 != null && var9.aByteArray2732[var10] != -1) {
							aByteArray2732[anInt2725] = (byte) (var9.aByteArray2732[var10] + anInt2743);
						} else {
							aByteArray2732[anInt2725] = -1;
						}
					}

					aShortArray2733[anInt2725] = var9.aShortArray2733[var10];
					anIntArray2756[anInt2725] = method3208(var9, var9.anIntArray2756[var10]);
					anIntArray2735[anInt2725] = method3208(var9, var9.anIntArray2735[var10]);
					anIntArray2728[anInt2725] = method3208(var9, var9.anIntArray2728[var10]);
					++anInt2725;
				}

				for (var10 = 0; var10 < var9.anInt2743; var10++) {
					byte var11 = aByteArray2737[anInt2743] = var9.aByteArray2737[var10];
					if (var11 == 0) {
						aShortArray2741[anInt2743] = (short) method3208(var9, var9.aShortArray2741[var10]);
						aShortArray2739[anInt2743] = (short) method3208(var9, var9.aShortArray2739[var10]);
						aShortArray2740[anInt2743] = (short) method3208(var9, var9.aShortArray2740[var10]);
					}

					if (var11 >= 1 && var11 <= 3) {
						aShortArray2741[anInt2743] = var9.aShortArray2741[var10];
						aShortArray2739[anInt2743] = var9.aShortArray2739[var10];
						aShortArray2740[anInt2743] = var9.aShortArray2740[var10];
						aShortArray2736[anInt2743] = var9.aShortArray2736[var10];
						aShortArray2729[anInt2743] = var9.aShortArray2729[var10];
						aShortArray2760[anInt2743] = var9.aShortArray2760[var10];
						aShortArray2744[anInt2743] = var9.aShortArray2744[var10];
						aByteArray2742[anInt2743] = var9.aByteArray2742[var10];
						aShortArray2745[anInt2743] = var9.aShortArray2745[var10];
					}

					if (var11 == 2) {
						aShortArray2753[anInt2743] = var9.aShortArray2753[var10];
					}

					++anInt2743;
				}
			}
		}

	}

	final int method3208(CacheableEntry_Sub23_Sub16_Sub6 var1, int var2) {
		int var3 = -1;
		int var6 = var1.anIntArray2746[var2];
		int var4 = var1.anIntArray2723[var2];
		int var7 = var1.anIntArray2724[var2];

		for (int var5 = 0; var5 < anInt2727; var5++) {
			if (var6 == anIntArray2746[var5] && var4 == anIntArray2723[var5] && var7 == anIntArray2724[var5]) {
				var3 = var5;
				break;
			}
		}

		if (var3 == -1) {
			anIntArray2746[anInt2727] = var6;
			anIntArray2723[anInt2727] = var4;
			anIntArray2724[anInt2727] = var7;
			if (var1.anIntArray2748 != null) {
				anIntArray2748[anInt2727] = var1.anIntArray2748[var2];
			}

			var3 = anInt2727++;
		}

		return var3;
	}

	public CacheableEntry_Sub23_Sub16_Sub6 method3210() {
		CacheableEntry_Sub23_Sub16_Sub6 var1 = new CacheableEntry_Sub23_Sub16_Sub6();
		if (aByteArray2767 != null) {
			var1.aByteArray2767 = new byte[anInt2725];

			for (int var2 = 0; var2 < anInt2725; var2++) {
				var1.aByteArray2767[var2] = aByteArray2767[var2];
			}
		}

		var1.anInt2727 = anInt2727;
		var1.anInt2725 = anInt2725;
		var1.anInt2743 = anInt2743;
		var1.anIntArray2746 = anIntArray2746;
		var1.anIntArray2723 = anIntArray2723;
		var1.anIntArray2724 = anIntArray2724;
		var1.anIntArray2756 = anIntArray2756;
		var1.anIntArray2735 = anIntArray2735;
		var1.anIntArray2728 = anIntArray2728;
		var1.aByteArray2758 = aByteArray2758;
		var1.aByteArray2731 = aByteArray2731;
		var1.aByteArray2732 = aByteArray2732;
		var1.aShortArray2733 = aShortArray2733;
		var1.aShortArray2734 = aShortArray2734;
		var1.aByte2749 = aByte2749;
		var1.aByteArray2737 = aByteArray2737;
		var1.aShortArray2741 = aShortArray2741;
		var1.aShortArray2739 = aShortArray2739;
		var1.aShortArray2740 = aShortArray2740;
		var1.aShortArray2736 = aShortArray2736;
		var1.aShortArray2729 = aShortArray2729;
		var1.aShortArray2760 = aShortArray2760;
		var1.aShortArray2744 = aShortArray2744;
		var1.aByteArray2742 = aByteArray2742;
		var1.aShortArray2745 = aShortArray2745;
		var1.aShortArray2753 = aShortArray2753;
		var1.anIntArray2748 = anIntArray2748;
		var1.anIntArray2722 = anIntArray2722;
		var1.anIntArrayArray2750 = anIntArrayArray2750;
		var1.anIntArrayArray2751 = anIntArrayArray2751;
		var1.aClass40Array2726 = aClass40Array2726;
		var1.aClass49Array2752 = aClass49Array2752;
		var1.aShort2755 = aShort2755;
		var1.aShort2730 = aShort2730;
		return var1;
	}

	public CacheableEntry_Sub23_Sub16_Sub6 method3211(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method3224();
		int var11 = var2 + anInt2759;
		int var9 = var2 + anInt2738;
		int var10 = var4 + anInt2762;
		int var12 = var4 + anInt2761;
		if (var11 >= 0 && var9 + 128 >> 7 < var1.length && var10 >= 0 && var12 + 128 >> 7 < var1[0].length) {
			var11 >>= 7;
			var9 = var9 + 127 >> 7;
			var10 >>= 7;
			var12 = var12 + 127 >> 7;
			if (var1[var11][var10] == var3 && var1[var9][var10] == var3 && var1[var11][var12] == var3 && var1[var9][var12] == var3) {
				return this;
			} else {
				CacheableEntry_Sub23_Sub16_Sub6 var17;
				if (var5) {
					var17 = new CacheableEntry_Sub23_Sub16_Sub6();
					var17.anInt2727 = anInt2727;
					var17.anInt2725 = anInt2725;
					var17.anInt2743 = anInt2743;
					var17.anIntArray2746 = anIntArray2746;
					var17.anIntArray2724 = anIntArray2724;
					var17.anIntArray2756 = anIntArray2756;
					var17.anIntArray2735 = anIntArray2735;
					var17.anIntArray2728 = anIntArray2728;
					var17.aByteArray2767 = aByteArray2767;
					var17.aByteArray2758 = aByteArray2758;
					var17.aByteArray2731 = aByteArray2731;
					var17.aByteArray2732 = aByteArray2732;
					var17.aShortArray2733 = aShortArray2733;
					var17.aShortArray2734 = aShortArray2734;
					var17.aByte2749 = aByte2749;
					var17.aByteArray2737 = aByteArray2737;
					var17.aShortArray2741 = aShortArray2741;
					var17.aShortArray2739 = aShortArray2739;
					var17.aShortArray2740 = aShortArray2740;
					var17.aShortArray2736 = aShortArray2736;
					var17.aShortArray2729 = aShortArray2729;
					var17.aShortArray2760 = aShortArray2760;
					var17.aShortArray2744 = aShortArray2744;
					var17.aByteArray2742 = aByteArray2742;
					var17.aShortArray2745 = aShortArray2745;
					var17.aShortArray2753 = aShortArray2753;
					var17.anIntArray2748 = anIntArray2748;
					var17.anIntArray2722 = anIntArray2722;
					var17.anIntArrayArray2750 = anIntArrayArray2750;
					var17.anIntArrayArray2751 = anIntArrayArray2751;
					var17.aShort2755 = aShort2755;
					var17.aShort2730 = aShort2730;
					var17.anIntArray2723 = new int[var17.anInt2727];
				} else {
					var17 = this;
				}

				int var7;
				int var8;
				int var13;
				int var14;
				int var15;
				int var16;
				int var18;
				int var20;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var18 = 0; var18 < var17.anInt2727; var18++) {
						var20 = anIntArray2746[var18] + var2;
						var7 = anIntArray2724[var18] + var4;
						var15 = var20 & 127;
						var13 = var7 & 127;
						var14 = var20 >> 7;
						var8 = var7 >> 7;
						var21 = var1[var14][var8] * (128 - var15) + var1[var14 + 1][var8] * var15 >> 7;
						var16 = var1[var14][var8 + 1] * (128 - var15) + var1[var14 + 1][var8 + 1] * var15 >> 7;
						var22 = var21 * (128 - var13) + var16 * var13 >> 7;
						var17.anIntArray2723[var18] = anIntArray2723[var18] + var22 - var3;
					}
				} else {
					for (var18 = 0; var18 < var17.anInt2727; var18++) {
						var20 = (-anIntArray2723[var18] << 16) / (anInt2410 * -695779227);
						if (var20 < var6) {
							var7 = anIntArray2746[var18] + var2;
							var15 = anIntArray2724[var18] + var4;
							var13 = var7 & 127;
							var14 = var15 & 127;
							var8 = var7 >> 7;
							var21 = var15 >> 7;
							var16 = var1[var8][var21] * (128 - var13) + var1[var8 + 1][var21] * var13 >> 7;
							var22 = var1[var8][var21 + 1] * (128 - var13) + var1[var8 + 1][var21 + 1] * var13 >> 7;
							int var19 = var16 * (128 - var14) + var22 * var14 >> 7;
							var17.anIntArray2723[var18] = anIntArray2723[var18] + (var19 - var3) * (var6 - var20) / var6;
						}
					}
				}

				var17.method3223();
				return var17;
			}
		} else {
			return this;
		}
	}

	public void method3215() {
		for (int var1 = 0; var1 < anInt2727; var1++) {
			int var2 = anIntArray2724[var1];
			anIntArray2724[var1] = anIntArray2746[var1];
			anIntArray2746[var1] = -var2;
		}

		method3223();
	}

	public void method3216(int var1) {
		int var2 = anIntArray2766[var1];
		int var4 = anIntArray2721[var1];

		for (int var3 = 0; var3 < anInt2727; var3++) {
			int var5 = anIntArray2724[var3] * var2 + anIntArray2746[var3] * var4 >> 16;
			anIntArray2724[var3] = anIntArray2724[var3] * var4 - anIntArray2746[var3] * var2 >> 16;
			anIntArray2746[var3] = var5;
		}

		method3223();
	}

	public void method3217(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2727; var4++) {
			anIntArray2746[var4] += var1;
			anIntArray2723[var4] += var2;
			anIntArray2724[var4] += var3;
		}

		method3223();
	}

	public void method3218(short var1, short var2) {
		for (int var3 = 0; var3 < anInt2725; var3++) {
			if (aShortArray2733[var3] == var1) {
				aShortArray2733[var3] = var2;
			}
		}

	}

	public void method3219(short var1, short var2) {
		if (aShortArray2734 != null) {
			for (int var3 = 0; var3 < anInt2725; var3++) {
				if (aShortArray2734[var3] == var1) {
					aShortArray2734[var3] = var2;
				}
			}

		}
	}

	public void method3220() {
		int var1;
		for (var1 = 0; var1 < anInt2727; var1++) {
			anIntArray2724[var1] = -anIntArray2724[var1];
		}

		for (var1 = 0; var1 < anInt2725; var1++) {
			int var2 = anIntArray2756[var1];
			anIntArray2756[var1] = anIntArray2728[var1];
			anIntArray2728[var1] = var2;
		}

		method3223();
	}

	public void method3222() {
		if (aClass40Array2726 == null) {
			aClass40Array2726 = new Class40[anInt2727];

			int var5;
			for (var5 = 0; var5 < anInt2727; var5++) {
				aClass40Array2726[var5] = new Class40();
			}

			for (var5 = 0; var5 < anInt2725; var5++) {
				int var7 = anIntArray2756[var5];
				int var8 = anIntArray2735[var5];
				int var12 = anIntArray2728[var5];
				int var9 = anIntArray2746[var8] - anIntArray2746[var7];
				int var15 = anIntArray2723[var8] - anIntArray2723[var7];
				int var11 = anIntArray2724[var8] - anIntArray2724[var7];
				int var14 = anIntArray2746[var12] - anIntArray2746[var7];
				int var16 = anIntArray2723[var12] - anIntArray2723[var7];
				int var13 = anIntArray2724[var12] - anIntArray2724[var7];
				int var1 = var15 * var13 - var16 * var11;
				int var2 = var11 * var14 - var13 * var9;

				int var3;
				for (var3 = var9 * var16 - var14 * var15; var1 > 8192 || var2 > 8192 || var3 > 8192 || var1 < -8192 || var2 < -8192 || var3 < -8192; var3 >>= 1) {
					var1 >>= 1;
					var2 >>= 1;
				}

				int var4 = (int) Math.sqrt((double) (var1 * var1 + var2 * var2 + var3 * var3));
				if (var4 <= 0) {
					var4 = 1;
				}

				var1 = var1 * 256 / var4;
				var2 = var2 * 256 / var4;
				var3 = var3 * 256 / var4;
				byte var10;
				if (aByteArray2767 == null) {
					var10 = 0;
				} else {
					var10 = aByteArray2767[var5];
				}

				if (var10 == 0) {
					Class40 var6 = aClass40Array2726[var7];
					var6.anInt579 += var1 * -570058601;
					var6.anInt577 += var2 * -182465231;
					var6.anInt576 += var3 * -2102398547;
					var6.anInt583 += 1531761631;
					var6 = aClass40Array2726[var8];
					var6.anInt579 += var1 * -570058601;
					var6.anInt577 += var2 * -182465231;
					var6.anInt576 += var3 * -2102398547;
					var6.anInt583 += 1531761631;
					var6 = aClass40Array2726[var12];
					var6.anInt579 += var1 * -570058601;
					var6.anInt577 += var2 * -182465231;
					var6.anInt576 += var3 * -2102398547;
					var6.anInt583 += 1531761631;
				} else if (var10 == 1) {
					if (aClass49Array2752 == null) {
						aClass49Array2752 = new Class49[anInt2725];
					}

					Class49 var17 = aClass49Array2752[var5] = new Class49();
					var17.anInt683 = var1 * -1972503663;
					var17.anInt681 = var2 * 234782301;
					var17.anInt687 = var3 * 1591541357;
				}
			}

		}
	}

	void method3223() {
		aClass40Array2726 = null;
		aClass40Array2754 = null;
		aClass49Array2752 = null;
		aBool2757 = false;
	}

	void method3224() {
		if (!aBool2757) {
			anInt2410 = 0;
			anInt2747 = 0;
			anInt2759 = 999999;
			anInt2738 = -999999;
			anInt2761 = -99999;
			anInt2762 = 99999;

			for (int var3 = 0; var3 < anInt2727; var3++) {
				int var2 = anIntArray2746[var3];
				int var4 = anIntArray2723[var3];
				int var1 = anIntArray2724[var3];
				if (var2 < anInt2759) {
					anInt2759 = var2;
				}

				if (var2 > anInt2738) {
					anInt2738 = var2;
				}

				if (var1 < anInt2762) {
					anInt2762 = var1;
				}

				if (var1 > anInt2761) {
					anInt2761 = var1;
				}

				if (-var4 > anInt2410 * -695779227) {
					anInt2410 = -var4 * -54955667;
				}

				if (var4 > anInt2747) {
					anInt2747 = var4;
				}
			}

			aBool2757 = true;
		}
	}

	static void method3225(CacheableEntry_Sub23_Sub16_Sub6 var0, CacheableEntry_Sub23_Sub16_Sub6 var1, int var2, int var3, int var4, boolean var5) {
		var0.method3224();
		var0.method3222();
		var1.method3224();
		var1.method3222();
		++anInt2765;
		int var10 = 0;
		int[] var17 = var1.anIntArray2746;
		int var13 = var1.anInt2727;

		int var11;
		for (var11 = 0; var11 < var0.anInt2727; var11++) {
			Class40 var9 = var0.aClass40Array2726[var11];
			if (var9.anInt583 * -1906792417 != 0) {
				int var12 = var0.anIntArray2723[var11] - var3;
				if (var12 <= var1.anInt2747) {
					int var14 = var0.anIntArray2746[var11] - var2;
					if (var14 >= var1.anInt2759 && var14 <= var1.anInt2738) {
						int var15 = var0.anIntArray2724[var11] - var4;
						if (var15 >= var1.anInt2762 && var15 <= var1.anInt2761) {
							for (int var16 = 0; var16 < var13; var16++) {
								Class40 var7 = var1.aClass40Array2726[var16];
								if (var14 == var17[var16] && var15 == var1.anIntArray2724[var16] && var12 == var1.anIntArray2723[var16] && var7.anInt583 * -1906792417 != 0) {
									if (var0.aClass40Array2754 == null) {
										var0.aClass40Array2754 = new Class40[var0.anInt2727];
									}

									if (var1.aClass40Array2754 == null) {
										var1.aClass40Array2754 = new Class40[var13];
									}

									Class40 var6 = var0.aClass40Array2754[var11];
									if (var6 == null) {
										var6 = var0.aClass40Array2754[var11] = new Class40(var9);
									}

									Class40 var8 = var1.aClass40Array2754[var16];
									if (var8 == null) {
										var8 = var1.aClass40Array2754[var16] = new Class40(var7);
									}

									var6.anInt579 += var7.anInt579 * 1;
									var6.anInt577 += var7.anInt577 * 1;
									var6.anInt576 += var7.anInt576 * 1;
									var6.anInt583 += var7.anInt583 * 1;
									var8.anInt579 += var9.anInt579 * 1;
									var8.anInt577 += var9.anInt577 * 1;
									var8.anInt576 += var9.anInt576 * 1;
									var8.anInt583 += var9.anInt583 * 1;
									++var10;
									anIntArray2763[var11] = anInt2765;
									anIntArray2764[var16] = anInt2765;
								}
							}
						}
					}
				}
			}
		}

		if (var10 >= 3 && var5) {
			for (var11 = 0; var11 < var0.anInt2725; var11++) {
				if (anIntArray2763[var0.anIntArray2756[var11]] == anInt2765 && anIntArray2763[var0.anIntArray2735[var11]] == anInt2765 && anIntArray2763[var0.anIntArray2728[var11]] == anInt2765) {
					if (var0.aByteArray2767 == null) {
						var0.aByteArray2767 = new byte[var0.anInt2725];
					}

					var0.aByteArray2767[var11] = 2;
				}
			}

			for (var11 = 0; var11 < var1.anInt2725; var11++) {
				if (anIntArray2764[var1.anIntArray2756[var11]] == anInt2765 && anIntArray2764[var1.anIntArray2735[var11]] == anInt2765 && anIntArray2764[var1.anIntArray2728[var11]] == anInt2765) {
					if (var1.aByteArray2767 == null) {
						var1.aByteArray2767 = new byte[var1.anInt2725];
					}

					var1.aByteArray2767[var11] = 2;
				}
			}

		}
	}

	static final int method3227(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	CacheableEntry_Sub23_Sub16_Sub6() {
	}

	public void method3240() {
		for (int var1 = 0; var1 < anInt2727; var1++) {
			anIntArray2746[var1] = -anIntArray2746[var1];
			anIntArray2724[var1] = -anIntArray2724[var1];
		}

		method3223();
	}

	public void method3245(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2727; var4++) {
			anIntArray2746[var4] = anIntArray2746[var4] * var1 / 128;
			anIntArray2723[var4] = anIntArray2723[var4] * var2 / 128;
			anIntArray2724[var4] = anIntArray2724[var4] * var3 / 128;
		}

		method3223();
	}

	public void method3246() {
		for (int var1 = 0; var1 < anInt2727; var1++) {
			int var2 = anIntArray2746[var1];
			anIntArray2746[var1] = anIntArray2724[var1];
			anIntArray2724[var1] = -var2;
		}

		method3223();
	}

	CacheableEntry_Sub23_Sub16_Sub6(byte[] var1) {
		if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			method3207(var1);
		} else {
			method3264(var1);
		}

	}

	static {
		anIntArray2766 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719;
		anIntArray2721 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720;
	}

	void method3264(byte[] var1) {
		boolean var2 = false;
		boolean var29 = false;
		DataBuffer var10 = new DataBuffer(var1);
		DataBuffer var6 = new DataBuffer(var1);
		DataBuffer var7 = new DataBuffer(var1);
		DataBuffer var28 = new DataBuffer(var1);
		DataBuffer var9 = new DataBuffer(var1);
		var10.pos = (var1.length - 18) * 1303963473;
		int var11 = var10.readUShort();
		int var5 = var10.readUShort();
		int var24 = var10.readUByte();
		int var14 = var10.readUByte();
		int var15 = var10.readUByte();
		int var16 = var10.readUByte();
		int var8 = var10.readUByte();
		int var17 = var10.readUByte();
		int var18 = var10.readUShort();
		int var19 = var10.readUShort();
		int var20 = var10.readUShort();
		int var21 = var10.readUShort();
		byte var12 = 0;
		int var46 = var12 + var11;
		int var41 = var46;
		var46 += var5;
		int var31 = var46;
		if (var15 == 255) {
			var46 += var5;
		}

		int var42 = var46;
		if (var8 == 1) {
			var46 += var5;
		}

		int var43 = var46;
		if (var14 == 1) {
			var46 += var5;
		}

		int var25 = var46;
		if (var17 == 1) {
			var46 += var11;
		}

		int var40 = var46;
		if (var16 == 1) {
			var46 += var5;
		}

		int var30 = var46;
		var46 += var21;
		int var13 = var46;
		var46 += var5 * 2;
		int var32 = var46;
		var46 += var24 * 6;
		int var34 = var46;
		var46 += var18;
		int var36 = var46;
		var46 += var19;
		int var10000 = var46 + var20;
		anInt2727 = var11;
		anInt2725 = var5;
		anInt2743 = var24;
		anIntArray2746 = new int[var11];
		anIntArray2723 = new int[var11];
		anIntArray2724 = new int[var11];
		anIntArray2756 = new int[var5];
		anIntArray2735 = new int[var5];
		anIntArray2728 = new int[var5];
		if (var24 > 0) {
			aByteArray2737 = new byte[var24];
			aShortArray2741 = new short[var24];
			aShortArray2739 = new short[var24];
			aShortArray2740 = new short[var24];
		}

		if (var17 == 1) {
			anIntArray2748 = new int[var11];
		}

		if (var14 == 1) {
			aByteArray2767 = new byte[var5];
			aByteArray2732 = new byte[var5];
			aShortArray2734 = new short[var5];
		}

		if (var15 == 255) {
			aByteArray2758 = new byte[var5];
		} else {
			aByte2749 = (byte) var15;
		}

		if (var16 == 1) {
			aByteArray2731 = new byte[var5];
		}

		if (var8 == 1) {
			anIntArray2722 = new int[var5];
		}

		aShortArray2733 = new short[var5];
		var10.pos = var12 * 1303963473;
		var6.pos = var34 * 1303963473;
		var7.pos = var36 * 1303963473;
		var28.pos = var46 * 1303963473;
		var9.pos = var25 * 1303963473;
		int var22 = 0;
		int var37 = 0;
		int var35 = 0;

		int var3;
		int var4;
		int var23;
		int var26;
		int var33;
		for (var4 = 0; var4 < var11; var4++) {
			var33 = var10.readUByte();
			var23 = 0;
			if ((var33 & 1) != 0) {
				var23 = var6.method1881();
			}

			var26 = 0;
			if ((var33 & 2) != 0) {
				var26 = var7.method1881();
			}

			var3 = 0;
			if ((var33 & 4) != 0) {
				var3 = var28.method1881();
			}

			anIntArray2746[var4] = var22 + var23;
			anIntArray2723[var4] = var37 + var26;
			anIntArray2724[var4] = var35 + var3;
			var22 = anIntArray2746[var4];
			var37 = anIntArray2723[var4];
			var35 = anIntArray2724[var4];
			if (var17 == 1) {
				anIntArray2748[var4] = var9.readUByte();
			}
		}

		var10.pos = var13 * 1303963473;
		var6.pos = var43 * 1303963473;
		var7.pos = var31 * 1303963473;
		var28.pos = var40 * 1303963473;
		var9.pos = var42 * 1303963473;

		for (var4 = 0; var4 < var5; var4++) {
			aShortArray2733[var4] = (short) var10.readUShort();
			if (var14 == 1) {
				var33 = var6.readUByte();
				if ((var33 & 1) == 1) {
					aByteArray2767[var4] = 1;
					var2 = true;
				} else {
					aByteArray2767[var4] = 0;
				}

				if ((var33 & 2) == 2) {
					aByteArray2732[var4] = (byte) (var33 >> 2);
					aShortArray2734[var4] = aShortArray2733[var4];
					aShortArray2733[var4] = 127;
					if (aShortArray2734[var4] != -1) {
						var29 = true;
					}
				} else {
					aByteArray2732[var4] = -1;
					aShortArray2734[var4] = -1;
				}
			}

			if (var15 == 255) {
				aByteArray2758[var4] = var7.readByte();
			}

			if (var16 == 1) {
				aByteArray2731[var4] = var28.readByte();
			}

			if (var8 == 1) {
				anIntArray2722[var4] = var9.readUByte();
			}
		}

		var10.pos = var30 * 1303963473;
		var6.pos = var41 * 1303963473;
		var4 = 0;
		var33 = 0;
		var23 = 0;
		var26 = 0;

		int var38;
		int var39;
		for (var3 = 0; var3 < var5; var3++) {
			var38 = var6.readUByte();
			if (var38 == 1) {
				var4 = var10.method1881() + var26;
				var33 = var10.method1881() + var4;
				var23 = var10.method1881() + var33;
				var26 = var23;
				anIntArray2756[var3] = var4;
				anIntArray2735[var3] = var33;
				anIntArray2728[var3] = var23;
			}

			if (var38 == 2) {
				var33 = var23;
				var23 = var10.method1881() + var26;
				var26 = var23;
				anIntArray2756[var3] = var4;
				anIntArray2735[var3] = var33;
				anIntArray2728[var3] = var23;
			}

			if (var38 == 3) {
				var4 = var23;
				var23 = var10.method1881() + var26;
				var26 = var23;
				anIntArray2756[var3] = var4;
				anIntArray2735[var3] = var33;
				anIntArray2728[var3] = var23;
			}

			if (var38 == 4) {
				var39 = var4;
				var4 = var33;
				var33 = var39;
				var23 = var10.method1881() + var26;
				var26 = var23;
				anIntArray2756[var3] = var4;
				anIntArray2735[var3] = var39;
				anIntArray2728[var3] = var23;
			}
		}

		var10.pos = var32 * 1303963473;

		for (var3 = 0; var3 < var24; var3++) {
			aByteArray2737[var3] = 0;
			aShortArray2741[var3] = (short) var10.readUShort();
			aShortArray2739[var3] = (short) var10.readUShort();
			aShortArray2740[var3] = (short) var10.readUShort();
		}

		if (aByteArray2732 != null) {
			boolean var45 = false;

			for (var38 = 0; var38 < var5; var38++) {
				var39 = aByteArray2732[var38] & 255;
				if (var39 != 255) {
					if ((aShortArray2741[var39] & 65535) == anIntArray2756[var38] && (aShortArray2739[var39] & 65535) == anIntArray2735[var38] && (aShortArray2740[var39] & 65535) == anIntArray2728[var38]) {
						aByteArray2732[var38] = -1;
					} else {
						var45 = true;
					}
				}
			}

			if (!var45) {
				aByteArray2732 = null;
			}
		}

		if (!var29) {
			aShortArray2734 = null;
		}

		if (!var2) {
			aByteArray2767 = null;
		}

	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method3266(int var1, int var2, int var3, int var4, int var5) {
		method3222();
		int var15 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		int var14 = var2 * var15 >> 8;
		CacheableEntry_Sub23_Sub16_Sub5 var9 = new CacheableEntry_Sub23_Sub16_Sub5();
		var9.anIntArray2668 = new int[anInt2725];
		var9.anIntArray2643 = new int[anInt2725];
		var9.anIntArray2644 = new int[anInt2725];
		if (anInt2743 > 0 && aByteArray2732 != null) {
			int[] var6 = new int[anInt2743];

			int var7;
			for (var7 = 0; var7 < anInt2725; var7++) {
				if (aByteArray2732[var7] != -1) {
					++var6[aByteArray2732[var7] & 255];
				}
			}

			var9.anInt2690 = 0;

			for (var7 = 0; var7 < anInt2743; var7++) {
				if (var6[var7] > 0 && aByteArray2737[var7] == 0) {
					++var9.anInt2690;
				}
			}

			var9.anIntArray2651 = new int[var9.anInt2690];
			var9.anIntArray2652 = new int[var9.anInt2690];
			var9.anIntArray2688 = new int[var9.anInt2690];
			var7 = 0;

			int var11;
			for (var11 = 0; var11 < anInt2743; var11++) {
				if (var6[var11] > 0 && aByteArray2737[var11] == 0) {
					var9.anIntArray2651[var7] = aShortArray2741[var11] & 65535;
					var9.anIntArray2652[var7] = aShortArray2739[var11] & 65535;
					var9.anIntArray2688[var7] = aShortArray2740[var11] & 65535;
					var6[var11] = var7++;
				} else {
					var6[var11] = -1;
				}
			}

			var9.aByteArray2647 = new byte[anInt2725];

			for (var11 = 0; var11 < anInt2725; var11++) {
				if (aByteArray2732[var11] != -1) {
					var9.aByteArray2647[var11] = (byte) var6[aByteArray2732[var11] & 255];
				} else {
					var9.aByteArray2647[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < anInt2725; var16++) {
			byte var17;
			if (aByteArray2767 == null) {
				var17 = 0;
			} else {
				var17 = aByteArray2767[var16];
			}

			byte var19;
			if (aByteArray2731 == null) {
				var19 = 0;
			} else {
				var19 = aByteArray2731[var16];
			}

			short var13;
			if (aShortArray2734 == null) {
				var13 = -1;
			} else {
				var13 = aShortArray2734[var16];
			}

			if (var19 == -2) {
				var17 = 3;
			}

			if (var19 == -1) {
				var17 = 2;
			}

			Class40 var8;
			int var10;
			Class49 var18;
			if (var13 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var18 = aClass49Array2752[var16];
						var10 = var1 + (var3 * var18.anInt683 * -2103958159 + var4 * var18.anInt681 * -1496693259 + var5 * var18.anInt687 * 1192147813) / (var14 + var14 / 2);
						var9.anIntArray2668[var16] = method3227(aShortArray2733[var16] & 65535, var10);
						var9.anIntArray2644[var16] = -1;
					} else if (var17 == 3) {
						var9.anIntArray2668[var16] = 128;
						var9.anIntArray2644[var16] = -1;
					} else {
						var9.anIntArray2644[var16] = -2;
					}
				} else {
					int var12 = aShortArray2733[var16] & 65535;
					if (aClass40Array2754 != null && aClass40Array2754[anIntArray2756[var16]] != null) {
						var8 = aClass40Array2754[anIntArray2756[var16]];
					} else {
						var8 = aClass40Array2726[anIntArray2756[var16]];
					}

					var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
					var9.anIntArray2668[var16] = method3227(var12, var10);
					if (aClass40Array2754 != null && aClass40Array2754[anIntArray2735[var16]] != null) {
						var8 = aClass40Array2754[anIntArray2735[var16]];
					} else {
						var8 = aClass40Array2726[anIntArray2735[var16]];
					}

					var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
					var9.anIntArray2643[var16] = method3227(var12, var10);
					if (aClass40Array2754 != null && aClass40Array2754[anIntArray2728[var16]] != null) {
						var8 = aClass40Array2754[anIntArray2728[var16]];
					} else {
						var8 = aClass40Array2726[anIntArray2728[var16]];
					}

					var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
					var9.anIntArray2644[var16] = method3227(var12, var10);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var18 = aClass49Array2752[var16];
					var10 = var1 + (var3 * var18.anInt683 * -2103958159 + var4 * var18.anInt681 * -1496693259 + var5 * var18.anInt687 * 1192147813) / (var14 + var14 / 2);
					var9.anIntArray2668[var16] = method3273(var10);
					var9.anIntArray2644[var16] = -1;
				} else {
					var9.anIntArray2644[var16] = -2;
				}
			} else {
				if (aClass40Array2754 != null && aClass40Array2754[anIntArray2756[var16]] != null) {
					var8 = aClass40Array2754[anIntArray2756[var16]];
				} else {
					var8 = aClass40Array2726[anIntArray2756[var16]];
				}

				var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
				var9.anIntArray2668[var16] = method3273(var10);
				if (aClass40Array2754 != null && aClass40Array2754[anIntArray2735[var16]] != null) {
					var8 = aClass40Array2754[anIntArray2735[var16]];
				} else {
					var8 = aClass40Array2726[anIntArray2735[var16]];
				}

				var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
				var9.anIntArray2643[var16] = method3273(var10);
				if (aClass40Array2754 != null && aClass40Array2754[anIntArray2728[var16]] != null) {
					var8 = aClass40Array2754[anIntArray2728[var16]];
				} else {
					var8 = aClass40Array2726[anIntArray2728[var16]];
				}

				var10 = var1 + (var3 * var8.anInt579 * -1201182937 + var4 * var8.anInt577 * -249140271 + var5 * var8.anInt576 * -537880027) / (var14 * var8.anInt583 * -1906792417);
				var9.anIntArray2644[var16] = method3273(var10);
			}
		}

		method3205();
		var9.anInt2634 = anInt2727;
		var9.anIntArray2694 = anIntArray2746;
		var9.anIntArray2636 = anIntArray2723;
		var9.anIntArray2637 = anIntArray2724;
		var9.anInt2656 = anInt2725;
		var9.anIntArray2639 = anIntArray2756;
		var9.anIntArray2640 = anIntArray2735;
		var9.anIntArray2655 = anIntArray2728;
		var9.aByteArray2671 = aByteArray2758;
		var9.aByteArray2661 = aByteArray2731;
		var9.aByte2630 = aByte2749;
		var9.anIntArrayArray2654 = anIntArrayArray2750;
		var9.anIntArrayArray2679 = anIntArrayArray2751;
		var9.aShortArray2659 = aShortArray2734;
		return var9;
	}

	static final int method3273(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}

	public static CacheableEntry_Sub23_Sub16_Sub6 method3283(IndexDescriptor var0, int var1, int var2) {
		byte[] var3 = var0.getFileData(var1, var2);
		return var3 == null ? null : new CacheableEntry_Sub23_Sub16_Sub6(var3);
	}

}
