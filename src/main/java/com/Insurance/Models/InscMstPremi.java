package com.Insurance.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "INSC_MST_PREMI")
public class InscMstPremi {
	
	@Id
	@Column (name="top")
	private Integer impremiTop;
	
	@Column (name="premi_pct")
	private BigDecimal impremiPremiPct;

}
