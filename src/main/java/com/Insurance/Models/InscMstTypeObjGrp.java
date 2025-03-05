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
@Table(name= "insc_mst_type_obj_grp")
public class InscMstTypeObjGrp {
	@Id
	@Column (name="type_id", length=240, nullable = false)
	private String imtogTypeId;
	
	@Column (name="obj_grp", length=10, nullable = false)
	private String imtogObjGrp;
	
	@Column (name="created_by", length=10)
	private String imtogCreatedBy;
	
	@Column (name="created_date")
	private Date imtogCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imtogModifiedBy;
	
	@Column (name="modified_date")
	private Date imtogModifiedDate;
}
