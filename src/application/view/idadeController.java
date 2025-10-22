package application.view;

import java.time.LocalDate;
import java.time.Period;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class idadeController {

    @FXML private Button btnIdade;
    @FXML private Button btnVoltar;
    @FXML private DatePicker dtData;
    @FXML private Label lblResultado;
    @FXML private TextField txtNome;
    
    public void calcularIdade() {
    	String nome = txtNome.getText();
    	LocalDate nasc = dtData.getValue();
    	
    	if (nasc != null && nome != null && !nome.isEmpty()) {
    		LocalDate anoAgora = LocalDate.now();
    		Period idade = Period.between(nasc, anoAgora);
    		
    		long diasVividos = java.time.temporal.ChronoUnit.DAYS.between(nasc, anoAgora);
    		
    		String diaSemanaNasc = nasc.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault());
    		
    		lblResultado.setText(nome + ", sua idade é: " + idade.getYears() + " anos.\nVocê tem: " + diasVividos + " dias vividos.\n"+ "Dia da semana: " + diaSemanaNasc);
    	} else {
    		lblResultado.setText("Por favor, insira as infomações nos campos(Nome ou Data de Nascimento).");
    	}
    	//idade = nasc - anoAgora;
    }
    
    @FXML
    public void initialize() {
    	btnVoltar.setOnAction(e -> {aplicativoController.voltar(btnVoltar);});
    }

}
