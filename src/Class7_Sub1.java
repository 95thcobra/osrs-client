import java.awt.*;
import java.awt.image.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

public final class Class7_Sub1 extends Class7 implements ImageProducer, ImageObserver {

	static Class82 aClass82_1705;
	static final int anInt1706 = 1;
	public static final int anInt1707 = 6;
	ImageConsumer anImageConsumer1704;
	ColorModel aColorModel1703;

	public final void method160(Graphics var1, int var2, int var3, int var4) {
		method1775(-2113123465);
		var1.drawImage(anImage111, var2, var3, this);
	}

	public final void method164(Graphics var1, int var2, int var3, int var4, int var5, byte var6) {
		method1776(var2, var3, var4, var5, -2137943106);
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage111, 0, 0, this);
		var1.setClip(var7);
	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return anImageConsumer1704 == var1;
	}

	static void method1774(int var0, int var1, byte var2) {
		if (GameClient.anInt2951 * -250760527 != 0 && var0 != -1) {
			Class97.method1247(Class44.aClass94_Sub1_634, var0, 0, GameClient.anInt2951 * -250760527, false, (byte) 15);
			GameClient.aBool2941 = true;
		}

	}

	public void startProduction(ImageConsumer var1) {
		addConsumer(var1);
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
	}

	synchronized void method1775(int var1) {
		if (anImageConsumer1704 != null) {
			anImageConsumer1704.setPixels(0, 0, anInt108 * -568569227, anInt110 * 774678777, aColorModel1703, anIntArray109, 0, anInt108 * -568569227);
			anImageConsumer1704.imageComplete(2);
		}
	}

	synchronized void method1776(int var1, int var2, int var3, int var4, int var5) {
		if (anImageConsumer1704 != null) {
			anImageConsumer1704.setPixels(var1, var2, var3, var4, aColorModel1703, anIntArray109, var2 * anInt108 * -568569227 + var1, anInt108 * -568569227);
			anImageConsumer1704.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	public synchronized void addConsumer(ImageConsumer var1) {
		anImageConsumer1704 = var1;
		var1.setDimensions(anInt108 * -568569227, anInt110 * 774678777);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel1703);
		var1.setHints(14);
	}

	public static void method1783(DataBuffer buffer, int var1, int var2) {
		LinkedEntry_Sub21 var3 = new LinkedEntry_Sub21();
		var3.anInt2077 = buffer.readUByte() * -514768457;
		var3.anInt2079 = buffer.readInt() * -924051709;
		var3.anIntArray2078 = new int[var3.anInt2077 * -782078969];
		var3.anIntArray2076 = new int[var3.anInt2077 * -782078969];
		var3.aFieldArray2082 = new Field[var3.anInt2077 * -782078969];
		var3.anIntArray2081 = new int[var3.anInt2077 * -782078969];
		var3.aMethodArray2080 = new Method[var3.anInt2077 * -782078969];
		var3.aByteArrayArrayArray2083 = new byte[var3.anInt2077 * -782078969][][];

		for (int var4 = 0; var4 < var3.anInt2077 * -782078969; var4++) {
			try {
				int var5 = buffer.readUByte();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = buffer.readString();
						var7 = buffer.readString();
						var8 = buffer.readUByte();
						System.out.println("Classpath " + var6 + ", " + var7);
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; var10++) {
							var9[var10] = buffer.readString();
						}

						String var26 = buffer.readString();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; var12++) {
								var13 = buffer.readInt();
								var11[var12] = new byte[var13];
								buffer.readBytes(var11[var12], 0, var13);
							}
						}

						var3.anIntArray2078[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; var13++) {
							var27[var13] = RuntimeException_Sub1.method3305(var9[var13], -921817989);
						}

						Class var28 = RuntimeException_Sub1.method3305(var26, -684648065);
						if (RuntimeException_Sub1.method3305(var6, -1520131529).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = RuntimeException_Sub1.method3305(var6, -639756416).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; var16++) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var27.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; var20++) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.aMethodArray2080[var4] = var17;
									}
								}
							}
						}

						var3.aByteArrayArrayArray2083[var4] = var11;
					}
				} else {
					var6 = buffer.readString();
					var7 = buffer.readString();
					var8 = 0;
					if (var5 == 1) {
						var8 = buffer.readInt();
					}

					var3.anIntArray2078[var4] = var5;
					var3.anIntArray2081[var4] = var8;
					if (RuntimeException_Sub1.method3305(var6, -212672452).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.aFieldArray2082[var4] = RuntimeException_Sub1.method3305(var6, -349357321).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var21.printStackTrace();
				var3.anIntArray2076[var4] = -1;
			} catch (SecurityException var22) {
				var22.printStackTrace();
				var3.anIntArray2076[var4] = -2;
			} catch (NullPointerException var23) {
				var23.printStackTrace();
				var3.anIntArray2076[var4] = -3;
			} catch (Exception var24) {
				var24.printStackTrace();
				var3.anIntArray2076[var4] = -4;
			} catch (Throwable var25) {
				var25.printStackTrace();
				var3.anIntArray2076[var4] = -5;
			}
		}

		Class118.aClass120_1535.method1495(var3);
	}

	public static void method1793(byte[] var0, int var1) {
		DataBuffer var2 = new DataBuffer(var0);
		var2.pos = (var0.length - 2) * 1303963473;
		Class18.anInt216 = var2.readUShort() * 1133427271;
		Class18.anIntArray218 = new int[Class18.anInt216 * -877080713];
		Class18.anIntArray219 = new int[Class18.anInt216 * -877080713];
		Class58.anIntArray756 = new int[Class18.anInt216 * -877080713];
		PacketDecoder.anIntArray341 = new int[Class18.anInt216 * -877080713];
		Class42.aByteArrayArray603 = new byte[Class18.anInt216 * -877080713][];
		var2.pos = (var0.length - 7 - Class18.anInt216 * 1573288888) * 1303963473;
		Class18.anInt220 = var2.readUShort() * 2054985485;
		Class18.anInt215 = var2.readUShort() * -1324487299;
		int var6 = (var2.readUByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			Class18.anIntArray218[var3] = var2.readUShort();
		}

		for (var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			Class18.anIntArray219[var3] = var2.readUShort();
		}

		for (var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			Class58.anIntArray756[var3] = var2.readUShort();
		}

		for (var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			PacketDecoder.anIntArray341[var3] = var2.readUShort();
		}

		var2.pos = (var0.length - 7 - Class18.anInt216 * 1573288888 - (var6 - 1) * 3) * 1303963473;
		CacheableEntry_Sub23_Sub10.anIntArray2316 = new int[var6];

		for (var3 = 1; var3 < var6; var3++) {
			CacheableEntry_Sub23_Sub10.anIntArray2316[var3] = var2.readTriByte();
			if (CacheableEntry_Sub23_Sub10.anIntArray2316[var3] == 0) {
				CacheableEntry_Sub23_Sub10.anIntArray2316[var3] = 1;
			}
		}

		var2.pos = 0;

		for (var3 = 0; var3 < Class18.anInt216 * -877080713; var3++) {
			int var9 = Class58.anIntArray756[var3];
			int var10 = PacketDecoder.anIntArray341[var3];
			int var11 = var9 * var10;
			byte[] var7 = new byte[var11];
			Class42.aByteArrayArray603[var3] = var7;
			int var8 = var2.readUByte();
			int var5;
			if (var8 == 0) {
				for (var5 = 0; var5 < var11; var5++) {
					var7[var5] = var2.readByte();
				}
			} else if (var8 == 1) {
				for (var5 = 0; var5 < var9; var5++) {
					for (int var4 = 0; var4 < var10; var4++) {
						var7[var9 * var4 + var5] = var2.readByte();
					}
				}
			}
		}

	}

	final void method177(int var1, int var2, Component var3, byte var4) {
		anInt108 = var1 * -1467126307;
		anInt110 = var2 * -952133303;
		anIntArray109 = new int[var1 * var2 + 1];
		aColorModel1703 = new DirectColorModel(32, 16711680, 65280, 255);
		anImage111 = var3.createImage(this);
		method1775(-428541934);
		var3.prepareImage(anImage111, this);
		method1775(-993392606);
		var3.prepareImage(anImage111, this);
		method1775(-345412264);
		var3.prepareImage(anImage111, this);
		method158(-2077600810);
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (var1 == anImageConsumer1704) {
			anImageConsumer1704 = null;
		}

	}

}
