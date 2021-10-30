package modelo;

public class Disciplina {
    private  Integer i_disciplina;
    private String descricao;
    private Integer num_creditos;
    private  Integer id_curso;

    public Disciplina(String descricao, Integer num_creditos, Integer id_curso) {
        this.descricao = descricao;
        this.num_creditos = num_creditos;
        this.id_curso = id_curso;
    }

    public Disciplina() {

    }

    public Integer getI_disciplina() {
        return i_disciplina;
    }

    public void setI_disciplina(Integer i_disciplina) {
        this.i_disciplina = i_disciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNum_creditos() {
        return num_creditos;
    }

    public void setNum_creditos(Integer num_creditos) {
        this.num_creditos = num_creditos;
    }

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "i_disciplina=" + i_disciplina +
                ", descricao='" + descricao + '\'' +
                ", num_creditos=" + num_creditos +
                ", id_curso=" + id_curso +
                '}';
    }
}
