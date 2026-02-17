package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.Timer;

public class CalculadoraDeTempo {
    private int tempototal;

    public int getTempototal() {
        return tempototal;
    }

//    public void inclui(Filme f) {
//        this.tempototal += f.getDuracaoEmMinutos();
//   }
//
//    public void inclui(Serie s) {
//        this.tempototal += s.getDuracaoEmMinutos();
//    }


    public void inclui(Titulo titulo){
        System.out.println("Adicione a duração em minutos de " + titulo);
        this.tempototal += titulo.getDuracaoEmMinutos();

    }
}
