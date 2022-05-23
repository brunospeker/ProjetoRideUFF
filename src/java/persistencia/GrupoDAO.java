package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class GrupoDAO {
    
    private EntityManager em;
    
    public void criarGrupo(Grupo g) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(g);
        et.commit();
    
    }
    
    public Grupo visualizarGrupo(Long idgrupo) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Grupo g = em.find(Grupo.class, idgrupo);
        et.commit();
        em.close();
        return g;
    
    }
    
    public void excluirGrupo(Long idgrupo) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Grupo g = em.find(Grupo.class, idgrupo);
        em.remove(g);
        et.commit();
        em.close();
    
    }
    
    public List<Grupo> buscarGrupo() {
    
      String jpqlQuery = "SELECT g FROM Grupo g ORDER BY g.nome";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Grupo> g = query.getResultList();
      em.close();
      return g;
   
    }
    
   public List<Grupo> listarGrupos() {
   
      String jpqlQuery = "SELECT * FROM Grupo";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Grupo> g = query.getResultList();
      em.close();
      return g;
   }
   
   public void editarGrupo(Long idgrupo) {}
    
   public void compartilharGrupo() {}
   
   public void pedirSocorro() {}
   
   public void compartilharLocalizacao() {}
   
    
}

