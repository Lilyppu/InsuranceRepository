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
public class InscMstRateProductCompKey implements Serializable {
	private String imrpCoyId;
	private String imrpOfficeCode;
	private String imrpTypeId;
	private String imrpPenggunaan;
	private String imrpCoverageId;
	private String imrpUsed;
	private String imrpRateType;
	private Integer imrpSeqNo;
}
