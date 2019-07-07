
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.result.SMSParsedResult;
import com.google.zxing.client.result.SMSMMSResultParser;

public class Main {

	public static void main(String[] args) throws WriterException, IOException {
		
		QRCodeWriter qrcode = new QRCodeWriter();
		BitMatrix matrix = qrcode.encode("text you wish to encode", BarcodeFormat.QR_CODE, 400, 400);
		BufferedImage image = MatrixToImageWriter.toBufferedImage(matrix);
		ImageIO.write(image, "PNG", new File("d:\\TUM\\SS19\\Info\\QR_code.PNG"));
		
	}
}