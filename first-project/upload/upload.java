package com.vijendra.project1.upload;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class upload {

	@RequestMapping(path = "upload", method = RequestMethod.POST)
	public String upload(@RequestParam MultipartFile param1) throws Exception
	{
		byte[] bytes = param1.getBytes();
		FileOutputStream fout = new FileOutputStream("src\\main\\resources\\static\\uploads " + param1.getOriginalFilename());
		fout.write(bytes);
		
		XSSFWorkbook workbook = new XSSFWorkbook("src\\main\\resources\\static\\uploads " + param1.getOriginalFilename());
		XSSFSheet worksheet = workbook.getSheetAt(0);
		XSSFRow row;
		for(int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++)
		{
			row = worksheet.getRow(i);
			System.out.println(row.getCell(0).getNumericCellValue() + "\t");
			System.out.println(row.getCell(1).getStringCellValue());
		}
		
		return param1.getOriginalFilename() + " uploaded successfully";
	}
}
