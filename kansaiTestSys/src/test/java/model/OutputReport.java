package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import common.Const;
import common.ExcelUtil;
import dto.DataBean;
import dto.KindBean;

public class OutputReport {
	private String separator = java.io.File.separator;

	public OutputReport() {
	}

	// 解决图片失真，变为红色
	private BufferedImage toBufferedImage(java.awt.Image image) {
		if (image instanceof BufferedImage) {
			return (BufferedImage) image;
		}
		// This code ensures that all the pixels in the image are loaded
		image = new ImageIcon(image).getImage();
		BufferedImage bimage = null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			int transparency = Transparency.OPAQUE;
			GraphicsDevice gs = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gs.getDefaultConfiguration();
			bimage = gc.createCompatibleImage(image.getWidth(null), image.getHeight(null), transparency);
		} catch (HeadlessException e) {
			// The system does not have a screen
		}
		if (bimage == null) {
			// Create a buffered image using the default color model
			int type = BufferedImage.TYPE_INT_RGB;
			bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
		}
		// Copy image to buffered image
		Graphics g = bimage.createGraphics();
		// Paint the image onto the buffered image
		g.drawImage(image, 0, 0, null);
		g.dispose();
		return bimage;
	}

	// 解决图片背景变为黑色
	private BufferedImage toBufferedImage1(File file) {
		try {
			BufferedImage bimage = ImageIO.read(file);
			int width = bimage.getWidth();
			int height = bimage.getHeight();
			double pid = (double) 140 / (double) width;

			width = (int) (width * pid);
			height = (int) (height * pid);

			BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

			Graphics2D g = buffer.createGraphics();

			buffer = g.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);

			g.dispose();
			g = buffer.createGraphics();
			java.awt.Image small = bimage.getScaledInstance(width, height, java.awt.Image.SCALE_AREA_AVERAGING);
			g.drawImage(small, 0, 0, null);
			g.dispose();
			return buffer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void outputExls(String caseId, ArrayList<DataBean> dataList) {
		KindBean kb = new KindBean();

		kb.setTestCaseId(caseId);

		/**
		 * 1 - Android 5.0 2 - Android 6.0 3 - Android 7.0 4 - Android 8.0 5 - Android
		 * 9.0 6 - iPhone7Plus 7 - iPhone8 8 - iPhoneX 9 - Win7-IE 10 - Win7-Chrome 11 -
		 * Win10-IE 12 - Win10-Chrome 13 - Win10-Edge 14 - Mac-Safari 15 - Mac-Chrome
		 */

		switch (Const.TESTKIND) {
		case 1:
			kb.setKind1("スマホ");
			kb.setKind2("Android 5.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case 2:
			kb.setKind1("スマホ");
			kb.setKind2("Android 6.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			kb.setKind1("スマホ");
			kb.setKind2("iOS 12.4");
			kb.setBrower("Safari");
			kb.setTestKind("Appium");
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		}

		String reportFileName = "Report_" + kb.getTestCaseId() + ".xlsx";

		XSSFColor color1 = new XSSFColor(new java.awt.Color(64, 224, 208));
		XSSFColor color2 = new XSSFColor(new java.awt.Color(255, 255, 255));

		try {
			short font_size_normal = 10;

			ExcelUtil xlsInstance = ExcelUtil.getInstance();

			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet(kb.getTestCaseId());

			XSSFCellStyle style1 = xlsInstance.getCellStyle(wb, color1, font_size_normal, true, "RIGHT", false, false);
			XSSFCellStyle style2 = xlsInstance.getCellStyle(wb, color2, font_size_normal, true, "", false, false);
			XSSFCellStyle style3 = xlsInstance.getCellStyle(wb, color2, font_size_normal, false, "", false, false);

			// 合并单元格
			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 1));
			sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 1));
			sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 1));
			sheet.addMergedRegion(new CellRangeAddress(3, 3, 0, 1));
			sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 1));

			sheet.addMergedRegion(new CellRangeAddress(0, 0, 2, 3));
			sheet.addMergedRegion(new CellRangeAddress(1, 1, 2, 3));
			sheet.addMergedRegion(new CellRangeAddress(2, 2, 2, 3));
			sheet.addMergedRegion(new CellRangeAddress(3, 3, 2, 3));
			sheet.addMergedRegion(new CellRangeAddress(4, 4, 2, 3));

			//
			XSSFRow row1 = sheet.createRow(0);
			xlsInstance.createCell(style1, row1, 0, 1, "テストケースID");
			xlsInstance.createCell(style2, row1, 2, 3, kb.getTestCaseId());

			//
			XSSFRow row2 = sheet.createRow(1);
			xlsInstance.createCell(style1, row2, 0, 1, "大分類");
			xlsInstance.createCell(style2, row2, 2, 3, kb.getKind1());

			//
			XSSFRow row3 = sheet.createRow(2);
			xlsInstance.createCell(style1, row3, 0, 1, "小分類");
			xlsInstance.createCell(style2, row3, 2, 3, kb.getKind2());

			//
			XSSFRow row4 = sheet.createRow(3);
			xlsInstance.createCell(style1, row4, 0, 1, "ブラウザ");
			xlsInstance.createCell(style2, row4, 2, 3, kb.getBrower());

			//
			XSSFRow row5 = sheet.createRow(4);
			xlsInstance.createCell(style1, row5, 0, 1, "テスト手法");
			xlsInstance.createCell(style2, row5, 2, 3, kb.getTestKind());

			int rowIndex = 4;

			//
			for (int i = 0; i < dataList.size(); i++) {
				rowIndex = rowIndex + 3;

				XSSFRow rowT = sheet.createRow(rowIndex);

				DataBean dto = (DataBean) dataList.get(i);

				// コメント設定
				xlsInstance.createCell(style3, rowT, 0, 0, (String) dto.getMsg());

	            // 图片处理
	            ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
	            
	            String imgPath = System.getProperty("user.dir") + separator + Const.COPYPICFROM + separator + dto.getImgPath();
	            
	            java.awt.Image src = Toolkit.getDefaultToolkit().getImage(imgPath);
	            BufferedImage bufferImg = this.toBufferedImage(src);//Image to BufferedImage
	            ImageIO.write(bufferImg, "jpg", byteArrayOut);
	            
				XSSFDrawing patriarch = sheet.createDrawingPatriarch();

				XSSFClientAnchor anchor = new XSSFClientAnchor(100, 100, 255, 255, 1, rowIndex + 2, 1 + Const.PICWIDTH,
						rowIndex + 2 + Const.PICHEIGHT);

//				anchor.setAnchorType(3);

				rowIndex = rowIndex + Const.PICHEIGHT;	
				
				patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_JPEG));
			}

			//
			String path = System.getProperty("user.dir") + separator + "report" + separator + reportFileName;
			FileOutputStream fileOut = new FileOutputStream(path);
			wb.write(fileOut);
			fileOut.close();
			System.out.println(path + " にファイルを作成しました。");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
