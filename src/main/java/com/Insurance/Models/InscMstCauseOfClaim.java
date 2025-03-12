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
@Table(name= "insc_mst_cause_of_claim")
@IdClass(InscMstCauseOfClaimCompKey.class)
public class InscMstCauseOfClaim {
	@Column (name="description", length=30, nullable = false)
	private String imcocDescription;
	
	@Column (name="created_by", length=10, nullable = false)
	private String imcocCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date imcocCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imcocModifiedBy;
	
	@Column (name="modified_date")
	private Date imcocModifiedDate;
	
	@Id
	@Column (name="coverage_id", length=10, nullable = false)
	private String imcocCoverageId;
	
	@Id
	@Column (name="cause_id", length=6, nullable = false)
	private String imcocCauseId;
	
	@Column (name="active_flag", length=1)
	private String imcocActiceFlag;
}
