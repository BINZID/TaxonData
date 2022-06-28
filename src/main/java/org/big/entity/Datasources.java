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
@Table(name = "datasources", schema = "desc_trait_media")
public class Datasources {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "dsname")
    private String dsname;
    @Column(name = "dstype")
    private String dstype;
    @Column(name = "version")
    private String version;
    @Column(name = "copyright")
    private String copyright;
    @Column(name = "rightsholder")
    private String rightsholder;
    @Column(name = "creater")
    private String creater;
    @Column(name = "createtime")
    private String createtime;
    @Column(name = "dsabstract")
    private String dsabstract;
    @Column(name = "dskeyword")
    private String dskeyword;
    @Column(name = "dsurl")
    private String dsurl;
    @Column(name = "status")
    private Integer status;
    @Column(name = "synchdate")
    private Timestamp synchdate;
    @Column(name = "remark")
    private String remark;
}