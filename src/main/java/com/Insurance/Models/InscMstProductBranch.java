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
@Table(name= "insc_mst_product_branch")
@IdClass(InscMstProductBranchCompKey.class)
public class InscMstProductBranch {
	@Id
	@Column (name="product_no", length=20, nullable = false)
	private String impbProductNo;
	
	@Id
	@Column (name="rate_no", length=20, nullable = false)
	private String impbRateNo;
	
	@Id
	@Column (name="branch_id", length=5, nullable = false)
	private String impbBranchId;
	
	@Column (name="start_date", nullable = false)
	private Date impbStartDate;
	
	@Column (name="end_date")
	private Date impbEndDate;
	
	@Column (name="created_by", length=10, nullable = false)
	private String impbCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date impbCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String impbModifiedBy;
	
	@Column (name="modified_date")
	private Date impbModifiedDate;
}
