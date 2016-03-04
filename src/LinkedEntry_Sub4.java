public class LinkedEntry_Sub4 extends LinkedEntry {

	static final int anInt1689 = 1;
	static final int anInt1690 = 2;
	static final int anInt1693 = 3;
	static final int anInt1695 = 0;
	int[] anIntArray1700;
	boolean aBool1701 = false;
	int anInt1692;
	boolean aBool1699;
	int[] anIntArray1694;
	int[] anIntArray1688;
	int[] anIntArray1696;
	int[] anIntArray1697;
	int anInt1698;
	int anInt1691;
	static int[] anIntArray1702;

	boolean method1758(double var1, int var3, IndexDescriptor var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray1694.length; var5++) {
			if (var4.method1157(anIntArray1694[var5], (byte) -116) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		anIntArray1700 = new int[var5];

		for (int var9 = 0; var9 < anIntArray1694.length; var9++) {
			int var16 = anIntArray1694[var9];
			byte[] var14 = var4.method1184(var16, 1325486518);
			boolean var8;
			if (var14 == null) {
				var8 = false;
			} else {
				Class7_Sub1.method1793(var14, -1850242590);
				var8 = true;
			}

			CacheableEntry_Sub23_Sub14_Sub1 var15;
			if (!var8) {
				var15 = null;
			} else {
				var15 = Class30.method412(1975377584);
			}

			var15.method2970();
			var14 = var15.aByteArray2586;
			int[] var13 = var15.anIntArray2581;
			int var10 = anIntArray1697[var9];
			if ((var10 & -16777216) == 16777216) {
				;
			}

			if ((var10 & -16777216) == 33554432) {
				;
			}

			int var6;
			int var7;
			int var11;
			int var12;
			if ((var10 & -16777216) == 50331648) {
				var6 = var10 & 16711935;
				var12 = var10 >> 8 & 255;

				for (var11 = 0; var11 < var13.length; var11++) {
					var7 = var13[var11];
					if ((var7 & 65535) == var7 >> 8) {
						var7 &= 255;
						var13[var11] = var6 * var7 >> 8 & 16711935 | var12 * var7 & 65280;
					}
				}
			}

			for (var6 = 0; var6 < var13.length; var6++) {
				var13[var6] = CacheableEntry_Sub23_Sub14_Sub3.method3156(var13[var6], var1);
			}

			if (var9 == 0) {
				var6 = 0;
			} else {
				var6 = anIntArray1688[var9 - 1];
			}

			if (var9 == 0) {
				;
			}

			if (var6 == 0) {
				if (var15.anInt2585 == var3) {
					for (var12 = 0; var12 < var5; var12++) {
						anIntArray1700[var12] = var13[var14[var12] & 255];
					}
				} else if (var15.anInt2585 == 64 && var3 == 128) {
					var12 = 0;

					for (var11 = 0; var11 < var3; var11++) {
						for (var7 = 0; var7 < var3; var7++) {
							anIntArray1700[var12++] = var13[var14[(var7 >> 1) + (var11 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var15.anInt2585 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var12 = 0;

					for (var11 = 0; var11 < var3; var11++) {
						for (var7 = 0; var7 < var3; var7++) {
							anIntArray1700[var12++] = var13[var14[(var7 << 1) + (var11 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var6 == 1) {
				;
			}

			if (var6 == 2) {
				;
			}

			if (var6 == 3) {
				;
			}
		}

		return true;
	}

	void method1759() {
		anIntArray1700 = null;
	}

	LinkedEntry_Sub4(DataBuffer var1) {
		anInt1692 = var1.readUShort();
		aBool1699 = var1.readUByte() == 1;
		int var3 = var1.readUByte();
		if (var3 >= 1 && var3 <= 4) {
			anIntArray1694 = new int[var3];

			int var2;
			for (var2 = 0; var2 < var3; var2++) {
				anIntArray1694[var2] = var1.readUShort();
			}

			if (var3 > 1) {
				anIntArray1688 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; var2++) {
					anIntArray1688[var2] = var1.readUByte();
				}
			}

			if (var3 > 1) {
				anIntArray1696 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; var2++) {
					anIntArray1696[var2] = var1.readUByte();
				}
			}

			anIntArray1697 = new int[var3];

			for (var2 = 0; var2 < var3; var2++) {
				anIntArray1697[var2] = var1.readInt();
			}

			anInt1698 = var1.readUByte();
			anInt1691 = var1.readUByte();
			anIntArray1700 = null;
		} else {
			throw new RuntimeException();
		}
	}

	void method1763(int var1) {
		if (anIntArray1700 != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (anInt1698 == 1 || anInt1698 == 3) {
				if (anIntArray1702 == null || anIntArray1702.length < anIntArray1700.length) {
					anIntArray1702 = new int[anIntArray1700.length];
				}

				if (anIntArray1700.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var2 = anIntArray1700.length;
				var4 = var3 * var1 * anInt1691;
				var5 = var2 - 1;
				if (anInt1698 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var2; var6++) {
					var7 = var6 + var4 & var5;
					anIntArray1702[var6] = anIntArray1700[var7];
				}

				var10 = anIntArray1700;
				anIntArray1700 = anIntArray1702;
				anIntArray1702 = var10;
			}

			if (anInt1698 == 2 || anInt1698 == 4) {
				if (anIntArray1702 == null || anIntArray1702.length < anIntArray1700.length) {
					anIntArray1702 = new int[anIntArray1700.length];
				}

				if (anIntArray1700.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var2 = anIntArray1700.length;
				var4 = var1 * anInt1691;
				var5 = var3 - 1;
				if (anInt1698 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var2; var6 += var3) {
					for (var7 = 0; var7 < var3; var7++) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						anIntArray1702[var8] = anIntArray1700[var9];
					}
				}

				var10 = anIntArray1700;
				anIntArray1700 = anIntArray1702;
				anIntArray1702 = var10;
			}

		}
	}

}
