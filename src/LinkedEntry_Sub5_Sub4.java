public class LinkedEntry_Sub5_Sub4 extends LinkedEntry_Sub5 {

	static final int anInt2461 = 1;
	public static final int anInt2467 = 89;
	public static final int anInt2486 = 235;
	int anInt2458 = 1423203584;
	boolean aBool2460;
	long aLong2482;
	int anInt2475;
	int anInt2481;
	long aLong2483;
	int anInt2459 = 690276800;
	int[] anIntArray2470 = new int[16];
	int[] anIntArray2457 = new int[16];
	int[] anIntArray2473 = new int[16];
	int[] anIntArray2463 = new int[16];
	int[] anIntArray2469 = new int[16];
	int[] anIntArray2465 = new int[16];
	int[] anIntArray2464 = new int[16];
	int[] anIntArray2479 = new int[16];
	int[] anIntArray2468 = new int[16];
	int[] anIntArray2474 = new int[16];
	int[] anIntArray2471 = new int[16];
	int[] anIntArray2472 = new int[16];
	int[] anIntArray2480 = new int[16];
	int[] anIntArray2462 = new int[16];
	int[] anIntArray2485 = new int[16];
	LinkedEntry_Sub18[][] aClass109_Sub18ArrayArray2476 = new LinkedEntry_Sub18[16][128];
	LinkedEntry_Sub18[][] aClass109_Sub18ArrayArray2477 = new LinkedEntry_Sub18[16][128];
	Class105 aClass105_2478 = new Class105();
	LinkedEntry_Sub5_Sub3 aClass109_Sub5_Sub3_2484 = new LinkedEntry_Sub5_Sub3(this);
	JagexMap aJagexMap_2466 = new JagexMap(128);

	void method2836(LinkedEntry_Sub18 var1, boolean var2, byte var3) {
		int var4 = var1.aClass109_Sub1_Sub1_1896.aByteArray2392.length;
		int var5;
		if (var2 && var1.aClass109_Sub1_Sub1_1896.aBool2391) {
			int var6 = var4 + var4 - var1.aClass109_Sub1_Sub1_1896.anInt2393;
			var5 = (int) ((long) anIntArray2480[var1.anInt1912 * 2114974573] * (long) var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.aClass109_Sub5_Sub2_1916.method2644(true);
			}
		} else {
			var5 = (int) ((long) var4 * (long) anIntArray2480[var1.anInt1912 * 2114974573] >> 6);
		}

		var1.aClass109_Sub5_Sub2_1916.method2579(var5);
	}

	public synchronized void method2837(int var1, byte var2) {
		anInt2458 = var1 * 1716835421;
	}

	int method2838(byte var1) {
		return anInt2458 * -1243111435;
	}

	int method2839(LinkedEntry_Sub18 var1, int var2) {
		Class102 var3 = var1.aClass102_1897;
		int var5 = 4096 + anIntArray2470[var1.anInt1912 * 2114974573] * anIntArray2473[var1.anInt1912 * 2114974573] >> 13;
		var5 = 16384 + var5 * var5 >> 15;
		var5 = var1.anInt1900 * -763464025 * var5 + 16384 >> 15;
		var5 = anInt2458 * -1243111435 * var5 + 128 >> 8;
		if (var3.anInt1438 * -2080964847 > 0) {
			var5 = (int) ((double) var5 * Math.pow(0.5D, (double) (var3.anInt1438 * -2080964847) * (double) (var1.anInt1902 * -1439901009) * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var6;
		int var7;
		int var8;
		if (var3.aByteArray1444 != null) {
			var6 = var1.anInt1906 * -1695729519;
			var7 = var3.aByteArray1444[1 + var1.anInt1907 * -1846924877];
			if (var1.anInt1907 * -1846924877 < var3.aByteArray1444.length - 2) {
				var4 = (var3.aByteArray1444[var1.anInt1907 * -1846924877] & 255) << 8;
				var8 = (var3.aByteArray1444[var1.anInt1907 * -1846924877 + 2] & 255) << 8;
				var7 += (var3.aByteArray1444[3 + var1.anInt1907 * -1846924877] - var7) * (var6 - var4) / (var8 - var4);
			}

			var5 = 32 + var7 * var5 >> 6;
		}

		if (var1.anInt1908 * 719007803 > 0 && var3.aByteArray1443 != null) {
			var6 = var1.anInt1908 * 719007803;
			var7 = var3.aByteArray1443[var1.anInt1911 * -437862515 + 1];
			if (var1.anInt1911 * -437862515 < var3.aByteArray1443.length - 2) {
				var4 = (var3.aByteArray1443[var1.anInt1911 * -437862515] & 255) << 8;
				var8 = (var3.aByteArray1443[2 + var1.anInt1911 * -437862515] & 255) << 8;
				var7 += (var6 - var4) * (var3.aByteArray1443[var1.anInt1911 * -437862515 + 3] - var7) / (var8 - var4);
			}

			var5 = var7 * var5 + 32 >> 6;
		}

		return var5;
	}

	public synchronized void method2842(LinkedEntry_Sub17 var1, boolean var2, int var3) {
		method2843((byte) 27);
		aClass105_2478.method1282(var1.aByteArray1893);
		aBool2460 = var2;
		aLong2482 = 0L;
		int var4 = aClass105_2478.method1336();

		for (int var5 = 0; var5 < var4; var5++) {
			aClass105_2478.method1290(var5);
			aClass105_2478.method1315(var5);
			aClass105_2478.method1287(var5);
		}

		anInt2475 = aClass105_2478.method1294() * 1857679;
		anInt2481 = aClass105_2478.anIntArray1474[anInt2475 * -1428568465] * -638054151;
		aLong2483 = aClass105_2478.method1327(anInt2481 * 1904193865) * 1395177067055174127L;
	}

	public synchronized void method2843(byte var1) {
		aClass105_2478.method1286();
		method2855(2089284912);
	}

	public synchronized boolean method2844(byte var1) {
		return aClass105_2478.method1297();
	}

	void method2846(int var1, int var2, int var3) {
		anIntArray2463[var1] = var2;
		anIntArray2465[var1] = var2 & -128;
		method2847(var1, var2, -1064642111);
	}

	void method2847(int var1, int var2, int var3) {
		if (anIntArray2469[var1] != var2) {
			anIntArray2469[var1] = var2;

			for (int var4 = 0; var4 < 128; var4++) {
				aClass109_Sub18ArrayArray2477[var1][var4] = null;
			}
		}

	}

	void method2848(int var1, int var2, int var3, int var4) {
		method2899(var1, var2, 64, 2018724867);
		if ((anIntArray2474[var1] & 2) != 0) {
			for (LinkedEntry_Sub18 var6 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1401(); var6 != null; var6 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1403()) {
				if (var1 == var6.anInt1912 * 2114974573 && var6.anInt1908 * 719007803 < 0) {
					aClass109_Sub18ArrayArray2476[var1][var6.anInt1905 * -795828631] = null;
					aClass109_Sub18ArrayArray2476[var1][var2] = var6;
					int var8 = var6.anInt1894 * 1080499421 + (var6.anInt1903 * -1558114147 * var6.anInt1904 * -103369499 >> 12);
					var6.anInt1894 += (var2 - var6.anInt1905 * -795828631 << 8) * 2057214837;
					var6.anInt1903 = (var8 - var6.anInt1894 * 1080499421) * 1674442165;
					var6.anInt1904 = -24195072;
					var6.anInt1905 = var2 * -1935224359;
					return;
				}
			}
		}

		LinkedEntry_Sub16 var9 = (LinkedEntry_Sub16) aJagexMap_2466.get((long) anIntArray2469[var1]);
		if (var9 != null) {
			LinkedEntry_Sub1_Sub1 var10 = var9.aClass109_Sub1_Sub1Array1882[var2];
			if (var10 != null) {
				LinkedEntry_Sub18 var7 = new LinkedEntry_Sub18();
				var7.anInt1912 = var1 * 567873125;
				var7.aClass109_Sub16_1899 = var9;
				var7.aClass109_Sub1_Sub1_1896 = var10;
				var7.aClass102_1897 = var9.aClass102Array1886[var2];
				var7.anInt1898 = var9.aByteArray1881[var2] * 1395228449;
				var7.anInt1905 = var2 * -1935224359;
				var7.anInt1900 = (1024 + var9.aByteArray1884[var2] * var9.anInt1889 * -33356305 * var3 * var3 >> 11) * 934531351;
				var7.anInt1901 = (var9.aByteArray1885[var2] & 255) * -61893665;
				var7.anInt1894 = ((var2 << 8) - (var9.aShortArray1883[var2] & 32767)) * 2057214837;
				var7.anInt1902 = 0;
				var7.anInt1906 = 0;
				var7.anInt1907 = 0;
				var7.anInt1908 = 1195890445;
				var7.anInt1911 = 0;
				if (anIntArray2480[var1] == 0) {
					var7.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var10, method2860(var7, 1991048695), method2839(var7, 519598730), method2926(var7, -1125975651));
				} else {
					var7.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var10, method2860(var7, 1987593206), 0, method2926(var7, -1904059167));
					method2836(var7, var9.aShortArray1883[var2] < 0, (byte) 14);
				}

				if (var9.aShortArray1883[var2] < 0) {
					var7.aClass109_Sub5_Sub2_1916.method2573(-1);
				}

				if (var7.anInt1898 * 921879777 >= 0) {
					LinkedEntry_Sub18 var5 = aClass109_Sub18ArrayArray2477[var1][var7.anInt1898 * 921879777];
					if (var5 != null && var5.anInt1908 * 719007803 < 0) {
						aClass109_Sub18ArrayArray2476[var1][var5.anInt1905 * -795828631] = null;
						var5.anInt1908 = 0;
					}

					aClass109_Sub18ArrayArray2477[var1][var7.anInt1898 * 921879777] = var7;
				}

				aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.add(var7);
				aClass109_Sub18ArrayArray2476[var1][var2] = var7;
			}
		}
	}

	public synchronized boolean method2849(LinkedEntry_Sub17 var1, IndexDescriptor var2, Class6 var3, int var4, int var5) {
		var1.method2114();
		boolean var6 = true;
		int[] var9 = null;
		if (var4 > 0) {
			var9 = new int[]{var4};
		}

		for (LinkedEntry_Sub22 var10 = (LinkedEntry_Sub22) var1.aJagexMap_1892.method1537(); var10 != null; var10 = (LinkedEntry_Sub22) var1.aJagexMap_1892.method1543()) {
			int var7 = (int) var10.key;
			LinkedEntry_Sub16 var8 = (LinkedEntry_Sub16) aJagexMap_2466.get((long) var7);
			if (var8 == null) {
				var8 = Class41.method671(var2, var7, -1220056043);
				if (var8 == null) {
					var6 = false;
					continue;
				}

				aJagexMap_2466.put(var8, (long) var7);
			}

			if (!var8.method2106(var3, var10.aByteArray2084, var9, (byte) -58)) {
				var6 = false;
			}
		}

		if (var6) {
			var1.method2113();
		}

		return var6;
	}

	public synchronized void method2850(int var1, int var2, byte var3) {
		method2846(var1, var2, 576942506);
	}

	void method2852(int var1, int var2, int var3) {
	}

	protected synchronized LinkedEntry_Sub5 method1796() {
		return aClass109_Sub5_Sub3_2484;
	}

	void method2853(int var1, int var2) {
		for (LinkedEntry_Sub18 var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1405(); var3 != null; var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1402()) {
			if (var1 < 0 || var1 == var3.anInt1912 * 2114974573) {
				if (var3.aClass109_Sub5_Sub2_1916 != null) {
					var3.aClass109_Sub5_Sub2_1916.method2640(Class2.anInt34 * -46901051 / 100);
					if (var3.aClass109_Sub5_Sub2_1916.method2588()) {
						aClass109_Sub5_Sub3_2484.aClass109_Sub5_Sub1_2452.method2544(var3.aClass109_Sub5_Sub2_1916);
					}

					var3.method2126(1883320653);
				}

				if (var3.anInt1908 * 719007803 < 0) {
					aClass109_Sub18ArrayArray2476[var3.anInt1912 * 2114974573][var3.anInt1905 * -795828631] = null;
				}

				var3.unlink();
			}
		}

	}

	public LinkedEntry_Sub5_Sub4() {
		method2855(-487808451);
	}

	void method2855(int var1) {
		method2853(-1, 377335837);
		method2901(-1, -1155181543);

		int var2;
		for (var2 = 0; var2 < 16; var2++) {
			anIntArray2469[var2] = anIntArray2463[var2];
		}

		for (var2 = 0; var2 < 16; var2++) {
			anIntArray2465[var2] = anIntArray2463[var2] & -128;
		}

	}

	void method2857(int var1, int var2) {
		if ((anIntArray2474[var1] & 4) != 0) {
			for (LinkedEntry_Sub18 var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1405(); var3 != null; var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1402()) {
				if (var1 == var3.anInt1912 * 2114974573) {
					var3.anInt1915 = 0;
				}
			}
		}

	}

	void method2858(int var1, byte var2) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			method2899(var4, var6, var5, 2010108182);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				method2848(var4, var6, var5, -1400606107);
			} else {
				method2899(var4, var6, 64, 2006954600);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			method2887(var4, var6, var5, (byte) 6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var6 == 0) {
				anIntArray2465[var4] = (var5 << 14) + (anIntArray2465[var4] & -2080769);
			}

			if (var6 == 32) {
				anIntArray2465[var4] = (anIntArray2465[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 1) {
				anIntArray2479[var4] = (anIntArray2479[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 33) {
				anIntArray2479[var4] = (anIntArray2479[var4] & -128) + var5;
			}

			if (var6 == 5) {
				anIntArray2468[var4] = (anIntArray2468[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 37) {
				anIntArray2468[var4] = var5 + (anIntArray2468[var4] & -128);
			}

			if (var6 == 7) {
				anIntArray2470[var4] = (var5 << 7) + (anIntArray2470[var4] & -16257);
			}

			if (var6 == 39) {
				anIntArray2470[var4] = var5 + (anIntArray2470[var4] & -128);
			}

			if (var6 == 10) {
				anIntArray2457[var4] = (anIntArray2457[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 42) {
				anIntArray2457[var4] = var5 + (anIntArray2457[var4] & -128);
			}

			if (var6 == 11) {
				anIntArray2473[var4] = (anIntArray2473[var4] & -16257) + (var5 << 7);
			}

			if (var6 == 43) {
				anIntArray2473[var4] = (anIntArray2473[var4] & -128) + var5;
			}

			if (var6 == 64) {
				if (var5 >= 64) {
					anIntArray2474[var4] |= 1;
				} else {
					anIntArray2474[var4] &= -2;
				}
			}

			if (var6 == 65) {
				if (var5 >= 64) {
					anIntArray2474[var4] |= 2;
				} else {
					method2921(var4, 1499726391);
					anIntArray2474[var4] &= -3;
				}
			}

			if (var6 == 99) {
				anIntArray2471[var4] = (var5 << 7) + (anIntArray2471[var4] & 127);
			}

			if (var6 == 98) {
				anIntArray2471[var4] = var5 + (anIntArray2471[var4] & 16256);
			}

			if (var6 == 101) {
				anIntArray2471[var4] = (anIntArray2471[var4] & 127) + 16384 + (var5 << 7);
			}

			if (var6 == 100) {
				anIntArray2471[var4] = (anIntArray2471[var4] & 16256) + 16384 + var5;
			}

			if (var6 == 120) {
				method2853(var4, -2105884689);
			}

			if (var6 == 121) {
				method2901(var4, -1379067553);
			}

			if (var6 == 123) {
				method2880(var4, -205736182);
			}

			int var7;
			if (var6 == 6) {
				var7 = anIntArray2471[var4];
				if (var7 == 16384) {
					anIntArray2472[var4] = (var5 << 7) + (anIntArray2472[var4] & -16257);
				}
			}

			if (var6 == 38) {
				var7 = anIntArray2471[var4];
				if (var7 == 16384) {
					anIntArray2472[var4] = (anIntArray2472[var4] & -128) + var5;
				}
			}

			if (var6 == 16) {
				anIntArray2480[var4] = (var5 << 7) + (anIntArray2480[var4] & -16257);
			}

			if (var6 == 48) {
				anIntArray2480[var4] = var5 + (anIntArray2480[var4] & -128);
			}

			if (var6 == 81) {
				if (var5 >= 64) {
					anIntArray2474[var4] |= 4;
				} else {
					method2857(var4, 1652430977);
					anIntArray2474[var4] &= -5;
				}
			}

			if (var6 == 17) {
				method2859(var4, (anIntArray2462[var4] & -16257) + (var5 << 7), 1882634827);
			}

			if (var6 == 49) {
				method2859(var4, (anIntArray2462[var4] & -128) + var5, 2019886680);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			method2847(var4, anIntArray2465[var4] + var6, -1064642111);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var6 = var1 >> 8 & 127;
			method2852(var4, var6, -642245569);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var6 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			method2904(var4, var6, (byte) 68);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				method2855(1458886881);
			}
		}
	}

	void method2859(int var1, int var2, int var3) {
		anIntArray2462[var1] = var2;
		anIntArray2485[var1] = (int) (2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D) + 0.5D);
	}

	int method2860(LinkedEntry_Sub18 var1, int var2) {
		int var3 = var1.anInt1894 * 1080499421 + (var1.anInt1904 * -103369499 * var1.anInt1903 * -1558114147 >> 12);
		var3 += (anIntArray2464[var1.anInt1912 * 2114974573] - 8192) * anIntArray2472[var1.anInt1912 * 2114974573] >> 12;
		Class102 var6 = var1.aClass102_1897;
		int var8;
		if (var6.anInt1445 * -1018763351 > 0 && (var6.anInt1441 * -1310972373 > 0 || anIntArray2479[var1.anInt1912 * 2114974573] > 0)) {
			var8 = var6.anInt1441 * -1310972373 << 2;
			int var7 = var6.anInt1446 * -1865429001 << 1;
			if (var1.anInt1910 * -1716322373 < var7) {
				var8 = var1.anInt1910 * -1716322373 * var8 / var7;
			}

			var8 += anIntArray2479[var1.anInt1912 * 2114974573] >> 7;
			double var4 = Math.sin(0.01227184630308513D * (double) (var1.anInt1913 * 1789086901 & 511));
			var3 += (int) ((double) var8 * var4);
		}

		var8 = (int) ((double) (var1.aClass109_Sub1_Sub1_1896.anInt2395 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double) var3) / (double) (Class2.anInt34 * -46901051) + 0.5D);
		return var8 < 1 ? 1 : var8;
	}

	protected synchronized LinkedEntry_Sub5 method1797() {
		return null;
	}

	protected synchronized int method1794() {
		return 0;
	}

	protected synchronized void method1803(int[] var1, int var2, int var3) {
		if (aClass105_2478.method1297()) {
			int var4 = anInt2459 * -1178137521 * aClass105_2478.anInt1462 / (Class2.anInt34 * -46901051);

			do {
				long var5 = (long) var4 * (long) var3 + 497425111599032637L * aLong2482;
				if (-1882446869992899313L * aLong2483 - var5 >= 0L) {
					aLong2482 = -4477008562629577195L * var5;
					break;
				}

				int var7 = (int) (((long) var4 + (-1882446869992899313L * aLong2483 - aLong2482 * 497425111599032637L) - 1L) / (long) var4);
				aLong2482 += (long) var4 * (long) var7 * -4477008562629577195L;
				aClass109_Sub5_Sub3_2484.method1803(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				method2863((byte) 16);
			} while (aClass105_2478.method1297());
		}

		aClass109_Sub5_Sub3_2484.method1803(var1, var2, var3);
	}

	protected synchronized void method1801(int var1) {
		if (aClass105_2478.method1297()) {
			int var4 = aClass105_2478.anInt1462 * anInt2459 * -1178137521 / (Class2.anInt34 * -46901051);

			do {
				long var2 = (long) var4 * (long) var1 + 497425111599032637L * aLong2482;
				if (aLong2483 * -1882446869992899313L - var2 >= 0L) {
					aLong2482 = var2 * -4477008562629577195L;
					break;
				}

				int var5 = (int) (((long) var4 + (aLong2483 * -1882446869992899313L - 497425111599032637L * aLong2482) - 1L) / (long) var4);
				aLong2482 += -4477008562629577195L * (long) var4 * (long) var5;
				aClass109_Sub5_Sub3_2484.method1801(var5);
				var1 -= var5;
				method2863((byte) 97);
			} while (aClass105_2478.method1297());
		}

		aClass109_Sub5_Sub3_2484.method1801(var1);
	}

	void method2863(byte var1) {
		int var2 = anInt2475 * -1428568465;
		int var5 = anInt2481 * 1904193865;

		long var3;
		for (var3 = aLong2483 * -1882446869992899313L; var5 == anInt2481 * 1904193865; var3 = aClass105_2478.method1327(var5)) {
			while (aClass105_2478.anIntArray1474[var2] == var5) {
				aClass105_2478.method1290(var2);
				int var6 = aClass105_2478.method1289(var2);
				if (var6 == 1) {
					aClass105_2478.method1288();
					aClass105_2478.method1287(var2);
					if (aClass105_2478.method1283()) {
						if (!aBool2460 || var5 == 0) {
							method2855(-803809717);
							aClass105_2478.method1286();
							return;
						}

						aClass105_2478.method1295(var3);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					method2858(var6, (byte) -119);
				}

				aClass105_2478.method1315(var2);
				aClass105_2478.method1287(var2);
			}

			var2 = aClass105_2478.method1294();
			var5 = aClass105_2478.anIntArray1474[var2];
		}

		anInt2475 = var2 * 1857679;
		anInt2481 = var5 * -638054151;
		aLong2483 = 1395177067055174127L * var3;
	}

	boolean method2864(LinkedEntry_Sub18 var1, byte var2) {
		if (var1.aClass109_Sub5_Sub2_1916 == null) {
			if (var1.anInt1908 * 719007803 >= 0) {
				var1.unlink();
				if (var1.anInt1898 * 921879777 > 0 && aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] == var1) {
					aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	synchronized void method2868(int var1) {
		for (LinkedEntry_Sub16 var2 = (LinkedEntry_Sub16) aJagexMap_2466.method1537(); var2 != null; var2 = (LinkedEntry_Sub16) aJagexMap_2466.method1543()) {
			var2.unlink();
		}

	}

	boolean method2878(LinkedEntry_Sub18 var1, int[] var2, int var3, int var4, int var5) {
		var1.anInt1895 = Class2.anInt34 * -46901051 / 100 * 537115961;
		if (var1.anInt1908 * 719007803 < 0 || var1.aClass109_Sub5_Sub2_1916 != null && !var1.aClass109_Sub5_Sub2_1916.method2587()) {
			int var7 = var1.anInt1904 * -103369499;
			if (var7 > 0) {
				var7 -= (int) (16.0D * Math.pow(2.0D, (double) anIntArray2468[var1.anInt1912 * 2114974573] * 4.921259842519685E-4D) + 0.5D);
				if (var7 < 0) {
					var7 = 0;
				}

				var1.anInt1904 = var7 * -579868435;
			}

			var1.aClass109_Sub5_Sub2_1916.method2589(method2860(var1, 1357837077));
			Class102 var6 = var1.aClass102_1897;
			boolean var8 = false;
			var1.anInt1910 -= 761926285;
			var1.anInt1913 += var6.anInt1445 * -1339163739;
			double var9 = 5.086263020833333E-6D * (double) ((var1.anInt1903 * -1558114147 * var1.anInt1904 * -103369499 >> 12) + (var1.anInt1905 * -795828631 - 60 << 8));
			if (var6.anInt1438 * -2080964847 > 0) {
				if (var6.anInt1440 * 1806465307 > 0) {
					var1.anInt1902 += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var6.anInt1440 * 1806465307)) + 0.5D) * -781140913;
				} else {
					var1.anInt1902 -= 1201789056;
				}
			}

			if (var6.aByteArray1444 != null) {
				if (var6.anInt1439 * -918845069 > 0) {
					var1.anInt1906 += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var6.anInt1439 * -918845069)) + 0.5D) * 703432817;
				} else {
					var1.anInt1906 -= 154912640;
				}

				while (var1.anInt1907 * -1846924877 < var6.aByteArray1444.length - 2 && var1.anInt1906 * -1695729519 > (var6.aByteArray1444[2 + var1.anInt1907 * -1846924877] & 255) << 8) {
					var1.anInt1907 -= 253666570;
				}

				if (var1.anInt1907 * -1846924877 == var6.aByteArray1444.length - 2 && var6.aByteArray1444[var1.anInt1907 * -1846924877 + 1] == 0) {
					var8 = true;
				}
			}

			if (var1.anInt1908 * 719007803 >= 0 && var6.aByteArray1443 != null && (anIntArray2474[var1.anInt1912 * 2114974573] & 1) == 0 && (var1.anInt1898 * 921879777 < 0 || aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] != var1)) {
				if (var6.anInt1442 * 485290785 > 0) {
					var1.anInt1908 += (int) (128.0D * Math.pow(2.0D, var9 * (double) (var6.anInt1442 * 485290785)) + 0.5D) * -1195890445;
				} else {
					var1.anInt1908 += 1544845696;
				}

				while (var1.anInt1911 * -437862515 < var6.aByteArray1443.length - 2 && var1.anInt1908 * 719007803 > (var6.aByteArray1443[2 + var1.anInt1911 * -437862515] & 255) << 8) {
					var1.anInt1911 += 1581856394;
				}

				if (var1.anInt1911 * -437862515 == var6.aByteArray1443.length - 2) {
					var8 = true;
				}
			}

			if (var8) {
				var1.aClass109_Sub5_Sub2_1916.method2640(var1.anInt1895 * 1112154377);
				if (var2 != null) {
					var1.aClass109_Sub5_Sub2_1916.method1803(var2, var3, var4);
				} else {
					var1.aClass109_Sub5_Sub2_1916.method1801(var4);
				}

				if (var1.aClass109_Sub5_Sub2_1916.method2588()) {
					aClass109_Sub5_Sub3_2484.aClass109_Sub5_Sub1_2452.method2544(var1.aClass109_Sub5_Sub2_1916);
				}

				var1.method2126(160298134);
				if (var1.anInt1908 * 719007803 >= 0) {
					var1.unlink();
					if (var1.anInt1898 * 921879777 > 0 && aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] == var1) {
						aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] = null;
					}
				}

				return true;
			} else {
				var1.aClass109_Sub5_Sub2_1916.method2583(var1.anInt1895 * 1112154377, method2839(var1, 2055634713), method2926(var1, 1177291339));
				return false;
			}
		} else {
			var1.method2126(-2124492641);
			var1.unlink();
			if (var1.anInt1898 * 921879777 > 0 && aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] == var1) {
				aClass109_Sub18ArrayArray2477[var1.anInt1912 * 2114974573][var1.anInt1898 * 921879777] = null;
			}

			return true;
		}
	}

	void method2880(int var1, int var2) {
		for (LinkedEntry_Sub18 var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1405(); var3 != null; var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1402()) {
			if ((var1 < 0 || var3.anInt1912 * 2114974573 == var1) && var3.anInt1908 * 719007803 < 0) {
				aClass109_Sub18ArrayArray2476[var3.anInt1912 * 2114974573][var3.anInt1905 * -795828631] = null;
				var3.anInt1908 = 0;
			}
		}

	}

	void method2887(int var1, int var2, int var3, byte var4) {
	}

	public synchronized void method2889(int var1) {
		for (LinkedEntry_Sub16 var2 = (LinkedEntry_Sub16) aJagexMap_2466.method1537(); var2 != null; var2 = (LinkedEntry_Sub16) aJagexMap_2466.method1543()) {
			var2.method2107(-1366136424);
		}

	}

	void method2899(int var1, int var2, int var3, int var4) {
		LinkedEntry_Sub18 var5 = aClass109_Sub18ArrayArray2476[var1][var2];
		if (var5 != null) {
			aClass109_Sub18ArrayArray2476[var1][var2] = null;
			if ((anIntArray2474[var1] & 2) != 0) {
				for (LinkedEntry_Sub18 var6 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1405(); var6 != null; var6 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1402()) {
					if (var5.anInt1912 * 2114974573 == var6.anInt1912 * 2114974573 && var6.anInt1908 * 719007803 < 0 && var6 != var5) {
						var5.anInt1908 = 0;
						break;
					}
				}
			} else {
				var5.anInt1908 = 0;
			}

		}
	}

	void method2901(int var1, int var2) {
		if (var1 >= 0) {
			anIntArray2470[var1] = 12800;
			anIntArray2457[var1] = 8192;
			anIntArray2473[var1] = 16383;
			anIntArray2464[var1] = 8192;
			anIntArray2479[var1] = 0;
			anIntArray2468[var1] = 8192;
			method2921(var1, -430696940);
			method2857(var1, 1652430977);
			anIntArray2474[var1] = 0;
			anIntArray2471[var1] = 32767;
			anIntArray2472[var1] = 256;
			anIntArray2480[var1] = 0;
			method2859(var1, 8192, 223876049);
		} else {
			for (var1 = 0; var1 < 16; var1++) {
				method2901(var1, 1755896549);
			}

		}
	}

	void method2904(int var1, int var2, byte var3) {
		anIntArray2464[var1] = var2;
	}

	void method2921(int var1, int var2) {
		if ((anIntArray2474[var1] & 2) != 0) {
			for (LinkedEntry_Sub18 var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1405(); var3 != null; var3 = (LinkedEntry_Sub18) aClass109_Sub5_Sub3_2484.aJagexLinkedList_2451.method1402()) {
				if (var1 == var3.anInt1912 * 2114974573 && aClass109_Sub18ArrayArray2476[var1][var3.anInt1905 * -795828631] == null && var3.anInt1908 * 719007803 < 0) {
					var3.anInt1908 = 0;
				}
			}
		}

	}

	int method2926(LinkedEntry_Sub18 var1, int var2) {
		int var3 = anIntArray2457[var1.anInt1912 * 2114974573];
		return var3 >= 8192 ? 16384 - ((128 - var1.anInt1901 * -1358567393) * (16384 - var3) + 32 >> 6) : var3 * var1.anInt1901 * -1358567393 + 32 >> 6;
	}

	static int method2933(int var0) {
		return GameClient.aBool3081 ? 2 : 1;
	}

	static final void method2934(CacheableEntry_Sub23_Sub16_Sub2 var0, int var1, byte var2) {
		ItemContainer.method1848(var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, var1);
	}

}
