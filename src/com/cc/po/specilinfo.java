package com.cc.po;

public class specilinfo {
    private Integer spilinfoid;
    private int depinfoid;
    private int spilinfocode;
    private String spilinfoname;

    @Override
    public String toString() {
        return "specilinfo{" +
                "spilinfoid=" + spilinfoid +
                ", depinfoid=" + depinfoid +
                ", spilinfocode=" + spilinfocode +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim='" + spilinfoaim + '\'' +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }

    public Integer getSpilinfoid() {
        return spilinfoid;
    }

    public void setSpilinfoid(Integer spilinfoid) {
        this.spilinfoid = spilinfoid;
    }

    public int getDepinfoid() {
        return depinfoid;
    }

    public void setDepinfoid(int depinfoid) {
        this.depinfoid = depinfoid;
    }

    public int getSpilinfocode() {
        return spilinfocode;
    }

    public void setSpilinfocode(int spilinfocode) {
        this.spilinfocode = spilinfocode;
    }

    public String getSpilinfoname() {
        return spilinfoname;
    }

    public void setSpilinfoname(String spilinfoname) {
        this.spilinfoname = spilinfoname;
    }

    public String getSpilinfoaim() {
        return spilinfoaim;
    }

    public void setSpilinfoaim(String spilinfoaim) {
        this.spilinfoaim = spilinfoaim;
    }

    public String getSpilinfoprodire() {
        return spilinfoprodire;
    }

    public void setSpilinfoprodire(String spilinfoprodire) {
        this.spilinfoprodire = spilinfoprodire;
    }

    public specilinfo(Integer spilinfoid, int depinfoid, int spilinfocode, String spilinfoname, String spilinfoaim, String spilinfoprodire) {
        this.spilinfoid = spilinfoid;
        this.depinfoid = depinfoid;
        this.spilinfocode = spilinfocode;
        this.spilinfoname = spilinfoname;
        this.spilinfoaim = spilinfoaim;
        this.spilinfoprodire = spilinfoprodire;
    }

    private String spilinfoaim;
    private String spilinfoprodire;

}
