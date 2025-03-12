package com.Insurance.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InscMstPerluasanCompKey implements Serializable {
	private String impanCoyId;
	private String impanTypeId;
	private String impanPerId;
	private Integer impanSeqNo;
}
