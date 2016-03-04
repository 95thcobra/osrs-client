public class LinkedEntry_Sub5_Sub3 extends LinkedEntry_Sub5 {

	static int anInt2454;
	static final int anInt2455 = 43;
	static final int anInt2456 = 37;
	JagexLinkedList aJagexLinkedList_2451 = new JagexLinkedList();
	LinkedEntry_Sub5_Sub1 aClass109_Sub5_Sub1_2452 = new LinkedEntry_Sub5_Sub1();
	LinkedEntry_Sub5_Sub4 aClass109_Sub5_Sub4_2453;

	protected LinkedEntry_Sub5 method1797() {
		LinkedEntry_Sub18 var1;
		do {
			var1 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1402();
			if (var1 == null) {
				return null;
			}
		} while (var1.aClass109_Sub5_Sub2_1916 == null);

		return var1.aClass109_Sub5_Sub2_1916;
	}

	protected int method1794() {
		return 0;
	}

	protected LinkedEntry_Sub5 method1796() {
		LinkedEntry_Sub18 var1 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1405();
		return (LinkedEntry_Sub5) (var1 == null ? null : (var1.aClass109_Sub5_Sub2_1916 == null ? method1797() : var1.aClass109_Sub5_Sub2_1916));
	}

	protected void method1801(int var1) {
		aClass109_Sub5_Sub1_2452.method1801(var1);

		for (LinkedEntry_Sub18 var2 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1405(); var2 != null; var2 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1402()) {
			if (!aClass109_Sub5_Sub4_2453.method2864(var2, (byte) 67)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt1895 * 1112154377) {
						method2829(var2, var3, 2115027104);
						var2.anInt1895 -= var3 * 537115961;
						break;
					}

					method2829(var2, var2.anInt1895 * 1112154377, 545800749);
					var3 -= var2.anInt1895 * 1112154377;
				} while (!aClass109_Sub5_Sub4_2453.method2878(var2, (int[]) null, 0, var3, -1185823292));
			}
		}

	}

	void method2829(LinkedEntry_Sub18 var1, int var2, int var3) {
		if ((aClass109_Sub5_Sub4_2453.anIntArray2474[var1.anInt1912 * 2114974573] & 4) != 0 && var1.anInt1908 * 719007803 < 0) {
			int var5 = aClass109_Sub5_Sub4_2453.anIntArray2485[var1.anInt1912 * 2114974573] / (Class2.anInt34 * -46901051);
			int var4 = (var5 + 1048575 - var1.anInt1915 * 516106269) / var5;
			var1.anInt1915 = (var2 * var5 + var1.anInt1915 * 516106269 & 1048575) * -600778187;
			if (var4 <= var2) {
				if (aClass109_Sub5_Sub4_2453.anIntArray2480[var1.anInt1912 * 2114974573] == 0) {
					var1.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var1.aClass109_Sub1_Sub1_1896, var1.aClass109_Sub5_Sub2_1916.method2586(), var1.aClass109_Sub5_Sub2_1916.method2580(), var1.aClass109_Sub5_Sub2_1916.method2602());
				} else {
					var1.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var1.aClass109_Sub1_Sub1_1896, var1.aClass109_Sub5_Sub2_1916.method2586(), 0, var1.aClass109_Sub5_Sub2_1916.method2602());
					aClass109_Sub5_Sub4_2453.method2836(var1, var1.aClass109_Sub16_1899.aShortArray1883[var1.anInt1905 * -795828631] < 0, (byte) 14);
				}

				if (var1.aClass109_Sub16_1899.aShortArray1883[var1.anInt1905 * -795828631] < 0) {
					var1.aClass109_Sub5_Sub2_1916.method2573(-1);
				}

				var2 = var1.anInt1915 * 516106269 / var5;
			}
		}

		var1.aClass109_Sub5_Sub2_1916.method1801(var2);
	}

	protected void method1803(int[] var1, int var2, int var3) {
		aClass109_Sub5_Sub1_2452.method1803(var1, var2, var3);

		for (LinkedEntry_Sub18 var4 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1405(); var4 != null; var4 = (LinkedEntry_Sub18) aJagexLinkedList_2451.method1402()) {
			if (!aClass109_Sub5_Sub4_2453.method2864(var4, (byte) 30)) {
				int var6 = var2;
				int var5 = var3;

				do {
					if (var5 <= var4.anInt1895 * 1112154377) {
						method2830(var4, var1, var6, var5, var6 + var5, -633411239);
						var4.anInt1895 -= var5 * 537115961;
						break;
					}

					method2830(var4, var1, var6, var4.anInt1895 * 1112154377, var6 + var5, -633411239);
					var6 += var4.anInt1895 * 1112154377;
					var5 -= var4.anInt1895 * 1112154377;
				} while (!aClass109_Sub5_Sub4_2453.method2878(var4, var1, var6, var5, -894157526));
			}
		}

	}

	LinkedEntry_Sub5_Sub3(LinkedEntry_Sub5_Sub4 var1) {
		aClass109_Sub5_Sub4_2453 = var1;
	}

	void method2830(LinkedEntry_Sub18 var1, int[] var2, int var3, int var4, int var5, int var6) {
		if ((aClass109_Sub5_Sub4_2453.anIntArray2474[var1.anInt1912 * 2114974573] & 4) != 0 && var1.anInt1908 * 719007803 < 0) {
			int var10 = aClass109_Sub5_Sub4_2453.anIntArray2485[var1.anInt1912 * 2114974573] / (Class2.anInt34 * -46901051);

			while (true) {
				int var9 = (var10 + 1048575 - var1.anInt1915 * 516106269) / var10;
				if (var9 > var4) {
					var1.anInt1915 += var10 * var4 * -600778187;
					break;
				}

				var1.aClass109_Sub5_Sub2_1916.method1803(var2, var3, var9);
				var3 += var9;
				var4 -= var9;
				var1.anInt1915 += (var10 * var9 - 1048576) * -600778187;
				int var7 = Class2.anInt34 * -46901051 / 100;
				int var11 = 262144 / var10;
				if (var11 < var7) {
					var7 = var11;
				}

				LinkedEntry_Sub5_Sub2 var8 = var1.aClass109_Sub5_Sub2_1916;
				if (aClass109_Sub5_Sub4_2453.anIntArray2480[var1.anInt1912 * 2114974573] == 0) {
					var1.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var1.aClass109_Sub1_Sub1_1896, var8.method2586(), var8.method2580(), var8.method2602());
				} else {
					var1.aClass109_Sub5_Sub2_1916 = LinkedEntry_Sub5_Sub2.method2571(var1.aClass109_Sub1_Sub1_1896, var8.method2586(), 0, var8.method2602());
					aClass109_Sub5_Sub4_2453.method2836(var1, var1.aClass109_Sub16_1899.aShortArray1883[var1.anInt1905 * -795828631] < 0, (byte) 14);
					var1.aClass109_Sub5_Sub2_1916.method2569(var7, var8.method2580());
				}

				if (var1.aClass109_Sub16_1899.aShortArray1883[var1.anInt1905 * -795828631] < 0) {
					var1.aClass109_Sub5_Sub2_1916.method2573(-1);
				}

				var8.method2640(var7);
				var8.method1803(var2, var3, var5 - var3);
				if (var8.method2588()) {
					aClass109_Sub5_Sub1_2452.method2544(var8);
				}
			}
		}

		var1.aClass109_Sub5_Sub2_1916.method1803(var2, var3, var4);
	}

	static int getInterfaceSettingFor(InterfaceDef interfaceDef) {
		InterfaceSetting setting = (InterfaceSetting) GameClient.interfaceSettings.get(((long) (interfaceDef.hash * 1582464481) << 32) + (long) (interfaceDef.slot * -1395083971));
		return setting != null ? setting.value : interfaceDef.defaultSettings * 770935883;
	}

}
