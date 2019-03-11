package seuNome;


public class Musica {
	private String nome;
	private Artista artista;
	private long dataCriacao;
	private int id;
	
	public Musica(String nome, Artista artista, long dataCriacao, int id) {
		this.nome = nome;
		this.artista = artista;
		this.dataCriacao = dataCriacao;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public Artista getArtista() {
		return artista;
	}
	public long getDataCriacao() {
		return dataCriacao;
	}

	public int getId() {
		return id;
	}

}
