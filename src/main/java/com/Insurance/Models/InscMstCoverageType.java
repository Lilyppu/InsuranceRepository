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
@Table(name= "insc_mst_coverage_type")
public class InscMstCoverageType {
	@Id
	@Column (name="coverage_id", length=10, nullable = false)
	private String imctCoverageId;
	
	@Column (name="description", length=12)
	private String imctSupplierCode;
	
	@Column (name="created_by", length=10)
	private String imctCreatedBy;
	
	@Column (name="created_date")
	private Date imctCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imctModifiedBy;
	
	@Column (name="modified_date")
	private Date imctModifiedDate;
	
	@Column (name="status", length=2)
	private String imctStatus;
	
	@Column (name="top_begin")
	private Integer imctTopBegin;
	
	@Column (name="top_end")
	private Integer imctTopEnd;
}
