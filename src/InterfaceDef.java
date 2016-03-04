import java.util.Arrays;

public class InterfaceDef extends LinkedEntry {

	static boolean[] aBoolArray1928;
	static IndexDescriptor aIndexDescriptor_1929;
	static IndexDescriptor aIndexDescriptor_1931;
	static IndexDescriptor aIndexDescriptor_1932;
	public static InterfaceDef[][] aInterfaceDefArrayArray1975;
	public Object[] anObjectArray1978;
	public Object[] anObjectArray1984;
	public Object[] anObjectArray1996;
	static IndexDescriptor aIndexDescriptor_2023;
	public Object[] anObjectArray2040;
	public Object[] anObjectArray2041;
	public Object[] anObjectArray2043;
	public Object[] anObjectArray2046;
	public Object[] anObjectArray2047;
	public Object[] anObjectArray2048;
	public InterfaceDef[] aInterfaceDefArray2061;
	public Object[] anObjectArray2064;
	public boolean cs2Inter = false;
	public int contenttype;
	public int anInt1948 = 0;
	public int anInt1943 = 0;
	public int anInt1946 = 0;
	public int anInt1949 = 0;
	public int anInt1950 = 0;
	public int anInt1953 = 0;
	public int anInt1969 = 0;
	public int anInt1958 = -1279052275;
	public int anInt1930 = -1337937149;
	public int[] anIntArray2050;
	public int[] anIntArray2013;
	public int[][] anIntArrayArray2049;
	public int anInt1963 = 0;
	public boolean aBool1982 = false;
	public int[] itemIds;
	public int[] itemAmounts;
	public int defaultSettings = 0;
	public int anInt2000 = 0;
	public int anInt2001 = 0;
	public int anInt2055 = 0;
	public int anInt2031 = -2115269075;
	public boolean aBool2068 = false;
	public int anInt2003 = 0;
	public int anInt1934 = 0;
	public int[] anIntArray2005;
	public int[] anIntArray2067;
	public int[] anIntArray2007;
	public String aString1997 = "";
	public String aString1998 = "";
	public int anInt2045 = 0;
	public boolean aBool2002 = false;
	public String[] itemOptions;
	public int anInt1965 = 0;
	public int anInt1966 = 0;
	public int anInt1967 = 0;
	public int anInt1971 = -2103477855;
	public int anInt1973 = -370961949;
	public int anInt1980 = -559540111;
	public int anInt1981 = -999821601;
	int anInt1999 = -313235791;
	int anInt2019 = -1991015937;
	public int anInt1959 = -1616693819;
	public int anInt1985 = 1672522169;
	public String action = "";
	public String aString2053 = "";
	public int anInt1991 = 786030780;
	public int anInt1988 = 0;
	public int anInt1989 = 0;
	public String aString2054;
	public int anInt1964 = 0;
	public int anInt1977 = 0;
	public int anInt1944 = 0;
	public int anInt2020 = 0;
	public int anInt1962 = 0;
	public int anInt1974 = 0;
	public boolean aBool2063;
	public boolean aBool2015 = false;
	public int anInt1976 = 0;
	public int anInt2044 = 0;
	public int anInt1986 = 0;
	public int anInt1987 = 0;
	public int anInt1990 = 0;
	public boolean aBool2028;
	public int anInt1970 = -400767859;
	public String aString2032 = "";
	public boolean aBool1994 = false;
	public String[] regularOptions;
	public int anInt2052 = 0;
	public int anInt2014 = 0;
	public boolean aBool1979;
	public int anInt1992 = 0;
	public boolean aBool1935 = false;
	public boolean aBool1983 = false;
	public Object[] anObjectArray2018;
	public Object[] anObjectArray2017;
	public Object[] anObjectArray2025;
	public Object[] anObjectArray2029;
	public Object[] anObjectArray2039;
	public Object[] varpScript;
	public Object[] itemContainerScript;
	public Object[] anObjectArray2056;
	public Object[] anObjectArray2036;
	public Object[] anObjectArray2037;
	public Object[] anObjectArray2051;
	public Object[] anObjectArray1968;
	public Object[] anObjectArray1939;
	public Object[] anObjectArray2021;
	public Object[] anObjectArray2022;
	public Object[] anObjectArray2026;
	public Object[] anObjectArray2027;
	public Object[] anObjectArray1951;
	public int[] varpTriggers;
	public int[] itemContainerListeners;
	public int[] skillTriggers;
	public boolean aBool1960 = false;
	public static boolean aBool1937 = false;
	public static Class128 aClass128_1933 = new Class128(200);
	public static Class128 aClass128_2035 = new Class128(50);
	public static Class128 aClass128_2065 = new Class128(20);
	public static Class128 aClass128_1936 = new Class128(8);
	public int hash = 1262844383;
	public int slot = 1182545387;
	public int anInt1952 = 0;
	public int anInt1945 = 0;
	public int anInt1954 = 0;
	public int invsize = 0;
	public int anInt1956 = -2079680217;
	public int anInt1957 = -187527477;
	public int anInt2070 = 0;
	public int anInt2038 = 0;
	public int anInt1993 = 0;
	public int anInt1995 = -1363643670;
	public InterfaceDef aInterfaceDef_2012 = null;
	public int anInt2057;
	public int anInt2058;
	public int anInt2059;
	public int anInt2010;
	public boolean aBool2062;
	public boolean aBool1961;
	public int anInt1942;
	public int anInt2004;
	public int anInt2066;
	public int anInt2042;
	public int anInt2060;
	public int anInt2069;

