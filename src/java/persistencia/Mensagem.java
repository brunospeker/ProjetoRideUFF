
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Matheus
 */
@Entity
public class Mensagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idmensagem;
    private String conteudo;
    private Grupo grupo;
    private Date datacriacao;


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdmensagem() != null ? getIdmensagem().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idmensagem fields are not set
        if (!(object instanceof Mensagem)) {
            return false;
        }
        Mensagem other = (Mensagem) object;
        if ((this.getIdmensagem() == null && other.getIdmensagem() != null) || (this.getIdmensagem() != null && !this.idmensagem.equals(other.idmensagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Mensagem[ idmensagem=" + getIdmensagem() + " ]";
    }

    public Long getIdmensagem() {
        return idmensagem;
    }

    public void setIdmensagem(Long idmensagem) {
        this.idmensagem = idmensagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }
    
}
