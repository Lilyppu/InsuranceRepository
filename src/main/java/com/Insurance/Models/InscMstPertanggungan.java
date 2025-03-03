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
@Table(name= "INSC_MST_PERTANGGUNGAN")
public class InscMstPertanggungan {
	
	@Id
	@Column (name="coy_id", length=10, nullable = false)
	private String imptgCoyId;
	
	@Column (name="type_id", length=10, nullable = false)
	private String imptgTypeId;
	
	@Column (name="top_id", nullable = false)
	private Integer imptgTopId;
	
	@Column (name="used", length=2, nullable = false)
	private String imptgUsed;
	
	@Column (name="perct_pertgg")
	private BigDecimal imptgPerctPertgg;
	
	@Column (name="npv")
	private BigDecimal imptgNpv;
	
	@Column (name="type_rate", length=5, nullable = false)
	private String imptgTypeRate;
	
	@Column (name="coverage_id", length=10, nullable = false)
	private String imptgCoverageId;
	
}