	public int hash() {
		return hash * 1582464481;
	}

	void decodeOld(DataBuffer buffer) {
		cs2Inter = false;
		contenttype = buffer.readUByte() * 1491066693;
		anInt1948 = buffer.readUByte() * -1092510769;
		anInt1943 = buffer.readUShort() * 1176572057;
		anInt1946 = buffer.readShort() * 1530429651;
		anInt1949 = buffer.readShort() * -1351876651;
		anInt1950 = buffer.readUShort() * 194957871;
		anInt1953 = buffer.readUShort() * -985908379;
		anInt1969 = buffer.readUByte() * 763876863;
		anInt1958 = buffer.readUShort() * 1279052275;
		if (anInt1958 * -1588791493 == 65535) {
			anInt1958 = -1279052275;
		} else {
			anInt1958 = (anInt1958 * -1588791493 + (hash * 1582464481 & -65536)) * 1279052275;
		}

		anInt1930 = buffer.readUShort() * 1337937149;
		if (anInt1930 * -1224986539 == 65535) {
			anInt1930 = -1337937149;
		}

		int var8 = buffer.readUByte();
		int var7;
		if (var8 > 0) {
			anIntArray2050 = new int[var8];
			anIntArray2013 = new int[var8];

			for (var7 = 0; var7 < var8; var7++) {
				anIntArray2050[var7] = buffer.readUByte();
				anIntArray2013[var7] = buffer.readUShort();
			}
		}

		var7 = buffer.readUByte();
		int var3;
		int var4;
		int var9;
		if (var7 > 0) {
			anIntArrayArray2049 = new int[var7][];

			for (var9 = 0; var9 < var7; var9++) {
				var3 = buffer.readUShort();
				anIntArrayArray2049[var9] = new int[var3];

				for (var4 = 0; var4 < var3; var4++) {
					anIntArrayArray2049[var9][var4] = buffer.readUShort();
					if (anIntArrayArray2049[var9][var4] == 65535) {
						anIntArrayArray2049[var9][var4] = -1;
					}
				}
			}
		}

		if (contenttype * -1878336627 == 0) {
			anInt1963 = buffer.readUShort() * 1416080879;
			aBool1982 = buffer.readUByte() == 1;
		}

		if (contenttype * -1878336627 == 1) {
			buffer.readUShort();
			buffer.readUByte();
		}

		if (contenttype * -1878336627 == 2) {
			itemIds = new int[anInt1953 * 791903853 * anInt1950 * -769280817];
			itemAmounts = new int[anInt1953 * 791903853 * anInt1950 * -769280817];
			if (buffer.readUByte() == 1) {
				defaultSettings = (defaultSettings * 770935883 | 0b0001_0000_0000_0000_0000_0000_0000_0000) * 1469898083;
			}

			if (buffer.readUByte() == 1) {
				defaultSettings = (defaultSettings * 770935883 | 0b0100_0000_0000_0000_0000_0000_0000_0000) * 1469898083;
			}

			if (buffer.readUByte() == 1) {
				defaultSettings = (defaultSettings * 770935883 | 0b1000_0000_0000_0000_0000_0000_0000_0000) * 1469898083;
			}

			if (buffer.readUByte() == 1) {
				defaultSettings = (defaultSettings * 770935883 | 0b0010_0000_0000_0000_0000_0000_0000_0000) * 1469898083;
			}

			anInt2003 = buffer.readUByte() * 1405520589;
			anInt1934 = buffer.readUByte() * -65046643;
			anIntArray2005 = new int[20];
			anIntArray2067 = new int[20];
			anIntArray2007 = new int[20];

			int var10;
			for (var10 = 0; var10 < 20; var10++) {
				int var5 = buffer.readUByte();
				if (var5 == 1) {
					anIntArray2005[var10] = buffer.readShort();
					anIntArray2067[var10] = buffer.readShort();
					anIntArray2007[var10] = buffer.readInt();
				} else {
					anIntArray2007[var10] = -1;
				}
			}

			itemOptions = new String[5];

			for (var10 = 0; var10 < 5; var10++) {
				String var12 = buffer.readString();
				if (var12.length() > 0) {
					itemOptions[var10] = var12;
					defaultSettings = (defaultSettings * 770935883 | 1 << 23 + var10) * 1469898083;
				}
			}

			int id = (hash * 1582464481) >> 16;
			if (id == 387) {
				System.out.println("OK WE HAVE IT BB " + ((hash * 1582464481)&0xFFFF));
			}
		}

		if (contenttype * -1878336627 == 3) {
			aBool2068 = buffer.readUByte() == 1;
		}

		if (contenttype * -1878336627 == 4 || contenttype * -1878336627 == 1) {
			anInt2000 = buffer.readUByte() * -297867465;
			anInt2001 = buffer.readUByte() * 2090058093;
			anInt2055 = buffer.readUByte() * 373228367;
			anInt2031 = buffer.readUShort() * 2115269075;
			if (anInt2031 * -97120677 == 65535) {
				anInt2031 = -2115269075;
			}

			aBool2002 = buffer.readUByte() == 1;
		}

		if (contenttype * -1878336627 == 4) {
			aString1997 = buffer.readString();
			aString1998 = buffer.readString();
		}

		if (contenttype * -1878336627 == 1 || contenttype * -1878336627 == 3 || contenttype * -1878336627 == 4) {
			anInt2045 = buffer.readInt() * -963482301;
		}

		if (contenttype * -1878336627 == 3 || contenttype * -1878336627 == 4) {
			anInt1965 = buffer.readInt() * 1678898981;
			anInt1966 = buffer.readInt() * 1277739297;
			anInt1967 = buffer.readInt() * -1444939971;
		}

		if (contenttype * -1878336627 == 5) {
			anInt1971 = buffer.readInt() * 2103477855;
			anInt1973 = buffer.readInt() * 370961949;
		}

		if (contenttype * -1878336627 == 6) {
			anInt1980 = -559540111;
			anInt1981 = buffer.readUShort() * 999821601;
            if (anInt1981 * -982469919 == 65535) {
                anInt1981 = -999821601;
            }

			anInt1999 = -313235791;
			anInt2019 = buffer.readUShort() * 1991015937;
			if (anInt2019 * 525828609 == 65535) {
				anInt2019 = -1991015937;
			}

			anInt1959 = buffer.readUShort() * 1616693819;
			if (anInt1959 * -335970573 == 65535) {
				anInt1959 = -1616693819;
			}

			anInt1985 = buffer.readUShort() * -1672522169;
			if (anInt1985 * 658207607 == 65535) {
				anInt1985 = 1672522169;
			}

			anInt1991 = buffer.readUShort() * 866853767;
			anInt1988 = buffer.readUShort() * 193807915;
			anInt1989 = buffer.readUShort() * 1932084251;
		}

		if (contenttype * -1878336627 == 7) {
			itemIds = new int[anInt1950 * -769280817 * anInt1953 * 791903853];
			itemAmounts = new int[anInt1950 * -769280817 * anInt1953 * 791903853];
			anInt2000 = buffer.readUByte() * -297867465;
			anInt2031 = buffer.readUShort() * 2115269075;
			if (anInt2031 * -97120677 == 65535) {
				anInt2031 = -2115269075;
			}

			aBool2002 = buffer.readUByte() == 1;
			anInt2045 = buffer.readInt() * -963482301;
			anInt2003 = buffer.readShort() * 1405520589;
			anInt1934 = buffer.readShort() * -65046643;
			var9 = buffer.readUByte();
			if (var9 == 1) {
				defaultSettings = (defaultSettings * 770935883 | 1073741824) * 1469898083;
			}

			itemOptions = new String[5];

			for (var3 = 0; var3 < 5; var3++) {
				String var11 = buffer.readString();
				if (var11.length() > 0) {
					itemOptions[var3] = var11;
					defaultSettings = (defaultSettings * 770935883 | 1 << 23 + var3) * 1469898083;
				}
			}
		}

		if (contenttype * -1878336627 == 8) {
			aString1997 = buffer.readString();
		}

		if (anInt1948 * -1021998289 == 2 || contenttype * -1878336627 == 2) {
			action = buffer.readString();
			aString2053 = buffer.readString();
			var9 = buffer.readUShort() & 63;
			defaultSettings = (defaultSettings * 770935883 | var9 << 11) * 1469898083;
		}

		if (anInt1948 * -1021998289 == 1 || anInt1948 * -1021998289 == 4 || anInt1948 * -1021998289 == 5 || anInt1948 * -1021998289 == 6) {
			aString2054 = buffer.readString();
			if (aString2054.length() == 0) {
				if (anInt1948 * -1021998289 == 1) {
					aString2054 = Class90.aString1104;
				}

				if (anInt1948 * -1021998289 == 4) {
					aString2054 = Class90.aString1060;
				}

				if (anInt1948 * -1021998289 == 5) {
					aString2054 = Class90.aString1060;
				}

				if (anInt1948 * -1021998289 == 6) {
					aString2054 = Class90.aString1061;
				}
			}
		}

		if (anInt1948 * -1021998289 == 1 || anInt1948 * -1021998289 == 4 || anInt1948 * -1021998289 == 5) {
			defaultSettings = (defaultSettings * 770935883 | 4194304) * 1469898083;
		}

		if (anInt1948 * -1021998289 == 6) {
			defaultSettings = (defaultSettings * 770935883 | 1) * 1469898083;
		}

	}

