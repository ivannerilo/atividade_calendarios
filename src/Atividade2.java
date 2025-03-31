import java.util.Calendar;
import java.util.GregorianCalendar;

public class Atividade2 {

    public static void main(String[] args){
        contaTempo(16, 11, 2025);
    }

  public static void contaTempo(int dia, int mes, int ano) {
        GregorianCalendar dataAtual = new GregorianCalendar();
        GregorianCalendar dataFutura = new GregorianCalendar(ano, mes - 1, dia); // Meses começam do zero

        if (dataFutura.before(dataAtual)) {
            System.out.println("Já passou, mano!");
            return;
        }

        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; 
        int anoAtual = dataAtual.get(Calendar.YEAR);

        int anos = ano - anoAtual;
        int meses = mes - mesAtual;
        int dias = dia - diaAtual;

        if (meses < 0) {
            anos--;
            meses += 12;
        }
        if (dias < 0) {
            meses--;
            if (meses < 0) {
                anos--;
                meses += 12;
            }
            dias += diasNoMes(anoAtual, mesAtual);
        }

        System.out.println("Faltam " + anos + " anos, " + meses + " meses e " + dias + " dias para a data " + dia + "/" + mes + "/" + ano);
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public static int diasNoMes(int ano, int mes) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && ehBissexto(ano)) {
            return 29; 
        }
        return dias[mes - 1];
    }
}
