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
@Table(name= "insc_mst_kode_plat")
public class InscMstKodePlat {
	@Id
	@Column (name="kode_plat", length=3, nullable = false)
	private String imkpKodePlat;
	
	@Column (name="kabupaten_kota", length=200)
	private String imkpKabupatenKota;
	
	@Column (name="daerah", length=50)
	private String imkpDaerah;
	
	@Column (name="wil_ojk", length=5)
	private String imkpWilOjk;
	
	@Column (name="created_by", length=30)
	private String imkpCreatedBy;
	
	@Column (name="created_timestamp")
	private Date imkpCreatedDate;
	
	@Column (name="lastupdate_by", length=30)
	private String imkpModifiedBy;
	
	@Column (name="lastupdate_timestamp")
	private Date imkpModifiedDate;
}
