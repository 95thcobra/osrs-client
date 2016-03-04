import java.util.zip.CRC32;

public class IndexDescriptor_Sub1 extends IndexDescriptor {

	volatile boolean aBool1920 = false;
	boolean aBool1925 = false;
	int anInt1926 = -1514324787;
	PacketEncoder aClass68_1924;
	PacketEncoder aClass68_1921;
	int anInt1919;
	int anInt1918;
	int anInt1917;
	static CRC32 aCRC32_1923 = new CRC32();
	volatile boolean[] aBoolArray1922;

	public IndexDescriptor_Sub1(PacketEncoder var1, PacketEncoder var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		aClass68_1924 = var1;
		aClass68_1921 = var2;
		anInt1919 = var3 * 228536573;
		aBool1925 = var6;
		int var9 = anInt1919 * -2055050155;
		if (Class72.aDataBuffer_874 != null) {
			Class72.aDataBuffer_874.pos = var9 * 1841773192 - 2070117227;
			int var7 = Class72.aDataBuffer_874.readInt();
			int var10 = Class72.aDataBuffer_874.readInt();
			method2129(var7, var10, (byte) 31);
		} else {
			Class65.method889((IndexDescriptor_Sub1) null, 255, 255, 0, (byte) 0, true, -1157195930);
			Class97.aClass94_Sub1Array1392[var9] = this;
		}

	}

	public int method2128(int var1) {
		if (aBool1920) {
			return 100;
		} else if (anObjectArray1356 != null) {
			return 99;
		} else {
			int var2 = anInt1919 * -2055050155;
			long var3 = (long) (16711680 + var2);
			int var5;
			if (DataBuffer.aClass109_Sub23_Sub19_1831 != null && DataBuffer.aClass109_Sub23_Sub19_1831.key == var3) {
				var5 = Class97.aDataBuffer_1389.pos * 139913075 / (Class97.aDataBuffer_1389.data.length - DataBuffer.aClass109_Sub23_Sub19_1831.aByte2447) + 1;
			} else {
				var5 = 0;
			}

			int var6 = var5;
			if (var5 >= 100) {
				var6 = 99;
			}

			return var6;
		}
	}

	void method1150(int var1, int var2) {
		Class75.method1026(anInt1919 * -2055050155, var1, -1936020946);
	}

	void method1158(int var1, int var2) {
		if (aClass68_1924 != null && aBoolArray1922 != null && aBoolArray1922[var1]) {
			PacketEncoder var3 = aClass68_1924;
			byte[] var5 = null;
			JagexLinkedList var6 = Class100.aJagexLinkedList_1416;
			synchronized (var6) {
				for (LinkedEntry_Sub20 var7 = (LinkedEntry_Sub20) Class100.aJagexLinkedList_1416.method1405(); var7 != null; var7 = (LinkedEntry_Sub20) Class100.aJagexLinkedList_1416.method1402()) {
					if ((long) var1 == var7.key && var3 == var7.aClass68_2073 && var7.anInt2071 * 1295328921 == 0) {
						var5 = var7.aByteArray2072;
						break;
					}
				}
			}

			if (var5 != null) {
				method2142(var3, var1, var5, true, (byte) 76);
			} else {
				byte[] var10 = var3.method914(var1, (short) -12461);
				method2142(var3, var1, var10, true, (byte) 76);
			}
		} else {
			Class65.method889(this, anInt1919 * -2055050155, var1, anIntArray1350[var1], (byte) 2, true, -1057562373);
		}

	}

	void method2129(int var1, int var2, byte var3) {
		anInt1918 = var1 * -490005189;
		anInt1917 = var2 * -1206896251;
		if (aClass68_1921 != null) {
			int var4 = anInt1919 * -2055050155;
			PacketEncoder var5 = aClass68_1921;
			byte[] var7 = null;
			JagexLinkedList var8 = Class100.aJagexLinkedList_1416;
			synchronized (var8) {
				for (LinkedEntry_Sub20 var9 = (LinkedEntry_Sub20) Class100.aJagexLinkedList_1416.method1405(); var9 != null; var9 = (LinkedEntry_Sub20) Class100.aJagexLinkedList_1416.method1402()) {
					if ((long) var4 == var9.key && var5 == var9.aClass68_2073 && var9.anInt2071 * 1295328921 == 0) {
						var7 = var9.aByteArray2072;
						break;
					}
				}
			}

			if (var7 != null) {
				method2142(var5, var4, var7, true, (byte) 76);
			} else {
				byte[] var12 = var5.method914(var4, (short) -18625);
				method2142(var5, var4, var12, true, (byte) 76);
			}
		} else {
			Class65.method889(this, 255, anInt1919 * -2055050155, anInt1918 * -82201613, (byte) 0, true, 372314142);
		}

	}

