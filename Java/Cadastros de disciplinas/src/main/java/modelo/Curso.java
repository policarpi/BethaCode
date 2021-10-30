package modelo;

public class Curso {

    private Integer i_curso;
    private String descricao;
    private Integer num_creditos;
    private String coordenador;

    public Curso(String descricao, Integer num_creditos, String coordenador) {
        this.descricao = descricao;
        this.num_creditos = num_creditos;
        this.coordenador = coordenador;
    }

    public Curso() {

    }

    public Integer getI_curso() {
        return i_curso;
    }

    public void setI_curso(Integer i_curso) {
        this.i_curso = i_curso;
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

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "i_curso=" + i_curso +
                ", descricao='" + descricao + '\'' +
                ", num_creditos=" + num_creditos +
                ", coordenador='" + coordenador + '\'' +
                '}';
    }
}
