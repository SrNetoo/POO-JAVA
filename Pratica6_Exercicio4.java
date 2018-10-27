/////////////////////////////////////////////////////////////////////////////////////////////////////////
*****Banco Dicionario****

import java.util.ArrayList;
import java.util.List;

public class BancoDicionarios {

    public String nome; //nome do dicionario
    public String tipo; // descreve se eh dicionario simples ou dicionarioIP
    Dicionario dici = new Dicionario();



    static List<BancoDicionarios> bancodicio = new ArrayList<BancoDicionarios>();


    // construtores
    public BancoDicionarios(Dicionario d) {
        this.dici = d;
    }
    

    public static boolean adicionarDicionario(Dicionario dic){

        for(int i=0; i<bancodicio.size(); i++){
            if(bancodicio.get(i).nome.equals(dic)){  // ve pelo nome se o diocionario ja existe
                return false;
            }
        }


        bancodicio.add(new BancoDicionarios(dic)); // adiciona o dicionario na lista
        return true;

    }


    public static void mostrarConteudoDicionarios(){

        for(int i=0; i<bancodicio.size(); i++){
            System.out.println("Dicionario: " + bancodicio.get(i).nome + "\n" + "Tipo: " + bancodicio.get(i).tipo + "\n"); // imprime o nome o tipo e o conteudo dos dicionarios da lista 
           bancodicio.get(i).dici.mostrarTodo();
        }

    }

    

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//As outras Classes necessarias pro codigo "Dicionario" "DicionarioSimples" e "DicionarioIP" estao no exercicio 3 da pratica 6
