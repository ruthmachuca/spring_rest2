package py.edu.facitec.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity

public class Post extends General {
	
	
	
		
		private String titulo;
		private String autor;
		
		@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
		private LocalDate fecha;
		private String texto; 
		
		//uno a muchos 			indicar el objeto de la otra clase 
					//indicar la bidireccionalidad de la relacion 
		
								//esta lista es importante visualizar 
		@JsonManagedReference	//se visualiza la lista de comentarios 
		@OneToMany(mappedBy = "post")
		private List<Comentario> comentarios; 	//asociacion 

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public List<Comentario> getComentarios() {
			return comentarios;
		}

		public void setComentarios(List<Comentario> comentarios) {
			this.comentarios = comentarios;
		}

		@Override
		public String toString() {
			return "Post [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", texto=" + texto
					+ ", toString()=" + super.toString() + "]";
		}

		
		
		
		
		

		

}
