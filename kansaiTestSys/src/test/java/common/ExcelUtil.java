package common;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/************************************************************/
/*  作成者	: 曹 (2010/02/01) Ver1.0							*/
/*  概要		: エクセルの単元格を作る								*/
/*  修正履歴	:												*/
/*				 (新規作成)									*/
/************************************************************/
public class ExcelUtil {
	private static ExcelUtil _instance = null;

	private ExcelUtil() {}

	public synchronized static ExcelUtil getInstance() {
		return ExcelUtil._instance == null ? new ExcelUtil() : ExcelUtil._instance;
	}

	/****************************************************************************/
	/*  関数名	: createCell													*/
	/*  引数		: 01 style	:スタイル												*/
	/* 			  02 row		:行オブジェクト										*/
	/* 			  03 colFrom	:列番号開始										*/
	/* 			  04 colTo		:列番号終了										*/
	/* 			  05 text		:文字列											*/
	/*  戻値		: なし															*/
	/*  作成者	: 曹 (2010/11/18) Ver1.0											*/
	/*  機能		: エクセルのセルを作る												*/
	/****************************************************************************/
	public void createCell(XSSFCellStyle style, XSSFRow row, int colFrom, int colTo, String text) {
		//結合CellのStyle処理
		for (int i = colFrom; i <= colTo; i++) {
			XSSFCell cell = row.createCell(i);
			cell.setCellStyle(style);
		}

		XSSFCell cell = row.createCell(colFrom);						// セル作成

		cell.setCellStyle(style);										// セルスタイル設定
		cell.setCellType(XSSFCell.CELL_TYPE_STRING);					// セルタイプ（？）
		cell.setCellValue(text);										// セル内容
	}

	public void createCell(XSSFCellStyle style, XSSFRow row, int colFrom, int colTo, Double text) {
		//結合CellのStyle処理
		for (int i = colFrom; i <= colTo; i++) {
			XSSFCell cell = row.createCell(i);
			cell.setCellStyle(style);
		}

		XSSFCell cell = row.createCell(colFrom);						// セル作成

		cell.setCellStyle(style);										// セルスタイル設定
		cell.setCellType(XSSFCell.CELL_TYPE_NUMERIC);					// セルタイプ（？）
		cell.setCellValue(text);										// セル内容
	}

	public void createCell(XSSFCellStyle style, XSSFRow row, int colFrom, int colTo, Integer text) {
		//結合CellのStyle処理
		for (int i = colFrom; i <= colTo; i++) {
			XSSFCell cell = row.createCell(i);
			cell.setCellStyle(style);
		}

		XSSFCell cell = row.createCell(colFrom);						// セル作成

		cell.setCellStyle(style);										// セルスタイル設定
		cell.setCellType(XSSFCell.CELL_TYPE_NUMERIC);					// セルタイプ（？）
		cell.setCellValue(text);										// セル内容
	}

	public XSSFCellStyle getCellStyle(XSSFWorkbook wb, XSSFColor color, short font_size, boolean isBorder, String alignKind, boolean isBold, boolean mulRows) {
		XSSFCellStyle style = wb.createCellStyle();						// スタイルオブジェクト作成

		// 改行 Style
		style.setWrapText(mulRows);

		// 文字 Style
		XSSFFont font = wb.createFont();								// フォントオブジェクト作成
		font.setFontHeightInPoints(font_size);							// 文字のサイズ
		font.setFontName("ＭＳ Ｐゴシック");							// 文字のテーマ

		if (isBold) {
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD); 				// 太字
		}

		style.setFont(font);											// フォント設定

		// Align Style
		if (!"".equals(alignKind)) {
			if ("LEFT".equals(alignKind)) {
				style.setAlignment(XSSFCellStyle.ALIGN_LEFT);			// 水平左表示
			} else if ("RIGHT".equals(alignKind)) {
				style.setAlignment(XSSFCellStyle.ALIGN_RIGHT);			// 水平右表示
			} else if ("CENTER".equals(alignKind)) {
				style.setAlignment(XSSFCellStyle.ALIGN_CENTER);			// 水平中央表示
			}
			style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER); 	// 垂直中央表示
		}

		// 枠線 Style
		if (isBorder) {
			style.setBorderTop(XSSFCellStyle.BORDER_THIN);				// 枠線上
			style.setBorderBottom(XSSFCellStyle.BORDER_THIN);			// 枠線下
			style.setBorderLeft(XSSFCellStyle.BORDER_THIN);				// 枠線左
			style.setBorderRight(XSSFCellStyle.BORDER_THIN);			// 枠線右
		}

		// 背景色 Style
		style.setFillForegroundColor(color);
		style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);

		return style;
	}
}
