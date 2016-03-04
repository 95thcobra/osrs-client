public abstract class IndexDescriptor {

	static Class2 aClass2_1353;
	static int anInt1366;
	static IndexDescriptor_Sub1 aClass94_Sub1_1369;
	public int crc;
	int anInt1364;
	int[] anIntArray1347;
	int[] anIntArray1350;
	int[] anIntArray1351;
	int[] anIntArray1359;
	int[][] anIntArrayArray1346;
	Object[] anObjectArray1356;
	Object[][] anObjectArrayArray1357;
	int[] anIntArray1367;
	Class114 aClass114_1349;
	int[][] anIntArrayArray1365;
	Class114[] aClass114Array1355;
	static Class56 aClass56_1358 = new Class56();
	static int anInt1362 = 0;
	boolean aBool1360;
	boolean aBool1361;

	void method1149(byte[] var1, byte var2) {
		int var3 = var1.length;
		int var9 = Class3.method114(var1, 0, var3, 59142782);
		crc = var9 * -1190064981;
		DataBuffer var5 = new DataBuffer(Class70.method938(var1, 1163672584));
		int var8 = var5.readUByte();
		if (var8 >= 5 && var8 <= 7) {
			if (var8 >= 6) {
				var5.readInt();
			}

			int var7 = var5.readUByte();
			if (var8 >= 7) {
				anInt1364 = var5.method1883() * -1593896223;
			} else {
				anInt1364 = var5.readUShort() * -1593896223;
			}

			int var10 = 0;
			int var6 = -1;
			anIntArray1347 = new int[anInt1364 * 103919905];
			int var4;
			if (var8 >= 7) {
				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					anIntArray1347[var4] = var10 += var5.method1883();
					if (anIntArray1347[var4] > var6) {
						var6 = anIntArray1347[var4];
					}
				}
			} else {
				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					anIntArray1347[var4] = var10 += var5.readUShort();
					if (anIntArray1347[var4] > var6) {
						var6 = anIntArray1347[var4];
					}
				}
			}

			anIntArray1350 = new int[1 + var6];
			anIntArray1351 = new int[1 + var6];
			anIntArray1359 = new int[1 + var6];
			anIntArrayArray1346 = new int[var6 + 1][];
			anObjectArray1356 = new Object[var6 + 1];
			anObjectArrayArray1357 = new Object[1 + var6][];
			if (var7 != 0) {
				anIntArray1367 = new int[var6 + 1];

				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					anIntArray1367[anIntArray1347[var4]] = var5.readInt();
				}

				aClass114_1349 = new Class114(anIntArray1367);
			}

			for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
				anIntArray1350[anIntArray1347[var4]] = var5.readInt();
			}

			for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
				anIntArray1351[anIntArray1347[var4]] = var5.readInt();
			}

			for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
				anIntArray1359[anIntArray1347[var4]] = var5.readUShort();
			}

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var8 >= 7) {
				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					var13 = anIntArray1347[var4];
					var12 = anIntArray1359[var13];
					var10 = 0;
					var15 = -1;
					anIntArrayArray1346[var13] = new int[var12];

					for (var11 = 0; var11 < var12; var11++) {
						var14 = anIntArrayArray1346[var13][var11] = var10 += var5.method1883();
						if (var14 > var15) {
							var15 = var14;
						}
					}

					anObjectArrayArray1357[var13] = new Object[var15 + 1];
				}
			} else {
				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					var13 = anIntArray1347[var4];
					var12 = anIntArray1359[var13];
					var10 = 0;
					var15 = -1;
					anIntArrayArray1346[var13] = new int[var12];

					for (var11 = 0; var11 < var12; var11++) {
						var14 = anIntArrayArray1346[var13][var11] = var10 += var5.readUShort();
						if (var14 > var15) {
							var15 = var14;
						}
					}

					anObjectArrayArray1357[var13] = new Object[var15 + 1];
				}
			}

			if (var7 != 0) {
				anIntArrayArray1365 = new int[1 + var6][];
				aClass114Array1355 = new Class114[1 + var6];

				for (var4 = 0; var4 < anInt1364 * 103919905; var4++) {
					var13 = anIntArray1347[var4];
					var12 = anIntArray1359[var13];
					anIntArrayArray1365[var13] = new int[anObjectArrayArray1357[var13].length];

					for (var15 = 0; var15 < var12; var15++) {
						anIntArrayArray1365[var13][anIntArrayArray1346[var13][var15]] = var5.readInt();
					}

					aClass114Array1355[var13] = new Class114(anIntArrayArray1365[var13]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method1150(int var1, int var2) {
	}

	public byte[] getFileData(int var1, int var2) {
		return method1152(var1, var2, (int[]) null);
	}

	public byte[] method1152(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1357.length && anObjectArrayArray1357[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1357[var1].length) {
			if (anObjectArrayArray1357[var1][var2] == null) {
				boolean var5 = method1187(var1, var3, (byte) -29);
				if (!var5) {
					method1158(var1, 337574752);
					var5 = method1187(var1, var3, (byte) -21);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = Class2.method102(anObjectArrayArray1357[var1][var2], false, 977351994);
			if (aBool1361) {
				anObjectArrayArray1357[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method1154(int var1, int var2) {
		if (anObjectArray1356[var1] == null) {
			method1158(var1, 337574752);
			return anObjectArray1356[var1] != null;
		} else {
			return true;
		}
	}

	public boolean method1155(byte var1) {
		boolean var2 = true;

		for (int var4 = 0; var4 < anIntArray1347.length; var4++) {
			int var3 = anIntArray1347[var4];
			if (anObjectArray1356[var3] == null) {
				method1158(var3, 337574752);
				if (anObjectArray1356[var3] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	public byte[] method1157(int var1, byte var2) {
		if (anObjectArrayArray1357.length != 1) {
			if (anObjectArrayArray1357[var1].length == 1) {
				return method1178(var1, 0, 2038970353);
			} else {
				throw new RuntimeException();
			}
		} else {
			return method1178(0, var1, 2089513295);
		}
	}

	void method1158(int var1, int var2) {
	}

	public int[] method1159(int var1, int var2) {
		return anIntArrayArray1346[var1];
	}

	IndexDescriptor(boolean var1, boolean var2) {
		aBool1360 = var1;
		aBool1361 = var2;
	}

	public int method1160(byte var1) {
		return anObjectArrayArray1357.length;
	}

	public void method1163(int var1, int var2) {
		for (int var3 = 0; var3 < anObjectArrayArray1357[var1].length; var3++) {
			anObjectArrayArray1357[var1][var3] = null;
		}

	}

	public int method1165(int var1, String var2, byte var3) {
		var2 = var2.toLowerCase();
		return aClass114Array1355[var1].method1447(Class78.hashName(var2));
	}

	public byte[] method1166(String var1, String var2, byte var3) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = aClass114_1349.method1447(Class78.hashName(var1));
		int var5 = aClass114Array1355[var4].method1447(Class78.hashName(var2));
		return getFileData(var4, var5);
	}

	public boolean method1167(String var1, String var2, byte var3) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = aClass114_1349.method1447(Class78.hashName(var1));
		int var5 = aClass114Array1355[var4].method1447(Class78.hashName(var2));
		return method1221(var4, var5, 934753108);
	}

	public boolean method1168(String var1, byte var2) {
		int var3 = method1170("");
		return var3 != -1 ? method1167("", var1, (byte) 25) : method1167(var1, "", (byte) 22);
	}

	public void method1169(String var1, int var2) {
		var1 = var1.toLowerCase();
		int var3 = aClass114_1349.method1447(Class78.hashName(var1));
		if (var3 >= 0) {
			method1150(var3, -553152107);
		}
	}

	public int method1170(String var1) {
		var1 = var1.toLowerCase();
		return aClass114_1349.method1447(Class78.hashName(var1));
	}

	public int numFilesInContainer(int var1) {
		return anObjectArrayArray1357[var1].length;
	}

	public byte[] method1178(int var1, int var2, int var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1357.length && anObjectArrayArray1357[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1357[var1].length) {
			if (anObjectArrayArray1357[var1][var2] == null) {
				boolean var4 = method1187(var1, (int[]) null, (byte) -75);
				if (!var4) {
					method1158(var1, 337574752);
					var4 = method1187(var1, (int[]) null, (byte) -64);
					if (!var4) {
						return null;
					}
				}
			}

			return Class2.method102(anObjectArrayArray1357[var1][var2], false, 485601372);
		} else {
			return null;
		}
	}

	public byte[] method1184(int var1, int var2) {
		if (anObjectArrayArray1357.length == 1) {
			return getFileData(0, var1);
		} else if (anObjectArrayArray1357[var1].length != 1) {
			throw new RuntimeException();
		} else {
			return getFileData(var1, 0);
		}
	}

	boolean method1187(int var1, int[] var2, byte var3) {
		if (anObjectArray1356[var1] == null) {
			return false;
		} else {
			int var4 = anIntArray1359[var1];
			int[] var5 = anIntArrayArray1346[var1];
			Object[] var6 = anObjectArrayArray1357[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; var8++) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var20;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
					var20 = Class2.method102(anObjectArray1356[var1], true, 1312918592);
					DataBuffer var9 = new DataBuffer(var20);
					var9.method1888(var2, 5, var9.data.length);
				} else {
					var20 = Class2.method102(anObjectArray1356[var1], false, -1593384725);
				}

				int var13;
				int var16;
				int var17;
				byte[] var21;
				try {
					var21 = Class70.method938(var20, 1163672584);
				} catch (RuntimeException var19) {
					String var12 = "" + (var2 != null) + "," + var1 + "," + var20.length + ",";
					var13 = var20.length;
					int var14 = Class3.method114(var20, 0, var13, 59142782);
					String var15 = var12 + var14 + ",";
					var16 = var20.length - 2;
					var17 = Class3.method114(var20, 0, var16, 59142782);
					throw Class63.method836(var19, var15 + var17 + "," + anIntArray1350[var1] + "," + crc * -212693501);
				}

				if (aBool1360) {
					anObjectArray1356[var1] = null;
				}

				if (var4 > 1) {
					int var10 = var21.length;
					--var10;
					int var11 = var21[var10] & 255;
					var10 -= var11 * var4 * 4;
					DataBuffer var22 = new DataBuffer(var21);
					int[] var24 = new int[var4];
					var22.pos = var10 * 1303963473;

					int var25;
					for (var13 = 0; var13 < var11; var13++) {
						var25 = 0;

						for (var17 = 0; var17 < var4; var17++) {
							var25 += var22.readInt();
							var24[var17] += var25;
						}
					}

					byte[][] var23 = new byte[var4][];

					for (var25 = 0; var25 < var4; var25++) {
						var23[var25] = new byte[var24[var25]];
						var24[var25] = 0;
					}

					var22.pos = var10 * 1303963473;
					var25 = 0;

					for (var17 = 0; var17 < var11; var17++) {
						var16 = 0;

						for (int var18 = 0; var18 < var4; var18++) {
							var16 += var22.readInt();
							System.arraycopy(var21, var25, var23[var18], var24[var18], var16);
							var24[var18] += var16;
							var25 += var16;
						}
					}

					for (var17 = 0; var17 < var4; var17++) {
						if (!aBool1361) {
							var6[var5[var17]] = Class23.method353(var23[var17], false, 1361758543);
						} else {
							var6[var5[var17]] = var23[var17];
						}
					}
				} else if (!aBool1361) {
					var6[var5[0]] = Class23.method353(var21, false, 2115200711);
				} else {
					var6[var5[0]] = var21;
				}

				return true;
			}
		}
	}

	public void method1199(int var1) {
		for (int var2 = 0; var2 < anObjectArrayArray1357.length; var2++) {
			if (anObjectArrayArray1357[var2] != null) {
				for (int var3 = 0; var3 < anObjectArrayArray1357[var2].length; var3++) {
					anObjectArrayArray1357[var2][var3] = null;
				}
			}
		}

	}

	public boolean method1221(int var1, int var2, int var3) {
		if (var1 >= 0 && var1 < anObjectArrayArray1357.length && anObjectArrayArray1357[var1] != null && var2 >= 0 && var2 < anObjectArrayArray1357[var1].length) {
			if (anObjectArrayArray1357[var1][var2] != null) {
				return true;
			} else if (anObjectArray1356[var1] != null) {
				return true;
			} else {
				method1158(var1, 337574752);
				return anObjectArray1356[var1] != null;
			}
		} else {
			return false;
		}
	}

}
