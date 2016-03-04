import java.io.File;
import java.io.IOException;

public final class Class21 {

	int anInt258;
	int anInt259;
	static InterfaceDef aInterfaceDef_260;
	int anInt261;
	int anInt263;
	int anInt264;
	public CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_265;
	public CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_266;
	int anInt267;
	static Connection aConnection_269;
	int anInt270;
	public static final int anInt271 = 69;
	public int anInt262 = 0;
	int anInt268 = 0;

	static final void method346(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (CacheableEntry_Sub23_Sub11.anInt2336 * 1572449351 != var0 || Class24.anInt317 * -932948791 != var1 || GameClient.anInt2917 * 1286856103 != var2 && GameClient.aBool2864) {
			CacheableEntry_Sub23_Sub11.anInt2336 = var0 * -1338229385;
			Class24.anInt317 = var1 * -846461575;
			GameClient.anInt2917 = var2 * 1070529047;
			if (!GameClient.aBool2864) {
				GameClient.anInt2917 = 0;
			}

			Class93.method1146(25, 2118193131);
			Class53.method780(Class90.aString1082, true, -1714673297);
			int var13 = Class35.anInt478 * -1719983039;
			int var14 = LinkedEntry_Sub13.anInt1825 * 803568843;
			Class35.anInt478 = (var0 - 6) * -82354680;
			LinkedEntry_Sub13.anInt1825 = (var1 - 6) * -627030248;
			int var15 = Class35.anInt478 * -1719983039 - var13;
			int var17 = LinkedEntry_Sub13.anInt1825 * 803568843 - var14;
			var13 = Class35.anInt478 * -1719983039;
			var14 = LinkedEntry_Sub13.anInt1825 * 803568843;

			int var7;
			int var8;
			for (var7 = 0; var7 < 32768; var7++) {
				Npc var16 = GameClient.sceneNpcs[var7];
				if (var16 != null) {
					for (var8 = 0; var8 < 10; var8++) {
						var16.stepQueueX[var8] -= var15;
						var16.stepQueueY[var8] -= var17;
					}

					var16.anInt2521 -= var15 * 577025920;
					var16.anInt2505 -= var17 * 1219883136;
				}
			}

			for (var7 = 0; var7 < 2048; var7++) {
				Player var24 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var7];
				if (var24 != null) {
					for (var8 = 0; var8 < 10; var8++) {
						var24.stepQueueX[var8] -= var15;
						var24.stepQueueY[var8] -= var17;
					}

					var24.anInt2521 -= var15 * 577025920;
					var24.anInt2505 -= var17 * 1219883136;
				}
			}

			CacheableEntry_Sub23_Sub16_Sub3.anInt2577 = var2 * 1191917245;
			Player.me.method2942(var3, var4, false, (byte) 14);
			byte var22 = 0;
			byte var25 = 104;
			byte var23 = 1;
			if (var15 < 0) {
				var22 = 103;
				var25 = -1;
				var23 = -1;
			}

			byte var19 = 0;
			byte var18 = 104;
			byte var20 = 1;
			if (var17 < 0) {
				var19 = 103;
				var18 = -1;
				var20 = -1;
			}

			for (int var6 = var22; var6 != var25; var6 += var23) {
				for (int var10 = var19; var10 != var18; var10 += var20) {
					int var11 = var15 + var6;
					int var12 = var10 + var17;

					for (int var9 = 0; var9 < 4; var9++) {
						if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
							GameClient.aJagexLinkedListArrayArrayArray2998[var9][var6][var10] = GameClient.aJagexLinkedListArrayArrayArray2998[var9][var11][var12];
						} else {
							GameClient.aJagexLinkedListArrayArrayArray2998[var9][var6][var10] = null;
						}
					}
				}
			}

			for (LinkedEntry_Sub6 var21 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1405(); var21 != null; var21 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1402()) {
				var21.anInt1723 -= var15 * -401458613;
				var21.anInt1729 -= var17 * -1241200405;
				if (var21.anInt1723 * 754007907 < 0 || var21.anInt1729 * 1618190275 < 0 || var21.anInt1723 * 754007907 >= 104 || var21.anInt1729 * 1618190275 >= 104) {
					var21.unlink();
				}
			}

			if (GameClient.mapMarkerX * -1846442735 != 0) {
				GameClient.mapMarkerX -= var15 * -2075522063;
				GameClient.mapMarkerZ -= var17 * -700155223;
			}

			GameClient.anInt3075 = 0;
			GameClient.aBool3083 = false;
			GameClient.anInt3058 = -1611844029;
			GameClient.aJagexLinkedList_3001.method1394();
			GameClient.aJagexLinkedList_3000.method1394();
		}
	}

	public static Class135 method347(String var0, String var1, boolean var2, int var3) {
		File var4 = new File(Class83.aFile983, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				Class135 var11 = new Class135(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
				;
			}
		}

		String var5 = "";
		if (Class83.anInt992 * -960009521 == 33) {
			var5 = "_rc";
		} else if (Class83.anInt992 * -960009521 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(Class83.aString993, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		Class135 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new Class135(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
				;
			}
		}

		try {
			var7 = new Class135(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

}
