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
@Table(name= "INSC_MST_TYPE")
public class InscMstType {
	
	@Id
	@Column (name="type_id", length = 240, nullable = false)
	private String imtyTypeId;
	
	@Column (name="description", length = 100)
	private String imtyDescription;
	
	@Column (name="obj_grp", length = 10)
	private String imtyObjGrp;
	
	@Column (name="created_by", length = 10)
	private String imtyCreateUser;
	
	@Column (name="created_date")
	private Date imtyCreateDate;
	
	@Column (name="modified_by", length = 10)
	private String imtyModifyUser;
	
	@Column (name="modified_date")
	private Date imtyModifyDate;

}
