package application.view;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {
	
	@FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    @FXML private Button btnUsuario;

	public void sair() {
		System.exit(0);
	}
	
	public void entrar() {
		
		try {
			
			String usuario = txtUsuario.getText();
			String senha = txtSenha.getText();
		
			if (usuario.equals("admin") && senha.equals("marina")) {
				Alert aviso;
				aviso = new Alert(Alert.AlertType.CONFIRMATION);
				aviso.setTitle("Confirmação");
				aviso.setHeaderText(null);
				aviso.setContentText("Bem-vindo ao Sistema " + usuario);
				aviso.showAndWait();
			
				//Fechar tela de login
				txtUsuario.getScene().getWindow().hide();
			
				//Abrir tela principal
				Parent root = FXMLLoader.load(getClass().getResource("aplicativo.fxml"));
				Stage stage = new Stage();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			
			} else {
				Alert aviso;
				aviso = new Alert(Alert.AlertType.ERROR);
				aviso.setTitle("Erro");
				aviso.setHeaderText(null);
				aviso.setContentText("Usuario ou senha incorreta");
				aviso.showAndWait();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void initialize() {
		btnUsuario.setOnMouseClicked(event->{
    		try {
    			Parent root = FXMLLoader.load(getClass().getResource("usuario.fxml"));
    			Stage stage = new Stage();
    			Scene scene = new Scene(root);
    			stage.setScene(scene);
    			stage.show();
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	});
		//Ao pressionar a tecla enter no campo usuario, muda para o campo senha
		txtUsuario.setOnAction(e->{txtSenha.requestFocus();});
		
		//Ao pressionar a tecla enter no campo senha, o botão 'entrar' sera acionado
		txtSenha.setOnAction(e->{entrar();});
	}
}
