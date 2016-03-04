import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class6 {

	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array99;
	static InterfaceDef aInterfaceDef_103;
	public static final int anInt104 = 177;
	public static final int anInt106 = 24;
	static final int anInt107 = 102;
	JagexMap aJagexMap_101 = new JagexMap(256);
	JagexMap aJagexMap_102 = new JagexMap(256);
	IndexDescriptor aIndexDescriptor_100;
	IndexDescriptor aIndexDescriptor_105;

	LinkedEntry_Sub1_Sub1 method140(int var1, int var2, int[] var3, int var4) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var7 = (long) var5;
		LinkedEntry_Sub1_Sub1 var6 = (LinkedEntry_Sub1_Sub1) aJagexMap_102.get(var7);
		if (var6 != null) {
			return var6;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class8 var9 = Class8.method184(aIndexDescriptor_100, var1, var2);
			if (var9 == null) {
				return null;
			} else {
				var6 = var9.method182();
				aJagexMap_102.put(var6, var7);
				if (var3 != null) {
					var3[0] -= var6.aByteArray2392.length;
				}

				return var6;
			}
		}
	}

	LinkedEntry_Sub1_Sub1 method141(int var1, int var2, int[] var3, byte var4) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var6 = (long) var5 ^ 4294967296L;
		LinkedEntry_Sub1_Sub1 var8 = (LinkedEntry_Sub1_Sub1) aJagexMap_102.get(var6);
		if (var8 != null) {
			return var8;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			LinkedEntry_Sub2 var9 = (LinkedEntry_Sub2) aJagexMap_101.get(var6);
			if (var9 == null) {
				var9 = LinkedEntry_Sub2.method1729(aIndexDescriptor_105, var1, var2);
				if (var9 == null) {
					return null;
				}

				aJagexMap_101.put(var9, var6);
			}

			var8 = var9.method1736(var3);
			if (var8 == null) {
				return null;
			} else {
				var9.unlink();
				aJagexMap_102.put(var8, var6);
				return var8;
			}
		}
	}

	public LinkedEntry_Sub1_Sub1 method142(int var1, int[] var2, byte var3) {
		if (aIndexDescriptor_100.method1160((byte) 0) != 1) {
			if (aIndexDescriptor_100.numFilesInContainer(var1) != 1) {
				throw new RuntimeException();
			} else {
				return method140(var1, 0, var2, -2075382171);
			}
		} else {
			return method140(0, var1, var2, -2077315955);
		}
	}

	static void method143(int var0) {
		Class3.aString55 = Class3.aString55.trim();
		if (Class3.aString55.length() == 0) {
			CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1298, Class90.aString1195, Class90.aString1300);
		} else {
			long var1 = Class70.method939(-380924934);
			byte var3;
			if (var1 == 0L) {
				var3 = 5;
			} else {
				String var4 = Class3.aString55;
				Random random = new Random();
				DataBuffer securebuf = new DataBuffer(128);
				DataBuffer secureBuf = new DataBuffer(128);
				int[] seed = new int[]{random.nextInt(), random.nextInt(), (int) (var1 >> 32), (int) var1};
				securebuf.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; var9++) {
					securebuf.writeInt(random.nextInt());
				}

				securebuf.writeInt(seed[0]);
				securebuf.writeInt(seed[1]);
				securebuf.writeLong(var1);
				securebuf.writeLong(0L);

				for (var9 = 0; var9 < 4; var9++) {
					securebuf.writeInt(random.nextInt());
				}

				System.out.println("fak");
				securebuf.doRsa(Class28.aBigInteger348, Class28.aBigInteger355);
				secureBuf.writeByte(10);

				for (var9 = 0; var9 < 3; var9++) {
					secureBuf.writeInt(random.nextInt());
				}

				secureBuf.writeLong(random.nextLong());
				secureBuf.write6Byte(random.nextLong());
				Class59.writeRandomDat(secureBuf, 1414336477);
				secureBuf.writeLong(random.nextLong());
				System.out.println("FML");
				secureBuf.doRsa(Class28.aBigInteger348, Class28.aBigInteger355);
				var9 = Class56.calcStringBytes(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				DataBuffer var10 = new DataBuffer(var9);
				var10.writeStr(var4);
				var10.pos = var9 * 1303963473;
				var10.method1885(seed);
				DataBuffer loginbuf = new DataBuffer(var10.pos * 1736753585 + secureBuf.pos * 1736753585 + securebuf.pos * 1736753585 + 5);
				loginbuf.writeByte(2);
				loginbuf.writeByte(securebuf.pos * 1736753585);
				loginbuf.writeBytes(securebuf.data, 0, securebuf.pos * 1736753585);
				loginbuf.writeByte(secureBuf.pos * 1736753585);
				loginbuf.writeBytes(secureBuf.data, 0, secureBuf.pos * 1736753585);
				loginbuf.writeShort(var10.pos * 1736753585);
				loginbuf.writeBytes(var10.data, 0, var10.pos * 1736753585);
				byte[] var12 = loginbuf.data;
				String var13 = method149(var12, 0, var12.length, 46321444);
				String var14 = var13;

				byte var20;
				try {
					URL url = new URL(ScriptInvocation.method1836("services", false) + "m=accountappeal/login.ws");
					URLConnection urlConnections = url.openConnection();
					urlConnections.setDoInput(true);
					urlConnections.setDoOutput(true);
					urlConnections.setConnectTimeout(5000);
					OutputStreamWriter outWriter = new OutputStreamWriter(urlConnections.getOutputStream());
					outWriter.write("data2=" + Class26.method370(var14) + "&dest=" + Class26.method370("passwordchoice.ws"));
					outWriter.flush();
					InputStream var18 = urlConnections.getInputStream();
					loginbuf = new DataBuffer(new byte[1000]);

					while (true) {
						int var19 = var18.read(loginbuf.data, loginbuf.pos * 1736753585, 1000 - loginbuf.pos * 1736753585);
						if (var19 == -1) {
							outWriter.close();
							var18.close();
							String var25 = new String(loginbuf.data);
							if (var25.startsWith("OFFLINE")) {
								var20 = 4;
							} else if (var25.startsWith("WRONG")) {
								var20 = 7;
							} else if (var25.startsWith("RELOAD")) {
								var20 = 3;
							} else if (var25.startsWith("Not permitted for social network accounts.")) {
								var20 = 6;
							} else {
								loginbuf.method2066(seed);

								while (loginbuf.pos * 1736753585 > 0 && loginbuf.data[loginbuf.pos * 1736753585 - 1] == 0) {
									loginbuf.pos -= 1303963473;
								}

								var25 = new String(loginbuf.data, 0, loginbuf.pos * 1736753585);
								boolean var21;
								if (var25 == null) {
									var21 = false;
								} else {
									label78:
									{
										try {
											new URL(var25);
										} catch (MalformedURLException var23) {
											var21 = false;
											break label78;
										}

										var21 = true;
									}
								}

								if (var21) {
									Class89.method1120(var25, true, false, -982469919);
									var20 = 2;
								} else {
									var20 = 5;
								}
							}
							break;
						}

						loginbuf.pos += var19 * 1303963473;
						if (loginbuf.pos * 1736753585 >= 1000) {
							var20 = 5;
							break;
						}
					}
				} catch (Throwable var24) {
					var24.printStackTrace();
					var20 = 5;
				}

				var3 = var20;
			}

			switch (var3) {
				case 2:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1067, Class90.aString1302, Class90.aString1303);
					Class3.anInt57 = -552582362;
					break;
				case 3:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1304, Class90.aString1305, Class90.aString1306);
					break;
				case 4:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1260, Class90.aString1308, Class90.aString1309);
					break;
				case 5:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1310, Class90.aString1311, Class90.aString1133);
					break;
				case 6:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1313, Class90.aString1314, Class90.aString1315);
					break;
				case 7:
					CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1316, Class90.aString1317, Class90.aString1139);
			}

		}
	}

	public Class6(IndexDescriptor var1, IndexDescriptor var2) {
		aIndexDescriptor_100 = var1;
		aIndexDescriptor_105 = var2;
	}

	public static String method149(byte[] var0, int var1, int var2, int var3) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(Class92.aCharArray1340[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(Class92.aCharArray1340[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[2 + var5] & 255;
					var4.append(Class92.aCharArray1340[(var7 & 15) << 2 | var8 >>> 6]).append(Class92.aCharArray1340[var8 & 63]);
				} else {
					var4.append(Class92.aCharArray1340[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(Class92.aCharArray1340[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	public LinkedEntry_Sub1_Sub1 method151(int var1, int[] var2, byte var3) {
		if (aIndexDescriptor_105.method1160((byte) -95) != 1) {
			if (aIndexDescriptor_105.numFilesInContainer(var1) == 1) {
				return method141(var1, 0, var2, (byte) 127);
			} else {
				throw new RuntimeException();
			}
		} else {
			return method141(0, var1, var2, (byte) 41);
		}
	}

	static final boolean method152(byte[] data, int baseX, int baseZ) {
		boolean var4 = true;
		DataBuffer buffer = new DataBuffer(data);
		int objectId = -1;

		outer:
		while (true) {
			int var6 = buffer.readCompact();
			if (var6 == 0) {
				return var4;
			}

			objectId += var6;
			int objSettings = 0;
			boolean stop = false;

			while (true) {
				int settingIncrease;
				while (!stop) {
					settingIncrease = buffer.readCompact();
					if (settingIncrease == 0) {
						continue outer;
					}

					objSettings += settingIncrease - 1;
					int localZ = objSettings & 63;
					int localX = objSettings >> 6 & 63;
					int type = buffer.readUByte() >> 2;
					int x = localX + baseX;
					int z = localZ + baseZ;
					if (x > 0 && z > 0 && x < 103 && z < 103) {
						ObjectDef definition = Class56.getObjectDef(objectId);
						if (type != 22 || !GameClient.aBool2864 || definition.anInt2292 * -1087968583 != 0 || definition.anInt2275 * 445231797 == 1 || definition.aBool2264) {
							if (!definition.method2430(16711680)) {
								GameClient.anInt2920 += 200080755;
								var4 = false;
							}

							stop = true;
						}
					}
				}

				settingIncrease = buffer.readCompact();
				if (settingIncrease == 0) {
					break;
				}

				buffer.readUByte();
			}
		}
	}

	public static final boolean method153(byte var0) {
		Class65 var1 = Class65.aClass65_819;
		synchronized (var1) {
			if (Class65.anInt829 * 1213257401 == Class65.anInt828 * 418546577) {
				return false;
			} else {
				Class47.anInt661 = Class65.anIntArray825[Class65.anInt828 * 418546577] * 1952977483;
				Class41.aChar594 = Class65.aCharArray812[Class65.anInt828 * 418546577];
				Class65.anInt828 = (Class65.anInt828 * 418546577 + 1 & 127) * -201024143;
				return true;
			}
		}
	}

}
