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
@Table(name= "insc_trn_refund")
public class InscTrnRefund {
	@Id
    @Column(name = "refund_no", nullable = false, length = 20)
    private String itrRefundNo;

    @Column(name = "refund_date")
    private Date itrRefundDate;

    @Column(name = "cert_no", length = 50)
    private String itrCertNo;

    @Column(name = "refund_type", length = 1)
    private String itrRefundType;

    @Column(name = "description", length = 100)
    private String itrDescription;

    @Column(name = "refund_amt")
    private BigDecimal itrRefundAmt;

    @Column(name = "confirm_letter", length = 30)
    private String itrConfirmLetter;

    @Column(name = "confirm_date")
    private Date itrConfirmDate;

    @Column(name = "confirm_status", length = 2)
    private String itrConfirmStatus;

    @Column(name = "cust_recd_amt")
    private BigDecimal itrCustRecdAmt;

    @Column(name = "refund_status", length = 2)
    private String itrRefundStatus;

    @Column(name = "rv_no", length = 20)
    private String itrRvNo;

    @Column(name = "rv_seq_no")
    private Integer itrRvSeqNo;

    @Column(name = "paid_sts", length = 1)
    private String itrPaidSts;

    @Column(name = "ap_invoice_no", length = 20)
    private String itrApInvoiceNo;

    @Column(name = "paid_date")
    private Date itrPaidDate;

    @Column(name = "doc_no", length = 20)
    private String itrDocNo;

    @Column(name = "doc_seq_no")
    private Integer itrDocSeqNo;

    @Column(name = "reject_desc", length = 100)
    private String itrRejectDesc;

    @Column(name = "refund_adm")
    private BigDecimal itrRefundAdm;

    @Column(name = "aab_branch", length = 30)
    private String itrAabBranch;

    @Column(name = "rsp_ap_amount_entrydt")
    private Date itrRspApAmountEntrydt;

    @Column(name = "rsp_ap_amount")
    private BigDecimal itrRspApAmount;

    @Column(name = "refund_premium_amount")
    private BigDecimal itrRefundPremiumAmount;

    @Column(name = "refund_policy_fee")
    private BigDecimal itrRefundPolicyFee;

    @Column(name = "refund_stamp_duty")
    private BigDecimal itrRefundStampDuty;

    @Column(name = "ar_group_number", length = 20)
    private String itrArGroupNumber;

    @Column(name = "ar_seq_no")
    private BigDecimal itrArSeqNo;

    @Column(name = "created_by", nullable = false, length = 15)
    private String itrCreatedBy;

    @Column(name = "created_date", nullable = false)
    private Date itrCreatedDate;

    @Column(name = "modified_by", length = 15)
    private String itrModifiedBy;

    @Column(name = "modified_date")
    private Date itrModifiedDate;

    @Column(name = "order_number", length = 20)
    private String itrOrderNumber;

    @Column(name = "branch_id", length = 10)
    private String itrBranchId;

    @Column(name = "refund_source", length = 20)
    private String itrRefundSource;

    @Column(name = "rv_date")
    private Date itrRvDate;

    @Column(name = "ncpt_date")
    private Date itrNcptDate;

    @Column(name = "ncpt_no", length = 30)
    private String itrNcptNo;

    @Column(name = "ncpt_amt")
    private BigDecimal itrNcptAmt;

    @Column(name = "cust_hp", length = 20)
    private String itrCustHp;

    @Column(name = "rv_amt")
    private BigDecimal itrRvAmt;

    @Column(name = "rsp_receive_status", length = 1)
    private String itrRspReceiveStatus;

    @Column(name = "trx_send_status", length = 2)
    private String itrTrxSendStatus;

    @Column(name = "cust_telp", length = 20)
    private String itrCustTelp;

    @Column(name = "coy_id", length = 5)
    private String itrCoyId;

    @Column(name = "batch_id", length = 30)
    private String itrBatchId;

    @Column(name = "filetxt_status", length = 2)
    private String itrFiletxtStatus;
}
