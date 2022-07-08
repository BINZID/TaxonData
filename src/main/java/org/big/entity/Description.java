package org.big.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "description", schema = "desc_trait_media")
public class Description {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "sciname")
    private String sciname;
    @Column(name = "chname")
    private String chname;
    @Column(name = "authorship")
    private String authorship;
    @Column(name = "ranken")
    private String rankEn;
    @Column(name = "rankcn")
    private String rankCn;
    @Column(name = "ordernum")
    private Integer orderNum;
    @Column(name = "score")
    private Integer score;
    @Column(name = "destitle")
    private String destitle;
    @Column(name = "descontent")
    private String descontent;
    @Column(name = "describer")
    private String describer;
    @Column(name = "desdate")
    private String desdate;
    @Column(name = "language")
    private String language;
    @Column(name = "copyright")
    private String copyright;
    @Column(name = "rightsholder")
    private String rightsholder;
    @Column(name = "license_name")
    private String licenseName;
    @Column(name = "license_id")
    private String licenseId;
    @Column(name = "sources_name")
    private String sourceName;
    @Column(name = "sources_id")
    private String sourceId;
    @Column(name = "referencejson")
    private String referencejson;
    @Column(name = "descriptiontype_name")
    private String descriptiontypeName;
    @Column(name = "descriptiontype_id")
    private String descriptiontypeId;
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