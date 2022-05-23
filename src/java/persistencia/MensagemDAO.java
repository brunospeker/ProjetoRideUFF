package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class MensagemDAO {
    
    private EntityManager em;
    
    public void criarMensagem(Mensagem m) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(m);
        et.commit();
    
    }
    
    public Mensagem visualizarMensagem(Long idmensagem) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Mensagem m = em.find(Mensagem.class, idmensagem);
        et.commit();
        em.close();
        return m;
    
    }
    
    public void deletarMensagem(Long idmensagem) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Mensagem m = em.find(Mensagem.class, idmensagem);
        em.remove(m);
        et.commit();
        em.close();
    
    }
    
    public List<Mensagem> buscarMensagem() {
    
      String jpqlQuery = "SELECT m FROM Mensagem m ORDER BY m.datacriacao";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Mensagem> m = query.getResultList();
      em.close();
      return m;
   
    }
    
   public List<Mensagem> listarMensagens() {
   
      String jpqlQuery = "SELECT * FROM Mensagem";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Mensagem> m = query.getResultList();
      em.close();
      return m;
   }
   
   
    
}