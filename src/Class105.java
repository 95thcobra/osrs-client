public class Class105 {

	static final int anInt1461 = 1;
	static final int anInt1463 = 3;
	static final int anInt1468 = 500000;
	static final int anInt1471 = 0;
	static final int anInt1473 = 2;
	DataBuffer aDataBuffer_1465 = new DataBuffer((byte[]) null);
	int anInt1462;
	int anInt1467;
	int[] anIntArray1464;
	long aLong1469;
	int[] anIntArray1470;
	int[] anIntArray1474;
	int[] anIntArray1466;
	static byte[] aByteArray1472 = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

	Class105(byte[] var1) {
		method1282(var1);
	}

	void method1282(byte[] var1) {
		aDataBuffer_1465.data = var1;
		aDataBuffer_1465.pos = 154732842;
		int var3 = aDataBuffer_1465.readUShort();
		anInt1462 = aDataBuffer_1465.readUShort();
		anInt1467 = 500000;
		anIntArray1464 = new int[var3];

		int var4;
		int var5;
		for (var4 = 0; var4 < var3; aDataBuffer_1465.pos += var5 * 1303963473) {
			int var2 = aDataBuffer_1465.readInt();
			var5 = aDataBuffer_1465.readInt();
			if (var2 == 1297379947) {
				anIntArray1464[var4] = aDataBuffer_1465.pos * 1736753585;
				++var4;
			}
		}

		aLong1469 = 0L;
		anIntArray1470 = new int[var3];

		for (var4 = 0; var4 < var3; var4++) {
			anIntArray1470[var4] = anIntArray1464[var4];
		}

		anIntArray1474 = new int[var3];
		anIntArray1466 = new int[var3];
	}

	boolean method1283() {
		int var1 = anIntArray1470.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (anIntArray1470[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method1286() {
		aDataBuffer_1465.data = null;
		anIntArray1464 = null;
		anIntArray1470 = null;
		anIntArray1474 = null;
		anIntArray1466 = null;
	}

	void method1287(int var1) {
		anIntArray1470[var1] = aDataBuffer_1465.pos * 1736753585;
	}

	void method1288() {
		aDataBuffer_1465.pos = -1303963473;
	}

	int method1289(int var1) {
		int var2 = method1291(var1);
		return var2;
	}

	void method1290(int var1) {
		aDataBuffer_1465.pos = anIntArray1470[var1] * 1303963473;
	}

	int method1291(int var1) {
		byte var2 = aDataBuffer_1465.data[aDataBuffer_1465.pos * 1736753585];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray1466[var1] = var5;
			aDataBuffer_1465.pos += 1303963473;
		} else {
			var5 = anIntArray1466[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return method1337(var1, var5);
		} else {
			int var3 = aDataBuffer_1465.method2075(-2040339769);
			if (var5 == 247 && var3 > 0) {
				int var4 = aDataBuffer_1465.data[aDataBuffer_1465.pos * 1736753585] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					aDataBuffer_1465.pos += 1303963473;
					anIntArray1466[var1] = var4;
					return method1337(var1, var4);
				}
			}

			aDataBuffer_1465.pos += var3 * 1303963473;
			return 0;
		}
	}

	int method1294() {
		int var1 = anIntArray1470.length;
		int var4 = -1;
		int var3 = 2147483647;

		for (int var2 = 0; var2 < var1; var2++) {
			if (anIntArray1470[var2] >= 0 && anIntArray1474[var2] < var3) {
				var4 = var2;
				var3 = anIntArray1474[var2];
			}
		}

		return var4;
	}

	void method1295(long var1) {
		aLong1469 = var1;
		int var4 = anIntArray1470.length;

		for (int var3 = 0; var3 < var4; var3++) {
			anIntArray1474[var3] = 0;
			anIntArray1466[var3] = 0;
			aDataBuffer_1465.pos = anIntArray1464[var3] * 1303963473;
			method1315(var3);
			anIntArray1470[var3] = aDataBuffer_1465.pos * 1736753585;
		}

	}

	boolean method1297() {
		return aDataBuffer_1465.data != null;
	}

	Class105() {
	}

	void method1315(int var1) {
		int var2 = aDataBuffer_1465.method2075(-2040339769);
		anIntArray1474[var1] += var2;
	}

	long method1327(int var1) {
		return aLong1469 + (long) var1 * (long) anInt1467;
	}

	int method1336() {
		return anIntArray1470.length;
	}

	int method1337(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = aDataBuffer_1465.readUByte();
			var4 = aDataBuffer_1465.method2075(-2040339769);
			if (var7 == 47) {
				aDataBuffer_1465.pos += var4 * 1303963473;
				return 1;
			} else if (var7 == 81) {
				int var5 = aDataBuffer_1465.readTriByte();
				var4 -= 3;
				int var6 = anIntArray1474[var1];
				aLong1469 += (long) var6 * (long) (anInt1467 - var5);
				anInt1467 = var5;
				aDataBuffer_1465.pos += var4 * 1303963473;
				return 2;
			} else {
				aDataBuffer_1465.pos += var4 * 1303963473;
				return 3;
			}
		} else {
			byte var3 = aByteArray1472[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | aDataBuffer_1465.readUByte() << 8;
			}

			if (var3 >= 2) {
				var4 |= aDataBuffer_1465.readUByte() << 16;
			}

			return var4;
		}
	}

}
