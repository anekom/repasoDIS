package ufv.dis.final2020.AMGRrepaso;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class GeneradorEAN13 {
	
	public static void generarEAN(Producto p){
		
		EAN13Writer ean13writer = new EAN13Writer();
		BitMatrix bitMatrix;
		try {
			bitMatrix = ean13writer.encode(p.getEAN13(), BarcodeFormat.EAN_13, 300, 100);
			Path path = FileSystems.getDefault().getPath("productos/" + p.getEAN13() + p.getNombre() + ".png");
			MatrixToImageWriter.writeToPath(bitMatrix, "png", path);
			
			
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
