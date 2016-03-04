import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class63_Sub1 extends Class63 {

	public static final int anInt1835 = 214;
	static AsyncJob connectionJob;
	public static final int anInt1843 = 227;
	int anInt1838 = -877089024;
	int anInt1837 = -1685788471;
	long aLong1839 = Class10.method216((short) 255) * -7773687020546477405L;
	int anInt1840;
	int anInt1842 = 0;
	long[] aLongArray1836 = new long[10];

	static final void method2089(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = LinkedEntry_Sub6.aClass39_1732.method646(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var17;
		if (var6 != 0) {
			var10 = LinkedEntry_Sub6.aClass39_1732.method531(var0, var1, var2, var6);
			var11 = var10 >> 6 & 3;
			var12 = var10 & 31;
			var9 = var3;
			if (var6 > 0) {
				var9 = var4;
			}

			int[] var7 = Class3.aClass109_Sub23_Sub14_Sub2_73.pixels;
			var8 = var1 * 4 + 24624 + (103 - var2) * 2048;
			var17 = var6 >> 14 & 32767;
			ObjectDef var13 = Class56.getObjectDef(var17);
			if (var13.anInt2287 * -1134068183 != -1) {
				CacheableEntry_Sub23_Sub14_Sub1 var14 = Class133.aClass109_Sub23_Sub14_Sub1Array1597[var13.anInt2287 * -1134068183];
				if (var14 != null) {
					int var15 = (var13.anInt2277 * -1258310884 - var14.anInt2585) / 2;
					int var16 = (var13.anInt2274 * 592665508 - var14.anInt2582) / 2;
					var14.method2972(var15 + var1 * 4 + 48, var16 + 48 + (104 - var2 - var13.anInt2274 * 1221908201) * 4);
				}
			} else {
				if (var12 == 0 || var12 == 2) {
					if (var11 == 0) {
						var7[var8] = var9;
						var7[var8 + 512] = var9;
						var7[1024 + var8] = var9;
						var7[1536 + var8] = var9;
					} else if (var11 == 1) {
						var7[var8] = var9;
						var7[1 + var8] = var9;
						var7[var8 + 2] = var9;
						var7[var8 + 3] = var9;
					} else if (var11 == 2) {
						var7[3 + var8] = var9;
						var7[512 + 3 + var8] = var9;
						var7[3 + var8 + 1024] = var9;
						var7[1536 + 3 + var8] = var9;
					} else if (var11 == 3) {
						var7[var8 + 1536] = var9;
						var7[1536 + var8 + 1] = var9;
						var7[1536 + var8 + 2] = var9;
						var7[3 + 1536 + var8] = var9;
					}
				}

				if (var12 == 3) {
					if (var11 == 0) {
						var7[var8] = var9;
					} else if (var11 == 1) {
						var7[3 + var8] = var9;
					} else if (var11 == 2) {
						var7[1536 + var8 + 3] = var9;
					} else if (var11 == 3) {
						var7[var8 + 1536] = var9;
					}
				}

				if (var12 == 2) {
					if (var11 == 3) {
						var7[var8] = var9;
						var7[512 + var8] = var9;
						var7[var8 + 1024] = var9;
						var7[var8 + 1536] = var9;
					} else if (var11 == 0) {
						var7[var8] = var9;
						var7[1 + var8] = var9;
						var7[2 + var8] = var9;
						var7[3 + var8] = var9;
					} else if (var11 == 1) {
						var7[3 + var8] = var9;
						var7[512 + var8 + 3] = var9;
						var7[1024 + 3 + var8] = var9;
						var7[1536 + var8 + 3] = var9;
					} else if (var11 == 2) {
						var7[var8 + 1536] = var9;
						var7[var8 + 1536 + 1] = var9;
						var7[var8 + 1536 + 2] = var9;
						var7[1536 + var8 + 3] = var9;
					}
				}
			}
		}

		var6 = LinkedEntry_Sub6.aClass39_1732.method529(var0, var1, var2);
		if (var6 != 0) {
			var10 = LinkedEntry_Sub6.aClass39_1732.method531(var0, var1, var2, var6);
			var11 = var10 >> 6 & 3;
			var12 = var10 & 31;
			var9 = var6 >> 14 & 32767;
			ObjectDef var18 = Class56.getObjectDef(var9);
			int var23;
			if (var18.anInt2287 * -1134068183 != -1) {
				CacheableEntry_Sub23_Sub14_Sub1 var20 = Class133.aClass109_Sub23_Sub14_Sub1Array1597[var18.anInt2287 * -1134068183];
				if (var20 != null) {
					var17 = (var18.anInt2277 * -1258310884 - var20.anInt2585) / 2;
					var23 = (var18.anInt2274 * 592665508 - var20.anInt2582) / 2;
					var20.method2972(var17 + 48 + var1 * 4, var23 + (104 - var2 - var18.anInt2274 * 1221908201) * 4 + 48);
				}
			} else if (var12 == 9) {
				var8 = 15658734;
				if (var6 > 0) {
					var8 = 15597568;
				}

				int[] var24 = Class3.aClass109_Sub23_Sub14_Sub2_73.pixels;
				var23 = (103 - var2) * 2048 + var1 * 4 + 24624;
				if (var11 != 0 && var11 != 2) {
					var24[var23] = var8;
					var24[var23 + 512 + 1] = var8;
					var24[var23 + 1024 + 2] = var8;
					var24[1536 + var23 + 3] = var8;
				} else {
					var24[1536 + var23] = var8;
					var24[1 + 1024 + var23] = var8;
					var24[var23 + 512 + 2] = var8;
					var24[3 + var23] = var8;
				}
			}
		}

		var6 = LinkedEntry_Sub6.aClass39_1732.method530(var0, var1, var2);
		if (var6 != 0) {
			var10 = var6 >> 14 & 32767;
			ObjectDef var21 = Class56.getObjectDef(var10);
			if (var21.anInt2287 * -1134068183 != -1) {
				CacheableEntry_Sub23_Sub14_Sub1 var22 = Class133.aClass109_Sub23_Sub14_Sub1Array1597[var21.anInt2287 * -1134068183];
				if (var22 != null) {
					var9 = (var21.anInt2277 * -1258310884 - var22.anInt2585) / 2;
					int var19 = (var21.anInt2274 * 592665508 - var22.anInt2582) / 2;
					var22.method2972(var9 + 48 + var1 * 4, var19 + 48 + (104 - var2 - var21.anInt2274 * 1221908201) * 4);
				}
			}
		}

	}

	public void method830(byte var1) {
		for (int var2 = 0; var2 < 10; var2++) {
			aLongArray1836[var2] = 0L;
		}

	}

	int method831(int var1, int var2, int var3) {
		int var4 = anInt1838 * 448437839;
		int var6 = anInt1837 * 937668985;
		anInt1838 = 784100628;
		anInt1837 = -1685788471;
		aLong1839 = Class10.method216((short) 255) * -7773687020546477405L;
		if (aLongArray1836[anInt1840 * -84686829] == 0L) {
			anInt1838 = var4 * -255084369;
			anInt1837 = var6 * -1685788471;
		} else if (aLong1839 * -3825563967405682421L > aLongArray1836[anInt1840 * -84686829]) {
			anInt1838 = (int) ((long) (var1 * 2560) / (aLong1839 * -3825563967405682421L - aLongArray1836[anInt1840 * -84686829])) * -255084369;
		}

		if (anInt1838 * 448437839 < 25) {
			anInt1838 = -2082141929;
		}

		if (anInt1838 * 448437839 > 256) {
			anInt1838 = -877089024;
			anInt1837 = (int) ((long) var1 - (-3825563967405682421L * aLong1839 - aLongArray1836[anInt1840 * -84686829]) / 10L) * -1685788471;
		}

		if (anInt1837 * 937668985 > var1) {
			anInt1837 = var1 * -1685788471;
		}

		aLongArray1836[anInt1840 * -84686829] = aLong1839 * -3825563967405682421L;
		anInt1840 = (anInt1840 * -84686829 + 1) % 10 * 387400219;
		int var5;
		if (anInt1837 * 937668985 > 1) {
			for (var5 = 0; var5 < 10; var5++) {
				if (aLongArray1836[var5] != 0L) {
					aLongArray1836[var5] += (long) (anInt1837 * 937668985);
				}
			}
		}

		if (anInt1837 * 937668985 < var2) {
			anInt1837 = var2 * -1685788471;
		}

		Class24.method357((long) (anInt1837 * 937668985));

		for (var5 = 0; anInt1842 * -354899107 < 256; anInt1842 += anInt1838 * 635797915) {
			++var5;
		}

		anInt1842 = (anInt1842 * -354899107 & 255) * -218889995;
		return var5;
	}

	public static void method2090(IndexDescriptor var0, int var1) {
		EnumDef.aIndexDescriptor_2185 = var0;
	}

	public static int method2091(int var0) {
		return (Class74.anInt892 -= 1792776501) * -1739239709 - 1;
	}

	static final boolean method2092(InterfaceDef var0, byte var1) {
		int var2 = var0.anInt1943 * -202095703;
		if (var2 == 205) {
			GameClient.anInt2915 = 1098944898;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				GameClient.aClass108_3140.method1346(var3, var4 == 1, -401514900);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				GameClient.aClass108_3140.method1347(var3, var4 == 1, (byte) 38);
			}

			if (var2 == 324) {
				GameClient.aClass108_3140.method1348(false, -1624953908);
			}

			if (var2 == 325) {
				GameClient.aClass108_3140.method1348(true, -496232562);
			}

			if (var2 == 326) {
				GameClient.secureBuffer.writeOpcode(33);
				GameClient.aClass108_3140.method1349(GameClient.secureBuffer, -43444068);
				return true;
			} else {
				return false;
			}
		}
	}

	Class63_Sub1() {
		for (int var1 = 0; var1 < 10; var1++) {
			aLongArray1836[var1] = aLong1839 * -3825563967405682421L;
		}

	}

	public static void method2093(PacketBuffer var0, int var1) {
		LinkedEntry_Sub21 var2 = (LinkedEntry_Sub21) Class118.aClass120_1535.method1498();
		if (var2 != null) {
			int var3 = var0.pos * 1736753585;
			var0.writeInt(var2.anInt2079 * -1768256597);

			for (int var4 = 0; var4 < var2.anInt2077 * -782078969; var4++) {
				if (var2.anIntArray2076[var4] != 0) {
					var0.writeByte(var2.anIntArray2076[var4]);
				} else {
					try {
						int var5 = var2.anIntArray2078[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.aFieldArray2082[var4];
							var7 = var6.getInt((Object) null);
							var0.writeByte(0);
							var0.writeInt(var7);
						} else if (var5 == 1) {
							var6 = var2.aFieldArray2082[var4];
							var6.setInt((Object) null, var2.anIntArray2081[var4]);
							var0.writeByte(0);
						} else if (var5 == 2) {
							var6 = var2.aFieldArray2082[var4];
							var7 = var6.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.aMethodArray2080[var4];
								var7 = var23.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var7);
							}
						} else {
							var23 = var2.aMethodArray2080[var4];
							byte[][] var24 = var2.aByteArrayArrayArray2083[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; var9++) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object) null, var8);
							if (var25 == null) {
								var0.writeByte(0);
							} else if (var25 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number) var25).longValue());
							} else if (var25 instanceof String) {
								var0.writeByte(2);
								var0.writeStr((String) var25);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.writeByte(-10);
					} catch (InvalidClassException var12) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var13) {
						var0.writeByte(-12);
					} catch (OptionalDataException var14) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var15) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var16) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var17) {
						var0.writeByte(-16);
					} catch (SecurityException var18) {
						var0.writeByte(-17);
					} catch (IOException var19) {
						var0.writeByte(-18);
					} catch (NullPointerException var20) {
						var0.writeByte(-19);
					} catch (Exception var21) {
						var0.writeByte(-20);
					} catch (Throwable var22) {
						var0.writeByte(-21);
					}
				}
			}

			var0.method1890(var3);
			var2.unlink();
		}
	}

}
