package br.com.starstore.model;

import java.io.Serializable;

public class AgendaModel implements Serializable {

	private static final long serialVersionUID = 4289523037541606295L;

	// @SerializedName("id")
	// @Expose
	private Long id;

	// @SerializedName("nome")
	// @Expose
	private String nome;

	// @SerializedName("endereco")
	// @Expose
	private String endereco;

	// @SerializedName("telefone")
	// @Expose
	private String telefone;

	public AgendaModel() {
	}

	public AgendaModel(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public AgendaModel(Long id, String nome, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return id.toString().concat(" - ").concat(nome);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
