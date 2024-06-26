package academy.devedojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void ImprimeDados() {
        System.out.println("--------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println("Salários: ");
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }

        MediaSalarial();
    }

    public void MediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia dos salarial: " + media);
    }
}

