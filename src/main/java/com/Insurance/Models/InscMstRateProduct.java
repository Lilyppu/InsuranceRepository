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
@Table(name= "insc_mst_rate_product")
@IdClass(InscMstRateProductCompKey.class)
public class InscMstRateProduct {
	@Id
	@Column (name="coy_id", length=10, nullable = false)
	private String imrpCoyId;
	
	@Id
	@Column (name="office_code", length=10)
	private String imrpOfficeCode;
	
	@Id
	@Column (name="type_id", length=10)
	private String imrpTypeId;
	
	@Id
	@Column (name="penggunaan", length=30)
	private String imrpPenggunaan;
	
	@Id
	@Column (name="coverage_id", length=10)
	private String imrpCoverageId;
	
	@Id
	@Column (name="used", length=10)
	private String imrpUsed;
	
	@Id
	@Column (name="rate_type", length=10)
	private String imrpRateType;
	
	@Id
	@Column (name="seq_no")
	private Integer imrpSeqNo;
	
	@Column (name="price_from")
	private BigDecimal imrpPriceFrom;
	
	@Column (name="price_to")
	private BigDecimal imrpPriceTo;
	
	@Column (name="rate")
	private Integer imprStampDutyAmt;
	
	@Column (name="created_by", length=30)
	private String imprCreatedBy;
	
	@Column (name="created_timestamp")
	private Date imprCreatedDate;
	
	@Column (name="lastupdate_by", length=30)
	private String imrpLastupdateBy;
	
	@Column (name="lastupdate_timestamp")
	private Date imrpLastupdateTimestamp;
	
	
}
