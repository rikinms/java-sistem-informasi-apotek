/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.File;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Administrator
 */
public class Controller_LapPemasok {
   
    public void cetak_preview(){
      try{
          Connection conn = Koneksi.DataBase.KoneksiDB();
          String path = "src/Report/RepLapPemasok.jasper";                                
          JasperReport jp=(JasperReport)JRLoader.loadObject(path);
          JasperPrint print   = JasperFillManager.fillReport(jp,null,conn);
          JasperViewer.viewReport(print,false);
          JasperViewer.setDefaultLookAndFeelDecorated(true);        

      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Data Tidak Dapat Dicetak!! "+ex.getMessage(),
            "Cetak Data",JOptionPane.ERROR_MESSAGE);
      }        
    }
       
    public void cetak_excel(){
        try{
            Connection conn = Koneksi.DataBase.KoneksiDB();
            String path = "src/Report/RepLapPemasok.jasper";  
            File xlsx = new File("D:/LapPemasok.xlsx");             
            JasperPrint print   = JasperFillManager.fillReport(path,null,conn);
            
            JRXlsxExporter Xlsxexporter = new JRXlsxExporter();
            Xlsxexporter.setParameter(JRExporterParameter.JASPER_PRINT,print);
            Xlsxexporter.setParameter(JRExporterParameter.OUTPUT_FILE,xlsx);
            Xlsxexporter.exportReport();
            
            JOptionPane.showMessageDialog(null,"Cek file pada drive D:/LapPemasok.xlsx");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Data Tidak Dapat Dicetak!! "+ex.getMessage(),
              "Cetak Data",JOptionPane.ERROR_MESSAGE);
        }        
    }
}