	void decodeCs2Interface(DataBuffer buffer) {
		buffer.readUByte();
		cs2Inter = true;
		contenttype = buffer.readUByte() * 1491066693;
		anInt1943 = buffer.readUShort() * 1176572057;
		anInt1946 = buffer.readShort() * 1530429651;
		anInt1949 = buffer.readShort() * -1351876651;
		anInt1950 = buffer.readUShort() * 194957871;
		if (contenttype * -1878336627 == 9) {
			anInt1953 = buffer.readShort() * -985908379;
		} else {
			anInt1953 = buffer.readUShort() * -985908379;
		}

		anInt1964 = buffer.readByte() * -2101465699;
		anInt1977 = buffer.readByte() * 763777549;
		anInt1944 = buffer.readByte() * -538410635;
		anInt2020 = buffer.readByte() * -1242302435;
		anInt1958 = buffer.readUShort() * 1279052275;
		if (anInt1958 * -1588791493 == 65535) {
			anInt1958 = -1279052275;
		} else {
			anInt1958 = (anInt1958 * -1588791493 + (hash * 1582464481 & -65536)) * 1279052275;
		}

		aBool1982 = buffer.readUByte() == 1;
		if (contenttype * -1878336627 == 0) {
			anInt1962 = buffer.readUShort() * -777567991;
			anInt1963 = buffer.readUShort() * 1416080879;
			aBool2063 = buffer.readUByte() == 1;
		}

		if (contenttype * -1878336627 == 5) {
			anInt1971 = buffer.readInt() * 2103477855;
			anInt1974 = buffer.readUShort() * -1549731937;
			aBool2015 = buffer.readUByte() == 1;
			anInt1969 = buffer.readUByte() * 763876863;
			anInt1976 = buffer.readUByte() * 417047835;
			anInt2044 = buffer.readInt() * 688847885;
			aBool2028 = buffer.readUByte() == 1;
			aBool1979 = buffer.readUByte() == 1;
		}

		if (contenttype * -1878336627 == 6) {
			anInt1980 = -559540111;
			anInt1981 = buffer.readUShort() * 999821601;
			if (anInt1981 * -982469919 == 65535) {
				anInt1981 = -999821601;
			}

			anInt1986 = buffer.readShort() * 1241506715;
			anInt1987 = buffer.readShort() * 1709008139;
			anInt1988 = buffer.readUShort() * 193807915;
			anInt1989 = buffer.readUShort() * 1932084251;
			anInt1990 = buffer.readUShort() * 173124353;
			anInt1991 = buffer.readUShort() * 866853767;
			anInt1959 = buffer.readUShort() * 1616693819;
			if (anInt1959 * -335970573 == 65535) {
				anInt1959 = -1616693819;
			}

			aBool1994 = buffer.readUByte() == 1;
			buffer.readUShort();
			if (anInt1964 * -865812299 != 0) {
				anInt1992 = buffer.readUShort() * -746918389;
			}

			if (anInt1977 * -39629627 != 0) {
				buffer.readUShort();
			}
		}

		if (contenttype * -1878336627 == 4) {
			anInt2031 = buffer.readUShort() * 2115269075;
			if (anInt2031 * -97120677 == 65535) {
				anInt2031 = -2115269075;
			}

			aString1997 = buffer.readString();
			anInt2055 = buffer.readUByte() * 373228367;
			anInt2000 = buffer.readUByte() * -297867465;
			anInt2001 = buffer.readUByte() * 2090058093;
			aBool2002 = buffer.readUByte() == 1;
			anInt2045 = buffer.readInt() * -963482301;
		}

		if (contenttype * -1878336627 == 3) {
			anInt2045 = buffer.readInt() * -963482301;
			aBool2068 = buffer.readUByte() == 1;
			anInt1969 = buffer.readUByte() * 763876863;
		}

		if (contenttype * -1878336627 == 9) {
			anInt1970 = buffer.readUByte() * -400767859;
			anInt2045 = buffer.readInt() * -963482301;
			aBool1935 = buffer.readUByte() == 1;
		}

		defaultSettings = buffer.readTriByte() * 1469898083;
		aString2032 = buffer.readString();
		int var4 = buffer.readUByte();
		if (var4 > 0) {
			regularOptions = new String[var4];

			for (int var3 = 0; var3 < var4; var3++) {
				regularOptions[var3] = buffer.readString();
			}
		}

		anInt2052 = buffer.readUByte() * -906918979;
		anInt2014 = buffer.readUByte() * -2045675427;
		aBool1983 = buffer.readUByte() == 1;
		action = buffer.readString();
		anObjectArray2018 = readScript(buffer);
		anObjectArray2017 = readScript(buffer);
		anObjectArray2025 = readScript(buffer);
		anObjectArray2029 = readScript(buffer);
		anObjectArray2039 = readScript(buffer);
		varpScript = readScript(buffer);
		itemContainerScript = readScript(buffer);
		anObjectArray2056 = readScript(buffer);
		anObjectArray2036 = readScript(buffer);
		anObjectArray2037 = readScript(buffer);
		anObjectArray2051 = readScript(buffer);
		anObjectArray1968 = readScript(buffer);
		anObjectArray1939 = readScript(buffer);
		anObjectArray2021 = readScript(buffer);
		anObjectArray2022 = readScript(buffer);
		anObjectArray2026 = readScript(buffer);
		anObjectArray2027 = readScript(buffer);
		anObjectArray1951 = readScript(buffer);
		varpTriggers = readTriggerArray(buffer);
		itemContainerListeners = readTriggerArray(buffer);

		if (hash() >> 16 == 218) {
			System.out.println("Script: " + Arrays.toString(anObjectArray2018));
			System.out.println("Script: " + Arrays.toString(anObjectArray2017));
			System.out.println("Script: " + Arrays.toString(anObjectArray2025));
			System.out.println("Script: " + Arrays.toString(anObjectArray2029));
			System.out.println("Script: " + Arrays.toString(anObjectArray2039));
			System.out.println("Script: " + Arrays.toString(anObjectArray2056));
			System.out.println("Script: " + Arrays.toString(anObjectArray2036));
			System.out.println("Script: " + Arrays.toString(anObjectArray2037));
			System.out.println("Script: " + Arrays.toString(anObjectArray2051));
			System.out.println("Script: " + Arrays.toString(anObjectArray1968));
			System.out.println("Script: " + Arrays.toString(anObjectArray1939));
			System.out.println("Script: " + Arrays.toString(anObjectArray2021));
			System.out.println("Script: " + Arrays.toString(anObjectArray2022));
			System.out.println("Script: " + Arrays.toString(anObjectArray2026));
			System.out.println("Script: " + Arrays.toString(anObjectArray2027));
			System.out.println("Script: " + Arrays.toString(anObjectArray1951));
		}

		skillTriggers = readTriggerArray(buffer);
	}

