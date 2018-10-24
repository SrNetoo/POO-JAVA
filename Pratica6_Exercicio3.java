///////////////////////////////////////////////////////////////////////////////////////////////////////////////
**********DICIONARIO***************

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Dicionario {

    public String word;
    public String description;

    static List<Dicionario> dicio = new ArrayList<Dicionario>();

    // construtores
    public Dicionario(){
        this.word=" ";
        this.description=" ";
    }

    public Dicionario(String p, String s){
        this.word=p;
        this.description=s;
    }


    //metodos

    /**
     *  Adiciona uma palavra
     */

    public static boolean adicionar(String palavra, String descricao){

        // checa se a palavra ja existe
        for(int i=0; i<dicio.size(); i++){
            if(dicio.get(i).word.equals(palavra)){
                return false;
            }
        }

        dicio.add(new Dicionario(palavra,descricao));
        return true;

    }


    /**
     *  Busca uma palavra
     */

    public static String buscar(String palavra){

        for(int i=0; i<dicio.size(); i++){
            if(dicio.get(i).word.equals(palavra)){
                System.out.println(dicio.get(i).description);
                return dicio.get(i).description;
            }
        }

        String resposta ="";
        return resposta;
    }

    /**
     *  Mostra todos
     */

    public static void mostrarTodo(){
        for(int i=0; i<dicio.size(); i++){
            System.out.println(dicio.get(i).word + ":" + dicio.get(i).description);
        }
    }


}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
********DICIOARIO SIMPLES*************

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DicionarioSimples extends Dicionario {

    public DicionarioSimples(String palavra, String significado){
        super(palavra,significado);
    }


}

/////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
************DICIONAIRO INGLES PORTUGUES***********

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DicionarioIP extends Dicionario {
    public DicionarioIP(String palavra,String sinonimo){
        super(palavra , sinonimo);
    }


    /**
     *  Sobrescreve o metodo Mostra todos
     */

    public static void mostrarTodo(){
        int x=0;


        for(int i=0; i<dicio.size(); i++){

            String parts[] = dicio.get(i).description.split(" ");
            System.out.print(dicio.get(i).word + ":");
            for(int j=0; j<parts.length - 1; j++){
                System.out.print(parts[j] + ",");
                x = j+1;
            }
            System.out.print(parts[x]);
            System.out.println(" ");
        }

    }


}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
