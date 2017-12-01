package automationtestproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadSheetReader {

	private Workbook workbook;

	public SpreadSheetReader(String fileName) {
		FileInputStream excelFile = null;
		try {
			excelFile = new FileInputStream(new File(fileName));
			workbook = new XSSFWorkbook(excelFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (excelFile != null) {
					excelFile.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public List<String> readRow(int rowNo, String sheetName) {
		List<String> row = new ArrayList<String>();
		Sheet datatypeSheet = workbook.getSheet(sheetName);
		Row currentRow = datatypeSheet.getRow(rowNo);
		for (Cell currentCell : currentRow) {
			switch (currentCell.getCellTypeEnum()) {
			case STRING:
				row.add(currentCell.getStringCellValue());
				break;
			case NUMERIC:
				row.add(String.valueOf(currentCell.getNumericCellValue()));
				break;
			case BOOLEAN:
				row.add(String.valueOf(currentCell.getBooleanCellValue()));
				break;
			case BLANK:
				row.add(currentCell.getStringCellValue());
				break;
			case _NONE:
				break;
			case ERROR:
				row.add("Cell contains an error.");
				break;
			case FORMULA:
				row.add(currentCell.getCellFormula());
				break;
			}
		}
		return row;
	}

}