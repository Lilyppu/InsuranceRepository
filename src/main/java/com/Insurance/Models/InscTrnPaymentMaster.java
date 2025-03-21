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
@Table(name= "insc_trn_payment_master")
public class InscTrnPaymentMaster {
	 @Id
	    @Column(name = "insc_group_no", nullable = false, length = 20)
	    private String itpmGroupNo;

	    @Column(name = "insc_ar_status", length = 1)
	    private String itpmArStatus;

	    @Column(name = "insc_appr_date")
	    private Date itpmApprDate;

	    @Column(name = "insc_voucher_no", length = 50)
	    private String itpmVoucherNo;

	    @Column(name = "insc_paid_date")
	    private Date itpmPaidDate;

	    @Column(name = "insc_bank_name", length = 30)
	    private String itpmBankName;

	    @Column(name = "insc_account_no", length = 20)
	    private String itpmAccountNo;

	    @Column(name = "insc_payment_type", length = 1)
	    private String itpmPaymentType;

	    @Column(name = "insc_claim_no", length = 50)
	    private String itpmClaimNo;

	    @Column(name = "insc_paid_status", length = 1)
	    private String itpmPaidStatus;

	    @Column(name = "ins_coy", length = 5)
	    private String itpmCoy;

	    @Column(name = "insc_inv_no", length = 30)
	    private String itpmInvNo;

	    @Column(name = "insc_rvpv_no", length = 20)
	    private String itpmRvpvNo;

	    @Column(name = "insc_record_count")
	    private Integer itpmRecordCount;

	    @Column(name = "insc_total_amount", precision = 16, scale = 2)
	    private BigDecimal itpmTotalAmount;

	    @Column(name = "insc_sender", length = 30)
	    private String itpmSender;

	    @Column(name = "insc_send_status", length = 1)
	    private String itpmSendStatus;

	    @Column(name = "insc_error_code", length = 4)
	    private String itpmErrorCode;

	    @Column(name = "insc_error_description", length = 128)
	    private String itpmErrorDescription;

	    @Column(name = "insc_send_date")
	    private Date itpmSendDate;

	    @Column(name = "insc_receive_date")
	    private Date itpmReceiveDate;

	    @Column(name = "insc_remark_payment", length = 100)
	    private String itpmRemarkPayment;

	    @Column(name = "insc_record_ok")
	    private Integer itpmRecordOk;

	    @Column(name = "debit_note_printed_date")
	    private Date itpmDebitNotePrintedDate;

	    @Column(name = "debit_note_received_date")
	    private Date itpmDebitNoteReceivedDate;

	    @Column(name = "debit_note_received_by", length = 10)
	    private String itpmDebitNoteReceivedBy;

	    @Column(name = "insc_settled_date")
	    private Date itpmSettledDate;

	    @Column(name = "debit_note_receive_status", length = 3)
	    private String itpmDebitNoteReceiveStatus;

	    @Column(name = "debit_note_receive_error", length = 128)
	    private String itpmDebitNoteReceiveError;

	    @Column(name = "dns_send_status", length = 1)
	    private String itpmDnsSendStatus;

	    @Column(name = "dns_send_date")
	    private Date itpmDnsSendDate;

	    @Column(name = "payment_send_status", length = 1)
	    private String itpmPaymentSendStatus;

	    @Column(name = "payment_send_date")
	    private Date itpmPaymentSendDate;

	    @Column(name = "payment_error_code", length = 20)
	    private String itpmPaymentErrorCode;

	    @Column(name = "payment_error_description", length = 500)
	    private String itpmPaymentErrorDescription;

	    @Column(name = "payment_amount")
	    private BigDecimal itpmPaymentAmount;

	    @Column(name = "supl_account_seqn")
	    private Integer itpmSuplAccountSeqn;

	    @Column(name = "debit_note_receive_sysdate")
	    private Date itpmDebitNoteReceiveSysdate;

	    @Column(name = "insc_aab_group_no", length = 20)
	    private String itpmAabGroupNo;

	    @Column(name = "fif_coy_id", length = 5)
	    private String itpmFifCoyId;

	    @Column(name = "refference_no", length = 50)
	    private String itpmReferenceNo;

	    @Column(name = "batch_payment_no", length = 30)
	    private String itpmBatchPaymentNo;

	    @Column(name = "created_by", length = 10)
	    private String itpmCreatedBy;

	    @Column(name = "created_date", nullable = false)
	    private Date itpmCreatedDate;

	    @Column(name = "modified_by", length = 10)
	    private String itpmModifiedBy;

	    @Column(name = "modified_date")
	    private Date itpmModifiedDate;
}
