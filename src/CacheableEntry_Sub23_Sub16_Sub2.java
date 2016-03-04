import java.awt.*;

public abstract class CacheableEntry_Sub23_Sub16_Sub2 extends CacheableEntry_Sub23_Sub16 {

	int direction;
	int spawnDirection;
	boolean aBool2518;
	static int[] mapFileIds;
	static final int anInt2526 = 4;
	int anInt2528;
	int anInt2529;
	int anInt2539;
	int anInt2540;
	int anInt2544;
	int anInt2545;
	int dx1;
	int dx2;
	int anInt2548;
	int anInt2549;
	static int anInt2550;
	int anInt2552;
	public static final int anInt2566 = 79;
	static final int anInt2567 = 2;
	static int anInt2568;
	int anInt2536 = -1940983775;
	int anInt2558 = 0;
	int anInt2563 = 0;
	int anInt2562 = 0;
	int anInt2521;
	int anInt2505;
	boolean aBool2507 = false;
	int anInt2508 = 1093548749;
	int anInt2509 = 597073351;
	int anInt2510 = -204914649;
	int anInt2551 = 1850759487;
	int anInt2524 = -125633893;
	int anInt2520 = -946961373;
	int anInt2514 = -1823978411;
	int anInt2564 = 4348545;
	int anInt2516 = -1732914689;
	String aString2523 = null;
	boolean aBool2519 = false;
	int anInt2511 = -91011604;
	int anInt2513 = 0;
	int anInt2522 = 0;
	int[] hitValues = new int[4];
	int[] hitTypes = new int[4];
	int[] hitDelays = new int[4];
	int anInt2527 = 980590312;
	int facedEntity = -357265433;
	int anInt2531 = 0;
	int anInt2532 = 0;
	int anInt2556 = 304340693;
	int anInt2534 = 0;
	int anInt2535 = 0;
	int anInt2537 = 0;
	int anInt2538 = 0;
	int anInt2517 = 0;
	int anInt2515 = 0;
	int anInt2541 = -1325550547;
	int anInt2542 = 0;
	int anInt2543 = 0;
	int lastSync = 0;
	int anInt2554 = -1461519176;
	int anInt2504 = 0;
	int anInt2557 = 656788448;
	int[] stepQueueX = new int[10];
	int[] stepQueueY = new int[10];
	boolean[] queueRunFlag = new boolean[10];

	final void method2942(int var1, int var2, boolean var3, byte var4) {
		if (anInt2536 * 1287875615 != -1 && CacheableEntry_Sub23_Sub11.getAnimation(anInt2536 * 1287875615).anInt2173 * 1962873195 == 1) {
			anInt2536 = -1940983775;
		}

		if (!var3) {
			int var7 = var1 - stepQueueX[0];
			int var5 = var2 - stepQueueY[0];
			if (var7 >= -8 && var7 <= 8 && var5 >= -8 && var5 <= 8) {
				if (anInt2558 * -1429276161 < 9) {
					anInt2558 -= 519240193;
				}

				for (int var6 = anInt2558 * -1429276161; var6 > 0; --var6) {
					stepQueueX[var6] = stepQueueX[var6 - 1];
					stepQueueY[var6] = stepQueueY[var6 - 1];
					queueRunFlag[var6] = queueRunFlag[var6 - 1];
				}

				stepQueueX[0] = var1;
				stepQueueY[0] = var2;
				queueRunFlag[0] = false;
				return;
			}
		}

		anInt2558 = 0;
		anInt2563 = 0;
		anInt2562 = 0;
		stepQueueX[0] = var1;
		stepQueueY[0] = var2;
		anInt2521 = stepQueueX[0] * 577025920 + anInt2508 * 1705200320;
		anInt2505 = stepQueueY[0] * 1219883136 + anInt2508 * -708355776;
	}

	final void moveInDirection(int dir, boolean run) {
		int var4 = stepQueueX[0];
		int var6 = stepQueueY[0];
		if (dir == 0) {
			--var4;
			++var6;
		}

		if (dir == 1) {
			++var6;
		}

		if (dir == 2) {
			++var4;
			++var6;
		}

		if (dir == 3) {
			--var4;
		}

		if (dir == 4) {
			++var4;
		}

		if (dir == 5) {
			--var4;
			--var6;
		}

		if (dir == 6) {
			--var6;
		}

		if (dir == 7) {
			++var4;
			--var6;
		}

		if (anInt2536 * 1287875615 != -1 && CacheableEntry_Sub23_Sub11.getAnimation(anInt2536 * 1287875615).anInt2173 * 1962873195 == 1) {
			anInt2536 = -1940983775;
		}

		if (anInt2558 * -1429276161 < 9) {
			anInt2558 -= 519240193;
		}

		for (int var5 = anInt2558 * -1429276161; var5 > 0; --var5) {
			stepQueueX[var5] = stepQueueX[var5 - 1];
			stepQueueY[var5] = stepQueueY[var5 - 1];
			queueRunFlag[var5] = queueRunFlag[var5 - 1];
		}

		stepQueueX[0] = var4;
		stepQueueY[0] = var6;
		queueRunFlag[0] = run;
	}

	boolean method2945(int var1) {
		return false;
	}

	public static RenderedItemImage method2948(IndexDescriptor var0, String var1, String var2, byte var3) {
		int var4 = var0.method1170(var1);
		int var5 = var0.method1165(var4, var2, (byte) -22);
		return Player.takeItemSnapshot(var0, var4, var5, 1533436780);
	}

	final void addHit(int value, int type, int delay) {
		for (int hitIndex = 0; hitIndex < 4; hitIndex++) {
			if (hitDelays[hitIndex] <= delay) {
				hitValues[hitIndex] = value;
				hitTypes[hitIndex] = type;
				hitDelays[hitIndex] = delay + 70;
				return;
			}
		}

	}

