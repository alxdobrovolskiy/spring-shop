package com.alxdobr.springshop.shop.jpa;

import com.alxdobr.springshop.shop.jpa.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductsJpaDaoImpl extends AbstractJpaDao implements ProductsDao {

    @Override
    public void addProduct(Product product) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();

        if (em != null) {
            em.close();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = null;
        EntityManager em = emf.createEntityManager();
        products = (List<Product>) em.createNamedQuery("getAllProducts").getResultList();

        if (em != null) {
            em.close();
        }
        return products;
    }
}
