//////////////////////////////////////////////////////////////////////////////////
******ANIMAL********

public class Animal {

    protected String apelido;
    protected int idade;
    protected double peso;
    protected String descricao;

    /**
     *  construtores
     */

    public Animal(){

        this.apelido="";
        this.idade=0;
        this.peso=0;
        this.descricao="";

    }

    public Animal(String a, int i, double p, String d){

        this.apelido=a;
        this.idade=i;
        this.peso=p;
        this.descricao=d;

    }


    public void infoGeral(){
        System.out.println("Nome:" + this.apelido + "_Idade:" + this.idade
        + "_Peso:" + this.peso + "_Descricao:" + this.descricao);

    }

    public void info(){

        System.out.println("\n\nNome:" + this.apelido + "\n_Idade:" + this.idade
                + "\n_Peso:" + this.peso + "\n_Descricao:" + this.descricao);

    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////
*********GUEPARDO***************

public class Guepardo extends Animal {
    double velocidadeCorrida;

    public Guepardo(){
        this.velocidadeCorrida=0;
    }

    @Override
    public void info() {
        System.out.println("\n\nVelocidade:" + this.velocidadeCorrida);
    }


}

/////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////
***********BALEIA*********

public class Baleia extends Animal {

    double alturaMaximaSalto;
    double sinalInfrasonica;

    public Baleia(){

        this.alturaMaximaSalto=0;
        this.sinalInfrasonica=0;
    }

    @Override
    public void info() {
        System.out.println("\n\nSalto:" + this.alturaMaximaSalto
        + "\n\nSonido:" + this.sinalInfrasonica);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////
************AGUIA*************

public class Aguia extends Animal {
    double envergadura;
    double elevacaoMaxima;

    public Aguia(){
        this.envergadura=0;
        this.elevacaoMaxima=0;
    }

    @Override
    public void info() {
        System.out.println("\n\nEnvergadura:" + this.envergadura
        + "\n\nElevacao:" + this.elevacaoMaxima);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////



