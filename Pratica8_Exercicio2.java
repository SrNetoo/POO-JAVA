//main igual exercicio1

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa1
{
    //Campos
    private JFrame quadro;

    private JLabel rotulo;
    private JTextField campoTexto;
    private JTextField campoTexto2;
    private JButton botonReconhecer;
    private JButton botonReconhecer2;

    //Construtor
    public Programa1(){
        this.criarQuadro();
    }

    ////////////// QUADRO /////////////////////////
    //Criar quadro
    private void criarQuadro(){
        quadro = new JFrame( "Reconhecedor GUI" );

        campoTexto = new JTextField(20);
        campoTexto2 = new JTextField(20);


        botonReconhecer = new JButton( "+" );
        botonReconhecer.addActionListener(new ReconhecedorActionListener());
        botonReconhecer2 = new JButton( "*" );
        botonReconhecer2.addActionListener(new ReconhecedorActionListener());

        rotulo = new JLabel( "=" );

        quadro.setLayout( new FlowLayout() );
        quadro.setSize(500,200);
        quadro.setLocationRelativeTo(null);
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        quadro.add(campoTexto);
        quadro.add(campoTexto2);

        quadro.add(botonReconhecer);
        quadro.add(botonReconhecer2);

        quadro.add(rotulo);

        quadro.setVisible(true);
    }

    //Classe interna ouvinte para o botão "botonReconhecer" e Reconhecedor
    class ReconhecedorActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            String variablex = campoTexto.getText();
            String variabley = campoTexto2.getText();
            int result=0;

            if (event.getActionCommand() == "+"){
                result = Integer.parseInt(variablex ) + Integer.parseInt(variabley );
            }
            if(event.getActionCommand() == "*"){
                result = Integer.parseInt(variablex ) * Integer.parseInt(variabley );
            }

                rotulo.setText( "= " + result );
        }
    }



}
