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
@Table(name= "insc_trn_order_out")
@IdClass(InscTrnOrderOutCompKey.class)
public class InscTrnOrderOut {
	@Id
    @Column(name = "contract_no", nullable = false, length = 20)
    private String itooContractNo;

    @Id
    @Column(name = "contract_seq", nullable = false)
    private Integer itooContractSeq;

    @Id
    @Column(name = "tahun_seq", nullable = false)
    private Integer itooTahunSeq;

    @Id
    @Column(name = "period_from", nullable = false)
    private Date itooPeriodFrom;

    @Column(name = "nama_konsumen", length = 100)
    private String itooNamaKonsumen;

    @Column(name = "pemohon", length = 50)
    private String itooPemohon;

    @Column(name = "cabang", length = 5)
    private String itooCabang;

    @Column(name = "harga_pembelian", nullable = false)
    private BigDecimal itooHargaPembelian;

    @Column(name = "merk", length = 30)
    private String itooMerk;

    @Column(name = "tipe", length = 60)
    private String itooTipe;

    @Column(name = "jenis", length = 100)
    private String itooJenis;

    @Column(name = "tahun", length = 4)
    private String itooTahun;

    @Column(name = "warna", length = 30)
    private String itooWarna;

    @Column(name = "no_rangka", length = 30)
    private String itooNoRangka;

    @Column(name = "no_mesin", length = 30)
    private String itooNoMesin;

    @Column(name = "no_polisi", length = 15)
    private String itooNoPolisi;

    @Column(name = "perluasan_jaminan", length = 6)
    private String itooPerluasanJaminan;

    @Column(name = "amount1")
    private BigDecimal itooAmount1;

    @Column(name = "amount2")
    private BigDecimal itooAmount2;

    @Column(name = "text1", length = 150)
    private String itooText1;

    @Column(name = "text2", length = 60)
    private String itooText2;

    @Column(name = "penggunaan_kendaraan", length = 20)
    private String itooPenggunaanKendaraan;

    @Column(name = "kondisi_pertanggungan", length = 20)
    private String itooKondisiPertanggungan;

    @Column(name = "kondisi", length = 1)
    private String itooKondisi;

    @Column(name = "period_to")
    private Date itooPeriodTo;

    @Column(name = "last_user", length = 10)
    private String itooLastUser;

    @Column(name = "status", length = 2)
    private String itooStatus;

    @Column(name = "batch_id", length = 30)
    private String itooBatchId;

    @Column(name = "coy_id", length = 5)
    private String itooCoyId;

    @Column(name = "created_by", nullable = false, length = 10)
    private String itooCreatedBy;

    @Column(name = "created_date", nullable = false)
    private Date itooCreatedDate;

    @Column(name = "modified_by", length = 10)
    private String itooModifiedBy;

    @Column(name = "modified_date")
    private Date itooModifiedDate;

    @Column(name = "company", length = 10)
    private String itooCompany;

    @Column(name = "bank_jf", length = 20)
    private String itooBankJf;
}
