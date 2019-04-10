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

    void create(Shop shop);

    void edit(Shop shop);

    void remove(Shop shop);

    Shop find(Object id);

    List<Shop> findAll();

    List<Shop> findRange(int[] range);

    int count();
    
}
