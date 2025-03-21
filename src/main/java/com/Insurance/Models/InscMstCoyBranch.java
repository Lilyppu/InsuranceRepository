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
@Table(name= "INSC_MST_COY_BRANCH")
public class InscMstCoyBranch {
	
	@Id
	@Column (name="coy_id", length=5, nullable = false)
	private String imcbCoyId;
	
	@Id
	@Column (name="office_code", length=10, nullable = false)
	private String imcbOfficeCode;
	
	@Id
	@Column (name="visible", length=2, nullable = false)
	private String imcbVisible;
	
	@Column (name="created_by", length=10)
	private String imcbCreateBy;
	
	@Column (name="created_date")
	private Date imcbCreateDate;
	
	@Column (name="modified_by", length=10)
	private String imcbModifyBy;
	
	@Column (name="modified_date")
	private Date imcbModifyDate;

}
