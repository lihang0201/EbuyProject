package com.ebuy.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "orders")
public class Orders {
    @Id
    private String oid;

    private Date ordertime;

    private BigDecimal total;

    private Short state;

    private String uid;

    private String address;

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
     * @return ordertime
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * @param ordertime
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return state
     */
    public Short getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}