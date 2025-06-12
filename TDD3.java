package app;

public class IRPF {
    private float salario;
    private float contribuicaoPrevidenciaria;
    private String[] dependentes;

    public void cadastrarSalario(float salario) {
        this.salario = salario;
    }

    public float getTotalSalario() {
        return this.salario;
    }

    public void cadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria) {
        this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
    }

    public float getPrevidenciaOficial() {
        return this.contribuicaoPrevidenciaria;
    }

    public void cadastrarDependente(String nome) {
        String[] temp = new String[(dependentes == null ? 0 : dependentes.length) + 1];
        for (int i = 0; dependentes != null && i < dependentes.length; i++) {
            temp[i] = dependentes[i];
        }
        temp[temp.length - 1] = nome;
        dependentes = temp;
