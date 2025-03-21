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
@Table(name= "insc_trn_payment_dtls")
@IdClass(InscTrnPaymentDtlsCompKey.class)
public class InscTrnPaymentDtls {
	    @Id
	    @Column(name = "insc_group_no", nullable = false, length = 20)
	    private String itpdGroupNo;

	    @Id
	    @Column(name = "polis_no", nullable = false, length = 50)
	    private String itpdPolisNo;

	    @Column(name = "period_from")
	    private Date itpdPeriodFrom;

	    @Column(name = "period_to")
	    private Date itpdPeriodTo;

	    @Column(name = "nokontrak", nullable = false, length = 20)
	    private String itpdNoKontrak;

	    @Column(name = "netpremi", precision = 15, scale = 2)
	    private BigDecimal itpdNetPremi;

	    @Column(name = "created_by", nullable = false, length = 10)
	    private String itpdCreatedBy;

	    @Column(name = "created_date", nullable = false)
	    private Date itpdCreatedDate;

	    @Column(name = "modified_by", length = 10)
	    private String itpdModifiedBy;

	    @Column(name = "modified_date")
	    private Date itpdModifiedDate;
	    
	    @Id
	    @Column(name = "tahun")
	    private Integer itpdTahun;

	    @Column(name = "insc_voucher_no", length = 50)
	    private String itpdVoucherNo;

	    @Column(name = "insc_remark_payment", length = 3200)
	    private String itpdRemarkPayment;
}