	Object[] readScript(DataBuffer buffer) {
		int var3 = buffer.readUByte();
		if (var3 == 0) {
			return null;
		} else {
			Object[] var4 = new Object[var3];

			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = buffer.readUByte();
				if (var6 == 0) {
					var4[var5] = buffer.readInt();
				} else if (var6 == 1) {
					var4[var5] = buffer.readString();
				}
			}

			aBool1960 = true;
			return var4;
		}
	}

	int[] readTriggerArray(DataBuffer var1) {
		int var3 = var1.readUByte();
		if (var3 == 0) {
			return null;
		} else {
			int[] var4 = new int[var3];

			for (int var5 = 0; var5 < var3; var5++) {
				var4[var5] = var1.readInt();
			}

			return var4;
		}
	}

	public void shiftItems(int var1, int var2) {
		int var4 = itemIds[var2];
		itemIds[var2] = itemIds[var1];
		itemIds[var1] = var4;
		var4 = itemAmounts[var2];
		itemAmounts[var2] = itemAmounts[var1];
		itemAmounts[var1] = var4;
	}

	public RenderedItemImage method2155(boolean var1, int var2) {
		aBool1937 = false;
		int var3;
		if (var1) {
			var3 = anInt1973 * 970703925;
		} else {
			var3 = anInt1971 * -1947118177;
		}

		if (var3 == -1) {
			return null;
		} else {
			long var5 = ((long) (anInt2044 * 1414771397) << 40) + ((aBool1979 ? 1L : 0L) << 39) + ((aBool2028 ? 1L : 0L) << 38) + (long) var3 + ((long) (anInt1976 * -958976749) << 36);
			RenderedItemImage var4 = (RenderedItemImage) aClass128_1933.get(var5);
			if (var4 != null) {
				return var4;
			} else {
				var4 = Player.takeItemSnapshot(aIndexDescriptor_1931, var3, 0, 1590856462);
				if (var4 == null) {
					aBool1937 = true;
					return null;
				} else {
					if (aBool2028) {
						var4.method2992();
					}

					if (aBool1979) {
						var4.method3047();
					}

					if (anInt1976 * -958976749 > 0) {
						var4.method3038(anInt1976 * -958976749);
					}

					if (anInt1976 * -958976749 >= 1) {
						var4.method3061(1);
					}

					if (anInt1976 * -958976749 >= 2) {
						var4.method3061(16777215);
					}

					if (anInt2044 * 1414771397 != 0) {
						var4.method2994(anInt2044 * 1414771397);
					}

					aClass128_1933.put(var4, var5);
					return var4;
				}
			}
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method2158(AnimationSequence var1, int var2, boolean var3, Class108 var4, int var5) {
		aBool1937 = false;
		int var6;
		int var7;
		if (var3) {
			var7 = anInt1999 * -685235631;
			var6 = anInt2019 * 525828609;
		} else {
			var7 = anInt1980 * 1661118609;
			var6 = anInt1981 * -982469919;
		}

		if (var7 == 0) {
			return null;
		} else if (var7 == 1 && var6 == -1) {
			return null;
		} else {
			CacheableEntry_Sub23_Sub16_Sub5 var10 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2035.get((long) (var6 + (var7 << 16)));
			if (var10 == null) {
				CacheableEntry_Sub23_Sub16_Sub6 var8;
				if (var7 == 1) {
					var8 = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2023, var6, 0);
					if (var8 == null) {
						aBool1937 = true;
						return null;
					}

					var10 = var8.method3266(64, 768, -50, -10, -50);
				}

				if (var7 == 2) {
					var8 = Class50.getNpcDef(var6).method2421((byte) 37);
					if (var8 == null) {
						aBool1937 = true;
						return null;
					}

					var10 = var8.method3266(64, 768, -50, -10, -50);
				}

				if (var7 == 3) {
					if (var4 == null) {
						return null;
					}

					var8 = var4.method1352((byte) -16);
					if (var8 == null) {
						aBool1937 = true;
						return null;
					}

					var10 = var8.method3266(64, 768, -50, -10, -50);
				}

				if (var7 == 4) {
					ItemDef var9 = PacketDecoder.getItemDef(var6);
					var8 = var9.method2252(10, 528303681);
					if (var8 == null) {
						aBool1937 = true;
						return null;
					}

					var10 = var8.method3266(var9.anInt2155 * 1037157411 + 64, 768 + var9.anInt2156 * 517891679, -50, -10, -50);
				}

				aClass128_2035.put(var10, (long) (var6 + (var7 << 16)));
			}

			if (var1 != null) {
				var10 = var1.method2316(var10, var2, 2001473456);
			}

			return var10;
		}
	}

	public CacheableEntry_Sub23_Sub18 method2159(byte var1) {
		long var2 = (long) (hash * 1582464481) << 32 | (long) (slot * -1395083971) & 4294967295L;
		CacheableEntry_Sub23_Sub18 var6 = (CacheableEntry_Sub23_Sub18) aClass128_1936.get(var2);
		if (var6 != null) {
			if (var6.anInt2443 * 989295955 != anInt1971 * -1947118177) {
				aClass128_1936.method1582(var2);
				var6 = null;
			}

			if (var6 != null) {
				return var6;
			}
		}

		RenderedItemImage var4 = method2155(false, -1683547213);
		if (var4 == null) {
			return null;
		} else {
			int[] var9 = new int[var4.height];
			int[] var11 = new int[var4.height];

			for (int var10 = 0; var10 < var4.height; var10++) {
				int var7 = 0;
				int var5 = var4.width;

				int var8;
				for (var8 = 0; var8 < var4.width; var8++) {
					if (var4.pixels[var4.width * var10 + var8] == 0) {
						var7 = var8;
						break;
					}
				}

				for (var8 = var4.width - 1; var8 >= var7; --var8) {
					if (var4.pixels[var10 * var4.width + var8] == 0) {
						var5 = var8 + 1;
						break;
					}
				}

				var9[var10] = var7;
				var11[var10] = var5 - var7;
			}

			var6 = new CacheableEntry_Sub23_Sub18(var4.width, var4.height, var11, var9, anInt1971 * -1947118177);
			aClass128_1936.put(var6, var2);
			return var6;
		}
	}

	public void method2160(int var1, String var2, int var3) {
		if (regularOptions == null || regularOptions.length <= var1) {
			String[] var4 = new String[var1 + 1];
			if (regularOptions != null) {
				for (int var5 = 0; var5 < regularOptions.length; var5++) {
					var4[var5] = regularOptions[var5];
				}
			}

			regularOptions = var4;
		}

		regularOptions[var1] = var2;
	}

	public static Class75[] method2176(byte var0) {
		return new Class75[]{Class75.aClass75_915, Class75.aClass75_919, Class75.aClass75_909, Class75.aClass75_910, Class75.aClass75_912};
	}

	public RenderedItemImage method2179(int var1, int var2) {
		aBool1937 = false;
		if (var1 >= 0 && var1 < anIntArray2007.length) {
			int var4 = anIntArray2007[var1];
			if (var4 == -1) {
				return null;
			} else {
				RenderedItemImage var3 = (RenderedItemImage) aClass128_1933.get((long) var4);
				if (var3 != null) {
					return var3;
				} else {
					var3 = Player.takeItemSnapshot(aIndexDescriptor_1931, var4, 0, -34688522);
					if (var3 != null) {
						aClass128_1933.put(var3, (long) var4);
					} else {
						aBool1937 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	static void method2182(ScriptInvocation var0, int var1) {
		Class79.method1034(var0, 200000, (byte) 8);
	}

	public CacheableEntry_Sub23_Sub14_Sub4_Sub1 method2189(byte var1) {
		aBool1937 = false;
		if (anInt2031 * -97120677 == -1) {
			return null;
		} else {
			CacheableEntry_Sub23_Sub14_Sub4_Sub1 var2 = (CacheableEntry_Sub23_Sub14_Sub4_Sub1) aClass128_2065.get((long) (anInt2031 * -97120677));
			if (var2 != null) {
				return var2;
			} else {
				var2 = CacheableEntry_Sub23_Sub7.method2396(aIndexDescriptor_1931, aIndexDescriptor_1932, anInt2031 * -97120677, 0, (byte) -81);
				if (var2 != null) {
					aClass128_2065.put(var2, (long) (anInt2031 * -97120677));
				} else {
					aBool1937 = true;
				}

				return var2;
			}
		}
	}

	public InterfaceDef() {
		aString2054 = Class90.aString1104;
		anInt2057 = -801052415;
		anInt2058 = 0;
		anInt2059 = 0;
		anInt2010 = 0;
		aBool2062 = false;
		aBool1961 = false;
		anInt1942 = -1478533863;
		anInt2004 = 0;
		anInt2066 = 0;
		anInt2042 = 0;
		anInt2060 = 1906039751;
		anInt2069 = 126448743;
		aBool2063 = false;
	}

	public static int method2208(int var0, int var1) {
		return var0 >> 17 & 7;
	}

}
