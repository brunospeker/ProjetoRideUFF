package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class UsuarioDAO {
    
    private EntityManager em;
    
    public void criarUsuario(Usuario u) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(u);
        et.commit();
    
    }
    
    public Usuario visualizarUsuario(Long idusuario) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Usuario u = em.find(Usuario.class, idusuario);
        et.commit();
        em.close();
        return u;
    
    }
    
    public void excluirUsuario(Long idusuario) {
    
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Usuario u = em.find(Usuario.class, idusuario);
        em.remove(u);
        et.commit();
        em.close();
    
    }
    
    public List<Usuario> buscarUsuario() {
    
      String jpqlQuery = "SELECT u FROM Usuario u ORDER BY u.nome";
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Usuario> u = query.getResultList();
      em.close();
      return u;
   
    }
    
   public List<Grupo> listarGruposPorUsuario() {
   
      String jpqlQuery = "SELECT g FROM Grupos g"; /*BUSCAR COMO PEGAR A QUERY DE BUSCA*/
      em = JPAUtil.getEM();
      Query query = em.createQuery(jpqlQuery);
      List<Grupo> g = query.getResultList();
      em.close();
      return g;
   } 
    
   public void darNotaPassageiro() {}
   
   
   
    
    
    
    
}
