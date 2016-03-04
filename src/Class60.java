import java.awt.*;

public class Class60 {

	public static int anInt769;
	public static Canvas aCanvas771;
	static final int anInt773 = 20;
	public static final int anInt774 = 55;
	static int[] anIntArray775;
	static final int anInt777 = 33;
	public static final int anInt778 = 199;
	int[] anIntArray776;
	byte[] aByteArray770;
	int[] anIntArray772;

	public int method807(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
		int var7 = 0;
		int var8 = var5 << 3;

		for (var3 += var2; var2 < var3; var2++) {
			int var10 = var1[var2] & 255;
			int var14 = anIntArray776[var10];
			byte var9 = aByteArray770[var10];
			if (var9 == 0) {
				throw new RuntimeException("");
			}

			int var11 = var8 >> 3;
			int var13 = var8 & 7;
			var7 &= -var13 >> 31;
			int var12 = var11 + (var13 + var9 - 1 >> 3);
			var13 += 24;
			var4[var11] = (byte) (var7 |= var14 >>> var13);
			if (var11 < var12) {
				++var11;
				var13 -= 8;
				var4[var11] = (byte) (var7 = var14 >>> var13);
				if (var11 < var12) {
					++var11;
					var13 -= 8;
					var4[var11] = (byte) (var7 = var14 >>> var13);
					if (var11 < var12) {
						++var11;
						var13 -= 8;
						var4[var11] = (byte) (var7 = var14 >>> var13);
						if (var11 < var12) {
							++var11;
							var13 -= 8;
							var4[var11] = (byte) (var7 = var14 << -var13);
						}
					}
				}
			}

			var8 += var9;
		}

		return (var8 + 7 >> 3) - var5;
	}

	public Class60(byte[] var1) {
		int var6 = var1.length;
		anIntArray776 = new int[var6];
		aByteArray770 = var1;
		int[] var9 = new int[33];
		anIntArray772 = new int[8];
		int var3 = 0;

		for (int var5 = 0; var5 < var6; var5++) {
			byte var7 = var1[var5];
			if (var7 != 0) {
				int var8 = 1 << 32 - var7;
				int var10 = var9[var7];
				anIntArray776[var5] = var10;
				int var2;
				int var11;
				int var12;
				int var13;
				if ((var10 & var8) != 0) {
					var11 = var9[var7 - 1];
				} else {
					var11 = var10 | var8;

					for (var2 = var7 - 1; var2 >= 1; --var2) {
						var12 = var9[var2];
						if (var12 != var10) {
							break;
						}

						var13 = 1 << 32 - var2;
						if ((var12 & var13) != 0) {
							var9[var2] = var9[var2 - 1];
							break;
						}

						var9[var2] = var12 | var13;
					}
				}

				var9[var7] = var11;

				for (var2 = 1 + var7; var2 <= 32; var2++) {
					if (var9[var2] == var10) {
						var9[var2] = var11;
					}
				}

				var2 = 0;

				for (var12 = 0; var12 < var7; var12++) {
					var13 = -2147483648 >>> var12;
					if ((var10 & var13) != 0) {
						if (anIntArray772[var2] == 0) {
							anIntArray772[var2] = var3;
						}

						var2 = anIntArray772[var2];
					} else {
						++var2;
					}

					if (var2 >= anIntArray772.length) {
						int[] var14 = new int[anIntArray772.length * 2];

						for (int var4 = 0; var4 < anIntArray772.length; var4++) {
							var14[var4] = anIntArray772[var4];
						}

						anIntArray772 = var14;
					}

					var13 >>>= 1;
				}

				anIntArray772[var2] = ~var5;
				if (var2 >= var3) {
					var3 = var2 + 1;
				}
			}
		}

	}

	public int method812(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
		if (var5 == 0) {
			return 0;
		} else {
			int var7 = 0;
			var5 += var4;
			int var9 = var2;

			while (true) {
				byte var8 = var1[var9];
				if (var8 < 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				int var10;
				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 64) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 32) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 16) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 8) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 4) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 2) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var8 & 1) != 0) {
					var7 = anIntArray772[var7];
				} else {
					++var7;
				}

				if ((var10 = anIntArray772[var7]) < 0) {
					var3[var4++] = (byte) (~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				++var9;
			}

			return 1 + var9 - var2;
		}
	}

	static final void method814(int var0, int var1) {
		if (ItemContainer.method1840(var0)) {
			Class28.method392(InterfaceDef.aInterfaceDefArrayArray1975[var0], -1, 1023306095);
		}
	}

}
