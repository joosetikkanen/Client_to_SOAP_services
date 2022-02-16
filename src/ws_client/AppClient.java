package ws_client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.xignite.services.ExchangeConversion;
import com.xignite.services.XigniteCurrencies;
import com.xignite.services.XigniteCurrenciesSoap;



public class AppClient {
    

    
    public String add(String input1, String input2) {
        int input_N1 = Integer.parseInt(input1);
        int input_N2 = Integer.parseInt(input2);
        Calculator calc_service = new Calculator();
        CalculatorSoap calc_serviceSOAP = calc_service.getCalculatorSoap();
        int result = calc_serviceSOAP.add(input_N1, input_N2);
        return result + "";
    }
    
    public String subtract(String input1, String input2) {
        int input_N1 = Integer.parseInt(input1);
        int input_N2 = Integer.parseInt(input2);
        Calculator calc_service = new Calculator();
        CalculatorSoap calc_serviceSOAP = calc_service.getCalculatorSoap();
        int result = calc_serviceSOAP.subtract(input_N1, input_N2);
        return result + "";
    }
    
    public String multiply(String input1, String input2) {
        int input_N1 = Integer.parseInt(input1);
        int input_N2 = Integer.parseInt(input2);
        Calculator calc_service = new Calculator();
        CalculatorSoap calc_serviceSOAP = calc_service.getCalculatorSoap();
        int result = calc_serviceSOAP.multiply(input_N1, input_N2);
        return result + "";
    }

    public String divide(String input1, String input2) {
        int input_N1 = Integer.parseInt(input1);
        int input_N2 = Integer.parseInt(input2);
        Calculator calc_service = new Calculator();
        CalculatorSoap calc_serviceSOAP = calc_service.getCalculatorSoap();
        int result = calc_serviceSOAP.divide(input_N1, input_N2);
        return result + "";
    }
    
    public String convert2word(String inputStr) {
        
        BigInteger input_N;
        try {
           input_N = new BigInteger(inputStr);
        }
        catch(Exception e){
            return "Please provide a number";
        }
        
        BigInteger zero = new BigInteger("0");
        if (input_N.compareTo(zero) < 0) {
            return "Cannot convert negative numbers";
        }

        NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToWords(input_N);
        return result;
    }
    

    

}
