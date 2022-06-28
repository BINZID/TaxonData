package org.big.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "traitdata", schema = "desc_trait_media")
public class Traitdata {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "sciname")
    private String sciname;
    @Column(name = "chname")
    private String chname;
    @Column(name = "infrasp")
    private String infrasp;
    @Column(name = "chinfrasp")
    private String chinfrasp;
    @Column(name = "rank")
    private String rank;
    @Column(name = "traitontology")
    private String traitontology;
    @Column(name = "traitproperty")
    private String traitproperty;
    @Column(name = "traitvalue")
    private String traitvalue;
    @Column(name = "traitunit")
    private String traitunit;
    @Column(name = "measurement")
    private String measurement;
    @Column(name = "locality")
    private String locality;
    @Column(name = "specimenno")
    private String specimenno;
    @Column(name = "taxongroups")
    private String taxongroups;
    @Column(name = "sources_name")
    private String sourcesName;
    @Column(name = "sources_id")
    private String sourcesId;
    @Column(name = "referencejson")
    private String referencejson;
    @Column(name = "taxon_id")
    private String taxonId;
    @Column(name = "dbase_id")
    private String dbaseId;
    @Column(name = "status")
    private Integer status;
    @Column(name = "synchdate")
    private Timestamp synchdate;
    @Column(name = "remark")
    private String remark;
}