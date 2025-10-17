package application.model;

public class usuarioModel {
	private int id_usuario;
	private String nome_usuario;
	private String login;
	private String senha;
	
	public usuarioModel(int id_usuario, String nome_usuario, String login, String senha) {
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.login = login;
		this.senha = senha;
	}
	
	public int getID() {return id_usuario;}
	public void setID(int id_usuario) {this.id_usuario = id_usuario;}
	
	public String getNomeCompleto() {return nome_usuario;}
	public void setNomeCompleto(String nome_usuario) {this.nome_usuario = nome_usuario;}
	
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
}
