package br.com.campanha.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CLIENTE")
@SequenceGenerator(name="ClienteSeq", sequenceName="SEQ_COD_CLIENTE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ClienteSeq")
	@Column(name = "COD_CLIENTE")
	private int codCliente;

	@Column(name = "NOM_CLIENTE")
	private String nomCliente;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DAT_NASCIMENTO")
	private Date datNascimento;

	@ManyToOne
	@JoinColumn(name = "COD_TIME")
	private Time time;

	@Column(name = "FLAG_ATIVO")
	private char flagAtivo;
	
	@Column(name = "DAT_CADASTRO")
	private Date datCadastro;
	
}