package Aula_06;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Math.random;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import javafx.event.EventType;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

class Framecalculadora extends Frame implements ActionListener {

    Label L1, L2, L3;
    Button B1, B2, B3, B4, B5, B6;
    Button B7, B8, B9, B10;
    Button B11, B12, B13, B14;
    TextField T1, T2, T3;
    CheckBox CB1;
    JCheckBox check;
    boolean controle = false;
    Label L4;

//Método de execução
    public static void main(String args[]) {
        Framecalculadora Janela = new Framecalculadora();
        Janela.addWindowListener(new fechajanela());
        Janela.show();

    }

    public void Limpar() {
        T1.setText("");
        T2.setText("");
        T3.setText("");

    }
//Construtor do objeto calculadora

    Framecalculadora() {
        setTitle(".:Calculadora 1.0:.");
//SetSize(150,200);
//SetLocation(50,50);
        setSize(350, 350);
        setLocation(800, 150);

        setBackground(new Color(150, 150, 150));
        setLayout(new GridLayout(11, 2));

        L1 = new Label("NUM 1 (peso  )");
        L1.setForeground(Color.white);

        L2 = new Label("NUM 2 (Altura EX 1.83) ");
        L2.setForeground(Color.white);
        L3 = new Label("Resultado");
        L3.setForeground(Color.white);
        L1.setFont(new Font("", Font.BOLD, 14));
        L2.setFont(new Font("", Font.BOLD, 14));
        L3.setFont(new Font("", Font.BOLD, 14));

        B1 = new Button("+");
        B1.addActionListener(this);
        B1.setBackground(Color.decode("#DCDCDC"));
        B2 = new Button("-");
        B2.addActionListener(this);
        B2.setBackground(Color.decode("#DCDCDC"));
        B3 = new Button("x");
        B3.addActionListener(this);
        B3.setBackground(Color.decode("#DCDCDC"));
        B4 = new Button("/");
        B4.addActionListener(this);
        B4.setBackground(Color.decode("#DCDCDC"));
        B5 = new Button("Limpar");
        B5.addActionListener(this);
        B5.setBackground(Color.blue);
        B5.setForeground(Color.white);
        B6 = new Button("Sair");
        B6.setBackground(Color.red);

        B7 = new Button("*^");//potenciacao
        B7.addActionListener(this);
        B7.setBackground(Color.decode("#DCDCDC"));

        B8 = new Button("%");//resto divisao
        B8.addActionListener(this);
        B8.setBackground(Color.decode("#DCDCDC"));

        B9 = new Button("Radiação");
        B9.addActionListener(this);
        B9.setBackground(Color.decode("#DCDCDC"));

        B10 = new Button("IMC");
        B10.addActionListener(this);
        B10.setBackground(Color.decode("#DCDCDC"));

        B11 = new Button("Cosseno");
        B11.addActionListener(this);
        B11.setBackground(Color.decode("#DCDCDC"));

        B12 = new Button("Seno");
        B12.addActionListener(this);
        B12.setBackground(Color.decode("#DCDCDC"));

        B13 = new Button("TANGENTE");
        B13.addActionListener(this);
        B13.setBackground(Color.decode("#DCDCDC"));

        B14 = new Button("Perimetro Retangulo");
        B14.addActionListener(this);
        B14.setBackground(Color.decode("#DCDCDC"));

        check = new JCheckBox("acao");
        check.addActionListener(this);
        check.setBackground(Color.decode("#DCDCDC"));

        L4 = new Label("");
        L4.setForeground(Color.white);
        L4.setBackground(Color.decode("#DCDCDC"));

        T1 = new TextField();
        T1.setBackground(Color.decode("#DCDCDC"));
        T2 = new TextField();
        T2.setBackground(Color.decode("#DCDCDC"));
        T3 = new TextField();
        T3.setBackground(Color.decode("#DCDCDC"));
        T3.setEditable(false);
        B9.setEnabled(false);
        B11.setEnabled(false);
        B12.setEnabled(false);
        B13.setEnabled(false);
//B10.setEnabled(false);
        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(L3);
        add(T3);
        add(B1);
        add(B2);
        add(B3);
        add(B4);

        add(B7);
        add(B8);
        add(B9);
        add(B10);

//add(new Checkbox("teste"));
        add(B11);
        add(B12);
        add(B13);
        add(B14);
        add(B5);
        add(B6);
        add(check);

        add(L4);

    }
//Tratamento de eventos 

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == check) {
            if (check.isSelected()) {

                B1.setEnabled(false);
                B2.setEnabled(false);
                B3.setEnabled(false);
                B4.setEnabled(false);
                B7.setEnabled(false);
                B8.setEnabled(false);
                B10.setEnabled(false);
                B14.setEnabled(false);

                B9.setEnabled(true);
                B11.setEnabled(true);
                B12.setEnabled(true);
                B13.setEnabled(true);

                L1.setText("NUM 1 ");
                L2.setText("NUM 2  ");

                T2.setEnabled(true);
                controle = true;

                return;

            }
            if (!check.isSelected()) {
                B1.setEnabled(true);
                B2.setEnabled(true);
                B3.setEnabled(true);
                B4.setEnabled(true);
                B8.setEnabled(true);
                B8.setEnabled(true);
                B10.setEnabled(true);
                B14.setEnabled(true);

                L1.setText("NUM 1 (peso  )");
                L2.setText("NUM 2 (Altura EX 1.83) ");

                B9.setEnabled(false);
                B11.setEnabled(false);
                B12.setEnabled(false);
                B13.setEnabled(false);

                // B10.setEnabled(false);
                T2.setEnabled(true);
                controle = false;

                return;

            }

        }

        if (e.getSource() == B5) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            return;
        }
        if (e.getSource() == B6) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            System.exit(0);
            return;
        }

        float N1 = 0, N2 = 0, result = 0;

        try {
            if (controle == true) {
                N1 = Float.parseFloat(T1.getText());
                //N2 = Float.parseFloat(T2.getText());

            } else {
                N1 = Float.parseFloat(T1.getText());
                N2 = Float.parseFloat(T2.getText());

            }
        } catch (NumberFormatException erro) {
            T3.setText("Erro formato invalido");
            return;
        }

        if (e.getSource() == B1) {
            result = N1 + N2;
        }
        if (e.getSource() == B2) {
            result = N1 - N2;
        }

        if (e.getSource() == B3) {
            result = N1 * N2;
        }
        if (e.getSource() == B4) {
            if (N2 == 0) {
                T3.setText("error ao dividir por zero");
                return;
            } else {
                result = N1 / N2;
            }
        }

        if (e.getSource() == B7) {
            result = (float) Math.pow(N1, N2);
        }

        if (e.getSource() == B8) {
            result = N1 % N2;
        }

        if (e.getSource() == B9)//potenciacao
        {
            result = (float) Math.sqrt(N1);

        }

        if (e.getSource() == B10) {
            float aux;
            String retorno;
            //N1 peso
            //N2 altura digitar exemplo 1.83
            result = (N1 / (N2 * N2));

            DecimalFormat formatter = new DecimalFormat("0.00");

            retorno = formatter.format(result);

            if ((N1 == 0) || (N2 == 0)) {
                JOptionPane.showMessageDialog(null, "Digite valores válidos nos campos");

                return;

            }

            /*
        
        
        
        if (result<16)
        {
            T3.setText(retorno+ " magreza Grave");
            
        }
        if (result>16 || result<17)
        {
            T3.setText(retorno+ " Magresa Moderada");
            
        }
        if (result>17 || result<18.5)
        {
            T3.setText(retorno+ " Magresa leve");
            
        }
        if (result>18.5 || result<25)
        {
            T3.setText(retorno+ " saldavel");
            
        }
        if (result>25 || result<=30)
        {
            T3.setText(retorno+ " SobrePeso");
            
        }
        if (result>30 || result<35)
        {
            T3.setText(retorno+ " Obsidade Grau 1");
            
        }
        if (result>35 || result<40)
        {
            JOptionPane.showMessageDialog(null, result);
            T3.setText(retorno+ " Obsidade Grau 2");
            
        }
        
        if (result>40)
        {
            T3.setText(retorno+ " Obsidade Gra 3");
            
        }
        
        
             */
 /*
        
             */
            if (result < 17) {
                T3.setText(retorno + " Magreza grave");
                return;
            }
            if (result < 17) {
                T3.setText(retorno + " Magreza moderada");
                return;
            }
            if (result < 18.5) {
                T3.setText(retorno + " Magreza leve");
                return;
            }
            if (result < 25) {
                T3.setText(retorno + " Saudável");
                return;
            }
            if (result <= 30) {
                T3.setText(retorno + " Sobrepeso");
                return;
            }
            if (result < 35) {
                T3.setText(retorno + " Obesidade Grau 1");
                return;
            }
            if (result < 40) {
                JOptionPane.showMessageDialog(null, result);
                T3.setText(retorno + " Obesidade Grau 2");
                return;
            }

            if (result > 40) {
                T3.setText(retorno + " Obesidade Grau 3");
                return;
            }

        }
        if (e.getSource() == B11) {
            result = (float) Math.cos(N1);
        }
        if (e.getSource() == B12) {
            result = (float) Math.sin(N1);
        }
        if (e.getSource() == B13) {
            result = (float) Math.tan(N1);
        }

        if (e.getSource() == B14) {
            result = (N1 + N1) + (N2 + N2);
        }

        T3.setText("" + result);
    }//Final do tratamento de eventos

}//

class fechajanela extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
