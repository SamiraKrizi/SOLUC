package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Shop
 *
 */
@Entity

public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "ShopName")
    private int shopName;

    @Column(name = "Location")
    private int location;

    @Column(name = "Service")
    private String service;

    @Temporal(TemporalType.TIME)
    @Column(name = "OpeningTime")
    private Date openingTime;

    @Temporal(TemporalType.TIME)
    @Column(name = "ClosingTime")
    private Date closingTime;

    public Shop() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShopName() {
        return shopName;
    }

    public void setShopName(int shopName) {
        this.shopName = shopName;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "Shop{" + "id=" + id + ", shopName=" + shopName + ", location=" + location + ", service=" + service + ", openingTime=" + openingTime + ", closingTime=" + closingTime + '}';
    }

}
