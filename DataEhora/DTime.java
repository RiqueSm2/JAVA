package DataEhora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DTime {
    public static void main (String[] args){
    // https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html    
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Tem como colocar direto no argumento
	DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());/*Para formatar datas Instant deve se especificar o fuso horario (no caso do usuario) */
   
    LocalDate d01 = LocalDate.now(); //Apenas a data de AGORA
    LocalDateTime d02 = LocalDateTime.now(); //Data e hora de AGORA
    Instant d03 = Instant.now(); //Retorna a data hora global de AGORA

    LocalDate d04 = LocalDate.parse("2022-07-20"); //Texto ISO 8601 -> Data-hora
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//ISO 8601 DH -TIME
	Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //ISO 8601 HORARIO DE LONDRES 'Z'
	Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//-03:00 DO HORARIO DE LONDRES ""
    

    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);//Texto formato customizado, data
	LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);//Texto formato customizado, data e hora 
    LocalDate d012 = LocalDate.parse("2022-07-20");

    LocalDate d10 = LocalDate.of(2022, 07, 20);//dia, mês, ano
	LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);//dia, mês, ano, horario
   
    ZoneId.getAvailableZoneIds();/*Todas os nomes dos paises para fuso horario */
    LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

    /*O proprio Java também ja imprimi na versao ISO */
    System.out.println("d01 = " + d01);
     System.out.println("d01 apenas data = " + d01.getDayOfMonth());
     System.out.println("d01 apenas mes = " + d01.getMonthValue());
     System.out.println("d01 apenas mes = " + d01.getYear()); 

    System.out.println("d02 = " + d02);
     System.out.println("d02 apenas hora = " + d02.getHour()); 
     System.out.println("d02 apenas minutos = " + d02.getMinute()); 

    System.out.println("d03 = " + d03);
     System.out.println("r1 = " + r1);
     System.out.println("r2 = " + r2);

    System.out.println("d04 = " + d04);
	System.out.println("d05 = " + d05);
	System.out.println("d06 = " + d06);
	System.out.println("d07 = " + d07);
	System.out.println("d08 = " + d08);

	System.out.println("d09 = " + d09);
        System.out.println("d12 = " + d012.format(fmt1));
        System.out.println("d12 = " + fmt1.format(d04)); 

	System.out.println("d10 = " + d10);
	System.out.println("d11 = " + d11);




	}
    }
    

