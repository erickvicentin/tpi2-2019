/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxselectdds;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author erick
 */
public class prueba {    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        System.out.println(fechaComoCadena);  
        System.out.println(getClass(fechaComoCadena));


    }

    
};
