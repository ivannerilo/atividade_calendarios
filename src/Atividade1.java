import java.util.Calendar;

public class Atividade1 {

    public static void main(String[] args){
        Calendar data = Calendar.getInstance();
        String dataFormatada = formatadorData(data);
        System.out.println(dataFormatada);
    }

    public static String formatadorData(Calendar data){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String[] diasSemana = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};

        int dia = data.get(Calendar.DAY_OF_MONTH);
        int diaSemana = data.get(Calendar.DAY_OF_WEEK);
        int mes = data.get(Calendar.MONTH);
        int ano = data.get(Calendar.YEAR);
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minuto = data.get(Calendar.MINUTE);

        return String.format("Hoje é %s, dia %d de %s de %d, as %d horas e %d minutos", diasSemana[diaSemana - 1], dia, meses[mes], ano, hora, minuto);
    }
}
