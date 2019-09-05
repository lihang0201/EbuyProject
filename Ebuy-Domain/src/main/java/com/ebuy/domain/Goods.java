package com.ebuy.domain;

import javax.persistence.*;

@Table(name = "goods")
public class Goods {
    @Id
    private String gid;

    private String gname;

    private String gimage;

    private String gprice;

    private String cid;

    private Boolean del;

    private String description;

    private String evaluate;

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

    /**
     * @return gname
     */
    public String getGname() {
        return gname;
    }

    /**
     * @param gname
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * @return gimage
     */
    public String getGimage() {
        return gimage;
    }

    /**
     * @param gimage
     */
    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    /**
     * @return gprice
     */
    public String getGprice() {
        return gprice;
    }

    /**
     * @param gprice
     */
    public void setGprice(String gprice) {
        this.gprice = gprice;
    }

    /**
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return del
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * @param del
     */
    public void setDel(Boolean del) {
        this.del = del;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return evaluate
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * @param evaluate
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }
}