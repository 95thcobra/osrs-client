import java.awt.*;
import java.awt.image.PixelGrabber;

public final class RenderedItemImage extends CacheableEntry_Sub23_Sub14 {

	public int[] pixels;
	public int anInt2595;
	public int width;
	public int anInt2593;
	public int height;
	public int anInt2591;
	public int anInt2590;

	public RenderedItemImage(int var1, int var2) {
		pixels = new int[var1 * var2];
		width = anInt2595 = var1;
		height = anInt2593 = var2;
		anInt2591 = 0;
		anInt2590 = 0;
	}

	public RenderedItemImage(byte[] pictureData, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(pictureData);
			MediaTracker tracker = new MediaTracker(component);
			tracker.addImage(image, 0);
			tracker.waitForAll();
			width = image.getWidth(component);
			height = image.getHeight(component);
			anInt2595 = width;
			anInt2593 = height;
			anInt2590 = 0;
			anInt2591 = 0;
			pixels = new int[width * height];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, width, height, pixels, 0, width);
			pixelGrabber.grabPixels();
		} catch (InterruptedException var6) {
			;
		}

	}

	public void method2986(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var6 = width;
			int var14 = height;
			int var13 = 0;
			int var8 = 0;
			int var9 = anInt2595;
			int var10 = anInt2593;
			int var12 = (var9 << 16) / var3;
			int var11 = (var10 << 16) / var4;
			int var5;
			if (anInt2590 > 0) {
				var5 = ((anInt2590 << 16) + var12 - 1) / var12;
				var1 += var5;
				var13 += var5 * var12 - (anInt2590 << 16);
			}

			if (anInt2591 > 0) {
				var5 = ((anInt2591 << 16) + var11 - 1) / var11;
				var2 += var5;
				var8 += var5 * var11 - (anInt2591 << 16);
			}

			if (var6 < var9) {
				var3 = ((var6 << 16) - var13 + var12 - 1) / var12;
			}

			if (var14 < var10) {
				var4 = ((var14 << 16) - var8 + var11 - 1) / var11;
			}

			var5 = var1 + var2 * anInt2399;
			int var15 = anInt2399 - var3;
			if (var2 + var4 > anInt2400) {
				var4 -= var2 + var4 - anInt2400;
			}

			int var7;
			if (var2 < anInt2397) {
				var7 = anInt2397 - var2;
				var4 -= var7;
				var5 += var7 * anInt2399;
				var8 += var11 * var7;
			}

			if (var1 + var3 > anInt2402) {
				var7 = var1 + var3 - anInt2402;
				var3 -= var7;
				var15 += var7;
			}

			if (var1 < anInt2401) {
				var7 = anInt2401 - var1;
				var3 -= var7;
				var5 += var7;
				var13 += var12 * var7;
				var15 += var7;
			}

			method3000(anIntArray2396, pixels, 0, var13, var8, var5, var15, var3, var4, var12, var11, var6);
		}
	}

	public void method2987(int var1, int var2, int var3, int var4) {
		method3011(anInt2595 << 3, anInt2593 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	public void method2989() {
		if (width != anInt2595 || height != anInt2593) {
			int[] var2 = new int[anInt2595 * anInt2593];

			for (int var1 = 0; var1 < height; var1++) {
				for (int var3 = 0; var3 < width; var3++) {
					var2[(var1 + anInt2591) * anInt2595 + var3 + anInt2590] = pixels[var1 * width + var3];
				}
			}

			pixels = var2;
			width = anInt2595;
			height = anInt2593;
			anInt2590 = 0;
			anInt2591 = 0;
		}
	}

	public void method2992() {
		int[] var1 = new int[width * height];
		int var4 = 0;

		for (int var2 = height - 1; var2 >= 0; --var2) {
			for (int var3 = 0; var3 < width; var3++) {
				var1[var4++] = pixels[var3 + var2 * width];
			}
		}

		pixels = var1;
		anInt2591 = anInt2593 - height - anInt2591;
	}

	public void method2994(int var1) {
		for (int var2 = height - 1; var2 > 0; --var2) {
			int var3 = var2 * width;

			for (int var4 = width - 1; var4 > 0; --var4) {
				if (pixels[var4 + var3] == 0 && pixels[var4 + var3 - 1 - width] != 0) {
					pixels[var4 + var3] = var1;
				}
			}
		}

	}

	public void method2995(int var1, int var2) {
		var1 += anInt2590;
		var2 += anInt2591;
		int var8 = var1 + var2 * anInt2399;
		int var4 = 0;
		int var5 = height;
		int var6 = width;
		int var9 = anInt2399 - var6;
		int var7 = 0;
		int var3;
		if (var2 < anInt2397) {
			var3 = anInt2397 - var2;
			var5 -= var3;
			var2 = anInt2397;
			var4 += var3 * var6;
			var8 += var3 * anInt2399;
		}

		if (var2 + var5 > anInt2400) {
			var5 -= var2 + var5 - anInt2400;
		}

		if (var1 < anInt2401) {
			var3 = anInt2401 - var1;
			var6 -= var3;
			var1 = anInt2401;
			var4 += var3;
			var8 += var3;
			var7 += var3;
			var9 += var3;
		}

		if (var1 + var6 > anInt2402) {
			var3 = var1 + var6 - anInt2402;
			var6 -= var3;
			var7 += var3;
			var9 += var3;
		}

		if (var6 > 0 && var5 > 0) {
			method2996(anIntArray2396, pixels, var4, var8, var6, var5, var9, var7);
		}
	}

	static void method2996(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; var8++) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	public void method2997(int var1, int var2) {
		var1 += anInt2590;
		var2 += anInt2591;
		int var8 = var1 + var2 * anInt2399;
		int var4 = 0;
		int var5 = height;
		int var3 = width;
		int var9 = anInt2399 - var3;
		int var7 = 0;
		int var6;
		if (var2 < anInt2397) {
			var6 = anInt2397 - var2;
			var5 -= var6;
			var2 = anInt2397;
			var4 += var6 * var3;
			var8 += var6 * anInt2399;
		}

		if (var2 + var5 > anInt2400) {
			var5 -= var2 + var5 - anInt2400;
		}

		if (var1 < anInt2401) {
			var6 = anInt2401 - var1;
			var3 -= var6;
			var1 = anInt2401;
			var4 += var6;
			var8 += var6;
			var7 += var6;
			var9 += var6;
		}

		if (var1 + var3 > anInt2402) {
			var6 = var1 + var3 - anInt2402;
			var3 -= var6;
			var7 += var6;
			var9 += var6;
		}

		if (var3 > 0 && var5 > 0) {
			method2998(anIntArray2396, pixels, 0, var4, var8, var3, var5, var9, var7);
		}
	}

	static void method2998(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			int var11;
			for (var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method2999(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var17 = var3;

		for (int var15 = -var8; var15 < 0; var15++) {
			int var14 = (var4 >> 16) * var11;

			for (int var18 = -var7; var18 < 0; var18++) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					int var16 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var16 & 16711935) * var13 & -16711936) + ((var2 & 65280) * var12 + (var16 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var17;
			var5 += var6;
		}

	}

	static void method3000(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var14 = -var8; var14 < 0; var14++) {
			int var15 = (var4 >> 16) * var11;

			for (int var13 = -var7; var13 < 0; var13++) {
				var2 = var1[(var3 >> 16) + var15];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public void method3001(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			method2997(var1, var2);
		} else {
			var1 += anInt2590;
			var2 += anInt2591;
			int var5 = var1 + var2 * anInt2399;
			int var7 = 0;
			int var8 = height;
			int var9 = width;
			int var10 = anInt2399 - var9;
			int var11 = 0;
			int var6;
			if (var2 < anInt2397) {
				var6 = anInt2397 - var2;
				var8 -= var6;
				var2 = anInt2397;
				var7 += var6 * var9;
				var5 += var6 * anInt2399;
			}

			if (var2 + var8 > anInt2400) {
				var8 -= var2 + var8 - anInt2400;
			}

			if (var1 < anInt2401) {
				var6 = anInt2401 - var1;
				var9 -= var6;
				var1 = anInt2401;
				var7 += var6;
				var5 += var6;
				var11 += var6;
				var10 += var6;
			}

			if (var1 + var9 > anInt2402) {
				var6 = var1 + var9 - anInt2402;
				var9 -= var6;
				var11 += var6;
				var10 += var6;
			}

			if (var9 > 0 && var8 > 0) {
				method3002(anIntArray2396, pixels, 0, var7, var5, var9, var8, var10, var11, var3, var4);
			}
		}
	}

	static void method3002(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var14 = (var10 & 65280) * var11 & 16711680;
		var10 = (var12 | var14) >>> 8;

		for (int var13 = -var6; var13 < 0; var13++) {
			for (int var15 = -var5; var15 < 0; var15++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var14 = (var2 & 65280) * var9 & 16711680;
					var0[var4++] = ((var12 | var14) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method3003(int var1, int var2, int var3) {
		var1 += anInt2590;
		var2 += anInt2591;
		int var4 = var1 + var2 * anInt2399;
		int var10 = 0;
		int var5 = height;
		int var6 = width;
		int var7 = anInt2399 - var6;
		int var8 = 0;
		int var9;
		if (var2 < anInt2397) {
			var9 = anInt2397 - var2;
			var5 -= var9;
			var2 = anInt2397;
			var10 += var9 * var6;
			var4 += var9 * anInt2399;
		}

		if (var2 + var5 > anInt2400) {
			var5 -= var2 + var5 - anInt2400;
		}

		if (var1 < anInt2401) {
			var9 = anInt2401 - var1;
			var6 -= var9;
			var1 = anInt2401;
			var10 += var9;
			var4 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > anInt2402) {
			var9 = var1 + var6 - anInt2402;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method3005(anIntArray2396, pixels, 0, var10, var4, var6, var5, var7, var8, var3);
		}
	}

	static void method3005(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var12 = -var6; var12 < 0; var12++) {
			for (int var13 = -var5; var13 < 0; var13++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var11 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var11 & 16711935) * var10 & -16711936) + ((var2 & 65280) * var9 + (var11 & 65280) * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method3007(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var11 = var2 < 0 ? -var2 : 0;
		int var18 = var2 + height <= var6 ? height : var6 - var2;
		int var9 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (var1 + width <= var5) {
			var10000 = width;
		} else {
			var10000 = var5 - var1;
		}

		int var14 = var3 + var1 + var9 + (var4 + var2 + var11) * anInt2399;
		int var12 = var2 + var11;

		for (int var17 = var11; var17 < var18; var17++) {
			int var19 = var7[var12];
			int var20 = var8[var12++];
			int var13 = var14;
			int var10;
			if (var1 < var19) {
				var10 = var19 - var1;
				var13 = var14 + (var10 - var9);
			} else {
				var10 = var9;
			}

			int var15;
			if (var1 + width <= var19 + var20) {
				var15 = width;
			} else {
				var15 = var19 + var20 - var1;
			}

			for (int var21 = var10; var21 < var15; var21++) {
				int var16 = pixels[var21 + var17 * width];
				if (var16 != 0) {
					anIntArray2396[var13++] = var16;
				} else {
					++var13;
				}
			}

			var14 += anInt2399;
		}

	}

	public void method3008(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * anInt2399;

			for (var2 = 0; var2 < var4; var2++) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; var1++) {
					anIntArray2396[var19++] = pixels[(var20 >> 16) + (var21 >> 16) * width];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt2399;
			}
		} catch (Exception var22) {
			;
		}

	}

	public void method3009(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * anInt2399;

			for (var2 = 0; var2 < var4; var2++) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; var1++) {
					int var20 = pixels[(var18 >> 16) + (var19 >> 16) * width];
					if (var20 != 0) {
						anIntArray2396[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt2399;
			}
		} catch (Exception var21) {
			;
		}

	}

	void method3011(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= anInt2590 << 4;
			var2 -= anInt2591 << 4;
			double var11 = (double) (var5 & 65535) * 9.587379924285257E-5D;
			int var16 = (int) Math.floor(Math.sin(var11) * (double) var6 + 0.5D);
			int var15 = (int) Math.floor(Math.cos(var11) * (double) var6 + 0.5D);
			int var17 = -var1 * var15 + -var2 * var16;
			int var27 = -(-var1) * var16 + -var2 * var15;
			int var18 = ((width << 4) - var1) * var15 + -var2 * var16;
			int var19 = -((width << 4) - var1) * var16 + -var2 * var15;
			int var20 = -var1 * var15 + ((height << 4) - var2) * var16;
			int var21 = -(-var1) * var16 + ((height << 4) - var2) * var15;
			int var22 = ((width << 4) - var1) * var15 + ((height << 4) - var2) * var16;
			int var23 = -((width << 4) - var1) * var16 + ((height << 4) - var2) * var15;
			int var24;
			int var25;
			if (var17 < var18) {
				var24 = var17;
				var25 = var18;
			} else {
				var24 = var18;
				var25 = var17;
			}

			if (var20 < var24) {
				var24 = var20;
			}

			if (var22 < var24) {
				var24 = var22;
			}

			if (var20 > var25) {
				var25 = var20;
			}

			if (var22 > var25) {
				var25 = var22;
			}

			int var28;
			int var29;
			if (var27 < var19) {
				var28 = var27;
				var29 = var19;
			} else {
				var28 = var19;
				var29 = var27;
			}

			if (var21 < var28) {
				var28 = var21;
			}

			if (var23 < var28) {
				var28 = var23;
			}

			if (var21 > var29) {
				var29 = var21;
			}

			if (var23 > var29) {
				var29 = var23;
			}

			var24 >>= 12;
			var25 = var25 + 4095 >> 12;
			var28 >>= 12;
			var29 = var29 + 4095 >> 12;
			var24 += var3;
			var25 += var3;
			var28 += var4;
			var29 += var4;
			var24 >>= 4;
			var25 = var25 + 15 >> 4;
			var28 >>= 4;
			var29 = var29 + 15 >> 4;
			if (var24 < anInt2401) {
				var24 = anInt2401;
			}

			if (var25 > anInt2402) {
				var25 = anInt2402;
			}

			if (var28 < anInt2397) {
				var28 = anInt2397;
			}

			if (var29 > anInt2400) {
				var29 = anInt2400;
			}

			var25 = var24 - var25;
			if (var25 < 0) {
				var29 = var28 - var29;
				if (var29 < 0) {
					int var13 = var28 * anInt2399 + var24;
					double var33 = 1.6777216E7D / (double) var6;
					int var32 = (int) Math.floor(Math.sin(var11) * var33 + 0.5D);
					int var10 = (int) Math.floor(Math.cos(var11) * var33 + 0.5D);
					int var38 = (var24 << 4) + 8 - var3;
					int var30 = (var28 << 4) + 8 - var4;
					int var37 = (var1 << 8) - (var30 * var32 >> 4);
					int var35 = (var2 << 8) + (var30 * var10 >> 4);
					int var7;
					int var8;
					int var9;
					int var14;
					int var26;
					int var31;
					int var36;
					if (var10 == 0) {
						if (var32 == 0) {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37;
								var26 = var35;
								var8 = var25;
								if (var37 >= 0 && var35 >= 0 && var37 - (width << 12) < 0 && var35 - (height << 12) < 0) {
									for (; var8 < 0; var8++) {
										var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
										if (var36 != 0) {
											anIntArray2396[var14++] = var36;
										} else {
											++var14;
										}
									}
								}

								++var31;
							}
						} else if (var32 < 0) {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37;
								var26 = var35 + (var38 * var32 >> 4);
								var8 = var25;
								if (var37 >= 0 && var37 - (width << 12) < 0) {
									if ((var7 = var26 - (height << 12)) >= 0) {
										var7 = (var32 - var7) / var32;
										var8 = var25 + var7;
										var26 += var32 * var7;
										var14 = var13 + var7;
									}

									if ((var7 = (var26 - var32) / var32) > var8) {
										var8 = var7;
									}

									while (var8 < 0) {
										var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
										if (var36 != 0) {
											anIntArray2396[var14++] = var36;
										} else {
											++var14;
										}

										var26 += var32;
										++var8;
									}
								}

								++var31;
								var37 -= var32;
							}
						} else {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37;
								var26 = var35 + (var38 * var32 >> 4);
								var8 = var25;
								if (var37 >= 0 && var37 - (width << 12) < 0) {
									if (var26 < 0) {
										var7 = (var32 - 1 - var26) / var32;
										var8 = var25 + var7;
										var26 += var32 * var7;
										var14 = var13 + var7;
									}

									if ((var7 = (1 + var26 - (height << 12) - var32) / var32) > var8) {
										var8 = var7;
									}

									while (var8 < 0) {
										var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
										if (var36 != 0) {
											anIntArray2396[var14++] = var36;
										} else {
											++var14;
										}

										var26 += var32;
										++var8;
									}
								}

								++var31;
								var37 -= var32;
							}
						}
					} else if (var10 < 0) {
						if (var32 == 0) {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37 + (var38 * var10 >> 4);
								var26 = var35;
								var8 = var25;
								if (var35 >= 0 && var35 - (height << 12) < 0) {
									if ((var7 = var9 - (width << 12)) >= 0) {
										var7 = (var10 - var7) / var10;
										var8 = var25 + var7;
										var9 += var10 * var7;
										var14 = var13 + var7;
									}

									if ((var7 = (var9 - var10) / var10) > var8) {
										var8 = var7;
									}

									while (var8 < 0) {
										var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
										if (var36 != 0) {
											anIntArray2396[var14++] = var36;
										} else {
											++var14;
										}

										var9 += var10;
										++var8;
									}
								}

								++var31;
								var35 += var10;
							}
						} else if (var32 < 0) {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37 + (var38 * var10 >> 4);
								var26 = var35 + (var38 * var32 >> 4);
								var8 = var25;
								if ((var7 = var9 - (width << 12)) >= 0) {
									var7 = (var10 - var7) / var10;
									var8 = var25 + var7;
									var9 += var10 * var7;
									var26 += var32 * var7;
									var14 = var13 + var7;
								}

								if ((var7 = (var9 - var10) / var10) > var8) {
									var8 = var7;
								}

								if ((var7 = var26 - (height << 12)) >= 0) {
									var7 = (var32 - var7) / var32;
									var8 += var7;
									var9 += var10 * var7;
									var26 += var32 * var7;
									var14 += var7;
								}

								if ((var7 = (var26 - var32) / var32) > var8) {
									var8 = var7;
								}

								while (var8 < 0) {
									var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
									if (var36 != 0) {
										anIntArray2396[var14++] = var36;
									} else {
										++var14;
									}

									var9 += var10;
									var26 += var32;
									++var8;
								}

								++var31;
								var37 -= var32;
								var35 += var10;
							}
						} else {
							for (var31 = var29; var31 < 0; var13 += anInt2399) {
								var14 = var13;
								var9 = var37 + (var38 * var10 >> 4);
								var26 = var35 + (var38 * var32 >> 4);
								var8 = var25;
								if ((var7 = var9 - (width << 12)) >= 0) {
									var7 = (var10 - var7) / var10;
									var8 = var25 + var7;
									var9 += var10 * var7;
									var26 += var32 * var7;
									var14 = var13 + var7;
								}

								if ((var7 = (var9 - var10) / var10) > var8) {
									var8 = var7;
								}

								if (var26 < 0) {
									var7 = (var32 - 1 - var26) / var32;
									var8 += var7;
									var9 += var10 * var7;
									var26 += var32 * var7;
									var14 += var7;
								}

								if ((var7 = (1 + var26 - (height << 12) - var32) / var32) > var8) {
									var8 = var7;
								}

								while (var8 < 0) {
									var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
									if (var36 != 0) {
										anIntArray2396[var14++] = var36;
									} else {
										++var14;
									}

									var9 += var10;
									var26 += var32;
									++var8;
								}

								++var31;
								var37 -= var32;
								var35 += var10;
							}
						}
					} else if (var32 == 0) {
						for (var31 = var29; var31 < 0; var13 += anInt2399) {
							var14 = var13;
							var9 = var37 + (var38 * var10 >> 4);
							var26 = var35;
							var8 = var25;
							if (var35 >= 0 && var35 - (height << 12) < 0) {
								if (var9 < 0) {
									var7 = (var10 - 1 - var9) / var10;
									var8 = var25 + var7;
									var9 += var10 * var7;
									var14 = var13 + var7;
								}

								if ((var7 = (1 + var9 - (width << 12) - var10) / var10) > var8) {
									var8 = var7;
								}

								while (var8 < 0) {
									var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
									if (var36 != 0) {
										anIntArray2396[var14++] = var36;
									} else {
										++var14;
									}

									var9 += var10;
									++var8;
								}
							}

							++var31;
							var35 += var10;
						}
					} else if (var32 < 0) {
						for (var31 = var29; var31 < 0; var13 += anInt2399) {
							var14 = var13;
							var9 = var37 + (var38 * var10 >> 4);
							var26 = var35 + (var38 * var32 >> 4);
							var8 = var25;
							if (var9 < 0) {
								var7 = (var10 - 1 - var9) / var10;
								var8 = var25 + var7;
								var9 += var10 * var7;
								var26 += var32 * var7;
								var14 = var13 + var7;
							}

							if ((var7 = (1 + var9 - (width << 12) - var10) / var10) > var8) {
								var8 = var7;
							}

							if ((var7 = var26 - (height << 12)) >= 0) {
								var7 = (var32 - var7) / var32;
								var8 += var7;
								var9 += var10 * var7;
								var26 += var32 * var7;
								var14 += var7;
							}

							if ((var7 = (var26 - var32) / var32) > var8) {
								var8 = var7;
							}

							while (var8 < 0) {
								var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
								if (var36 != 0) {
									anIntArray2396[var14++] = var36;
								} else {
									++var14;
								}

								var9 += var10;
								var26 += var32;
								++var8;
							}

							++var31;
							var37 -= var32;
							var35 += var10;
						}
					} else {
						for (var31 = var29; var31 < 0; var13 += anInt2399) {
							var14 = var13;
							var9 = var37 + (var38 * var10 >> 4);
							var26 = var35 + (var38 * var32 >> 4);
							var8 = var25;
							if (var9 < 0) {
								var7 = (var10 - 1 - var9) / var10;
								var8 = var25 + var7;
								var9 += var10 * var7;
								var26 += var32 * var7;
								var14 = var13 + var7;
							}

							if ((var7 = (1 + var9 - (width << 12) - var10) / var10) > var8) {
								var8 = var7;
							}

							if (var26 < 0) {
								var7 = (var32 - 1 - var26) / var32;
								var8 += var7;
								var9 += var10 * var7;
								var26 += var32 * var7;
								var14 += var7;
							}

							if ((var7 = (1 + var26 - (height << 12) - var32) / var32) > var8) {
								var8 = var7;
							}

							while (var8 < 0) {
								var36 = pixels[(var26 >> 12) * width + (var9 >> 12)];
								if (var36 != 0) {
									anIntArray2396[var14++] = var36;
								} else {
									++var14;
								}

								var9 += var10;
								var26 += var32;
								++var8;
							}

							++var31;
							var37 -= var32;
							var35 += var10;
						}
					}

				}
			}
		}
	}

	RenderedItemImage() {
	}

	public RenderedItemImage method3019() {
		RenderedItemImage var1 = new RenderedItemImage(width, height);
		var1.anInt2595 = anInt2595;
		var1.anInt2593 = anInt2593;
		var1.anInt2590 = anInt2595 - width - anInt2590;
		var1.anInt2591 = anInt2591;

		for (int var3 = 0; var3 < height; var3++) {
			for (int var2 = 0; var2 < width; var2++) {
				var1.pixels[var3 * width + var2] = pixels[var3 * width + width - 1 - var2];
			}
		}

		return var1;
	}

	public void method3026(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < pixels.length; var4++) {
			int var6 = pixels[var4];
			if (var6 != 0) {
				int var5 = var6 >> 16 & 255;
				var5 += var1;
				if (var5 < 1) {
					var5 = 1;
				} else if (var5 > 255) {
					var5 = 255;
				}

				int var7 = var6 >> 8 & 255;
				var7 += var2;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var6 & 255;
				var8 += var3;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				pixels[var4] = (var5 << 16) + (var7 << 8) + var8;
			}
		}

	}

	public void method3038(int var1) {
		if (width != anInt2595 || height != anInt2593) {
			int var2 = var1;
			if (var1 > anInt2590) {
				var2 = anInt2590;
			}

			int var8 = var1;
			if (var1 + anInt2590 + width > anInt2595) {
				var8 = anInt2595 - anInt2590 - width;
			}

			int var5 = var1;
			if (var1 > anInt2591) {
				var5 = anInt2591;
			}

			int var9 = var1;
			if (var1 + anInt2591 + height > anInt2593) {
				var9 = anInt2593 - anInt2591 - height;
			}

			int var6 = width + var2 + var8;
			int var10 = height + var5 + var9;
			int[] var3 = new int[var6 * var10];

			for (int var4 = 0; var4 < height; var4++) {
				for (int var7 = 0; var7 < width; var7++) {
					var3[(var4 + var5) * var6 + var7 + var2] = pixels[var4 * width + var7];
				}
			}

			pixels = var3;
			width = var6;
			height = var10;
			anInt2590 -= var2;
			anInt2591 -= var5;
		}
	}

	public void method3045() {
		method2710(pixels, width, height);
	}

	public void method3047() {
		int[] var1 = new int[width * height];
		int var3 = 0;

		for (int var2 = 0; var2 < height; var2++) {
			for (int var4 = width - 1; var4 >= 0; --var4) {
				var1[var3++] = pixels[var4 + var2 * width];
			}
		}

		pixels = var1;
		anInt2590 = anInt2595 - width - anInt2590;
	}

	public void method3053(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var7 = width;
			int var8 = height;
			int var9 = 0;
			int var10 = 0;
			int var12 = anInt2595;
			int var14 = anInt2593;
			int var13 = (var12 << 16) / var3;
			int var15 = (var14 << 16) / var4;
			int var11;
			if (anInt2590 > 0) {
				var11 = ((anInt2590 << 16) + var13 - 1) / var13;
				var1 += var11;
				var9 += var11 * var13 - (anInt2590 << 16);
			}

			if (anInt2591 > 0) {
				var11 = ((anInt2591 << 16) + var15 - 1) / var15;
				var2 += var11;
				var10 += var11 * var15 - (anInt2591 << 16);
			}

			if (var7 < var12) {
				var3 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			if (var8 < var14) {
				var4 = ((var8 << 16) - var10 + var15 - 1) / var15;
			}

			var11 = var1 + var2 * anInt2399;
			int var6 = anInt2399 - var3;
			if (var2 + var4 > anInt2400) {
				var4 -= var2 + var4 - anInt2400;
			}

			int var16;
			if (var2 < anInt2397) {
				var16 = anInt2397 - var2;
				var4 -= var16;
				var11 += var16 * anInt2399;
				var10 += var15 * var16;
			}

			if (var1 + var3 > anInt2402) {
				var16 = var1 + var3 - anInt2402;
				var3 -= var16;
				var6 += var16;
			}

			if (var1 < anInt2401) {
				var16 = anInt2401 - var1;
				var3 -= var16;
				var11 += var16;
				var9 += var13 * var16;
				var6 += var16;
			}

			method2999(anIntArray2396, pixels, 0, var9, var10, var11, var6, var3, var4, var13, var15, var7, var5);
		}
	}

	public void method3061(int var1) {
		int[] var2 = new int[width * height];
		int var6 = 0;

		for (int var4 = 0; var4 < height; var4++) {
			for (int var3 = 0; var3 < width; var3++) {
				int var5 = pixels[var6];
				if (var5 == 0) {
					if (var3 > 0 && pixels[var6 - 1] != 0) {
						var5 = var1;
					} else if (var4 > 0 && pixels[var6 - width] != 0) {
						var5 = var1;
					} else if (var3 < width - 1 && pixels[var6 + 1] != 0) {
						var5 = var1;
					} else if (var4 < height - 1 && pixels[var6 + width] != 0) {
						var5 = var1;
					}
				}

				var2[var6++] = var5;
			}
		}

		pixels = var2;
	}

}
