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
@Table(name= "INSC_MST_COY_DTL")
public class InscMstCoyDtl {
	
	@Id
	@Column (name="coy_id", length=5, nullable = false)
	private String imcdCoyId;
	
	@Id
	@Column (name="coverage_id", length=10, nullable = false)
	private String imcdCoverageId;
	
	@Id
	@Column (name="type_id", length=100, nullable = false)
	private String imcdTypeId;
	
	@Column (name="coy_seq_no")
	private Integer imcdCoySeqNo;
	
	@Column (name="b2b_flag", length=2)
	private String imcdB2bFlag;
	
	@Column (name="fif_print_polis", length=2)
	private String imcdFifPrintPolis;
	
	@Column (name="status", length=2)
	private String imcdStatus;
	
	@Column (name="created_by", length=10)
	private String imcdCreateBy;
	
	@Column (name="created_date")
	private Date imcdCreateDate;
	
	@Column (name="modified_by", length=10)
	private String imcdModifyBy;
	
	@Column (name="modified_date")
	private Date imcdModifyDate;
	
	@Column (name="pct_loading")
	private BigDecimal imcdPctLoading;
	
	@Column (name="year_start_loading")
	private Integer imcdYearStartLoading;

}
