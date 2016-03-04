import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.*;

public class Class2_Sub2 extends Class2 {

	AudioFormat anAudioFormat1710;
	byte[] aByteArray1711;
	SourceDataLine aSourceDataLine1708;
	int anInt1709;

	void method55(Component var1) {
		anAudioFormat1710 = new AudioFormat((float) (anInt34 * -46901051), 16, aBool19 ? 2 : 1, true, false);
		aByteArray1711 = new byte[256 << (aBool19 ? 2 : 1)];
	}

	void method95(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, anAudioFormat1710, var1 << (aBool19 ? 2 : 1));
			aSourceDataLine1708 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine1708.open();
			aSourceDataLine1708.start();
			anInt1709 = var1 * -273189997;
		} catch (LineUnavailableException var5) {
			int var3 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765);
			var3 = (var3 >>> 2 & 858993459) + (var3 & 858993459);
			var3 = (var3 >>> 4) + var3 & 252645135;
			var3 += var3 >>> 8;
			var3 += var3 >>> 16;
			int var4 = var3 & 255;
			if (var4 != 1) {
				method95(LinkedEntry_Sub12.method1851(var1, 1342615205));
			} else {
				aSourceDataLine1708 = null;
				throw var5;
			}
		}
	}

	int method66() {
		return anInt1709 * -95509861 - (aSourceDataLine1708.available() >> (aBool19 ? 2 : 1));
	}

	void method98() {
		int var1 = 256;
		if (aBool19) {
			var1 <<= 1;
		}

		for (int var3 = 0; var3 < var1; var3++) {
			int var2 = anIntArray21[var3];
			if ((var2 + 8388608 & -16777216) != 0) {
				var2 = 8388607 ^ var2 >> 31;
			}

			aByteArray1711[var3 * 2] = (byte) (var2 >> 8);
			aByteArray1711[1 + var3 * 2] = (byte) (var2 >> 16);
		}

		aSourceDataLine1708.write(aByteArray1711, 0, var1 << 1);
	}

	void method60() {
		aSourceDataLine1708.flush();
	}

	void method59() {
		if (aSourceDataLine1708 != null) {
			aSourceDataLine1708.close();
			aSourceDataLine1708 = null;
		}

	}

}
