package com.ebuy.domain;

import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "orderitem")
public class Orderitem {
    @Id
    private String iid;

    private Integer count;

    private BigDecimal subtotal;

    private String oid;

    private String gid;

    /**
     * @return iid
     */
    public String getIid() {
        return iid;
    }

    /**
     * @param iid
     */
    public void setIid(String iid) {
        this.iid = iid;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return subtotal
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal
     */
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return oid
     */
    public String getOid() {
        return oid;
    }

    /**
     * @param oid
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * @return gid
     */
    public String getGid() {
        return gid;
    }

    /**
     * @param gid
     */
    public void setGid(String gid) {
        this.gid = gid;
    }
}