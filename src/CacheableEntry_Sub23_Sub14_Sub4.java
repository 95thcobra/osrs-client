import java.util.Random;

public abstract class CacheableEntry_Sub23_Sub14_Sub4 extends CacheableEntry_Sub23_Sub14 {

	public static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array2799;
	byte[][] aByteArrayArray2797 = new byte[256][];
	public int anInt2807 = 0;
	int[] anIntArray2791;
	byte[] aByteArray2810;
	static int anInt2809 = 256;
	static int anInt2801 = 0;
	static int anInt2805 = 0;
	static int anInt2800 = -1;
	static int anInt2802 = -1;
	static int anInt2804 = -1;
	static int anInt2803 = -1;
	static int anInt2796 = 0;
	static int anInt2808 = 0;
	static Random aRandom2806 = new Random();
	static String[] aStringArray2811 = new String[100];
	int[] anIntArray2794;
	int[] anIntArray2795;
	int[] anIntArray2792;
	int[] anIntArray2793;
	int anInt2790;
	int anInt2798;

	CacheableEntry_Sub23_Sub14_Sub4(byte[] var1) {
		method3308(var1);
	}

	void method3308(byte[] var1) {
		anIntArray2791 = new int[256];
		int var5;
		if (var1.length == 257) {
			for (var5 = 0; var5 < anIntArray2791.length; var5++) {
				anIntArray2791[var5] = var1[var5] & 255;
			}

			anInt2807 = var1[256] & 255;
		} else {
			var5 = 0;

			for (int var6 = 0; var6 < 256; var6++) {
				anIntArray2791[var6] = var1[var5++] & 255;
			}

			int[] var11 = new int[256];
			int[] var3 = new int[256];

			int var4;
			for (var4 = 0; var4 < 256; var4++) {
				var11[var4] = var1[var5++] & 255;
			}

			for (var4 = 0; var4 < 256; var4++) {
				var3[var4] = var1[var5++] & 255;
			}

			byte[][] var10 = new byte[256][];

			int var9;
			for (int var7 = 0; var7 < 256; var7++) {
				var10[var7] = new byte[var11[var7]];
				byte var8 = 0;

				for (var9 = 0; var9 < var10[var7].length; var9++) {
					var8 += var1[var5++];
					var10[var7][var9] = var8;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; var13++) {
				var12[var13] = new byte[var11[var13]];
				byte var14 = 0;

				for (int var2 = 0; var2 < var12[var13].length; var2++) {
					var14 += var1[var5++];
					var12[var13][var2] = var14;
				}
			}

			aByteArray2810 = new byte[65536];

			for (var13 = 0; var13 < 256; var13++) {
				if (var13 != 32 && var13 != 160) {
					for (var9 = 0; var9 < 256; var9++) {
						if (var9 != 32 && var9 != 160) {
							aByteArray2810[(var13 << 8) + var9] = (byte) method3309(var10, var12, var3, anIntArray2791, var11, var13, var9);
						}
					}
				}
			}

			anInt2807 = var3[32] + var11[32];
		}

	}

	static int method3309(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var13 = var7 + var4[var5];
		int var8 = var2[var6];
		int var11 = var8 + var4[var6];
		int var9 = var7;
		if (var8 > var7) {
			var9 = var8;
		}

		int var14 = var13;
		if (var11 < var13) {
			var14 = var11;
		}

		int var10 = var3[var5];
		if (var3[var6] < var10) {
			var10 = var3[var6];
		}

		byte[] var15 = var1[var5];
		byte[] var16 = var0[var6];
		int var12 = var9 - var7;
		int var17 = var9 - var8;

		for (int var19 = var9; var19 < var14; var19++) {
			int var18 = var15[var12++] + var16[var17++];
			if (var18 < var10) {
				var10 = var18;
			}
		}

		return -var10;
	}

	public int method3311(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = 60;
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										String var8 = var7.substring(4);
										int var9 = Npc.method3394(var8, 10, true, (byte) 1);
										var4 += aClass109_Sub23_Sub14_Sub1Array2799[var9].anInt2579;
										var3 = -1;
									} catch (Exception var11) {
										;
									}
								}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160) {
						var6 = 32;
					}

					if (var2 == -1) {
						var4 += anIntArray2791[(char) (Class53.method782(var6, -1305953540) & 255)];
						if (aByteArray2810 != null && var3 != -1) {
							var4 += aByteArray2810[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public static String method3315(String var0) {
		int var1 = var0.length();
		int var4 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			char var2 = var0.charAt(var3);
			if (var2 == 60 || var2 == 62) {
				var4 += 3;
			}
		}

		StringBuilder var7 = new StringBuilder(var1 + var4);

		for (int var6 = 0; var6 < var1; var6++) {
			char var5 = var0.charAt(var6);
			if (var5 == 60) {
				var7.append("<lt>");
			} else if (var5 == 62) {
				var7.append("<gt>");
			} else {
				var7.append(var5);
			}
		}

		return var7.toString();
	}

	public void method3316(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3338(var4, var5);
			method3327(var1, var2, var3);
		}
	}

	public void method3317(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3338(var4, var5);
			method3327(var1, var2 - method3311(var1), var3);
		}
	}

	public int method3319(String var1, int var2) {
		int var3 = method3386(var1, new int[]{var2}, aStringArray2811);
		int var5 = 0;

		for (int var6 = 0; var6 < var3; var6++) {
			int var4 = method3311(aStringArray2811[var6]);
			if (var4 > var5) {
				var5 = var4;
			}
		}

		return var5;
	}

	public void method3320(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3338(var4, var5);
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var7[var8] = (int) (Math.sin((double) var8 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}

			method3326(var1, var2 - method3311(var1) / 2, var3, (int[]) null, var7);
		}
	}

	public void method3321(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3338(var4, var5);
			int[] var9 = new int[var1.length()];
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var9[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var7[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}

			method3326(var1, var2 - method3311(var1) / 2, var3, var9, var7);
		}
	}

	public void method3322(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			method3338(var4, var5);
			double var8 = 7.0D - (double) var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6 / 1.0D) * var8);
			}

			method3326(var1, var2 - method3311(var1) / 2, var3, (int[]) null, var10);
		}
	}

	public void method3323(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			method3338(var4, var5);
			aRandom2806.setSeed((long) var6);
			anInt2809 = 192 + (aRandom2806.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((aRandom2806.nextInt() & 3) == 0) {
					++var8;
				}
			}

			method3326(var1, var2, var3, var7, (int[]) null);
		}
	}

	int method3324(char var1) {
		if (var1 == 160) {
			var1 = 32;
		}

		return anIntArray2791[Class53.method782(var1, -1305953540) & 255];
	}

	void method3326(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= anInt2807;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); var9++) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Class53.method782(var1.charAt(var9), -1305953540) & 255);
				if (var10 == 60) {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var15;
					if (var10 == 62 && var6 != -1) {
						String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt")) {
							var10 = 60;
						} else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										String var20 = var11.substring(4);
										var15 = Npc.method3394(var20, 10, true, (byte) 1);
										CacheableEntry_Sub23_Sub14_Sub1 var17 = aClass109_Sub23_Sub14_Sub1Array2799[var15];
										var17.method2972(var2 + var12, var3 + anInt2807 - var17.anInt2580 + var13);
										var2 += var17.anInt2579;
										var7 = -1;
									} catch (Exception var18) {
										;
									}
								} else {
									method3335(var11);
								}
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160) {
						var10 = 32;
					}

					if (var6 == -1) {
						if (aByteArray2810 != null && var7 != -1) {
							var2 += aByteArray2810[(var7 << 8) + var10];
						}

						int var19 = anIntArray2792[var10];
						var12 = anIntArray2793[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var15 = var5[var8];
						} else {
							var15 = 0;
						}

						++var8;
						if (var10 != 32) {
							if (anInt2809 == 256) {
								if (anInt2804 != -1) {
									method3331(aByteArrayArray2797[var10], var2 + anIntArray2794[var10] + 1 + var13, var3 + anIntArray2795[var10] + 1 + var15, var19, var12, anInt2804);
								}

								method3329(aByteArrayArray2797[var10], var2 + anIntArray2794[var10] + var13, var3 + anIntArray2795[var10] + var15, var19, var12, anInt2805);
							} else {
								if (anInt2804 != -1) {
									method3333(aByteArrayArray2797[var10], var2 + anIntArray2794[var10] + 1 + var13, var3 + anIntArray2795[var10] + 1 + var15, var19, var12, anInt2804, anInt2809);
								}

								method3351(aByteArrayArray2797[var10], var2 + anIntArray2794[var10] + var13, var3 + anIntArray2795[var10] + var15, var19, var12, anInt2805, anInt2809);
							}
						} else if (anInt2808 > 0) {
							anInt2801 += anInt2808;
							var2 += anInt2801 >> 8;
							anInt2801 &= 255;
						}

						int var14 = anIntArray2791[var10];
						if (anInt2800 != -1) {
							method2756(var2, var3 + (int) ((double) anInt2807 * 0.7D), var14, anInt2800);
						}

						if (anInt2802 != -1) {
							method2756(var2, var3 + anInt2807, var14, anInt2802);
						}

						var2 += var14;
						var7 = var10;
					}
				}
			}
		}

	}

	void method3327(String var1, int var2, int var3) {
		var3 -= anInt2807;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Class53.method782(var1.charAt(var6), -1305953540) & 255);
				if (var7 == 60) {
					var4 = var6;
				} else {
					int var10;
					if (var7 == 62 && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = 60;
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										String var15 = var8.substring(4);
										var10 = Npc.method3394(var15, 10, true, (byte) 1);
										CacheableEntry_Sub23_Sub14_Sub1 var12 = aClass109_Sub23_Sub14_Sub1Array2799[var10];
										var12.method2972(var2, var3 + anInt2807 - var12.anInt2580);
										var2 += var12.anInt2579;
										var5 = -1;
									} catch (Exception var13) {
										;
									}
								} else {
									method3335(var8);
								}
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160) {
						var7 = 32;
					}

					if (var4 == -1) {
						if (aByteArray2810 != null && var5 != -1) {
							var2 += aByteArray2810[(var5 << 8) + var7];
						}

						int var14 = anIntArray2792[var7];
						var10 = anIntArray2793[var7];
						if (var7 != 32) {
							if (anInt2809 == 256) {
								if (anInt2804 != -1) {
									method3331(aByteArrayArray2797[var7], var2 + anIntArray2794[var7] + 1, var3 + anIntArray2795[var7] + 1, var14, var10, anInt2804);
								}

								method3329(aByteArrayArray2797[var7], var2 + anIntArray2794[var7], var3 + anIntArray2795[var7], var14, var10, anInt2805);
							} else {
								if (anInt2804 != -1) {
									method3333(aByteArrayArray2797[var7], var2 + anIntArray2794[var7] + 1, var3 + anIntArray2795[var7] + 1, var14, var10, anInt2804, anInt2809);
								}

								method3351(aByteArrayArray2797[var7], var2 + anIntArray2794[var7], var3 + anIntArray2795[var7], var14, var10, anInt2805, anInt2809);
							}
						} else if (anInt2808 > 0) {
							anInt2801 += anInt2808;
							var2 += anInt2801 >> 8;
							anInt2801 &= 255;
						}

						int var9 = anIntArray2791[var7];
						if (anInt2800 != -1) {
							method2756(var2, var3 + (int) ((double) anInt2807 * 0.7D), var9, anInt2800);
						}

						if (anInt2802 != -1) {
							method2756(var2, var3 + anInt2807 + 1, var9, anInt2802);
						}

						var2 += var9;
						var5 = var7;
					}
				}
			}
		}

	}

	abstract void method3329(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	static void method3331(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * anInt2399;
		int var9 = anInt2399 - var3;
		int var7 = 0;
		int var10 = 0;
		int var8;
		if (var2 < anInt2397) {
			var8 = anInt2397 - var2;
			var4 -= var8;
			var2 = anInt2397;
			var10 += var8 * var3;
			var6 += var8 * anInt2399;
		}

		if (var2 + var4 > anInt2400) {
			var4 -= var2 + var4 - anInt2400;
		}

		if (var1 < anInt2401) {
			var8 = anInt2401 - var1;
			var3 -= var8;
			var1 = anInt2401;
			var10 += var8;
			var6 += var8;
			var7 += var8;
			var9 += var8;
		}

		if (var1 + var3 > anInt2402) {
			var8 = var1 + var3 - anInt2402;
			var3 -= var8;
			var7 += var8;
			var9 += var8;
		}

		if (var3 > 0 && var4 > 0) {
			method3332(anIntArray2396, var0, var5, var10, var6, var3, var4, var9, var7);
		}
	}

	static void method3332(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			int var11;
			for (var11 = var9; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method3333(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * anInt2399;
		int var11 = anInt2399 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < anInt2397) {
			var10 = anInt2397 - var2;
			var4 -= var10;
			var2 = anInt2397;
			var9 += var10 * var3;
			var7 += var10 * anInt2399;
		}

		if (var2 + var4 > anInt2400) {
			var4 -= var2 + var4 - anInt2400;
		}

		if (var1 < anInt2401) {
			var10 = anInt2401 - var1;
			var3 -= var10;
			var1 = anInt2401;
			var9 += var10;
			var7 += var10;
			var8 += var10;
			var11 += var10;
		}

		if (var1 + var3 > anInt2402) {
			var10 = var1 + var3 - anInt2402;
			var3 -= var10;
			var8 += var10;
			var11 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method3334(anIntArray2396, var0, var5, var9, var7, var3, var4, var11, var8, var6);
		}
	}

	static void method3334(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var10 = -var5; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	void method3335(String var1) {
		try {
			if (var1.startsWith("col=")) {
				anInt2805 = Class72.method955(var1.substring(4), 16, (byte) -7);
			} else if (var1.equals("/col")) {
				anInt2805 = anInt2796;
			} else if (var1.startsWith("str=")) {
				anInt2800 = Class72.method955(var1.substring(4), 16, (byte) -47);
			} else if (var1.equals("str")) {
				anInt2800 = 8388608;
			} else if (var1.equals("/str")) {
				anInt2800 = -1;
			} else if (var1.startsWith("u=")) {
				anInt2802 = Class72.method955(var1.substring(2), 16, (byte) -18);
			} else if (var1.equals("u")) {
				anInt2802 = 0;
			} else if (var1.equals("/u")) {
				anInt2802 = -1;
			} else if (var1.startsWith("shad=")) {
				anInt2804 = Class72.method955(var1.substring(5), 16, (byte) 4);
			} else if (var1.equals("shad")) {
				anInt2804 = 0;
			} else if (var1.equals("/shad")) {
				anInt2804 = anInt2803;
			} else if (var1.equals("br")) {
				method3338(anInt2796, anInt2803);
			}
		} catch (Exception var3) {
			;
		}

	}

	void method3338(int var1, int var2) {
		anInt2800 = -1;
		anInt2802 = -1;
		anInt2803 = var2;
		anInt2804 = var2;
		anInt2796 = var1;
		anInt2805 = var1;
		anInt2809 = 256;
		anInt2808 = 0;
		anInt2801 = 0;
	}

	public int method3346(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) {
			return 0;
		} else {
			method3338(var6, var7);
			if (var10 == 0) {
				var10 = anInt2807;
			}

			int[] var13 = new int[]{var4};
			if (var5 < anInt2790 + anInt2798 + var10 && var5 < var10 + var10) {
				var13 = null;
			}

			int var11 = method3386(var1, var13, aStringArray2811);
			if (var9 == 3 && var11 == 1) {
				var9 = 1;
			}

			int var12;
			int var14;
			if (var9 == 0) {
				var14 = var3 + anInt2790;
			} else if (var9 == 1) {
				var14 = var3 + anInt2790 + (var5 - anInt2790 - anInt2798 - (var11 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var14 = var3 + var5 - anInt2798 - (var11 - 1) * var10;
			} else {
				var12 = (var5 - anInt2790 - anInt2798 - (var11 - 1) * var10) / (var11 + 1);
				if (var12 < 0) {
					var12 = 0;
				}

				var14 = var3 + anInt2790 + var12;
				var10 += var12;
			}

			for (var12 = 0; var12 < var11; var12++) {
				if (var8 == 0) {
					method3327(aStringArray2811[var12], var2, var14);
				} else if (var8 == 1) {
					method3327(aStringArray2811[var12], var2 + (var4 - method3311(aStringArray2811[var12])) / 2, var14);
				} else if (var8 == 2) {
					method3327(aStringArray2811[var12], var2 + var4 - method3311(aStringArray2811[var12]), var14);
				} else if (var12 == var11 - 1) {
					method3327(aStringArray2811[var12], var2, var14);
				} else {
					method3366(aStringArray2811[var12], var4);
					method3327(aStringArray2811[var12], var2, var14);
					anInt2808 = 0;
				}

				var14 += var10;
			}

			return var11;
		}
	}

	CacheableEntry_Sub23_Sub14_Sub4(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		anIntArray2794 = var2;
		anIntArray2795 = var3;
		anIntArray2792 = var4;
		anIntArray2793 = var5;
		method3308(var1);
		aByteArrayArray2797 = var7;
		int var10 = 2147483647;
		int var9 = -2147483648;

		for (int var8 = 0; var8 < 256; var8++) {
			if (anIntArray2795[var8] < var10 && anIntArray2793[var8] != 0) {
				var10 = anIntArray2795[var8];
			}

			if (anIntArray2795[var8] + anIntArray2793[var8] > var9) {
				var9 = anIntArray2795[var8] + anIntArray2793[var8];
			}
		}

		anInt2790 = anInt2807 - var10;
		anInt2798 = var9 - anInt2807;
	}

	abstract void method3351(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method3366(String var1, int var2) {
		int var3 = 0;
		boolean var6 = false;

		for (int var5 = 0; var5 < var1.length(); var5++) {
			char var4 = var1.charAt(var5);
			if (var4 == 60) {
				var6 = true;
			} else if (var4 == 62) {
				var6 = false;
			} else if (!var6 && var4 == 32) {
				++var3;
			}
		}

		if (var3 > 0) {
			anInt2808 = (var2 - method3311(var1) << 8) / var3;
		}

	}

	public int method3371(String var1, int var2) {
		return method3386(var1, new int[]{var2}, aStringArray2811);
	}

	public void method3381(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			method3338(var4, var5);
			method3327(var1, var2 - method3311(var1) / 2, var3);
		}
	}

	int method3386(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == 60) {
					var10 = var14;
				} else {
					if (var15 == 62 && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method3324('<');
							if (aByteArray2810 != null && var11 != -1) {
								var4 += aByteArray2810[(var11 << 8) + 60];
							}

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method3324('>');
							if (aByteArray2810 != null && var11 != -1) {
								var4 += aByteArray2810[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								String var17 = var16.substring(4);
								int var18 = Npc.method3394(var17, 10, true, (byte) 1);
								var4 += aClass109_Sub23_Sub14_Sub1Array2799[var18].anInt2579;
								var11 = 0;
							} catch (Exception var20) {
								;
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method3324(var15);
							if (aByteArray2810 != null && var11 != -1) {
								var4 += aByteArray2810[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var21 = var6.toString();
			if (var21.length() > var5) {
				var3[var12++] = var21.substring(var5, var21.length());
			}

			return var12;
		}
	}

}
