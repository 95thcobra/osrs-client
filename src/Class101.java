public class Class101 {

	public static final int anInt1420 = 60;
	public static final int anInt1421 = 16;
	public static final int anInt1422 = 61;
	public static final int anInt1423 = 1;
	public static final int anInt1424 = 8;
	public static final int anInt1425 = 2;
	public static final int anInt1426 = 5;
	public static final int anInt1427 = 16;
	public static final int anInt1428 = 225;
	public static final int anInt1429 = 1024;
	public static final int anInt1430 = 153;
	public static final int anInt1431 = 181;
	public static final int anInt1432 = 51;
	public static final int anInt1433 = 2;
	public static final int anInt1434 = 32;
	public static final int anInt1435 = 49;
	public static final int anInt1436 = 137;
	public static int[] anIntArray1437 = new int[]{0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, -2, 0, 0, 0, 2, 0, 20, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 10, -2, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 4, 0, 10, 0, 0, 2, 0, 0, 0, 0, 0, -2, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 0, 0, 0, -2, 0, 15, 0, 0, -1, 6, 1, 8, 0, 0, 0, 6, 0, 7, 0, 1, 0, -2, 0, 0, 5, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, -1, 0, 2, 0, 0, 6, 0, 0, 0, 8, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 12, 5, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 4, 0, 6, 5, 0, -1, 0, 0, 0, 4, 6, 0, 0, 0, 2, 0, 28, 0, 3, 0, 0, 7, 0, -2, -2, 6, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 2, 0, -1, -2, -2, 0, 0, 0, 6, 0, 0, -2, 0, 3, 14, 0, 0, 5, 0, 2, 0, -2, 0, 0, 0};

	Class101() throws Throwable {
		throw new Error();
	}

	static final void method1266(CacheableEntry_Sub23_Sub16_Sub2 var0, int var1) {
		var0.aBool2507 = false;
		AnimationSequence var2;
		if (var0.anInt2556 * -1834510973 != -1) {
			var2 = CacheableEntry_Sub23_Sub11.getAnimation(var0.anInt2556 * -1834510973);
			if (var2 != null && var2.anIntArray2169 != null) {
				var0.anInt2535 -= 1996052833;
				if (var0.anInt2534 * 1209298591 < var2.anIntArray2169.length && var0.anInt2535 * -676399777 > var2.anIntArray2183[var0.anInt2534 * 1209298591]) {
					var0.anInt2535 = -1996052833;
					var0.anInt2534 += 2036804959;
					LinkedEntry_Sub8.method1831(var2, var0.anInt2534 * 1209298591, var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, (byte) -97);
				}

				if (var0.anInt2534 * 1209298591 >= var2.anIntArray2169.length) {
					var0.anInt2535 = 0;
					var0.anInt2534 = 0;
					LinkedEntry_Sub8.method1831(var2, var0.anInt2534 * 1209298591, var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, (byte) -103);
				}
			} else {
				var0.anInt2556 = 304340693;
			}
		}

		if (var0.anInt2541 * -1444330405 != -1 && GameClient.cycle * 1026470457 >= var0.anInt2544 * -1244118181) {
			if (var0.anInt2542 * -2034852903 < 0) {
				var0.anInt2542 = 0;
			}

			int var4 = Class42.getGfxDef(var0.anInt2541 * -1444330405).animId * 28936275;
			if (var4 != -1) {
				AnimationSequence var3 = CacheableEntry_Sub23_Sub11.getAnimation(var4);
				if (var3 != null && var3.anIntArray2169 != null) {
					var0.anInt2543 += 200007691;
					if (var0.anInt2542 * -2034852903 < var3.anIntArray2169.length && var0.anInt2543 * 1260104611 > var3.anIntArray2183[var0.anInt2542 * -2034852903]) {
						var0.anInt2543 = 200007691;
						var0.anInt2542 -= 708692887;
						LinkedEntry_Sub8.method1831(var3, var0.anInt2542 * -2034852903, var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, (byte) -10);
					}

					if (var0.anInt2542 * -2034852903 >= var3.anIntArray2169.length && (var0.anInt2542 * -2034852903 < 0 || var0.anInt2542 * -2034852903 >= var3.anIntArray2169.length)) {
						var0.anInt2541 = -1325550547;
					}
				} else {
					var0.anInt2541 = -1325550547;
				}
			} else {
				var0.anInt2541 = -1325550547;
			}
		}

		if (var0.anInt2536 * 1287875615 != -1 && var0.anInt2517 * -82959261 <= 1) {
			var2 = CacheableEntry_Sub23_Sub11.getAnimation(var0.anInt2536 * 1287875615);
			if (var2.anInt2180 * -1239714469 == 1 && var0.anInt2563 * -2051913933 > 0 && var0.anInt2540 * 1613108255 <= GameClient.cycle * 1026470457 && var0.anInt2539 * 468464431 < GameClient.cycle * 1026470457) {
				var0.anInt2517 = -88244917;
				return;
			}
		}

		if (var0.anInt2536 * 1287875615 != -1 && var0.anInt2517 * -82959261 == 0) {
			var2 = CacheableEntry_Sub23_Sub11.getAnimation(var0.anInt2536 * 1287875615);
			if (var2 != null && var2.anIntArray2169 != null) {
				var0.anInt2538 += 1531506933;
				if (var0.anInt2537 * -1478048169 < var2.anIntArray2169.length && var0.anInt2538 * -1340589219 > var2.anIntArray2183[var0.anInt2537 * -1478048169]) {
					var0.anInt2538 = 1531506933;
					var0.anInt2537 -= 857897625;
					LinkedEntry_Sub8.method1831(var2, var0.anInt2537 * -1478048169, var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, (byte) -35);
				}

				if (var0.anInt2537 * -1478048169 >= var2.anIntArray2169.length) {
					var0.anInt2537 -= var2.anInt2182 * 200896369;
					var0.anInt2515 -= 643773333;
					if (var0.anInt2515 * -1688240061 < var2.anInt2179 * 1170452997) {
						if (var0.anInt2537 * -1478048169 >= 0 && var0.anInt2537 * -1478048169 < var2.anIntArray2169.length) {
							LinkedEntry_Sub8.method1831(var2, var0.anInt2537 * -1478048169, var0.anInt2521 * -1051150961, var0.anInt2505 * -844883935, (byte) -60);
						} else {
							var0.anInt2536 = -1940983775;
						}
					} else {
						var0.anInt2536 = -1940983775;
					}
				}

				var0.aBool2507 = var2.aBool2175;
			} else {
				var0.anInt2536 = -1940983775;
			}
		}

		if (var0.anInt2517 * -82959261 > 0) {
			var0.anInt2517 += 88244917;
		}

	}

	static final void method1267(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		LinkedEntry_Sub6 var10 = null;

		for (LinkedEntry_Sub6 var11 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1405(); var11 != null; var11 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1402()) {
			if (var0 == var11.anInt1717 * -1806974757 && var1 == var11.anInt1723 * 754007907 && var11.anInt1729 * 1618190275 == var2 && var11.anInt1718 * -794083855 == var3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LinkedEntry_Sub6();
			var10.anInt1717 = var0 * -883279021;
			var10.anInt1718 = var3 * -142077167;
			var10.anInt1723 = var1 * -401458613;
			var10.anInt1729 = var2 * -1241200405;
			ItemContainer.method1850(var10);
			GameClient.aJagexLinkedList_2999.add(var10);
		}

		var10.anInt1720 = var4 * -523298551;
		var10.anInt1724 = var5 * 1698227967;
		var10.anInt1725 = var6 * 276116475;
		var10.anInt1727 = var7 * 1930203555;
		var10.anInt1728 = var8 * 917740037;
	}

}
