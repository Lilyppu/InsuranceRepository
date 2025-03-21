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
@Table(name= "INSC_MST_COY_BU")
public class InscMstCoyBu {
	
	@Id
	@Column (name="coy_id", length=5, nullable = false)
	private String imcbuCoyId;
	
	@Id
	@Column (name="buss_unit", length=10, nullable = false)
	private String imcbuBussUnit;
	
	@Id
	@Column (name="type_id", length=100, nullable = false)
	private String imcbuTypeId;
	
	@Id
	@Column (name="seq_no", nullable = false)
	private Integer imcbuSeqNo;
	
	@Column (name="amount_begin")
	private BigDecimal imcbuAmountBegin;
	
	@Column (name="amount_end")
	private BigDecimal imcbuAmountEnd;
	
	@Column (name="pct_net_premi")
	private BigDecimal imcbuPctNetPremi;


}
