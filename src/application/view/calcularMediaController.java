package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calcularMediaController {

    @FXML private Button btnCalcularMedia;
    @FXML private Label lblResultado;
    @FXML private TextField txtNota1;
    @FXML private TextField txtNota2;
    @FXML private TextField txtNota3;
    @FXML private TextField txtNota4;
    @FXML private Button btnVoltar;
    @FXML private Button btnResetar;
    
    public void media() {
    	double nota1, nota2, nota3, nota4, media;
    	nota1 = converterLetraParaNumero(txtNota1.getText());
    	nota2 = converterLetraParaNumero(txtNota2.getText());
    	nota3 = converterLetraParaNumero(txtNota3.getText());
    	nota4 = converterLetraParaNumero(txtNota4.getText());
    	
    	/*txtNota1.setText(String.valueOf(nota1));
    	txtNota2.setText(String.valueOf(nota2));
    	txtNota3.setText(String.valueOf(nota3));
    	txtNota4.setText(String.valueOf(nota4));*/
    	media = (nota1 + nota2 + nota3 + nota4) / 4;
    	
    	lblResultado.setText(String.valueOf(media));
    }
    @FXML
    public void initialize() {
    	txtNota1.textProperty().addListener((observable, oldValue, newValue)->{txtNota1.setText(newValue.replaceAll("[^\\d]",""));});
    	txtNota2.textProperty().addListener((observable, oldValue, newValue)->{txtNota2.setText(newValue.replaceAll("[^\\d]",""));});
    	txtNota3.textProperty().addListener((observable, oldValue, newValue)->{txtNota3.setText(newValue.replaceAll("[^\\d]",""));});
    	txtNota4.textProperty().addListener((observable, oldValue, newValue)->{txtNota4.setText(newValue.replaceAll("[^\\d]",""));});
    	btnResetar.setOnAction(e -> {txtNota1.setText("0");txtNota2.setText("0");txtNota3.setText("0");txtNota4.setText("0");lblResultado.setText("Resultado");});
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
