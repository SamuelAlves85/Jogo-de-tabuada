import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Tela1 extends JFrame {

    public JLabel label;
    public JLabel label1;
    public JTextField textField;
    Random random;

    JButton button ;
    JButton button1;

    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    public int valor =0;
    String x =null;
    JLabel acertos ;
    JLabel erros;
    JLabel numAcertosLabel;
    JLabel numErrosLabel;
    int numAcertos =0;
    int numErros =0;
    public Tela1(){
        setTitle("Tabuada");

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(null);


        textField = new JTextField("");
        textField.setBounds(30,30,100,25);
        textField.setFont(new Font("Arial",Font.BOLD,14));
        add(textField);


        label= new JLabel("0");
        label.setBounds(260,80,100,100);
        label.setFont(new Font("Arial",Font.BOLD,22));
        add(label);

        label1= new JLabel("0");
        label1.setBounds(300,80,200,100);
        label1.setFont(new Font("Arial",Font.BOLD,22));
        add(label1);

        button = new JButton("convert");
        button.setBounds(30,60,100,25);
        button.setFont(new Font("Arial",Font.BOLD,14));
        button.addActionListener(this::acao);
        add(button);

        random = new Random();

        button1 = new JButton();
        button1.setBounds(130,170,50,50);
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.addActionListener(this::acaobutton1);
        add(button1);

        button2 = new JButton();
        button2.setBounds(200,170,50,50);
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.addActionListener(this::acaobutton2);
        add(button2);

        button3 = new JButton();
        button3.setBounds(270,170,50,50);
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.addActionListener(this::acaobutton3);
        add(button3);

        button4 = new JButton();
        button4.setBounds(340,170,50,50);
        button4.setFont(new Font("Arial",Font.BOLD,14));
        button4.addActionListener(this::acaobutton4);
        add(button4);

        button5 = new JButton();
        button5.setBounds(410,170,50,50);
        button5.setFont(new Font("Arial",Font.BOLD,14));
        button5.addActionListener(this::acaobutton5);
        add(button5);

        acertos = new JLabel("acertos ");
        acertos.setBounds(400,230,100,100);
        acertos.setFont(new Font("Arial",Font.BOLD,14));
        add(acertos);

        erros = new JLabel("erros ");
        erros.setBounds(400,250,100,100);
        erros.setFont(new Font("Arial",Font.BOLD,14));
        add(erros);

        numAcertosLabel =new JLabel("0");
        numAcertosLabel.setBounds(470,230,100,100);
        numAcertosLabel.setFont(new Font("Arial",Font.BOLD,14));
        add(numAcertosLabel);

        numErrosLabel =new JLabel("0");
        numErrosLabel.setBounds(470,250,100,100);
        numErrosLabel.setFont(new Font("Arial",Font.BOLD,14));
        add(numErrosLabel);

        setVisible(true);
    }



    public void acao(ActionEvent event) {
        //1º parte isso aqui faz o a conta aleatoria e a multiplicação
        String valortext = textField.getText();
        this.label.setText(valortext + " X");
        int z = random.nextInt(10) + 1;
        x = String.valueOf(z);
        this.label1.setText(x + " = ?");
        valor = Integer.parseInt(textField.getText());
        int valoRandom = Integer.parseInt(x);
        valor = valor * valoRandom;


        //2ºparte isso aqui vai colocar os valores nos botões de forma aleatoria

        for (int i = 0; i <= 100; i++) {


            if (valoRandom == random.nextInt(10) + 1) {
                button1.setText(String.valueOf(valor));
                button2.setText(String.valueOf(valor - 3));
                button3.setText(String.valueOf(valor + 5));
                button4.setText(String.valueOf(valor - 7));
                button5.setText(String.valueOf(valor + 2));
            }

            if (valoRandom == random.nextInt(10) + 1) {
                button1.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button2.setText(String.valueOf(valor));
                button3.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button4.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button5.setText(String.valueOf(valor - random.nextInt(10) + 1));
            }
            if (valoRandom == random.nextInt(10) + 1) {
                button1.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button2.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button3.setText(String.valueOf(valor));
                button4.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button5.setText(String.valueOf(valor + random.nextInt(10) + 1));
            }
            if (valoRandom == random.nextInt(10) + 1) {

                button1.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button2.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button3.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button4.setText(String.valueOf(valor));
                button5.setText(String.valueOf(valor - random.nextInt(10) + 1));

            }
            if (valoRandom == random.nextInt(10) + 1) {
                button1.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button2.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button3.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button4.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button5.setText(String.valueOf(valor));
            }
            if (valoRandom == random.nextInt(10) + 1) {
                button1.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button2.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button3.setText(String.valueOf(valor - random.nextInt(10) + 1));
                button4.setText(String.valueOf(valor + random.nextInt(10) + 1));
                button5.setText(String.valueOf(valor));

            }

        }

        }

        //3ºparte comparar o valor que a pessoa escolheu com valor de verdade

    public void comparar(JButton botao, int valorOficial, JLabel labelChange, String numAleat){

        int valorButton = Integer.parseInt(botao.getText());
        if ( valorOficial == valorButton) {
            labelChange.setText(numAleat + " = "+ valorOficial +" (Correto)");
            numAcertos = numAcertos + 1;
            numAcertosLabel.setText(""+ numAcertos);
        }else {
            labelChange.setText(numAleat + " = "+" Incorreto");
            numErros = numErros +1;
            numErrosLabel.setText(""+ numErros);

        }
    }

        public void  acaobutton1(ActionEvent event) { comparar(button1,valor,label1,x); }
        public void  acaobutton2(ActionEvent event) {
            comparar(button2,valor,label1,x);
        }
        public void  acaobutton3(ActionEvent event) {
            comparar(button3,valor,label1,x);
        }
        public void  acaobutton4(ActionEvent event) {
            comparar(button4,valor,label1,x);
        }
        public void  acaobutton5(ActionEvent event) {
            comparar(button5,valor,label1,x);
        }

}






