package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas extends Audio {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferidos por todos!");
        }else {
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo está curtindo!");
        }
    }
}
