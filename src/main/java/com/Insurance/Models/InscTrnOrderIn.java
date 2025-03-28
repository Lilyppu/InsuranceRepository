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
@Table(name= "insc_trn_order_in")
@IdClass(InscTrnOrderInCompKey.class)
public class InscTrnOrderIn {
	
    @Column(name = "batch_id", nullable = false, length = 30)
    private String itoiBatchId;

    @Column(name = "ins_coy_id", nullable = false, length = 5)
    private String itoiInsCoyId;
    
    @Id
    @Column(name = "contract_no", nullable = false, length = 20)
    private String itoiContractNo;

    @Id
    @Column(name = "contract_seq", nullable = false)
    private Integer itoiContractSeq;
    
    @Id
    @Column(name = "tahun_seq", nullable = false)
    private Integer itoiTahunSeq;

    @Column(name = "submit_date")
    private Date itoiSubmitDate;

    @Column(name = "nama_konsumen", length = 100)
    private String itoiNamaKonsumen;

    @Column(name = "pemohon", length = 50)
    private String itoiPemohon;

    @Column(name = "cabang", length = 5)
    private String itoiCabang;

    @Column(name = "harga_pembelian", nullable = false)
    private BigDecimal itoiHargaPembelian;

    @Column(name = "merk", length = 30)
    private String itoiMerk;

    @Column(name = "tipe", length = 60)
    private String itoiTipe;

    @Column(name = "jenis", length = 100)
    private String itoiJenis;

    @Column(name = "tahun", length = 4)
    private String itoiTahun;

    @Column(name = "warna", length = 30)
    private String itoiWarna;

    @Column(name = "no_rangka", length = 30)
    private String itoiNoRangka;

    @Column(name = "no_mesin", length = 30)
    private String itoiNoMesin;

    @Column(name = "no_polisi", length = 15)
    private String itoiNoPolisi;

    @Column(name = "perluasan_jaminan", length = 6)
    private String itoiPerluasanJaminan;

    @Column(name = "amount1")
    private BigDecimal itoiAmount1;

    @Column(name = "amount2")
    private BigDecimal itoiAmount2;

    @Column(name = "text1", length = 60)
    private String itoiText1;

    @Column(name = "text2", length = 60)
    private String itoiText2;

    @Column(name = "penggunaan_kendaraan", length = 20)
    private String itoiPenggunaanKendaraan;

    @Column(name = "kondisi_pertanggungan", length = 20)
    private String itoiKondisiPertanggungan;

    @Column(name = "kondisi", length = 1)
    private String itoiKondisi;

    @Column(name = "period_from")
    private Date itoiPeriodFrom;

    @Column(name = "period_to")
    private Date itoiPeriodTo;

    @Column(name = "last_user", length = 10)
    private String itoiLastUser;

    @Column(name = "nomor_polis", length = 50)
    private String itoiNomorPolis;

    @Column(name = "nett_premi")
    private BigDecimal itoiNettPremi;

    @Column(name = "created_by", nullable = false, length = 10)
    private String itoiCreatedBy;

    @Column(name = "created_date", nullable = false)
    private Date itoiCreatedDate;

    @Column(name = "modified_by", length = 10)
    private String itoiModifiedBy;

    @Column(name = "modified_date")
    private Date itoiModifiedDate;

    @Column(name = "coy_id", length = 5)
    private String itoiCoyId;

    @Column(name = "kode_plat", length = 5)
    private String itoiKodePlat;

    @Column(name = "no_kps", length = 50)
    private String itoiNoKps;

    @Column(name = "no_sppa", length = 50)
    private String itoiNoSppa;

	@Column(name = "joint_life", length = 200)
    private String itoiJointLife;

    @Column(name = "birth_date")
    private Date itoiBirthDate;

    @Column(name = "umur")
    private Integer itoiUmur;

    @Column(name = "address", length = 2000)
    private String itoiAddress;

    @Column(name = "okupasi", length = 500)
    private String itoiOkupasi;

    @Column(name = "bank_jf", length = 20)
    private String itoiBankJf;
}
