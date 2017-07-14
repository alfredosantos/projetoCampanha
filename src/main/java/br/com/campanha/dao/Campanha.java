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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CAMPANHA")
@SequenceGenerator(name="CampanhaSeq", sequenceName="SEQ_COD_CAMPANHA")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Campanha {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CampanhaSeq")
	@Column(name = "COD_CAMPANHA")
	private int codCampanha;

	@Column(name = "NOM_CAMPANHA")
	private String nomCampanha;

	@ManyToOne
	@JoinColumn(name = "COD_TIME")
	@JsonBackReference
	private Time time;

	@Column(name = "DAT_INICIO")
	private Date datInicio;
	
	@Column(name = "DAT_FIM")
	private Date datFim;

}