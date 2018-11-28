package itext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloPDF {

	@Test
	public void test1() {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("D://Hello.pdf"));
			document.open();
			document.add(new Paragraph("Hello111"));
			System.out.println("生成成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			document.close();
		}
	}
	
	@Test
	public void test2(){

		Rectangle rect = new Rectangle(PageSize.A4);
		rect.setBackgroundColor(BaseColor.LIGHT_GRAY);
		rect.setBorder(Rectangle.BOX);
		rect.setBorderColor(BaseColor.DARK_GRAY);
		rect.setBorderWidth(5);
		Document document = new Document(rect,10,10,10,10);
		try {
			PdfWriter.getInstance(document, new FileOutputStream("D://Hello.pdf"));
			document.open();
			document.add(new Paragraph("Hello111"));
			System.out.println("生成成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			document.close();
		}
	
	}
	@Test
	public void test3(){
		
		Rectangle rect = new Rectangle(PageSize.A4);
		rect.setBackgroundColor(BaseColor.LIGHT_GRAY);
		rect.setBorder(Rectangle.BOX);
		rect.setBorderColor(BaseColor.DARK_GRAY);
		rect.setBorderWidth(5);
		Document document = new Document(rect,10,10,10,10);
		try {
			PdfWriter pdf = PdfWriter.getInstance(document, new FileOutputStream("D://Hello.pdf"));
			pdf.setViewerPreferences(PdfWriter.PageModeUseThumbs|PdfWriter.PageLayoutTwoColumnLeft|PdfWriter.HideMenubar);
			document.open();
			document.add(new Paragraph("Hello111w我们"));
			System.out.println("生成成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			document.close();
		}
	}
		@Test
		public void test4(){
			
			Rectangle rect = new Rectangle(PageSize.A4);
			rect.setBackgroundColor(BaseColor.LIGHT_GRAY);
			rect.setBorder(Rectangle.BOX);
			rect.setBorderColor(BaseColor.DARK_GRAY);
			rect.setBorderWidth(5);
			Document document = new Document(rect,10,10,10,10);
			try {
				PdfWriter pdf = PdfWriter.getInstance(document, new FileOutputStream("D://Hello.pdf"));
				pdf.setViewerPreferences(PdfWriter.PageModeUseThumbs|PdfWriter.PageLayoutTwoColumnLeft|PdfWriter.HideMenubar);
				BaseFont font = null;
				Font fontchinese = null;
				try {
					/**
					 * @param 字体名字
					 * @param 字体
					 */
					font = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED);
					fontchinese = new Font(font, 12, Font.NORMAL);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				document.open();
				document.add(new Paragraph("Hello111w我们",fontchinese));
				System.out.println("生成成功");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				document.close();
			}
		
	}
		
		@SuppressWarnings("deprecation")
		@Test
		public void test5(){
			
			Rectangle rect = new Rectangle(PageSize.A4);
			rect.setBackgroundColor(BaseColor.LIGHT_GRAY);
			rect.setBorder(Rectangle.BOX);
			rect.setBorderColor(BaseColor.DARK_GRAY);
			rect.setBorderWidth(5);
			Document document = new Document(rect,10,10,10,10);
			try {
				PdfWriter pdf = PdfWriter.getInstance(document, new FileOutputStream("D://Hello.pdf"));
				pdf.setViewerPreferences(PdfWriter.PageModeUseThumbs|PdfWriter.PageLayoutTwoColumnLeft|PdfWriter.HideMenubar);
				/**
				 * 加密类型
				 * 使用者密码
				 * 拥有着密码（全能）
				 * 使用者能干吗
				 */
				pdf.setEncryption(PdfWriter.STANDARD_ENCRYPTION_40, "111", "222", PdfWriter.ALLOW_COPY);
				document.open();
				document.add(new Paragraph("Hello111"));
				System.out.println("生成成功");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				document.close();
			}
		}

}
