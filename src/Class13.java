public class Class13 {

	static final float aFloat170 = 100.0F;
	static final int anInt171 = 4;
	static final float aFloat179 = 8.0F;
	static final float aFloat181 = 32.703197F;
	static float aFloat177;
	static int anInt178;
	int[] anIntArray175 = new int[2];
	int[][][] anIntArrayArrayArray172 = new int[2][2][4];
	int[][][] anIntArrayArrayArray173 = new int[2][2][4];
	int[] anIntArray174 = new int[2];
	static float[][] aFloatArrayArray180 = new float[2][8];
	static int[][] anIntArrayArray176 = new int[2][8];

	float method245(int var1, int var2, float var3) {
		float var4 = (float) anIntArrayArrayArray173[var1][0][var2] + var3 * (float) (anIntArrayArrayArray173[var1][1][var2] - anIntArrayArrayArray173[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	static float method246(float var0) {
		float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
		return var1 * 3.1415927F / 11025.0F;
	}

	float method247(int var1, int var2, float var3) {
		float var4 = (float) anIntArrayArrayArray172[var1][0][var2] + var3 * (float) (anIntArrayArrayArray172[var1][1][var2] - anIntArrayArrayArray172[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method246(var4);
	}

	int method248(int var1, float var2) {
		float var4;
		if (var1 == 0) {
			var4 = (float) anIntArray174[0] + (float) (anIntArray174[1] - anIntArray174[0]) * var2;
			var4 *= 0.0030517578F;
			aFloat177 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			anInt178 = (int) (aFloat177 * 65536.0F);
		}

		if (anIntArray175[var1] == 0) {
			return 0;
		} else {
			var4 = method245(var1, 0, var2);
			aFloatArrayArray180[var1][0] = -2.0F * var4 * (float) Math.cos((double) method247(var1, 0, var2));
			aFloatArrayArray180[var1][1] = var4 * var4;

			int var5;
			for (var5 = 1; var5 < anIntArray175[var1]; var5++) {
				var4 = method245(var1, var5, var2);
				float var6 = -2.0F * var4 * (float) Math.cos((double) method247(var1, var5, var2));
				float var7 = var4 * var4;
				aFloatArrayArray180[var1][var5 * 2 + 1] = aFloatArrayArray180[var1][var5 * 2 - 1] * var7;
				aFloatArrayArray180[var1][var5 * 2] = aFloatArrayArray180[var1][var5 * 2 - 1] * var6 + aFloatArrayArray180[var1][var5 * 2 - 2] * var7;

				for (int var3 = var5 * 2 - 1; var3 >= 2; --var3) {
					aFloatArrayArray180[var1][var3] += aFloatArrayArray180[var1][var3 - 1] * var6 + aFloatArrayArray180[var1][var3 - 2] * var7;
				}

				aFloatArrayArray180[var1][1] += aFloatArrayArray180[var1][0] * var6 + var7;
				aFloatArrayArray180[var1][0] += var6;
			}

			if (var1 == 0) {
				for (var5 = 0; var5 < anIntArray175[0] * 2; var5++) {
					aFloatArrayArray180[0][var5] *= aFloat177;
				}
			}

			for (var5 = 0; var5 < anIntArray175[var1] * 2; var5++) {
				anIntArrayArray176[var1][var5] = (int) (aFloatArrayArray180[var1][var5] * 65536.0F);
			}

			return anIntArray175[var1] * 2;
		}
	}

	final void method249(DataBuffer var1, Class11 var2) {
		int var3 = var1.readUByte();
		anIntArray175[0] = var3 >> 4;
		anIntArray175[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray174[0] = var1.readUShort();
			anIntArray174[1] = var1.readUShort();
			int var6 = var1.readUByte();

			int var4;
			int var5;
			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < anIntArray175[var4]; var5++) {
					anIntArrayArrayArray172[var4][0][var5] = var1.readUShort();
					anIntArrayArrayArray173[var4][0][var5] = var1.readUShort();
				}
			}

			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < anIntArray175[var4]; var5++) {
					if ((var6 & 1 << var4 * 4 << var5) != 0) {
						anIntArrayArrayArray172[var4][1][var5] = var1.readUShort();
						anIntArrayArrayArray173[var4][1][var5] = var1.readUShort();
					} else {
						anIntArrayArrayArray172[var4][1][var5] = anIntArrayArrayArray172[var4][0][var5];
						anIntArrayArrayArray173[var4][1][var5] = anIntArrayArrayArray173[var4][0][var5];
					}
				}
			}

			if (var6 != 0 || anIntArray174[1] != anIntArray174[0]) {
				var2.method230(var1);
			}
		} else {
			int[] var7 = anIntArray174;
			anIntArray174[1] = 0;
			var7[0] = 0;
		}

	}

}
