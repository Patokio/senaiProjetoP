package application.view;

import javafx.beans.Observable;
import application.view.aplicativoController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadoraController {

    @FXML private Button btnDividir;
    @FXML private Button btnMultiplicar;
    @FXML private Button btnSoma;
    @FXML private Button btnSubtrair;
    @FXML private Label lblResultado;
    @FXML private TextField txtPrimeiroNumero;
    @FXML private TextField txtSegundoNumero;
    @FXML private Button btnResetar;
    @FXML private Button btnVoltar;
    @FXML private Label lblImpar;
    
    @FXML
    public void Somar() {
    	double numero1;
    	double numero2;
    	
    	try {
    		numero1 = Double.valueOf(txtPrimeiroNumero.getText());
    	} catch(Exception e) {
    		numero1 = 0;
    		txtPrimeiroNumero.setText("0");
    	}
    	
    	try {
    		numero2 = Double.valueOf(txtSegundoNumero.getText());
    	} catch(Exception e) {
    		numero2 = 0;
    		txtSegundoNumero.setText("0");
    	}
    	
    	double resultado = numero1 + numero2;
    	lblResultado.setText(String.valueOf(resultado));
    	if (resultado % 2 == 0) {
    		lblImpar.setText("Par");
    	} else {
    		lblImpar.setText("Impar");
    	}
    }
    
    @FXML
    public void Subtrair() {
    	double numero1 = converterLetraParaNumero(txtPrimeiroNumero.getText());
    	double numero2 = converterLetraParaNumero(txtSegundoNumero.getText());
    	txtPrimeiroNumero.setText(String.valueOf(numero1));
    	txtSegundoNumero.setText(String.valueOf(numero2));
    	double resultado = numero1 - numero2;
    	
    	lblResultado.setText(String.valueOf(resultado));
    	if (resultado % 2 == 0) {
    		lblImpar.setText("Par");
    	} else {
    		lblImpar.setText("Impar");
    	}
    }
    
    @FXML
    public void Multiplicar() {
    	double numero1 = Double.valueOf(txtPrimeiroNumero.getText());
    	double numero2 = Double.valueOf(txtSegundoNumero.getText());
    	double resultado = numero1 * numero2;
    	
    	lblResultado.setText(String.valueOf(resultado));
    	if (resultado % 2 == 0) {
    		lblImpar.setText("Par");
    	} else {
    		lblImpar.setText("Impar");
    	}
    }
    
    @FXML
    public void Dividir() {
    	double numero1 = Double.valueOf(txtPrimeiroNumero.getText());
    	double numero2 = Double.valueOf(txtSegundoNumero.getText());
    	double resultado = numero1 / numero2;
    	
    	lblResultado.setText(String.valueOf(resultado));
    	if (resultado % 2 == 0) {
    		lblImpar.setText("Par");
    	} else {
    		lblImpar.setText("Impar");
    	}
    }
    
    @FXML
    private void initialize() {
    	txtPrimeiroNumero.textProperty().addListener((observable, oldValue, newValue)->{txtPrimeiroNumero.setText(newValue.replaceAll("[^\\d]",""));});
    	txtSegundoNumero.textProperty().addListener((observable, oldValue, newValue)->{txtSegundoNumero.setText(newValue.replaceAll("[^\\d]",""));});
    	btnResetar.setOnAction(e -> {txtPrimeiroNumero.setText("0");txtSegundoNumero.setText("0");lblResultado.setText("Resultado:");});
    	btnVoltar.setOnAction(e -> {aplicativoController.voltar(btnVoltar);});
    	
    }
    public static double converterLetraParaNumero(String numero) {
    	try {
    		return Double.valueOf(numero);
    	} catch(Exception e) {
    		return 0;
    	}
    }
}


