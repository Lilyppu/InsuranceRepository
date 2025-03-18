package com.Insurance.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InscMstPertanggunganCompKey implements Serializable{
	
	private String imptgCoyId;
	private String imptgTypeId;
	private Integer imptgTopId;
	private String imptgUsed;
	private String imptgTypeRate;
	private String imptgCoverageId;

}
