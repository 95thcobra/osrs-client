public class Class8 {

	static final int anInt117 = 22050;
	int anInt116;
	int anInt114;
	Class12[] aClass12Array115 = new Class12[10];

	final byte[] method181() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass12Array115[var2] != null && aClass12Array115[var2].anInt159 + aClass12Array115[var2].anInt144 > var1) {
				var1 = aClass12Array115[var2].anInt159 + aClass12Array115[var2].anInt144;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var8 = 0; var8 < 10; var8++) {
				if (aClass12Array115[var8] != null) {
					int var9 = aClass12Array115[var8].anInt159 * 22050 / 1000;
					int var5 = aClass12Array115[var8].anInt144 * 22050 / 1000;
					int[] var6 = aClass12Array115[var8].method233(var9, aClass12Array115[var8].anInt159);

					for (int var4 = 0; var4 < var9; var4++) {
						int var7 = var3[var4 + var5] + (var6[var4] >> 8);
						if ((var7 + 128 & -256) != 0) {
							var7 = var7 >> 31 ^ 127;
						}

						var3[var4 + var5] = (byte) var7;
					}
				}
			}

			return var3;
		}
	}

	public LinkedEntry_Sub1_Sub1 method182() {
		byte[] var1 = method181();
		return new LinkedEntry_Sub1_Sub1(22050, var1, anInt116 * 22050 / 1000, anInt114 * 22050 / 1000);
	}

	public final int method183() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (aClass12Array115[var2] != null && aClass12Array115[var2].anInt144 / 20 < var1) {
				var1 = aClass12Array115[var2].anInt144 / 20;
			}
		}

		if (anInt116 < anInt114 && anInt116 / 20 < var1) {
			var1 = anInt116 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; var2++) {
				if (aClass12Array115[var2] != null) {
					aClass12Array115[var2].anInt144 -= var1 * 20;
				}
			}

			if (anInt116 < anInt114) {
				anInt116 -= var1 * 20;
				anInt114 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	public static Class8 method184(IndexDescriptor var0, int var1, int var2) {
		byte[] var3 = var0.getFileData(var1, var2);
		return var3 == null ? null : new Class8(new DataBuffer(var3));
	}

	Class8(DataBuffer var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = var1.readUByte();
			if (var3 != 0) {
				var1.pos -= 1303963473;
				aClass12Array115[var2] = new Class12();
				aClass12Array115[var2].method235(var1);
			}
		}

		anInt116 = var1.readUShort();
		anInt114 = var1.readUShort();
	}

}
