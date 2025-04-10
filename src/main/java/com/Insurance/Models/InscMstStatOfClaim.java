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
@Table(name= "insc_mst_stat_of_claim")
@IdClass(InscMstStatOfClaimCompKey.class)
public class InscMstStatOfClaim {
	@Id
	@Column (name="coverage_id", length=10, nullable = false)
	private String imsocCoverageId;
	
	@Id
	@Column (name="status_id", length=6)
	private String imsocStatusId;
	
	@Column (name="description", length=30)
	private String imsocDescription;
	
	@Column (name="created_by", length=10)
	private String imsocCreatedBy;
	
	@Column (name="created_date")
	private Date imsocCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imsocModifiedBy;
	
	@Column (name="modified_date")
	private Date imsocModifiedDate;
	
	@Column (name="active_flag", length=1)
	private String imsocActiveFlag;
}
