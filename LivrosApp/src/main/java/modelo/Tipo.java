package modelo;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false,length = 100)
    private String Descricao;

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "id=" + id +
                ", Descricao='" + Descricao + '\'' +
                '}';
    }
}
