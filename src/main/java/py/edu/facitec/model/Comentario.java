package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Comentario extends General {
	
	
	
			
		private String texto;
		private Integer estrellas; 
		 
		//muchos a uno
		
		//lo dejamos invisible
		//o ver el obejto post deja de ser importante 
		@JsonManagedReference
		@ManyToOne
		private Post post; //Aplicación de asociación 
		
		@ManyToOne
		private Suscrito suscrito;
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Integer getEstrellas() {
			return estrellas;
		}
		public void setEstrellas(Integer estrellas) {
			this.estrellas = estrellas;
		}
		public Post getPost() {
			return post;
		}
		public void setPost(Post post) {
			this.post = post;
		}
		public Suscrito getSuscrito() {
			return suscrito;
		}
		public void setSuscrito(Suscrito suscrito) {
			this.suscrito = suscrito;
		}
		@Override
		public String toString() {
			return "Comentario [texto=" + texto + ", estrellas=" + estrellas + ", post=" + post + ", suscrito="
					+ suscrito + "]";
		} 
		
		
		

}
