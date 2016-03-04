public class Class49 {

	static final int anInt680 = 3;
	int anInt681;
	static final int anInt682 = 400;
	int anInt683;
	static final int anInt684 = 0;
	public static final int anInt685 = 254;
	public static final int anInt686 = 105;
	int anInt687;

	static final void method707(CacheableEntry_Sub23_Sub16_Sub2 var0, int var1) {
		int var2 = var0.anInt2540 * 1613108255 - GameClient.cycle * 1026470457;
		int var4 = var0.dx1 * -1540093824 + var0.anInt2508 * -1408204480;
		int var3 = var0.anInt2508 * -1408204480 + var0.anInt2548 * 1615118976;
		var0.anInt2521 += (var4 - var0.anInt2521 * -1051150961) / var2 * 373606767;
		var0.anInt2505 += (var3 - var0.anInt2505 * -844883935) / var2 * -1030657055;
		var0.anInt2562 = 0;
		if (var0.anInt2552 * 894665061 == 0) {
			var0.spawnDirection = 544009216;
		}

		if (var0.anInt2552 * 894665061 == 1) {
			var0.spawnDirection = 816013824;
		}

		if (var0.anInt2552 * 894665061 == 2) {
			var0.spawnDirection = 0;
		}

		if (var0.anInt2552 * 894665061 == 3) {
			var0.spawnDirection = 272004608;
		}

	}

	static void method708(int var0, int var1, int var2) {
		int[] var3 = new int[4];
		int[] var5 = new int[4];
		var3[0] = var0;
		var5[0] = var1;
		int var6 = 1;

		for (int var4 = 0; var4 < 4; var4++) {
			if (Class51.anIntArray702[var4] != var0) {
				var3[var6] = Class51.anIntArray702[var4];
				var5[var6] = Class51.anIntArray705[var4];
				++var6;
			}
		}

		Class51.anIntArray702 = var3;
		Class51.anIntArray705 = var5;
		Class72.method963(Class4.aClass51Array80, 0, Class4.aClass51Array80.length - 1, Class51.anIntArray702, Class51.anIntArray705, -525879552);
	}

}
