package service;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Prograd;

public class ExcelGenerator {
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		try {
			String filename = "C:\\Users\\vinot\\Documents\\excel\\prograd.xls";
			HSSFWorkbook hwb = new HSSFWorkbook();
			HSSFSheet sheet = hwb.createSheet("sheet");
			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell((short) 0).setCellValue("Name");
			rowhead.createCell((short) 1).setCellValue("Prograd Id");
			rowhead.createCell((short) 2).setCellValue("Rating");
			rowhead.createCell((short) 3).setCellValue("Recommendation");
			rowhead.createCell((short) 4).setCellValue("Comments");
			
			int i = 0;

			for (Prograd st : list) {
				int j = i + 1;
				HSSFRow row = sheet.createRow((short) j);
				row.createCell((short) 0).setCellValue(st.getName());
				row.createCell((short) 1).setCellValue(st.getId());
				row.createCell((short) 2).setCellValue(st.getRate());
				row.createCell((short) 3).setCellValue(st.getRecommend());
				row.createCell((short) 4).setCellValue(st.getComment());
				i++;
			}

			 out = new FileOutputStream(filename);
			hwb.write(out);
		
			return hwb;
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			out.close();
		}
		return null;
		
	}
}
