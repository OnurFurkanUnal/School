/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.schmgt.web.entity.ik;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.temelt.schmgt.web.entity.BaseEntity;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "employee")
public class Personel  extends BaseEntity{

    private Long id;
    private String ad;
    private String soyad;
    private String adres;
    private String tel;
    private String mail;
    private BigDecimal ucret;
    private Date baslamaTarihi;

    @Id
    @SequenceGenerator(name = "seq_employee", allocationSize = 1, sequenceName = "seq_employee")
    @GeneratedValue(generator = "seq_employee", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", length = 50)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "surname", length = 50)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "address", length = 500)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Column(name = "phone", length = 13)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "email", length = 100)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column(name = "exspense", precision = 14, scale = 2)
    public BigDecimal getUcret() {
        return ucret;
    }

    public void setUcret(BigDecimal ucret) {
        this.ucret = ucret;
    }

    @Column(name = "start_date")
    public Date getBaslamaTarihi() {
        return baslamaTarihi;
    }

    public void setBaslamaTarihi(Date baslamaTarihi) {
        this.baslamaTarihi = baslamaTarihi;
    }

   @Override
    public String toString() {
        return  "adi = "+ad+ " soyadı = "+soyad+ " id = "+id;
    }
    

}
