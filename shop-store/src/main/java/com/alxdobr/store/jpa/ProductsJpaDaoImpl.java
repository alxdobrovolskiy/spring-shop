package com.alxdobr.store.jpa;

import com.alxdobr.store.jpa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional(Transactional.TxType.REQUIRED)
public class ProductsJpaDaoImpl implements ProductsDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addProduct(Product product) {
        em.persist(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) em.createNamedQuery("getAllProducts").getResultList();
    }
}
