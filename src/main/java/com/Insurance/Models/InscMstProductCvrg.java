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
@Table(name= "insc_mst_product_cvrg")
@IdClass(InscMstProductCvrgCompKey.class)
public class InscMstProductCvrg {
	@Id
	@Column (name="product_no", length=20, nullable = false)
	private String impcgProductNo;
	
	@Id
	@Column (name="coverage_id", length=10, nullable = false)
	private String impcgRateNo;
	
	@Column (name="created_by", length=10, nullable = false)
	private String impcgCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date impcgCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String impcgModifiedBy;
	
	@Column (name="modified_date")
	private Date impcgModifiedDate;
	
	@Column (name="primary", length=50)
	private String impcgBranchId;
}
