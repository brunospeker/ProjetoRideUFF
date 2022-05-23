
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
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idgrupo;
    private Usuario usuario;
    private String nome;
    private String descricao;
    private int tipogrupo;
    private Date datacriacao;
    private Date datafinalizacao;
    private int qtdparticipantes;
    private double preco;
    private String localpartida;
    private String localchegada;
    private double medianotamotorista;
    private double medianotapassageiro;

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdgrupo() != null ? getIdgrupo().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idgrupo fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.getIdgrupo() == null && other.getIdgrupo() != null) || (this.getIdgrupo() != null && !this.idgrupo.equals(other.idgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Grupo[ idgrupo=" + getIdgrupo() + " ]";
    }

    public Long getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipogrupo() {
        return tipogrupo;
    }

    public void setTipogrupo(int tipogrupo) {
        this.tipogrupo = tipogrupo;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    public Date getDatafinalizacao() {
        return datafinalizacao;
    }

    public void setDatafinalizacao(Date datafinalizacao) {
        this.datafinalizacao = datafinalizacao;
    }

    public int getQtdparticipantes() {
        return qtdparticipantes;
    }

    public void setQtdparticipantes(int qtdparticipantes) {
        this.qtdparticipantes = qtdparticipantes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLocalpartida() {
        return localpartida;
    }

    public void setLocalpartida(String localpartida) {
        this.localpartida = localpartida;
    }

    public String getLocalchegada() {
        return localchegada;
    }

    public void setLocalchegada(String localchegada) {
        this.localchegada = localchegada;
    }

    public double getMedianotamotorista() {
        return medianotamotorista;
    }

    public void setMedianotamotorista(double medianotamotorista) {
        this.medianotamotorista = medianotamotorista;
    }

    public double getMedianotapassageiro() {
        return medianotapassageiro;
    }

    public void setMedianotapassageiro(double medianotapassageiro) {
        this.medianotapassageiro = medianotapassageiro;
    }
    
}
