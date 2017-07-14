package br.com.campanha.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIME")
@SequenceGenerator(name="TimeSeq", sequenceName="SEQ_COD_TIME")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Time {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TimeSeq")
	@Column(name = "COD_TIME")
	private int codTime;

	@Column(name = "NOM_TIME")
	private String nomTime;
	
    @OneToMany(mappedBy = "time", targetEntity = Campanha.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Campanha> campanha;
	
	@Column(name = "DAT_CADASTRO")
	private Date datCadastro;
}
