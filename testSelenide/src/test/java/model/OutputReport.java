package model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
import common.FileUtil;
import dto.DataBean;
import dto.KindBean;

public class OutputReport {
	private String separator = java.io.File.separator;

	public OutputReport() {
	}

	public void outputExls(KindBean kb, ArrayList<DataBean> dataList) {
//		new FileUtil().moveFile(Const.COPYPICFROM, Const.COPYPICTO);

		String reportFileName = "Report_" + kb.getTestCaseId() + ".xlsx";

		XSSFColor color1 = new XSSFColor(new java.awt.Color(64, 224, 208));
		XSSFColor color2 = new XSSFColor(new java.awt.Color(255, 255, 255));

		try {
			short font_size_normal = 10;

			ExcelUtil xlsInstance = ExcelUtil.getInstance();

			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet(Const.SHEETNAME);

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

				// set message
				xlsInstance.createCell(style3, rowT, 0, 0, (String) dto.getMsg());

				XSSFDrawing patriarch = sheet.createDrawingPatriarch();

				XSSFClientAnchor anchor = new XSSFClientAnchor(100, 100, 255, 255, 1, rowIndex + 2, 1 + Const.PICWIDTH,
						rowIndex + 2 + Const.PICHEIGHT);

				rowIndex = rowIndex + Const.PICHEIGHT;

				ByteArrayOutputStream byteOutPut = new ByteArrayOutputStream();

				BufferedImage bufferImage = ImageIO.read(new File(Const.COPYPICTO + separator + dto.getImgPath()));

				ImageIO.write(bufferImage, "png", byteOutPut);

				patriarch.createPicture(anchor,
						wb.addPicture(byteOutPut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_PNG));
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
