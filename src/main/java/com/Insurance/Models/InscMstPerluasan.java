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
@Table(name= "insc_mst_perluasan")
@IdClass(InscMstPerluasanCompKey.class)
public class InscMstPerluasan {
	@Id
	@Column (name="coy_id", length=10, nullable = false)
	private String impanCoyId;
	
	@Id
	@Column (name="type_id", length=10, nullable = false)
	private String impanTypeId;
	
	@Id
	@Column (name="per_id", length=5, nullable = false)
	private String impanPerId;
	
	@Id
	@Column (name="seq_no", nullable = false)
	private Integer impanSeqNo;
	
	@Column (name="coverage_id", length=5)
	private String impanCoverageId;
	
	@Column (name="description", length=300)
	private String impanDescription;
	
	@Column (name="percentage")
	private Integer impanPercentage;
	
	@Column (name="created_by", length=20)
	private String impanCreatedBy;
	
	@Column (name="created_date")
	private Date impanCreatedDate;
	
	@Column (name="lastupdate_by", length=20)
	private String impanLastupdateBy;
	
	@Column (name="lastupdate_timestamp")
	private Date impanLastupdateTimestamp;
	
	@Column (name="for_vehicle", length=1)
	private String impanForVehicle;
	
	@Column (name="sum_insured_from")
	private BigDecimal impanSumInsuredFrom;
	
	@Column (name="sum_insured_to")
	private BigDecimal impanInsuredTo;
}