	void method2130(int var1, byte[] var2, boolean var3, boolean var4, byte var5) {
		if (var3) {
			if (aBool1920) {
				throw new RuntimeException();
			}

			if (aClass68_1921 != null) {
				Class84.method1090(anInt1919 * -2055050155, var2, aClass68_1921, -1632343179);
			}

			method1149(var2, (byte) -54);
			method2140((short) 19021);
		} else {
			var2[var2.length - 2] = (byte) (anIntArray1351[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray1351[var1];
			if (aClass68_1924 != null) {
				Class84.method1090(var1, var2, aClass68_1924, -881327614);
				aBoolArray1922[var1] = true;
			}

			if (var4) {
				anObjectArray1356[var1] = Class23.method353(var2, false, 823216343);
			}
		}

	}

	int method2132(int var1, int var2) {
		if (anObjectArray1356[var1] != null) {
			return 100;
		} else if (aBoolArray1922[var1]) {
			return 100;
		} else {
			int var4 = anInt1919 * -2055050155;
			long var5 = (long) ((var4 << 16) + var1);
			int var3;
			if (DataBuffer.aClass109_Sub23_Sub19_1831 != null && var5 == DataBuffer.aClass109_Sub23_Sub19_1831.key) {
				var3 = Class97.aDataBuffer_1389.pos * 139913075 / (Class97.aDataBuffer_1389.data.length - DataBuffer.aClass109_Sub23_Sub19_1831.aByte2447) + 1;
			} else {
				var3 = 0;
			}

			return var3;
		}
	}

	public int method2133(byte var1) {
		int var2 = 0;
		int var4 = 0;

		int var3;
		for (var3 = 0; var3 < anObjectArray1356.length; var3++) {
			if (anIntArray1359[var3] > 0) {
				var2 += 100;
				var4 += method2132(var3, 1468586090);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var3 = var4 * 100 / var2;
			return var3;
		}
	}

	void method2140(short var1) {
		aBoolArray1922 = new boolean[anObjectArray1356.length];

		int var2;
		for (var2 = 0; var2 < aBoolArray1922.length; var2++) {
			aBoolArray1922[var2] = false;
		}

		if (aClass68_1924 == null) {
			aBool1920 = true;
		} else {
			anInt1926 = -1514324787;

			for (var2 = 0; var2 < aBoolArray1922.length; var2++) {
				if (anIntArray1359[var2] > 0) {
					PacketEncoder var3 = aClass68_1924;
					LinkedEntry_Sub20 var5 = new LinkedEntry_Sub20();
					var5.anInt2071 = 95014313;
					var5.key = (long) var2;
					var5.aClass68_2073 = var3;
					var5.aClass94_Sub1_2074 = this;
					JagexLinkedList var6 = Class100.aJagexLinkedList_1416;
					synchronized (var6) {
						Class100.aJagexLinkedList_1416.add(var5);
					}

					Object var11 = Class100.anObject1411;
					synchronized (var11) {
						if (Class100.anInt1410 * 1739579873 == 0) {
							Class50.aClass73_693.submitRunnable(new Class100(), 5, (byte) 7);
						}

						Class100.anInt1410 = 825228632;
					}

					anInt1926 = var2 * 1514324787;
				}
			}

			if (anInt1926 * 1115353083 == -1) {
				aBool1920 = true;
			}

		}
	}

	public void method2142(PacketEncoder var1, int var2, byte[] var3, boolean var4, byte var5) {
		int var6;
		if (aClass68_1921 == var1) {
			if (aBool1920) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Class65.method889(this, 255, anInt1919 * -2055050155, anInt1918 * -82201613, (byte) 0, true, -928304657);
				return;
			}

			aCRC32_1923.reset();
			aCRC32_1923.update(var3, 0, var3.length);
			var6 = (int) aCRC32_1923.getValue();
			DataBuffer var10 = new DataBuffer(Class70.method938(var3, 1163672584));
			int var9 = var10.readUByte();
			if (var9 != 5 && var9 != 6) {
				throw new RuntimeException(var9 + "," + anInt1919 * -2055050155 + "," + var2);
			}

			int var8 = 0;
			if (var9 >= 6) {
				var8 = var10.readInt();
			}

			if (anInt1918 * -82201613 != var6 || var8 != anInt1917 * -2003773619) {
				Class65.method889(this, 255, anInt1919 * -2055050155, anInt1918 * -82201613, (byte) 0, true, -1321541974);
				return;
			}

			method1149(var3, (byte) -13);
			method2140((short) 17017);
		} else {
			if (!var4 && anInt1926 * 1115353083 == var2) {
				aBool1920 = true;
			}

			if (var3 == null || var3.length <= 2) {
				aBoolArray1922[var2] = false;
				if (aBool1925 || var4) {
					Class65.method889(this, anInt1919 * -2055050155, var2, anIntArray1350[var2], (byte) 2, var4, -723131359);
				}

				return;
			}

			aCRC32_1923.reset();
			aCRC32_1923.update(var3, 0, var3.length - 2);
			var6 = (int) aCRC32_1923.getValue();
			int var7 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
			if (anIntArray1350[var2] != var6 || anIntArray1351[var2] != var7) {
				aBoolArray1922[var2] = false;
				if (aBool1925 || var4) {
					Class65.method889(this, anInt1919 * -2055050155, var2, anIntArray1350[var2], (byte) 2, var4, -1042579896);
				}

				return;
			}

			aBoolArray1922[var2] = true;
			if (var4) {
				anObjectArray1356[var2] = Class23.method353(var3, false, 380979276);
			}
		}

	}

	public static void method2148(int var0, int var1) {
		Class104.anInt1454 = -438370161;
		Class104.aIndexDescriptor_1457 = null;
		Class104.anInt1459 = 534518349;
		Class104.anInt1458 = -387363359;
		Class104.anInt1450 = 0;
		Class99.aBool1407 = false;
		Class29.anInt362 = var0 * 23246755;
	}

}
