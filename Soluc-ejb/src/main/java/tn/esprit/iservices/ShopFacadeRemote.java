/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.iservices;

import java.util.List;
import javax.ejb.Remote;
import tn.esprit.entities.Shop;

/**
 *
 * @author ksamih
 */
@Remote
public interface ShopFacadeRemote {

    public void create(Shop shop);

    public void edit(Shop shop);

    public void remove(Shop shop);

    public Shop find(Object id);

    public List<Shop> findAll();

    public List<Shop> findRange(int[] range);

    public int count();
    
}
