import java.awt.*;
import java.awt.image.ImageObserver;

public class Class31 {

	static int anInt386;
	static long aLong387;
	static String aString388;
	static final int anInt389 = 1;

	protected static final void method413(int var0, String var1, Color var2, boolean var3, byte var4) {
		try {
			Graphics var5 = Class60.aCanvas771.getGraphics();
			if (Class61.aFont779 == null) {
				Class61.aFont779 = new Font("Helvetica", 1, 13);
				Class46.aFontMetrics659 = Class60.aCanvas771.getFontMetrics(Class61.aFont779);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111);
			}

			if (var2 == null) {
				var2 = new Color(140, 17, 17);
			}

			try {
				if (Class15.anImage191 == null) {
					Class15.anImage191 = Class60.aCanvas771.createImage(304, 34);
				}

				Graphics var6 = Class15.anImage191.getGraphics();
				var6.setColor(var2);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var0 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(2 + var0 * 3, 2, 300 - var0 * 3, 30);
				var6.setFont(Class61.aFont779);
				var6.setColor(Color.white);
				var6.drawString(var1, (304 - Class46.aFontMetrics659.stringWidth(var1)) / 2, 22);
				var5.drawImage(Class15.anImage191, Class5.anInt98 * 2104430923 / 2 - 152, Class60.anInt769 * -1064642111 / 2 - 18, (ImageObserver) null);
			} catch (Exception var9) {
				int var7 = Class5.anInt98 * 2104430923 / 2 - 152;
				int var8 = Class60.anInt769 * -1064642111 / 2 - 18;
				var5.setColor(var2);
				var5.drawRect(var7, var8, 303, 33);
				var5.fillRect(var7 + 2, var8 + 2, var0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var7 + 1, 1 + var8, 301, 31);
				var5.fillRect(var7 + 2 + var0 * 3, var8 + 2, 300 - var0 * 3, 30);
				var5.setFont(Class61.aFont779);
				var5.setColor(Color.white);
				var5.drawString(var1, var7 + (304 - Class46.aFontMetrics659.stringWidth(var1)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			Class60.aCanvas771.repaint();
		}

	}

	static boolean method414(char var0, int var1) {
		return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	public static boolean method415(char var0, int var1) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var3 = Class91.aCharArray1332;

				for (int var2 = 0; var2 < var3.length; var2++) {
					char var4 = var3[var2];
					if (var4 == var0) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

}
