public class CacheableEntry_Sub23_Sub16_Sub5 extends CacheableEntry_Sub23_Sub16 {

	static final int anInt2638 = 50;
	static final int anInt2650 = 1600;
	static final int anInt2662 = 4096;
	static final int anInt2695 = 3500;
	int anInt2634 = 0;
	int anInt2656 = 0;
	int anInt2690 = 0;
	int[] anIntArray2694;
	int[] anIntArray2637;
	int[] anIntArray2639;
	int[] anIntArray2640;
	int[] anIntArray2655;
	int[] anIntArray2668;
	int[] anIntArray2643;
	int[] anIntArray2644;
	byte[] aByteArray2671;
	byte[] aByteArray2661;
	byte[] aByteArray2647;
	short[] aShortArray2659;
	byte aByte2630 = 0;
	int[] anIntArray2651;
	int[] anIntArray2652;
	int[] anIntArray2688;
	int[][] anIntArrayArray2654;
	int[][] anIntArrayArray2679;
	public boolean aBool2648 = false;
	int[] anIntArray2636;
	int anInt2657;
	static byte[] aByteArray2631 = new byte[1];
	int anInt2658;
	int anInt2645;
	int anInt2635;
	int anInt2660;
	static int anInt2682;
	static int anInt2683;
	static int anInt2684;
	public static int anInt2680 = 0;
	static CacheableEntry_Sub23_Sub16_Sub5 aClass109_Sub23_Sub16_Sub5_2641 = new CacheableEntry_Sub23_Sub16_Sub5();
	static CacheableEntry_Sub23_Sub16_Sub5 aClass109_Sub23_Sub16_Sub5_2632 = new CacheableEntry_Sub23_Sub16_Sub5();
	static byte[] aByteArray2633 = new byte[1];
	static boolean[] aBoolArray2663 = new boolean[4096];
	static boolean[] aBoolArray2664 = new boolean[4096];
	static int[] anIntArray2665 = new int[4096];
	static int[] anIntArray2666 = new int[4096];
	static int[] anIntArray2672 = new int[4096];
	static int[] anIntArray2649 = new int[4096];
	static int[] anIntArray2646 = new int[4096];
	static int[] anIntArray2670 = new int[4096];
	static int[] anIntArray2691 = new int[1600];
	static int[][] anIntArrayArray2673 = new int[1600][512];
	static int[] anIntArray2667 = new int[12];
	static int[][] anIntArrayArray2675 = new int[12][2000];
	static int[] anIntArray2669 = new int[2000];
	static int[] anIntArray2677 = new int[2000];
	static int[] anIntArray2678 = new int[12];
	static int[] anIntArray2642 = new int[10];
	static int[] anIntArray2674 = new int[10];
	static int[] anIntArray2681 = new int[10];
	public static boolean aBool2685 = false;
	public static int anInt2686 = 0;
	public static int anInt2687 = 0;
	public static int[] anIntArray2689 = new int[1000];
	static int[] anIntArray2653;
	static int[] anIntArray2676;
	static int[] anIntArray2692;
	static int[] anIntArray2693;

