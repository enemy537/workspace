package model;

public class CD {
	private String titulo;
	private String artista;
	private int QuantidadeDeMusicas;
	private float tempoTotal;
	
	public CD(String titulo, String artista, int quantidadeMusicas,
			float tempoTotal) {
		this.titulo = titulo;
		this.artista = artista;
		QuantidadeDeMusicas = quantidadeMusicas;
		this.tempoTotal = tempoTotal;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getQuantidaDeMusicas() {
		return QuantidadeDeMusicas;
	}

	public void setQuantidaDeMusicas(int quantidadeMusicas) {
		QuantidadeDeMusicas = quantidadeMusicas;
	}

	public float getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(float tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	@Override
	public String toString() {
		return "CD [" + titulo + " de " + artista
				+ " (" + QuantidadeDeMusicas + " músicas, "
				+ tempoTotal +" min.]";
	}
}
