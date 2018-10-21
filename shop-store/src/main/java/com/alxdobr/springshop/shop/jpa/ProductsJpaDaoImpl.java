package com.alxdobr.springshop.shop.jpa;

import com.alxdobr.springshop.shop.jpa.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductsJpaDaoImpl extends AbstractJpaDao implements ProductsDao {

    @Override
    public void addProduct(ProductEntity productEntity) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(productEntity);
        em.getTransaction().commit();

        if (em != null) {
            em.close();
        }
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> productEntities = null;
        EntityManager em = emf.createEntityManager();
        productEntities = (List<ProductEntity>) em.createNamedQuery("getAllProducts").getResultList();

        if (em != null) {
            em.close();
        }
        return productEntities;
    }
}