	public CacheableEntry_Sub23_Sub16_Sub5 method3079(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		method3082();
		int var10 = var2 - anInt2645;
		int var8 = var2 + anInt2645;
		int var9 = var4 - anInt2645;
		int var11 = var4 + anInt2645;
		if (var10 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var11 + 128 >> 7 < var1[0].length) {
			var10 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var11 = var11 + 127 >> 7;
			if (var1[var10][var9] == var3 && var1[var8][var9] == var3 && var1[var10][var11] == var3 && var1[var8][var11] == var3) {
				return this;
			} else {
				CacheableEntry_Sub23_Sub16_Sub5 var7;
				if (var5) {
					var7 = new CacheableEntry_Sub23_Sub16_Sub5();
					var7.anInt2634 = anInt2634;
					var7.anInt2656 = anInt2656;
					var7.anInt2690 = anInt2690;
					var7.anIntArray2694 = anIntArray2694;
					var7.anIntArray2637 = anIntArray2637;
					var7.anIntArray2639 = anIntArray2639;
					var7.anIntArray2640 = anIntArray2640;
					var7.anIntArray2655 = anIntArray2655;
					var7.anIntArray2668 = anIntArray2668;
					var7.anIntArray2643 = anIntArray2643;
					var7.anIntArray2644 = anIntArray2644;
					var7.aByteArray2671 = aByteArray2671;
					var7.aByteArray2661 = aByteArray2661;
					var7.aByteArray2647 = aByteArray2647;
					var7.aShortArray2659 = aShortArray2659;
					var7.aByte2630 = aByte2630;
					var7.anIntArray2651 = anIntArray2651;
					var7.anIntArray2652 = anIntArray2652;
					var7.anIntArray2688 = anIntArray2688;
					var7.anIntArrayArray2654 = anIntArrayArray2654;
					var7.anIntArrayArray2679 = anIntArrayArray2679;
					var7.aBool2648 = aBool2648;
					var7.anIntArray2636 = new int[var7.anInt2634];
				} else {
					var7 = this;
				}

				int var12;
				int var13;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var12 = 0; var12 < var7.anInt2634; var12++) {
						var13 = anIntArray2694[var12] + var2;
						var15 = anIntArray2637[var12] + var4;
						var18 = var13 & 127;
						var16 = var15 & 127;
						var19 = var13 >> 7;
						var20 = var15 >> 7;
						var21 = var1[var19][var20] * (128 - var18) + var1[var19 + 1][var20] * var18 >> 7;
						var22 = var1[var19][var20 + 1] * (128 - var18) + var1[var19 + 1][var20 + 1] * var18 >> 7;
						var17 = var21 * (128 - var16) + var22 * var16 >> 7;
						var7.anIntArray2636[var12] = anIntArray2636[var12] + var17 - var3;
					}
				} else {
					for (var12 = 0; var12 < var7.anInt2634; var12++) {
						var13 = (-anIntArray2636[var12] << 16) / (anInt2410 * -695779227);
						if (var13 < var6) {
							var15 = anIntArray2694[var12] + var2;
							var18 = anIntArray2637[var12] + var4;
							var16 = var15 & 127;
							var19 = var18 & 127;
							var20 = var15 >> 7;
							var21 = var18 >> 7;
							var22 = var1[var20][var21] * (128 - var16) + var1[var20 + 1][var21] * var16 >> 7;
							var17 = var1[var20][var21 + 1] * (128 - var16) + var1[var20 + 1][var21 + 1] * var16 >> 7;
							int var14 = var22 * (128 - var19) + var17 * var19 >> 7;
							var7.anIntArray2636[var12] = anIntArray2636[var12] + (var14 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var7.anInt2657 = 0;
				return var7;
			}
		} else {
			return this;
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method3080(boolean var1) {
		if (!var1 && aByteArray2631.length < anInt2656) {
			aByteArray2631 = new byte[anInt2656 + 100];
		}

		return method3081(var1, aClass109_Sub23_Sub16_Sub5_2641, aByteArray2631);
	}

	CacheableEntry_Sub23_Sub16_Sub5 method3081(boolean var1, CacheableEntry_Sub23_Sub16_Sub5 var2, byte[] var3) {
		var2.anInt2634 = anInt2634;
		var2.anInt2656 = anInt2656;
		var2.anInt2690 = anInt2690;
		if (var2.anIntArray2694 == null || var2.anIntArray2694.length < anInt2634) {
			var2.anIntArray2694 = new int[anInt2634 + 100];
			var2.anIntArray2636 = new int[anInt2634 + 100];
			var2.anIntArray2637 = new int[anInt2634 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt2634; var4++) {
			var2.anIntArray2694[var4] = anIntArray2694[var4];
			var2.anIntArray2636[var4] = anIntArray2636[var4];
			var2.anIntArray2637[var4] = anIntArray2637[var4];
		}

		if (var1) {
			var2.aByteArray2661 = aByteArray2661;
		} else {
			var2.aByteArray2661 = var3;
			if (aByteArray2661 == null) {
				for (var4 = 0; var4 < anInt2656; var4++) {
					var2.aByteArray2661[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < anInt2656; var4++) {
					var2.aByteArray2661[var4] = aByteArray2661[var4];
				}
			}
		}

		var2.anIntArray2639 = anIntArray2639;
		var2.anIntArray2640 = anIntArray2640;
		var2.anIntArray2655 = anIntArray2655;
		var2.anIntArray2668 = anIntArray2668;
		var2.anIntArray2643 = anIntArray2643;
		var2.anIntArray2644 = anIntArray2644;
		var2.aByteArray2671 = aByteArray2671;
		var2.aByteArray2647 = aByteArray2647;
		var2.aShortArray2659 = aShortArray2659;
		var2.aByte2630 = aByte2630;
		var2.anIntArray2651 = anIntArray2651;
		var2.anIntArray2652 = anIntArray2652;
		var2.anIntArray2688 = anIntArray2688;
		var2.anIntArrayArray2654 = anIntArrayArray2654;
		var2.anIntArrayArray2679 = anIntArrayArray2679;
		var2.aBool2648 = aBool2648;
		var2.anInt2657 = 0;
		return var2;
	}

	public void method3082() {
		if (anInt2657 != 1) {
			anInt2657 = 1;
			anInt2410 = 0;
			anInt2658 = 0;
			anInt2645 = 0;

			for (int var1 = 0; var1 < anInt2634; var1++) {
				int var3 = anIntArray2694[var1];
				int var2 = anIntArray2636[var1];
				int var4 = anIntArray2637[var1];
				if (-var2 > anInt2410 * -695779227) {
					anInt2410 = -var2 * -54955667;
				}

				if (var2 > anInt2658) {
					anInt2658 = var2;
				}

				int var5 = var3 * var3 + var4 * var4;
				if (var5 > anInt2645) {
					anInt2645 = var5;
				}
			}

			anInt2645 = (int) (Math.sqrt((double) anInt2645) + 0.99D);
			anInt2635 = (int) (Math.sqrt((double) (anInt2645 * anInt2645 + anInt2410 * -695779227 * anInt2410 * -695779227)) + 0.99D);
			anInt2660 = anInt2635 + (int) (Math.sqrt((double) (anInt2645 * anInt2645 + anInt2658 * anInt2658)) + 0.99D);
		}
	}

	void method3083() {
		if (anInt2657 != 2) {
			anInt2657 = 2;
			anInt2645 = 0;

			for (int var5 = 0; var5 < anInt2634; var5++) {
				int var1 = anIntArray2694[var5];
				int var3 = anIntArray2636[var5];
				int var2 = anIntArray2637[var5];
				int var4 = var1 * var1 + var2 * var2 + var3 * var3;
				if (var4 > anInt2645) {
					anInt2645 = var4;
				}
			}

			anInt2645 = (int) (Math.sqrt((double) anInt2645) + 0.99D);
			anInt2635 = anInt2645;
			anInt2660 = anInt2645 + anInt2645;
		}
	}

	public int method3084() {
		method3082();
		return anInt2645;
	}

	public void method3085(CacheableEntry_Sub23_Sub15 var1, int var2) {
		if (anIntArrayArray2654 != null) {
			if (var2 != -1) {
				Class43 var3 = var1.aClass43Array2408[var2];
				LinkedEntry_Sub9 var5 = var3.aClass109_Sub9_610;
				anInt2682 = 0;
				anInt2683 = 0;
				anInt2684 = 0;

				for (int var4 = 0; var4 < var3.anInt611; var4++) {
					int var6 = var3.anIntArray614[var4];
					method3087(var5.anIntArray1763[var6], var5.anIntArrayArray1764[var6], var3.anIntArray615[var4], var3.anIntArray616[var4], var3.anIntArray618[var4]);
				}

				anInt2657 = 0;
			}
		}
	}

	public void method3086(CacheableEntry_Sub23_Sub15 var1, int var2, CacheableEntry_Sub23_Sub15 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Class43 var8 = var1.aClass43Array2408[var2];
				Class43 var7 = var3.aClass43Array2408[var4];
				LinkedEntry_Sub9 var10 = var8.aClass109_Sub9_610;
				anInt2682 = 0;
				anInt2683 = 0;
				anInt2684 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var12 = var5[var9];

				int var6;
				int var11;
				for (var6 = 0; var6 < var8.anInt611; var6++) {
					for (var11 = var8.anIntArray614[var6]; var11 > var12; var12 = var5[var13++]) {
						;
					}

					if (var11 != var12 || var10.anIntArray1763[var11] == 0) {
						method3087(var10.anIntArray1763[var11], var10.anIntArrayArray1764[var11], var8.anIntArray615[var6], var8.anIntArray616[var6], var8.anIntArray618[var6]);
					}
				}

				anInt2682 = 0;
				anInt2683 = 0;
				anInt2684 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var12 = var5[var9];

				for (var6 = 0; var6 < var7.anInt611; var6++) {
					for (var11 = var7.anIntArray614[var6]; var11 > var12; var12 = var5[var13++]) {
						;
					}

					if (var11 == var12 || var10.anIntArray1763[var11] == 0) {
						method3087(var10.anIntArray1763[var11], var10.anIntArrayArray1764[var11], var7.anIntArray615[var6], var7.anIntArray616[var6], var7.anIntArray618[var6]);
					}
				}

				anInt2657 = 0;
			} else {
				method3085(var1, var2);
			}
		}
	}

	void method3087(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var10;
		int var11;
		int var16;
		if (var1 == 0) {
			var10 = 0;
			anInt2682 = 0;
			anInt2683 = 0;
			anInt2684 = 0;

			for (var11 = 0; var11 < var6; var11++) {
				int var18 = var2[var11];
				if (var18 < anIntArrayArray2654.length) {
					int[] var19 = anIntArrayArray2654[var18];

					for (var7 = 0; var7 < var19.length; var7++) {
						var16 = var19[var7];
						anInt2682 += anIntArray2694[var16];
						anInt2683 += anIntArray2636[var16];
						anInt2684 += anIntArray2637[var16];
						++var10;
					}
				}
			}

			if (var10 > 0) {
				anInt2682 = anInt2682 / var10 + var3;
				anInt2683 = anInt2683 / var10 + var4;
				anInt2684 = anInt2684 / var10 + var5;
			} else {
				anInt2682 = var3;
				anInt2683 = var4;
				anInt2684 = var5;
			}

		} else {
			int[] var12;
			int var13;
			if (var1 == 1) {
				for (var10 = 0; var10 < var6; var10++) {
					var11 = var2[var10];
					if (var11 < anIntArrayArray2654.length) {
						var12 = anIntArrayArray2654[var11];

						for (var13 = 0; var13 < var12.length; var13++) {
							var7 = var12[var13];
							anIntArray2694[var7] += var3;
							anIntArray2636[var7] += var4;
							anIntArray2637[var7] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var10 = 0; var10 < var6; var10++) {
					var11 = var2[var10];
					if (var11 < anIntArrayArray2654.length) {
						var12 = anIntArrayArray2654[var11];

						for (var13 = 0; var13 < var12.length; var13++) {
							var7 = var12[var13];
							anIntArray2694[var7] -= anInt2682;
							anIntArray2636[var7] -= anInt2683;
							anIntArray2637[var7] -= anInt2684;
							var16 = (var3 & 255) * 8;
							int var14 = (var4 & 255) * 8;
							int var17 = (var5 & 255) * 8;
							int var8;
							int var9;
							int var15;
							if (var17 != 0) {
								var9 = anIntArray2653[var17];
								var8 = anIntArray2676[var17];
								var15 = anIntArray2636[var7] * var9 + anIntArray2694[var7] * var8 >> 16;
								anIntArray2636[var7] = anIntArray2636[var7] * var8 - anIntArray2694[var7] * var9 >> 16;
								anIntArray2694[var7] = var15;
							}

							if (var16 != 0) {
								var9 = anIntArray2653[var16];
								var8 = anIntArray2676[var16];
								var15 = anIntArray2636[var7] * var8 - anIntArray2637[var7] * var9 >> 16;
								anIntArray2637[var7] = anIntArray2636[var7] * var9 + anIntArray2637[var7] * var8 >> 16;
								anIntArray2636[var7] = var15;
							}

							if (var14 != 0) {
								var9 = anIntArray2653[var14];
								var8 = anIntArray2676[var14];
								var15 = anIntArray2637[var7] * var9 + anIntArray2694[var7] * var8 >> 16;
								anIntArray2637[var7] = anIntArray2637[var7] * var8 - anIntArray2694[var7] * var9 >> 16;
								anIntArray2694[var7] = var15;
							}

							anIntArray2694[var7] += anInt2682;
							anIntArray2636[var7] += anInt2683;
							anIntArray2637[var7] += anInt2684;
						}
					}
				}

			} else if (var1 == 3) {
				for (var10 = 0; var10 < var6; var10++) {
					var11 = var2[var10];
					if (var11 < anIntArrayArray2654.length) {
						var12 = anIntArrayArray2654[var11];

						for (var13 = 0; var13 < var12.length; var13++) {
							var7 = var12[var13];
							anIntArray2694[var7] -= anInt2682;
							anIntArray2636[var7] -= anInt2683;
							anIntArray2637[var7] -= anInt2684;
							anIntArray2694[var7] = anIntArray2694[var7] * var3 / 128;
							anIntArray2636[var7] = anIntArray2636[var7] * var4 / 128;
							anIntArray2637[var7] = anIntArray2637[var7] * var5 / 128;
							anIntArray2694[var7] += anInt2682;
							anIntArray2636[var7] += anInt2683;
							anIntArray2637[var7] += anInt2684;
						}
					}
				}

			} else if (var1 == 5) {
				if (anIntArrayArray2679 != null && aByteArray2661 != null) {
					for (var10 = 0; var10 < var6; var10++) {
						var11 = var2[var10];
						if (var11 < anIntArrayArray2679.length) {
							var12 = anIntArrayArray2679[var11];

							for (var13 = 0; var13 < var12.length; var13++) {
								var7 = var12[var13];
								var16 = (aByteArray2661[var7] & 255) + var3 * 8;
								if (var16 < 0) {
									var16 = 0;
								} else if (var16 > 255) {
									var16 = 255;
								}

								aByteArray2661[var7] = (byte) var16;
							}
						}
					}
				}

			}
		}
	}

	public void method3088() {
		for (int var1 = 0; var1 < anInt2634; var1++) {
			int var2 = anIntArray2694[var1];
			anIntArray2694[var1] = anIntArray2637[var1];
			anIntArray2637[var1] = -var2;
		}

		anInt2657 = 0;
	}

	public void method3089() {
		for (int var1 = 0; var1 < anInt2634; var1++) {
			anIntArray2694[var1] = -anIntArray2694[var1];
			anIntArray2637[var1] = -anIntArray2637[var1];
		}

		anInt2657 = 0;
	}

	public void method3090() {
		for (int var1 = 0; var1 < anInt2634; var1++) {
			int var2 = anIntArray2637[var1];
			anIntArray2637[var1] = anIntArray2694[var1];
			anIntArray2694[var1] = -var2;
		}

		anInt2657 = 0;
	}

	public void method3091(int var1) {
		int var2 = anIntArray2653[var1];
		int var5 = anIntArray2676[var1];

		for (int var3 = 0; var3 < anInt2634; var3++) {
			int var4 = anIntArray2636[var3] * var5 - anIntArray2637[var3] * var2 >> 16;
			anIntArray2637[var3] = anIntArray2636[var3] * var2 + anIntArray2637[var3] * var5 >> 16;
			anIntArray2636[var3] = var4;
		}

		anInt2657 = 0;
	}

	public void method3093(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2634; var4++) {
			anIntArray2694[var4] = anIntArray2694[var4] * var1 / 128;
			anIntArray2636[var4] = anIntArray2636[var4] * var2 / 128;
			anIntArray2637[var4] = anIntArray2637[var4] * var3 / 128;
		}

		anInt2657 = 0;
	}

	public final void method3094(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anIntArray2691[0] = -1;
		if (anInt2657 != 2 && anInt2657 != 1) {
			method3083();
		}

		int var8 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706;
		int var9 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707;
		int var10 = anIntArray2653[var1];
		int var11 = anIntArray2676[var1];
		int var12 = anIntArray2653[var2];
		int var13 = anIntArray2676[var2];
		int var14 = anIntArray2653[var3];
		int var15 = anIntArray2676[var3];
		int var16 = anIntArray2653[var4];
		int var17 = anIntArray2676[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < anInt2634; var19++) {
			int var20 = anIntArray2694[var19];
			int var21 = anIntArray2636[var19];
			int var22 = anIntArray2637[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			anIntArray2672[var19] = var22 - var18;
			anIntArray2665[var19] = var8 + var20 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var22;
			anIntArray2666[var19] = var9 + var23 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var22;
			if (anInt2690 > 0) {
				anIntArray2649[var19] = var20;
				anIntArray2646[var19] = var23;
				anIntArray2670[var19] = var22;
			}
		}

		try {
			method3096(false, false, 0);
		} catch (Exception var24) {
			;
		}

	}

	CacheableEntry_Sub23_Sub16_Sub5() {
	}

	final void method3096(boolean var1, boolean var2, int var3) {
		if (anInt2660 < 1600) {
			int var8;
			for (var8 = 0; var8 < anInt2660; var8++) {
				anIntArray2691[var8] = 0;
			}

			int var5;
			int var6;
			int var9;
			int var10;
			int var11;
			int var12;
			int var14;
			int var15;
			int var18;
			for (var8 = 0; var8 < anInt2656; var8++) {
				if (anIntArray2644[var8] != -2) {
					var15 = anIntArray2639[var8];
					var10 = anIntArray2640[var8];
					var11 = anIntArray2655[var8];
					var6 = anIntArray2665[var15];
					var9 = anIntArray2665[var10];
					var12 = anIntArray2665[var11];
					int var4;
					if (!var1 || var6 != -5000 && var9 != -5000 && var12 != -5000) {
						if (var2 && method3107(anInt2686, anInt2687, anIntArray2666[var15], anIntArray2666[var10], anIntArray2666[var11], var6, var9, var12)) {
							anIntArray2689[anInt2680++] = var3;
							var2 = false;
						}

						if ((var6 - var9) * (anIntArray2666[var11] - anIntArray2666[var10]) - (anIntArray2666[var15] - anIntArray2666[var10]) * (var12 - var9) > 0) {
							aBoolArray2664[var8] = false;
							if (var6 >= 0 && var9 >= 0 && var12 >= 0 && var6 <= CacheableEntry_Sub23_Sub14_Sub3.anInt2717 && var9 <= CacheableEntry_Sub23_Sub14_Sub3.anInt2717 && var12 <= CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
								aBoolArray2663[var8] = false;
							} else {
								aBoolArray2663[var8] = true;
							}

							var4 = (anIntArray2672[var15] + anIntArray2672[var10] + anIntArray2672[var11]) / 3 + anInt2635;
							anIntArrayArray2673[var4][anIntArray2691[var4]++] = var8;
						}
					} else {
						var4 = anIntArray2649[var15];
						var5 = anIntArray2649[var10];
						var14 = anIntArray2649[var11];
						int var7 = anIntArray2646[var15];
						var18 = anIntArray2646[var10];
						int var16 = anIntArray2646[var11];
						int var17 = anIntArray2670[var15];
						int var13 = anIntArray2670[var10];
						int var19 = anIntArray2670[var11];
						var4 -= var5;
						var14 -= var5;
						var7 -= var18;
						var16 -= var18;
						var17 -= var13;
						var19 -= var13;
						int var20 = var7 * var19 - var17 * var16;
						int var21 = var17 * var14 - var4 * var19;
						int var22 = var4 * var16 - var7 * var14;
						if (var5 * var20 + var18 * var21 + var13 * var22 > 0) {
							aBoolArray2664[var8] = true;
							int var23 = (anIntArray2672[var15] + anIntArray2672[var10] + anIntArray2672[var11]) / 3 + anInt2635;
							anIntArrayArray2673[var23][anIntArray2691[var23]++] = var8;
						}
					}
				}
			}

			int[] var27;
			if (aByteArray2671 == null) {
				for (var8 = anInt2660 - 1; var8 >= 0; --var8) {
					var15 = anIntArray2691[var8];
					if (var15 > 0) {
						var27 = anIntArrayArray2673[var8];

						for (var11 = 0; var11 < var15; var11++) {
							method3108(var27[var11]);
						}
					}
				}

			} else {
				for (var8 = 0; var8 < 12; var8++) {
					anIntArray2667[var8] = 0;
					anIntArray2678[var8] = 0;
				}

				for (var8 = anInt2660 - 1; var8 >= 0; --var8) {
					var15 = anIntArray2691[var8];
					if (var15 > 0) {
						var27 = anIntArrayArray2673[var8];

						for (var11 = 0; var11 < var15; var11++) {
							var6 = var27[var11];
							byte var26 = aByteArray2671[var6];
							var12 = anIntArray2667[var26]++;
							anIntArrayArray2675[var26][var12] = var6;
							if (var26 < 10) {
								anIntArray2678[var26] += var8;
							} else if (var26 == 10) {
								anIntArray2669[var12] = var8;
							} else {
								anIntArray2677[var12] = var8;
							}
						}
					}
				}

				var8 = 0;
				if (anIntArray2667[1] > 0 || anIntArray2667[2] > 0) {
					var8 = (anIntArray2678[1] + anIntArray2678[2]) / (anIntArray2667[1] + anIntArray2667[2]);
				}

				var15 = 0;
				if (anIntArray2667[3] > 0 || anIntArray2667[4] > 0) {
					var15 = (anIntArray2678[3] + anIntArray2678[4]) / (anIntArray2667[3] + anIntArray2667[4]);
				}

				var10 = 0;
				if (anIntArray2667[6] > 0 || anIntArray2667[8] > 0) {
					var10 = (anIntArray2678[6] + anIntArray2678[8]) / (anIntArray2667[6] + anIntArray2667[8]);
				}

				var6 = 0;
				var9 = anIntArray2667[10];
				int[] var28 = anIntArrayArray2675[10];
				int[] var24 = anIntArray2669;
				if (var6 == var9) {
					var6 = 0;
					var9 = anIntArray2667[11];
					var28 = anIntArrayArray2675[11];
					var24 = anIntArray2677;
				}

				if (var6 < var9) {
					var11 = var24[var6];
				} else {
					var11 = -1000;
				}

				for (var5 = 0; var5 < 10; var5++) {
					while (var5 == 0 && var11 > var8) {
						method3108(var28[var6++]);
						if (var6 == var9 && var28 != anIntArrayArray2675[11]) {
							var6 = 0;
							var9 = anIntArray2667[11];
							var28 = anIntArrayArray2675[11];
							var24 = anIntArray2677;
						}

						if (var6 < var9) {
							var11 = var24[var6];
						} else {
							var11 = -1000;
						}
					}

					while (var5 == 3 && var11 > var15) {
						method3108(var28[var6++]);
						if (var6 == var9 && var28 != anIntArrayArray2675[11]) {
							var6 = 0;
							var9 = anIntArray2667[11];
							var28 = anIntArrayArray2675[11];
							var24 = anIntArray2677;
						}

						if (var6 < var9) {
							var11 = var24[var6];
						} else {
							var11 = -1000;
						}
					}

					while (var5 == 5 && var11 > var10) {
						method3108(var28[var6++]);
						if (var6 == var9 && var28 != anIntArrayArray2675[11]) {
							var6 = 0;
							var9 = anIntArray2667[11];
							var28 = anIntArrayArray2675[11];
							var24 = anIntArray2677;
						}

						if (var6 < var9) {
							var11 = var24[var6];
						} else {
							var11 = -1000;
						}
					}

					var14 = anIntArray2667[var5];
					int[] var25 = anIntArrayArray2675[var5];

					for (var18 = 0; var18 < var14; var18++) {
						method3108(var25[var18]);
					}
				}

				while (var11 != -1000) {
					method3108(var28[var6++]);
					if (var6 == var9 && var28 != anIntArrayArray2675[11]) {
						var6 = 0;
						var28 = anIntArrayArray2675[11];
						var9 = anIntArray2667[11];
						var24 = anIntArray2677;
					}

					if (var6 < var9) {
						var11 = var24[var6];
					} else {
						var11 = -1000;
					}
				}

			}
		}
	}

	public void method3100(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt2634; var4++) {
			anIntArray2694[var4] += var1;
			anIntArray2636[var4] += var2;
			anIntArray2637[var4] += var3;
		}

		anInt2657 = 0;
	}

	static {
		anIntArray2653 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719;
		anIntArray2676 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720;
		anIntArray2692 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2713;
		anIntArray2693 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2718;
	}

	final boolean method3107(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false : (var2 > var3 && var2 > var4 && var2 > var5 ? false : (var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8));
	}

	final void method3108(int var1) {
		if (aBoolArray2664[var1]) {
			method3113(var1);
		} else {
			int var2 = anIntArray2639[var1];
			int var4 = anIntArray2640[var1];
			int var3 = anIntArray2655[var1];
			CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = aBoolArray2663[var1];
			if (aByteArray2661 == null) {
				CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = 0;
			} else {
				CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = aByteArray2661[var1] & 255;
			}

			if (aShortArray2659 != null && aShortArray2659[var1] != -1) {
				int var5;
				int var7;
				int var8;
				if (aByteArray2647 != null && aByteArray2647[var1] != -1) {
					int var6 = aByteArray2647[var1] & 255;
					var7 = anIntArray2651[var6];
					var5 = anIntArray2652[var6];
					var8 = anIntArray2688[var6];
				} else {
					var7 = var2;
					var5 = var4;
					var8 = var3;
				}

				if (anIntArray2644[var1] == -1) {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(anIntArray2666[var2], anIntArray2666[var4], anIntArray2666[var3], anIntArray2665[var2], anIntArray2665[var4], anIntArray2665[var3], anIntArray2668[var1], anIntArray2668[var1], anIntArray2668[var1], anIntArray2649[var7], anIntArray2649[var5], anIntArray2649[var8], anIntArray2646[var7], anIntArray2646[var5], anIntArray2646[var8], anIntArray2670[var7], anIntArray2670[var5], anIntArray2670[var8], aShortArray2659[var1]);
				} else {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(anIntArray2666[var2], anIntArray2666[var4], anIntArray2666[var3], anIntArray2665[var2], anIntArray2665[var4], anIntArray2665[var3], anIntArray2668[var1], anIntArray2643[var1], anIntArray2644[var1], anIntArray2649[var7], anIntArray2649[var5], anIntArray2649[var8], anIntArray2646[var7], anIntArray2646[var5], anIntArray2646[var8], anIntArray2670[var7], anIntArray2670[var5], anIntArray2670[var8], aShortArray2659[var1]);
				}
			} else if (anIntArray2644[var1] == -1) {
				CacheableEntry_Sub23_Sub14_Sub3.method3160(anIntArray2666[var2], anIntArray2666[var4], anIntArray2666[var3], anIntArray2665[var2], anIntArray2665[var4], anIntArray2665[var3], anIntArray2692[anIntArray2668[var1]]);
			} else {
				CacheableEntry_Sub23_Sub14_Sub3.method3158(anIntArray2666[var2], anIntArray2666[var4], anIntArray2666[var3], anIntArray2665[var2], anIntArray2665[var4], anIntArray2665[var3], anIntArray2668[var1], anIntArray2643[var1], anIntArray2644[var1]);
			}

		}
	}

	public final void method3109(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		anIntArray2691[0] = -1;
		if (anInt2657 != 2 && anInt2657 != 1) {
			method3083();
		}

		int var9 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706;
		int var10 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707;
		int var11 = anIntArray2653[var1];
		int var12 = anIntArray2676[var1];
		int var13 = anIntArray2653[var2];
		int var14 = anIntArray2676[var2];
		int var15 = anIntArray2653[var3];
		int var16 = anIntArray2676[var3];
		int var17 = anIntArray2653[var4];
		int var18 = anIntArray2676[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < anInt2634; var20++) {
			int var21 = anIntArray2694[var20];
			int var22 = anIntArray2636[var20];
			int var23 = anIntArray2637[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			anIntArray2672[var20] = var23 - var19;
			anIntArray2665[var20] = var9 + var21 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var8;
			anIntArray2666[var20] = var10 + var24 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var8;
			if (anInt2690 > 0) {
				anIntArray2649[var20] = var21;
				anIntArray2646[var20] = var24;
				anIntArray2670[var20] = var23;
			}
		}

		try {
			method3096(false, false, 0);
		} catch (Exception var25) {
			;
		}

	}

	final void method3113(int var1) {
		int var2 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706;
		int var15 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707;
		int var5 = 0;
		int var6 = anIntArray2639[var1];
		int var7 = anIntArray2640[var1];
		int var3 = anIntArray2655[var1];
		int var9 = anIntArray2670[var6];
		int var16 = anIntArray2670[var7];
		int var10 = anIntArray2670[var3];
		if (aByteArray2661 == null) {
			CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = 0;
		} else {
			CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = aByteArray2661[var1] & 255;
		}

		int var4;
		int var8;
		int var13;
		int var14;
		if (var9 >= 50) {
			anIntArray2642[var5] = anIntArray2665[var6];
			anIntArray2674[var5] = anIntArray2666[var6];
			anIntArray2681[var5++] = anIntArray2668[var1];
		} else {
			var4 = anIntArray2649[var6];
			var14 = anIntArray2646[var6];
			var13 = anIntArray2668[var1];
			if (var10 >= 50) {
				var8 = (50 - var9) * anIntArray2693[var10 - var9];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var3] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var3] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2644[var1] - var13) * var8 >> 16);
			}

			if (var16 >= 50) {
				var8 = (50 - var9) * anIntArray2693[var16 - var9];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var7] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var7] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2643[var1] - var13) * var8 >> 16);
			}
		}

		if (var16 >= 50) {
			anIntArray2642[var5] = anIntArray2665[var7];
			anIntArray2674[var5] = anIntArray2666[var7];
			anIntArray2681[var5++] = anIntArray2643[var1];
		} else {
			var4 = anIntArray2649[var7];
			var14 = anIntArray2646[var7];
			var13 = anIntArray2643[var1];
			if (var9 >= 50) {
				var8 = (50 - var16) * anIntArray2693[var9 - var16];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var6] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var6] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2668[var1] - var13) * var8 >> 16);
			}

			if (var10 >= 50) {
				var8 = (50 - var16) * anIntArray2693[var10 - var16];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var3] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var3] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2644[var1] - var13) * var8 >> 16);
			}
		}

		if (var10 >= 50) {
			anIntArray2642[var5] = anIntArray2665[var3];
			anIntArray2674[var5] = anIntArray2666[var3];
			anIntArray2681[var5++] = anIntArray2644[var1];
		} else {
			var4 = anIntArray2649[var3];
			var14 = anIntArray2646[var3];
			var13 = anIntArray2644[var1];
			if (var16 >= 50) {
				var8 = (50 - var10) * anIntArray2693[var16 - var10];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var7] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var7] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2643[var1] - var13) * var8 >> 16);
			}

			if (var9 >= 50) {
				var8 = (50 - var10) * anIntArray2693[var9 - var10];
				anIntArray2642[var5] = var2 + (var4 + ((anIntArray2649[var6] - var4) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2674[var5] = var15 + (var14 + ((anIntArray2646[var6] - var14) * var8 >> 16)) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / 50;
				anIntArray2681[var5++] = var13 + ((anIntArray2668[var1] - var13) * var8 >> 16);
			}
		}

		var4 = anIntArray2642[0];
		var14 = anIntArray2642[1];
		var13 = anIntArray2642[2];
		var8 = anIntArray2674[0];
		int var17 = anIntArray2674[1];
		int var18 = anIntArray2674[2];
		CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = false;
		int var11;
		int var12;
		int var19;
		int var20;
		if (var5 == 3) {
			if (var4 < 0 || var14 < 0 || var13 < 0 || var4 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var14 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var13 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
				CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = true;
			}

			if (aShortArray2659 != null && aShortArray2659[var1] != -1) {
				if (aByteArray2647 != null && aByteArray2647[var1] != -1) {
					var11 = aByteArray2647[var1] & 255;
					var19 = anIntArray2651[var11];
					var12 = anIntArray2652[var11];
					var20 = anIntArray2688[var11];
				} else {
					var19 = var6;
					var12 = var7;
					var20 = var3;
				}

				if (anIntArray2644[var1] == -1) {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var17, var18, var4, var14, var13, anIntArray2668[var1], anIntArray2668[var1], anIntArray2668[var1], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], aShortArray2659[var1]);
				} else {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var17, var18, var4, var14, var13, anIntArray2681[0], anIntArray2681[1], anIntArray2681[2], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], aShortArray2659[var1]);
				}
			} else if (anIntArray2644[var1] == -1) {
				CacheableEntry_Sub23_Sub14_Sub3.method3160(var8, var17, var18, var4, var14, var13, anIntArray2692[anIntArray2668[var1]]);
			} else {
				CacheableEntry_Sub23_Sub14_Sub3.method3158(var8, var17, var18, var4, var14, var13, anIntArray2681[0], anIntArray2681[1], anIntArray2681[2]);
			}
		}

		if (var5 == 4) {
			if (var4 < 0 || var14 < 0 || var13 < 0 || var4 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var14 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var13 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || anIntArray2642[3] < 0 || anIntArray2642[3] > CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
				CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = true;
			}

			if (aShortArray2659 != null && aShortArray2659[var1] != -1) {
				if (aByteArray2647 != null && aByteArray2647[var1] != -1) {
					var11 = aByteArray2647[var1] & 255;
					var19 = anIntArray2651[var11];
					var12 = anIntArray2652[var11];
					var20 = anIntArray2688[var11];
				} else {
					var19 = var6;
					var12 = var7;
					var20 = var3;
				}

				short var21 = aShortArray2659[var1];
				if (anIntArray2644[var1] == -1) {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var17, var18, var4, var14, var13, anIntArray2668[var1], anIntArray2668[var1], anIntArray2668[var1], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], var21);
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var18, anIntArray2674[3], var4, var13, anIntArray2642[3], anIntArray2668[var1], anIntArray2668[var1], anIntArray2668[var1], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], var21);
				} else {
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var17, var18, var4, var14, var13, anIntArray2681[0], anIntArray2681[1], anIntArray2681[2], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], var21);
					CacheableEntry_Sub23_Sub14_Sub3.method3176(var8, var18, anIntArray2674[3], var4, var13, anIntArray2642[3], anIntArray2681[0], anIntArray2681[2], anIntArray2681[3], anIntArray2649[var19], anIntArray2649[var12], anIntArray2649[var20], anIntArray2646[var19], anIntArray2646[var12], anIntArray2646[var20], anIntArray2670[var19], anIntArray2670[var12], anIntArray2670[var20], var21);
				}
			} else if (anIntArray2644[var1] == -1) {
				var19 = anIntArray2692[anIntArray2668[var1]];
				CacheableEntry_Sub23_Sub14_Sub3.method3160(var8, var17, var18, var4, var14, var13, var19);
				CacheableEntry_Sub23_Sub14_Sub3.method3160(var8, var18, anIntArray2674[3], var4, var13, anIntArray2642[3], var19);
			} else {
				CacheableEntry_Sub23_Sub14_Sub3.method3158(var8, var17, var18, var4, var14, var13, anIntArray2681[0], anIntArray2681[1], anIntArray2681[2]);
				CacheableEntry_Sub23_Sub14_Sub3.method3158(var8, var18, anIntArray2674[3], var4, var13, anIntArray2642[3], anIntArray2681[0], anIntArray2681[2], anIntArray2681[3]);
			}
		}

	}

	public CacheableEntry_Sub23_Sub16_Sub5(CacheableEntry_Sub23_Sub16_Sub5[] var1, int var2) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var9 = false;
		anInt2634 = 0;
		anInt2656 = 0;
		anInt2690 = 0;
		aByte2630 = -1;

		CacheableEntry_Sub23_Sub16_Sub5 var3;
		int var8;
		for (var8 = 0; var8 < var2; var8++) {
			var3 = var1[var8];
			if (var3 != null) {
				anInt2634 += var3.anInt2634;
				anInt2656 += var3.anInt2656;
				anInt2690 += var3.anInt2690;
				if (var3.aByteArray2671 != null) {
					var4 = true;
				} else {
					if (aByte2630 == -1) {
						aByte2630 = var3.aByte2630;
					}

					if (aByte2630 != var3.aByte2630) {
						var4 = true;
					}
				}

				var5 |= var3.aByteArray2661 != null;
				var6 |= var3.aShortArray2659 != null;
				var9 |= var3.aByteArray2647 != null;
			}
		}

		anIntArray2694 = new int[anInt2634];
		anIntArray2636 = new int[anInt2634];
		anIntArray2637 = new int[anInt2634];
		anIntArray2639 = new int[anInt2656];
		anIntArray2640 = new int[anInt2656];
		anIntArray2655 = new int[anInt2656];
		anIntArray2668 = new int[anInt2656];
		anIntArray2643 = new int[anInt2656];
		anIntArray2644 = new int[anInt2656];
		if (var4) {
			aByteArray2671 = new byte[anInt2656];
		}

		if (var5) {
			aByteArray2661 = new byte[anInt2656];
		}

		if (var6) {
			aShortArray2659 = new short[anInt2656];
		}

		if (var9) {
			aByteArray2647 = new byte[anInt2656];
		}

		if (anInt2690 > 0) {
			anIntArray2651 = new int[anInt2690];
			anIntArray2652 = new int[anInt2690];
			anIntArray2688 = new int[anInt2690];
		}

		anInt2634 = 0;
		anInt2656 = 0;
		anInt2690 = 0;

		for (var8 = 0; var8 < var2; var8++) {
			var3 = var1[var8];
			if (var3 != null) {
				int var7;
				for (var7 = 0; var7 < var3.anInt2656; var7++) {
					anIntArray2639[anInt2656] = var3.anIntArray2639[var7] + anInt2634;
					anIntArray2640[anInt2656] = var3.anIntArray2640[var7] + anInt2634;
					anIntArray2655[anInt2656] = var3.anIntArray2655[var7] + anInt2634;
					anIntArray2668[anInt2656] = var3.anIntArray2668[var7];
					anIntArray2643[anInt2656] = var3.anIntArray2643[var7];
					anIntArray2644[anInt2656] = var3.anIntArray2644[var7];
					if (var4) {
						if (var3.aByteArray2671 != null) {
							aByteArray2671[anInt2656] = var3.aByteArray2671[var7];
						} else {
							aByteArray2671[anInt2656] = var3.aByte2630;
						}
					}

					if (var5 && var3.aByteArray2661 != null) {
						aByteArray2661[anInt2656] = var3.aByteArray2661[var7];
					}

					if (var6) {
						if (var3.aShortArray2659 != null) {
							aShortArray2659[anInt2656] = var3.aShortArray2659[var7];
						} else {
							aShortArray2659[anInt2656] = -1;
						}
					}

					if (var9) {
						if (var3.aByteArray2647 != null && var3.aByteArray2647[var7] != -1) {
							aByteArray2647[anInt2656] = (byte) (var3.aByteArray2647[var7] + anInt2690);
						} else {
							aByteArray2647[anInt2656] = -1;
						}
					}

					++anInt2656;
				}

				for (var7 = 0; var7 < var3.anInt2690; var7++) {
					anIntArray2651[anInt2690] = var3.anIntArray2651[var7] + anInt2634;
					anIntArray2652[anInt2690] = var3.anIntArray2652[var7] + anInt2634;
					anIntArray2688[anInt2690] = var3.anIntArray2688[var7] + anInt2634;
					++anInt2690;
				}

				for (var7 = 0; var7 < var3.anInt2634; var7++) {
					anIntArray2694[anInt2634] = var3.anIntArray2694[var7];
					anIntArray2636[anInt2634] = var3.anIntArray2636[var7];
					anIntArray2637[anInt2634] = var3.anIntArray2637[var7];
					++anInt2634;
				}
			}
		}

	}

	public CacheableEntry_Sub23_Sub16_Sub5 method3131(boolean var1) {
		if (!var1 && aByteArray2633.length < anInt2656) {
			aByteArray2633 = new byte[anInt2656 + 100];
		}

		return method3081(var1, aClass109_Sub23_Sub16_Sub5_2632, aByteArray2633);
	}

	void method2786(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		anIntArray2691[0] = -1;
		if (anInt2657 != 1) {
			method3082();
		}

		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = anInt2645 * var3 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var6 * var5 >> 16;
			int var15 = (var14 - anInt2645) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705;
			if (var15 / var13 < CacheableEntry_Sub23_Sub14_Sub3.anInt2716) {
				int var16 = (var14 + anInt2645) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705;
				if (var16 / var13 > CacheableEntry_Sub23_Sub14_Sub3.anInt2710) {
					int var17 = var7 * var3 - var10 * var2 >> 16;
					int var18 = anInt2645 * var2 >> 16;
					int var19 = (var17 + var18) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705;
					if (var19 / var13 > CacheableEntry_Sub23_Sub14_Sub3.anInt2702) {
						int var20 = var18 + (anInt2410 * -695779227 * var3 >> 16);
						int var21 = (var17 - var20) * CacheableEntry_Sub23_Sub14_Sub3.anInt2705;
						if (var21 / var13 < CacheableEntry_Sub23_Sub14_Sub3.anInt2708) {
							int var22 = var12 + (anInt2410 * -695779227 * var2 >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || anInt2690 > 0;
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if (var9 > 0 && aBool2685) {
								var27 = var11 - var12;
								if (var27 <= 50) {
									var27 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt2686 - CacheableEntry_Sub23_Sub14_Sub3.anInt2706;
								var29 = anInt2687 - CacheableEntry_Sub23_Sub14_Sub3.anInt2707;
								if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
									if (aBool2648) {
										anIntArray2689[anInt2680++] = var9;
									} else {
										var26 = true;
									}
								}
							}

							var27 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706;
							var28 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray2653[var1];
								var30 = anIntArray2676[var1];
							}

							for (int var31 = 0; var31 < anInt2634; var31++) {
								int var32 = anIntArray2694[var31];
								int var33 = anIntArray2636[var31];
								int var34 = anIntArray2637[var31];
								int var35;
								if (var1 != 0) {
									var35 = var34 * var29 + var32 * var30 >> 16;
									var34 = var34 * var30 - var32 * var29 >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = var34 * var4 + var32 * var5 >> 16;
								var34 = var34 * var5 - var32 * var4 >> 16;
								var32 = var35;
								var35 = var33 * var3 - var34 * var2 >> 16;
								var34 = var33 * var2 + var34 * var3 >> 16;
								anIntArray2672[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray2665[var31] = var27 + var32 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var34;
									anIntArray2666[var31] = var28 + var35 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var34;
								} else {
									anIntArray2665[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray2649[var31] = var32;
									anIntArray2646[var31] = var35;
									anIntArray2670[var31] = var34;
								}
							}

							try {
								method3096(var23, var26, var9);
							} catch (Exception var36) {
								;
							}

						}
					}
				}
			}
		}
	}

}
