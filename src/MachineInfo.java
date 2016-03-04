public class MachineInfo extends LinkedEntry {

	static final int anInt1847 = 1;
	static final int anInt1848 = 2;
	static final int anInt1849 = 4;
	int anInt1850;
	static final int anInt1852 = 1;
	static final int anInt1854 = 4;
	static final int anInt1855 = 6;
	static final int anInt1861 = 2;
	int anInt1862;
	static final int anInt1864 = 5;
	int anInt1866;
	static final int anInt1868 = 8;
	int anInt1872;
	int anInt1873;
	int anInt1874;
	public static short[][] aShortArrayArray1879;
	public static final int anInt1880 = 34;
	String aString1876;
	String aString1859;
	String aString1869;
	String aString1870;
	int[] anIntArray1877 = new int[3];
	int anInt1856;
	String aString1860;
	String aString1871;
	boolean aBool1851;
	int anInt1857;
	int anInt1858;
	int anInt1867;
	int anInt1853;
	int anInt1875;
	boolean aBool1846;
	int anInt1863;
	int anInt1878;
	int anInt1865;

	void method2094(int var1) {
		if (aString1876.length() > 40) {
			aString1876 = aString1876.substring(0, 40);
		}

		if (aString1859.length() > 40) {
			aString1859 = aString1859.substring(0, 40);
		}

		if (aString1869.length() > 10) {
			aString1869 = aString1869.substring(0, 10);
		}

		if (aString1870.length() > 10) {
			aString1870 = aString1870.substring(0, 10);
		}

	}

	static final void method2096(LinkedEntry_Sub5 var0, int var1) {
		var0.aBool1715 = false;
		if (var0.aClass109_Sub1_1713 != null) {
			var0.aClass109_Sub1_1713.anInt1652 = 0;
		}

		for (LinkedEntry_Sub5 var2 = var0.method1796(); var2 != null; var2 = var0.method1797()) {
			method2096(var2, -2113768299);
		}

	}

	public int method2097(int var1) {
		byte var2 = 38;
		String var4 = aString1876;
		int var5 = var4.length() + 2;
		int var21 = var2 + var5;
		String var9 = aString1859;
		int var10 = var9.length() + 2;
		var21 += var10;
		String var7 = aString1869;
		int var8 = var7.length() + 2;
		var21 += var8;
		String var13 = aString1870;
		int var14 = var13.length() + 2;
		var21 += var14;
		String var18 = aString1860;
		int var17 = var18.length() + 2;
		var21 += var17;
		String var3 = aString1871;
		int var19 = var3.length() + 2;
		var21 += var19;
		return var21;
	}

	public void writeToBuffer(DataBuffer buf, int var2) {
		buf.writeByte(6);
		buf.writeByte(anInt1856 * -1678422097);
		buf.writeByte(aBool1851 ? 1 : 0);
		buf.writeByte(anInt1857 * 551881733);
		buf.writeByte(anInt1858 * 1580871769);
		buf.writeByte(anInt1867 * 2042022783);
		buf.writeByte(anInt1853 * 1295007027);
		buf.writeByte(anInt1875 * 208991287);
		buf.writeByte(aBool1846 ? 1 : 0);
		buf.writeShort(anInt1863 * -1099150523);
		buf.writeByte(anInt1878 * 1667745223);
		buf.writeTriByte(anInt1865 * 1761549273);
		buf.writeShort(anInt1866 * 988849873);
		buf.writeJagStr(aString1876, (byte) 0);
		buf.writeJagStr(aString1859, (byte) 0);
		buf.writeJagStr(aString1869, (byte) 0);
		buf.writeJagStr(aString1870, (byte) 0);
		buf.writeByte(anInt1872 * -2013920267);
		buf.writeShort(anInt1862 * 1839626727);
		buf.writeJagStr(aString1860, (byte) 0);
		buf.writeJagStr(aString1871, (byte) 0);
		buf.writeByte(anInt1873 * 2110382673);
		buf.writeByte(anInt1874 * 2015219541);

		for (int var3 = 0; var3 < anIntArray1877.length; var3++) {
			buf.writeInt(anIntArray1877[var3]);
		}

		buf.writeInt(anInt1850 * 1803510823);
	}

	public MachineInfo(boolean var1) {
		if (var1) {
			if (LinkedEntry_Sub16.aString1890.startsWith("win")) {
				anInt1856 = 835938127;
			} else if (LinkedEntry_Sub16.aString1890.startsWith("mac")) {
				anInt1856 = 1671876254;
			} else if (LinkedEntry_Sub16.aString1890.startsWith("linux")) {
				anInt1856 = -1787152915;
			} else {
				anInt1856 = -951214788;
			}

			String var2;
			try {
				var2 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var11) {
				var2 = "";
			}

			String var4;
			try {
				var4 = System.getProperty("os.version").toLowerCase();
			} catch (Exception var10) {
				var4 = "";
			}

			String var3 = "Unknown";
			String var5 = "1.1";

			try {
				var3 = System.getProperty("java.vendor");
				var5 = System.getProperty("java.version");
			} catch (Exception var9) {
				;
			}

			if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
				aBool1851 = false;
			} else {
				aBool1851 = true;
			}

			if (anInt1856 * -1678422097 == 1) {
				if (var4.indexOf("4.0") != -1) {
					anInt1857 = -1818369843;
				} else if (var4.indexOf("4.1") != -1) {
					anInt1857 = 658227610;
				} else if (var4.indexOf("4.9") != -1) {
					anInt1857 = -1160142233;
				} else if (var4.indexOf("5.0") != -1) {
					anInt1857 = 1316455220;
				} else if (var4.indexOf("5.1") != -1) {
					anInt1857 = -501914623;
				} else if (var4.indexOf("5.2") != -1) {
					anInt1857 = -1662056856;
				} else if (var4.indexOf("6.0") != -1) {
					anInt1857 = 1974682830;
				} else if (var4.indexOf("6.1") != -1) {
					anInt1857 = 156312987;
				} else if (var4.indexOf("6.2") != -1) {
					anInt1857 = 814540597;
				} else if (var4.indexOf("6.3") != -1) {
					anInt1857 = -1003829246;
				}
			} else if (anInt1856 * -1678422097 == 2) {
				if (var4.indexOf("10.4") != -1) {
					anInt1857 = -2007658492;
				} else if (var4.indexOf("10.5") != -1) {
					anInt1857 = 468938961;
				} else if (var4.indexOf("10.6") != -1) {
					anInt1857 = -1349430882;
				} else if (var4.indexOf("10.7") != -1) {
					anInt1857 = 1127166571;
				} else if (var4.indexOf("10.8") != -1) {
					anInt1857 = -691203272;
				} else if (var4.indexOf("10.9") != -1) {
					anInt1857 = 1785394181;
				} else if (var4.indexOf("10.10") != -1) {
					anInt1857 = -32975662;
				}
			}

			if (var3.toLowerCase().indexOf("sun") != -1) {
				anInt1858 = 1912739817;
			} else if (var3.toLowerCase().indexOf("microsoft") != -1) {
				anInt1858 = -469487662;
			} else if (var3.toLowerCase().indexOf("apple") != -1) {
				anInt1858 = 1443252155;
			} else if (var3.toLowerCase().indexOf("oracle") != -1) {
				anInt1858 = 973764493;
			} else {
				anInt1858 = -938975324;
			}

			int var6 = 2;
			int var7 = 0;

			char var8;
			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var8 - 48 + var7 * 10;
					++var6;
				}
			} catch (Exception var14) {
				;
			}

			anInt1867 = var7 * 2040853631;
			var6 = var5.indexOf(46, 2) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var7 * 10 + (var8 - 48);
					++var6;
				}
			} catch (Exception var13) {
				;
			}

			anInt1853 = var7 * 695600635;
			var6 = var5.indexOf(95, 4) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var7 * 10 + (var8 - 48);
					++var6;
				}
			} catch (Exception var12) {
				;
			}

			anInt1875 = var7 * -535232121;
			aBool1846 = false;
			anInt1863 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 838045581;
			if (anInt1867 * 2042022783 > 3) {
				anInt1878 = Runtime.getRuntime().availableProcessors() * 1461349367;
			} else {
				anInt1878 = 0;
			}

			anInt1865 = 0;
		}

		if (aString1876 == null) {
			aString1876 = "";
		}

		if (aString1859 == null) {
			aString1859 = "";
		}

		if (aString1869 == null) {
			aString1869 = "";
		}

		if (aString1870 == null) {
			aString1870 = "";
		}

		if (aString1860 == null) {
			aString1860 = "";
		}

		if (aString1871 == null) {
			aString1871 = "";
		}

		method2094(1708994837);
	}

}
