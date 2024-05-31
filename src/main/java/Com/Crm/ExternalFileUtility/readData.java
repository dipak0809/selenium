package Com.Crm.ExternalFileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData {
	
	public static String ReadPropertyData(String key) throws IOException {
		Properties p =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\HP840G6\\eclipse\\Selenium\\Com.Crm.DemoWebShop\\src\\test\\resources\\PropertyFilePath\\importantDetails.properties");
		p.load(fis);
		String result = p.getProperty(key) ;
		return result ;
		
		}
	
	public static Sheet ReaddataExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP840G6\\Desktop\\AdvancedSelenium.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("giftcart");
		
		return sheet;
		
	}

}
