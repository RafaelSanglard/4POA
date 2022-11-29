package localizadorcep;

import javax.swing.JOptionPane;

public class Main {

    LocalizadorCEP localizador;
    public Main(LocalizadorCEP localizador) {
       this.localizador=localizador;
    }

    public static void main(String[] args) {
        Main main = new Main(new AdapterCEP());
        main.repetirBuscasPorCEP();
    }

    void repetirBuscasPorCEP() {
        String cepString;
        do {
            cepString=JOptionPane.showInputDialog("Entre um cep (-1 para finalizar)");
            Long cep=null;
            try {
                cep=Long.valueOf(cepString);
            } catch(NumberFormatException nfe) {
                System.out.println("Valor inválido!");
            }
            String endereco=localizador.buscarPorCEP(cep);
            System.out.println(endereco);
        } while(!cepString.equals("-1"));
    }

}
