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
@Table(name= "insc_mst_product_rate")
public class InscMstProductRate {
	@Id
	@Column (name="product_no", length=20, nullable = false)
	private String imprtProductNo;
	
	@Column (name="rate_no", length=20)
	private String imprtRate;
	
	@Column (name="created_by", length=10)
	private String imprtCreatedBy;
	
	@Column (name="created_date")
	private Date imprtCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imprtModifiedBy;
	
	@Column (name="modified_date")
	private Date imprtModifiedDate;
}
