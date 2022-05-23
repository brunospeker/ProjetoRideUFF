package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class CarteiraDAO {
    
    private EntityManager em;
    
    public void criarCarteira(Carteira c) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(c);
        et.commit();
    
    }
    
    public Carteira visualizarCarteira(Long idcarteira) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Carteira c = em.find(Carteira.class, idcarteira);
        et.commit();
        em.close();
        return c;
    
    }
    
    public void deletarCarteira(Long idcarteira) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Carteira c = em.find(Carteira.class, idcarteira);
        em.remove(c);
        et.commit();
        em.close();
    
    }
    
    public List<Carteira> buscarCarteira() {
    
      String jpqlQuery = "SELECT c FROM Carteira c";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Carteira> c = query.getResultList();
      em.close();
      return c;
   
    }
    
   public void adicionarFormaPagamento() {}
   
   public void alterarFormaPagamento() {}
   
   public void esquecerFormaPagamento() {}
   
   public void adicionarPromocao() {}
   
   public List<Carteira> listarHistoricoPagamento() {
   Carteira c = null; /*ALTERAR DEPOIS*/
   return (List<Carteira>) c;
   }
   
    
}