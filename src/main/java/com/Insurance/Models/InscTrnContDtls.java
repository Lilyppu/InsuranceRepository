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
@Table(name= "INSC_TRN_CONT_DTLS")
@IdClass(InscTrnContDtlsCompKey.class)
public class InscTrnContDtls {
	
	@Id
	@Column (name="appl_no", length=20, nullable = false)
	private String itcdApplNo;
	
	@Id
	@Column (name="appl_seq_no", nullable = false)
	private Integer itcdApplSeqNo;
	
	@Id
	@Column (name="tahun", nullable = false)
	private Integer itcdTahun;
	
	@Id
	@Column (name="period_from", nullable = false)
	private Date itcdPeriodFrom;
	
	@Column (name="period_to")
	private Date itcdPeriodTo;
	
	@Column (name="netpremi")
	private BigDecimal itcdNetPremi;
	
	@Column (name="db_note", length=50)
	private String itcdDbNote;
	
	@Column (name="tgl_db_note")
	private Date itcdTglDbNote;
	
	@Column (name="created_by", length=10)
	private String itcdCreateBy;	
	
	@Column (name="created_date")
	private Date itcdCreateDate;	
	
	@Column (name="modified_by", length=10)
	private String itcdModifyBy;	
	
	@Column (name="modified_date")
	private Date itcdModifyDate;
	
	@Column (name="netpremi_calc")
	private BigDecimal itcdNetPremiCalc;	
	
	@Column (name="batch_id", length=50)
	private String itcdBatchId;	
	
	@Id
	@Column (name="version_no", nullable = false)
	private Integer itcdVersionNo;	
	
	@Id
	@Column (name="contract_seq", nullable = false)
	private Integer itcdContractSeq;

}
