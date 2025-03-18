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
@Table(name= "INSC_MST_TOP")
public class InscMstTop {
	
	@Id
	@Column (name="top", nullable = false)
	private Integer imtTop;
	
	@Column (name="created_by", length = 10)
	private String imtCreateUser;
	
	@Column (name="created_date")
	private Date imtCreateDate;
	
	@Column (name="modified_date")
	private Date imtModifyDate;
	
	@Column (name="modified_by", length = 10)
	private String imtModifyUser;
	
	@Column (name="net_rate_pct")
	private BigDecimal imtNetRatePct;
	
	@Column (name="claim_rate_pct")
	private BigDecimal imtClaimRatePct;
	
	@Column (name="avg_by")
	private Integer imtAvgBy;
	
	@Column (name="top_rate_ref")
	private Integer imtTopRateRef;

}
