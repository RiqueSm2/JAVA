package DataEhora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DTime {
    public static void main (String[] args){
    // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html    
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Tem como colocar direto no argumento
	DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    LocalDate d01 = LocalDate.now(); //Apenas a data de AGORA
    LocalDateTime d02 = LocalDateTime.now(); //Data e hora de AGORA
    Instant d03 = Instant.now(); //Retorna a data hora global de AGORA

    LocalDate d04 = LocalDate.parse("2022-07-20"); //Texto ISO 8601 -> Data-hora
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//ISO 8601 DH -TIME
	Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //ISO 8601 HORARIO DE LONDRES 'Z'
	Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//-03:00 DO HORARIO DE LONDRES
    

    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);//Texto formato customizado, data
	LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);//Texto formato customizado, data e hora 


    LocalDate d10 = LocalDate.of(2022, 07, 20);//dia, mês, ano
	LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);//dia, mês, ano, horario


    System.out.println("d01 = " + d01);
    System.out.println("d02 = " + d02);
    System.out.println("d03 = " + d03);
    System.out.println("d04 = " + d04.toString());
	System.out.println("d05 = " + d05.toString());
	System.out.println("d06 = " + d06.toString());
	System.out.println("d07 = " + d07.toString());
	System.out.println("d08 = " + d08.toString());
	System.out.println("d09 = " + d09.toString());
	System.out.println("d10 = " + d10.toString());
	System.out.println("d11 = " + d11.toString());

	}
    }
    

