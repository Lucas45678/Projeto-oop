package poo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date data = new Date();
        System.out.println(formato.format(data));
	
        // Cria objeto Calendar
        Calendar cal = Calendar.getInstance();
        // Define a variaval q Calendar vai modificar
        cal.setTime(data);
        
        /* Por exemplo, para obter os minutos vc deve criar
         * uma variavel q vai armazena-lo. Depois chame o 
         * metodo get do objeto Calendar. No argumento vc 
         * informa a class Calendar.<oq vc deseja buscar>
         */
        int minutos = cal.get(Calendar.MINUTE);
        /* Para o Calendar os meses começa no zero, então vc
         * precisa adicionar 1 antes de chamar o mês. */
        int mes = 1 + cal.get(Calendar.MONTH);
        
        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);
        

	}
}
