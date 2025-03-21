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
@Table(name= "insc_trn_refund_rsp")
public class InscTrnRefundRsp {
	@Id
    @Column(name = "refund_no", nullable = false, length = 20)
    private String itrrRefundNo;

    @Column(name = "batch_id", length = 30)
    private String itrrBatchId;

    @Column(name = "coy_id", length = 5)
    private String itrrCoyId;

    @Column(name = "refund_date")
    private Date itrrRefundDate;

    @Column(name = "cert_no", length = 50)
    private String itrrCertNo;

    @Column(name = "refund_type", length = 1)
    private String itrrRefundType;

    @Column(name = "description", length = 100)
    private String itrrDescription;

    @Column(name = "refund_amt")
    private BigDecimal itrrRefundAmt;

    @Column(name = "confirm_letter", length = 30)
    private String itrrConfirmLetter;

    @Column(name = "confirm_date")
    private Date itrrConfirmDate;

    @Column(name = "confirm_status", length = 2)
    private String itrrConfirmStatus;

    @Column(name = "cust_recd_amt")
    private BigDecimal itrrCustRecdAmt;

    @Column(name = "refund_status", length = 2)
    private String itrrRefundStatus;

    @Column(name = "rv_no", length = 20)
    private String itrrRvNo;

    @Column(name = "rv_seq_no")
    private Integer itrrRvSeqNo;

    @Column(name = "paid_sts", length = 1)
    private String itrrPaidSts;

    @Column(name = "ap_invoice_no", length = 20)
    private String itrrApInvoiceNo;

    @Column(name = "paid_date")
    private Date itrrPaidDate;

    @Column(name = "doc_no", length = 20)
    private String itrrDocNo;

    @Column(name = "doc_seq_no")
    private Integer itrrDocSeqNo;

    @Column(name = "reject_desc", length = 100)
    private String itrrRejectDesc;

    @Column(name = "refund_adm")
    private BigDecimal itrrRefundAdm;

    @Column(name = "aab_branch", length = 30)
    private String itrrAabBranch;

    @Column(name = "rsp_ap_amount_entrydt")
    private Date itrrRspApAmountEntrydt;

    @Column(name = "rsp_ap_amount")
    private BigDecimal itrrRspApAmount;

    @Column(name = "refund_premium_amount")
    private BigDecimal itrrRefundPremiumAmount;

    @Column(name = "refund_policy_fee")
    private BigDecimal itrrRefundPolicyFee;

    @Column(name = "refund_stamp_duty")
    private BigDecimal itrrRefundStampDuty;

    @Column(name = "ar_group_number", length = 20)
    private String itrrArGroupNumber;

    @Column(name = "ar_seq_no")
    private Integer itrrArSeqNo;

    @Column(name = "created_by", nullable = false, length = 15)
    private String itrrCreatedBy;

    @Column(name = "created_date", nullable = false)
    private Date itrrCreatedDate;

    @Column(name = "modified_by", length = 15)
    private String itrrModifiedBy;

    @Column(name = "modified_date")
    private Date itrrModifiedDate;

    @Column(name = "order_number", length = 20)
    private String itrrOrderNumber;

    @Column(name = "branch_id", length = 10)
    private String itrrBranchId;

    @Column(name = "refund_source", length = 20)
    private String itrrRefundSource;

    @Column(name = "rv_date")
    private Date itrrRvDate;

    @Column(name = "ncpt_date")
    private Date itrrNcptDate;

    @Column(name = "ncpt_no", length = 30)
    private String itrrNcptNo;

    @Column(name = "ncpt_amt")
    private BigDecimal itrrNcptAmt;

    @Column(name = "cust_hp", length = 20)
    private String itrrCustHp;

    @Column(name = "rv_amt")
    private BigDecimal itrrRvAmt;

    @Column(name = "rsp_receive_status", length = 1)
    private String itrrRspReceiveStatus;

    @Column(name = "trx_send_status", length = 2)
    private String itrrTrxSendStatus;

    @Column(name = "cust_telp", length = 20)
    private String itrrCustTelp;
}
