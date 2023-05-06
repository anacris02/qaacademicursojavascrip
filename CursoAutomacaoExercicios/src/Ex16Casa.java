public class Ex16Casa {
    public static void alunos(){
        int tamanho = 5;
        String[] nomeAlunos = new String[tamanho];
        int[] numeroAlunos = new int[tamanho];
        nomeAlunos[0] = "Ana";
        nomeAlunos[1] = "Murilo";
        nomeAlunos[2] = "Maria";
        nomeAlunos[3] = "Antonio";
        nomeAlunos[4] = "Jose";

        numeroAlunos[0] = 5;
        numeroAlunos[1] = 4;
        numeroAlunos[2] = 3;
        numeroAlunos[3] = 2;
        numeroAlunos[4] = 1;

        int i = 0;
        while(i<tamanho){
            System.out.println("Aluno: "+nomeAlunos[i]+" / Número: "+numeroAlunos[i]);
            i++;
        }

    }
    public static void main(String[] args){
        alunos();
    }
    
}
