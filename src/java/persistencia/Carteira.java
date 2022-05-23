
package persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Matheus
 */
@Entity
public class Carteira implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcarteira;
    private Usuario usuario;
    private String formapagamento;
    private double saldoconta;

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdcarteira() != null ? getIdcarteira().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idcarteira fields are not set
        if (!(object instanceof Carteira)) {
            return false;
        }
        Carteira other = (Carteira) object;
        if ((this.getIdcarteira() == null && other.getIdcarteira() != null) || (this.getIdcarteira() != null && !this.idcarteira.equals(other.idcarteira))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Carteira[ idcarteira=" + getIdcarteira() + " ]";
    }

    public Long getIdcarteira() {
        return idcarteira;
    }

    public void setIdcarteira(Long idcarteira) {
        this.idcarteira = idcarteira;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }
    
}
