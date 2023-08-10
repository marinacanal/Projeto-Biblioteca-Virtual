/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Mascaras;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author luis.santos6
 */
public class Data {


public class DataMask {
    private SimpleDateFormat inputFormat;
    private SimpleDateFormat outputFormat;

    public DataMask(String inputPattern, String outputPattern) {
        inputFormat = new SimpleDateFormat(inputPattern);
        outputFormat = new SimpleDateFormat(outputPattern);
    }

    public String formatarData(String data) {
        try {
            Date dataFormatada = inputFormat.parse(data);
            return outputFormat.format(dataFormatada);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
String data = "2023-06-14";
        DataMask dataMask = new DataMask("yyyy-MM-dd", "dd/MM/yyyy");
        String dataFormatada = dataMask.formatarData(data);
        
    }


    

   