	static boolean method2962(IndexDescriptor var0, int var1, int var2, int var3) {
		byte[] var4 = var0.getFileData(var1, var2);
		if (var4 == null) {
			return false;
		} else {
			Class7_Sub1.method1793(var4, -1668317899);
			return true;
		}
	}

	final void method2963(int var1) {
		anInt2558 = 0;
		anInt2563 = 0;
	}

	public static boolean method2964(char var0, byte var1) {
		return var0 >= 32 && var0 <= 126 ? true : (var0 >= 160 && var0 <= 255 ? true : var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376);
	}

	static void method2965(Component var0, IndexDescriptor var1, IndexDescriptor var2, boolean var3, int var4, int var5) {
		if (Class3.aBool63) {
			if (var4 == 4) {
				Class3.anInt57 = 1063267524;
			}

		} else {
			Class3.anInt57 = var4 * -807924943;
			CacheableEntry_Sub23_Sub14.method2716();
			byte[] var7 = var1.method1166("title.jpg", "", (byte) 0);
			Class134.aClass109_Sub23_Sub14_Sub2_1599 = new RenderedItemImage(var7, var0);
			Class3.aClass109_Sub23_Sub14_Sub2_45 = Class134.aClass109_Sub23_Sub14_Sub2_1599.method3019();
			Class106.aClass109_Sub23_Sub14_Sub1_1475 = Class19.method342(var2, "logo", "", (byte) 96);
			Class3.aClass109_Sub23_Sub14_Sub1_43 = Class19.method342(var2, "titlebox", "", (byte) 96);
			Class3.aClass109_Sub23_Sub14_Sub1_44 = Class19.method342(var2, "titlebutton", "", (byte) 96);
			ItemDef.aClass109_Sub23_Sub14_Sub1Array2140 = Class24.method359(var2, "runes", "", -1685738212);
			Class118.aClass109_Sub23_Sub14_Sub1Array1537 = Class24.method359(var2, "title_mute", "", -1519444044);
			Class3.aClass109_Sub23_Sub14_Sub1_41 = Class19.method342(var2, "options_radio_buttons,0", "", (byte) 96);
			Class42.aClass109_Sub23_Sub14_Sub1_605 = Class19.method342(var2, "options_radio_buttons,2", "", (byte) 96);
			Class33.anIntArray430 = new int[256];

			int var6;
			for (var6 = 0; var6 < 64; var6++) {
				Class33.anIntArray430[var6] = var6 * 262144;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class33.anIntArray430[var6 + 64] = var6 * 1024 + 16711680;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class33.anIntArray430[var6 + 128] = 16776960 + var6 * 4;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class33.anIntArray430[var6 + 192] = 16777215;
			}

			Class51.anIntArray706 = new int[256];

			for (var6 = 0; var6 < 64; var6++) {
				Class51.anIntArray706[var6] = var6 * 1024;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class51.anIntArray706[64 + var6] = var6 * 4 + 65280;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class51.anIntArray706[128 + var6] = var6 * 262144 + 65535;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class51.anIntArray706[var6 + 192] = 16777215;
			}

			Class42.anIntArray598 = new int[256];

			for (var6 = 0; var6 < 64; var6++) {
				Class42.anIntArray598[var6] = var6 * 4;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class42.anIntArray598[var6 + 64] = 255 + var6 * 262144;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class42.anIntArray598[128 + var6] = 16711935 + var6 * 1024;
			}

			for (var6 = 0; var6 < 64; var6++) {
				Class42.anIntArray598[192 + var6] = 16777215;
			}

			Class60.anIntArray775 = new int[256];
			Class66.anIntArray840 = new int[32768];
			Class136.anIntArray1606 = new int[32768];
			ScriptInvocation.method1837((CacheableEntry_Sub23_Sub14_Sub1) null);
			Class30.anIntArray382 = new int[32768];
			CacheableEntry_Sub23_Sub16_Sub4.anIntArray2617 = new int[32768];
			if (var3) {
				Class3.aString55 = "";
				Class3.password = "";
			}

			Class107.anInt1499 = 0;
			Class126_Sub1.aString1646 = "";
			Class3.aBool75 = true;
			Class3.aBool69 = false;
			if (!Class15.aClass35_195.aBool473) {
				IndexDescriptor_Sub1 var10 = Class46.aClass94_Sub1_652;
				int var8 = var10.method1170("scape main");
				int var9 = var10.method1165(var8, "", (byte) 3);
				Class104.anInt1454 = -438370161;
				Class104.aIndexDescriptor_1457 = var10;
				Class104.anInt1459 = var8 * -534518349;
				Class104.anInt1458 = var9 * 387363359;
				Class104.anInt1450 = -1900323351;
				Class99.aBool1407 = false;
				Class29.anInt362 = 46493510;
			} else {
				IndexDescriptor_Sub1.method2148(2, 642335533);
			}

			GameClient.method3561(false, (byte) 27);
			Class3.aBool63 = true;
			Class3.anInt42 = (Class5.anInt98 * 2104430923 - GameClient.anInt3082 * 1386143757) / 2 * -1646540671;
			Class3.anInt47 = Class3.anInt42 * -2012744469 - 1809848210;
			Class134.aClass109_Sub23_Sub14_Sub2_1599.method2995(Class3.anInt42 * -468945023, 0);
			Class3.aClass109_Sub23_Sub14_Sub2_45.method2995(Class3.anInt42 * -468945023 + 382, 0);
			Class106.aClass109_Sub23_Sub14_Sub1_1475.method2972(Class3.anInt42 * -468945023 + 382 - Class106.aClass109_Sub23_Sub14_Sub1_1475.anInt2585 / 2, 18);
		}
	}

}
