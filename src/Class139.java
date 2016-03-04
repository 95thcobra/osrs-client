import java.io.EOFException;
import java.io.IOException;

public class Class139 {

	static final int anInt1627 = 131072;
	long aLong1620;
	long aLong1624;
	long aLong1621 = -1519131692448356851L;
	int anInt1622 = 0;
	long aLong1623;
	long aLong1618 = -4616036392415095063L;
	Class135 aClass135_1626;
	long aLong1625;
	byte[] aByteArray1617;
	byte[] aByteArray1616;
	int anInt1619;

	void method1657(byte var1) throws IOException {
		if (-5559158498415728837L * aLong1621 != -1L) {
			if (aLong1620 * -2440560027465476073L != aLong1621 * -5559158498415728837L) {
				aClass135_1626.method1639(aLong1621 * -5559158498415728837L);
				aLong1620 = aLong1621 * 8952027914391927933L;
			}

			aClass135_1626.method1650(aByteArray1616, 0, anInt1622 * 1081893979, -1483506203);
			aLong1620 += 6994872256333544541L * (long) anInt1622;
			if (-2440560027465476073L * aLong1620 > aLong1624 * 8974096889506238785L) {
				aLong1624 = -1001945501943956649L * aLong1620;
			}

			long var4 = -1L;
			long var2 = -1L;
			if (-5559158498415728837L * aLong1621 >= aLong1618 * 7541634135136558759L && aLong1621 * -5559158498415728837L < aLong1618 * 7541634135136558759L + (long) (anInt1619 * -333507863)) {
				var4 = -5559158498415728837L * aLong1621;
			} else if (7541634135136558759L * aLong1618 >= -5559158498415728837L * aLong1621 && aLong1618 * 7541634135136558759L < -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979)) {
				var4 = aLong1618 * 7541634135136558759L;
			}

			if (-5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979) > aLong1618 * 7541634135136558759L && -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979) <= (long) (anInt1619 * -333507863) + aLong1618 * 7541634135136558759L) {
				var2 = aLong1621 * -5559158498415728837L + (long) (anInt1622 * 1081893979);
			} else if ((long) (anInt1619 * -333507863) + aLong1618 * 7541634135136558759L > aLong1621 * -5559158498415728837L && 7541634135136558759L * aLong1618 + (long) (anInt1619 * -333507863) <= -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979)) {
				var2 = (long) (anInt1619 * -333507863) + aLong1618 * 7541634135136558759L;
			}

			if (var4 > -1L && var2 > var4) {
				int var6 = (int) (var2 - var4);
				System.arraycopy(aByteArray1616, (int) (var4 - -5559158498415728837L * aLong1621), aByteArray1617, (int) (var4 - 7541634135136558759L * aLong1618), var6);
			}

			aLong1621 = -1519131692448356851L;
			anInt1622 = 0;
		}

	}

	public void method1658(int var1) throws IOException {
		method1657((byte) 0);
		aClass135_1626.method1641(971825942);
	}

	public void method1659(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			aLong1623 = 6387178279213829201L * var1;
		}
	}

	public Class139(Class135 var1, int var2, int var3) throws IOException {
		aClass135_1626 = var1;
		aLong1625 = (aLong1624 = var1.method1642(-2136626722) * -7972538352941367615L) * -3822838932384883719L;
		aByteArray1617 = new byte[var2];
		aByteArray1616 = new byte[var3];
		aLong1623 = 0L;
	}

	void method1662(int var1) throws IOException {
		anInt1619 = 0;
		if (aLong1623 * 2919194880057752753L != -2440560027465476073L * aLong1620) {
			aClass135_1626.method1639(aLong1623 * 2919194880057752753L);
			aLong1620 = aLong1623 * 1214829275040286327L;
		}

		int var2;
		for (aLong1618 = aLong1623 * -524331204307841817L; anInt1619 * -333507863 < aByteArray1617.length; anInt1619 += var2 * -1777801895) {
			var2 = aClass135_1626.method1643(aByteArray1617, anInt1619 * -333507863, aByteArray1617.length - anInt1619 * -333507863, 1736753585);
			if (var2 == -1) {
				break;
			}

			aLong1620 += (long) var2 * 4730576851504701351L;
		}

	}

	public long method1671(int var1) {
		return 6708597326523720073L * aLong1625;
	}

	public void method1678(byte[] var1, int var2) throws IOException {
		method1681(var1, 0, var1.length, 945103535);
	}

	public void method1681(byte[] var1, int var2, int var3, int var4) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (aLong1621 * -5559158498415728837L != -1L && 2919194880057752753L * aLong1623 >= -5559158498415728837L * aLong1621 && (long) var3 + aLong1623 * 2919194880057752753L <= -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979)) {
				System.arraycopy(aByteArray1616, (int) (2919194880057752753L * aLong1623 - aLong1621 * -5559158498415728837L), var1, var2, var3);
				aLong1623 += 6387178279213829201L * (long) var3;
				return;
			}

			long var5 = 2919194880057752753L * aLong1623;
			int var8 = var3;
			int var9;
			if (2919194880057752753L * aLong1623 >= 7541634135136558759L * aLong1618 && 2919194880057752753L * aLong1623 < 7541634135136558759L * aLong1618 + (long) (anInt1619 * -333507863)) {
				var9 = (int) ((long) (anInt1619 * -333507863) - (aLong1623 * 2919194880057752753L - aLong1618 * 7541634135136558759L));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(aByteArray1617, (int) (aLong1623 * 2919194880057752753L - aLong1618 * 7541634135136558759L), var1, var2, var9);
				aLong1623 += (long) var9 * 6387178279213829201L;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > aByteArray1617.length) {
				aClass135_1626.method1639(2919194880057752753L * aLong1623);

				for (aLong1620 = aLong1623 * 1214829275040286327L; var3 > 0; var3 -= var9) {
					var9 = aClass135_1626.method1643(var1, var2, var3, 1736753585);
					if (var9 == -1) {
						break;
					}

					aLong1620 += 4730576851504701351L * (long) var9;
					aLong1623 += 6387178279213829201L * (long) var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				method1662(-1241588373);
				var9 = var3;
				if (var3 > anInt1619 * -333507863) {
					var9 = anInt1619 * -333507863;
				}

				System.arraycopy(aByteArray1617, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				aLong1623 += (long) var9 * 6387178279213829201L;
			}

			if (-5559158498415728837L * aLong1621 != -1L) {
				if (aLong1621 * -5559158498415728837L > aLong1623 * 2919194880057752753L && var3 > 0) {
					var9 = (int) (aLong1621 * -5559158498415728837L - 2919194880057752753L * aLong1623) + var2;
					if (var9 > var3 + var2) {
						var9 = var3 + var2;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						aLong1623 += 6387178279213829201L;
					}
				}

				long var10 = -1L;
				long var12 = -1L;
				if (-5559158498415728837L * aLong1621 >= var5 && -5559158498415728837L * aLong1621 < var5 + (long) var8) {
					var10 = aLong1621 * -5559158498415728837L;
				} else if (var5 >= aLong1621 * -5559158498415728837L && var5 < -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979)) {
					var10 = var5;
				}

				if (-5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979) > var5 && (long) (anInt1622 * 1081893979) + -5559158498415728837L * aLong1621 <= (long) var8 + var5) {
					var12 = (long) (anInt1622 * 1081893979) + -5559158498415728837L * aLong1621;
				} else if ((long) var8 + var5 > aLong1621 * -5559158498415728837L && var5 + (long) var8 <= -5559158498415728837L * aLong1621 + (long) (anInt1622 * 1081893979)) {
					var12 = (long) var8 + var5;
				}

				if (var10 > -1L && var12 > var10) {
					int var14 = (int) (var12 - var10);
					System.arraycopy(aByteArray1616, (int) (var10 - -5559158498415728837L * aLong1621), var1, (int) (var10 - var5) + var2, var14);
					if (var12 > aLong1623 * 2919194880057752753L) {
						var3 = (int) ((long) var3 - (var12 - aLong1623 * 2919194880057752753L));
						aLong1623 = 6387178279213829201L * var12;
					}
				}
			}
		} catch (IOException var16) {
			aLong1620 = -4730576851504701351L;
			throw var16;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	public void method1683(byte[] var1, int var2, int var3, int var4) throws IOException {
		try {
			if ((long) var3 + aLong1623 * 2919194880057752753L > aLong1625 * 6708597326523720073L) {
				aLong1625 = ((long) var3 + 2919194880057752753L * aLong1623) * 1619715810860983481L;
			}

			if (-5559158498415728837L * aLong1621 != -1L && (aLong1623 * 2919194880057752753L < aLong1621 * -5559158498415728837L || 2919194880057752753L * aLong1623 > (long) (anInt1622 * 1081893979) + -5559158498415728837L * aLong1621)) {
				method1657((byte) 0);
			}

			if (-5559158498415728837L * aLong1621 != -1L && 2919194880057752753L * aLong1623 + (long) var3 > (long) aByteArray1616.length + -5559158498415728837L * aLong1621) {
				int var5 = (int) ((long) aByteArray1616.length - (2919194880057752753L * aLong1623 - -5559158498415728837L * aLong1621));
				System.arraycopy(var1, var2, aByteArray1616, (int) (aLong1623 * 2919194880057752753L - -5559158498415728837L * aLong1621), var5);
				aLong1623 += 6387178279213829201L * (long) var5;
				var2 += var5;
				var3 -= var5;
				anInt1622 = aByteArray1616.length * 674900947;
				method1657((byte) 0);
			}

			if (var3 <= aByteArray1616.length) {
				if (var3 > 0) {
					if (aLong1621 * -5559158498415728837L == -1L) {
						aLong1621 = aLong1623 * 3375092592937264387L;
					}

					System.arraycopy(var1, var2, aByteArray1616, (int) (2919194880057752753L * aLong1623 - aLong1621 * -5559158498415728837L), var3);
					aLong1623 += (long) var3 * 6387178279213829201L;
					if (aLong1623 * 2919194880057752753L - aLong1621 * -5559158498415728837L > (long) (anInt1622 * 1081893979)) {
						anInt1622 = (int) (aLong1623 * 2919194880057752753L - aLong1621 * -5559158498415728837L) * 674900947;
					}

				}
			} else {
				if (aLong1623 * 2919194880057752753L != -2440560027465476073L * aLong1620) {
					aClass135_1626.method1639(2919194880057752753L * aLong1623);
					aLong1620 = aLong1623 * 1214829275040286327L;
				}

				aClass135_1626.method1650(var1, var2, var3, -1483506203);
				aLong1620 += 4730576851504701351L * (long) var3;
				if (aLong1620 * -2440560027465476073L > aLong1624 * 8974096889506238785L) {
					aLong1624 = aLong1620 * -1001945501943956649L;
				}

				long var6 = -1L;
				long var8 = -1L;
				if (aLong1623 * 2919194880057752753L >= 7541634135136558759L * aLong1618 && aLong1623 * 2919194880057752753L < (long) (anInt1619 * -333507863) + aLong1618 * 7541634135136558759L) {
					var6 = aLong1623 * 2919194880057752753L;
				} else if (7541634135136558759L * aLong1618 >= aLong1623 * 2919194880057752753L && 7541634135136558759L * aLong1618 < 2919194880057752753L * aLong1623 + (long) var3) {
					var6 = aLong1618 * 7541634135136558759L;
				}

				if ((long) var3 + 2919194880057752753L * aLong1623 > aLong1618 * 7541634135136558759L && 2919194880057752753L * aLong1623 + (long) var3 <= aLong1618 * 7541634135136558759L + (long) (anInt1619 * -333507863)) {
					var8 = (long) var3 + 2919194880057752753L * aLong1623;
				} else if (aLong1618 * 7541634135136558759L + (long) (anInt1619 * -333507863) > aLong1623 * 2919194880057752753L && (long) (anInt1619 * -333507863) + 7541634135136558759L * aLong1618 <= 2919194880057752753L * aLong1623 + (long) var3) {
					var8 = (long) (anInt1619 * -333507863) + 7541634135136558759L * aLong1618;
				}

				if (var6 > -1L && var8 > var6) {
					int var10 = (int) (var8 - var6);
					System.arraycopy(var1, (int) ((long) var2 + var6 - aLong1623 * 2919194880057752753L), aByteArray1617, (int) (var6 - 7541634135136558759L * aLong1618), var10);
				}

				aLong1623 += (long) var3 * 6387178279213829201L;
			}
		} catch (IOException var11) {
			aLong1620 = -4730576851504701351L;
			throw var11;
		}
	}

}
