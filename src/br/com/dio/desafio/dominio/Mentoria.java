package br.com.dio.desafio.dominio;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private String data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public String getData() {
        return data;
    }

    public String setData(LocalDate data) {
        LocalDate localDate = data;
        Date date = Date.valueOf(localDate);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String data1 =format.format(date);

        return this.data = data1;
    }

    @Override
    public String toString() {
        return "\n ** Mentoria: \n " +
                "  - titulo: " + getTitulo() + '\'' + "\n" +
                "   - descricao: " + getDescricao() + '\'' + "\n" +
                "   - data: " + data;
    }
}
