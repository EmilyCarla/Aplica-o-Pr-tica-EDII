import java.util.ArrayList;
import java.util.HashMap;

class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

public class GerenciadorBiblioteca {

    // Função para ordenar livros por título usando Insertion Sort
    public static void insertionSort(ArrayList<Livro> livros) {
        for (int i = 1; i < livros.size(); i++) {
            Livro chave = livros.get(i);
            int j = i - 1;

            // Move os elementos maiores que a chave para a frente
            while (j >= 0 && livros.get(j).titulo.compareTo(chave.titulo) > 0) {
                livros.set(j + 1, livros.get(j));
                j--;
            }

            // Insere a chave na posição correta
            livros.set(j + 1, chave);
        }
    }

    // Função para exibir livros
    public static void exibirLivros(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.titulo + " - " + livro.autor);
        }
    }

    // Função para criar um mapa de livros para busca rápida por título
    public static HashMap<String, Livro> criarMapaLivros(ArrayList<Livro> livros) {
        HashMap<String, Livro> mapaLivros = new HashMap<>();
        for (Livro livro : livros) {
            mapaLivros.put(livro.titulo, livro);
        }
        return mapaLivros;
    }

    public static void main(String[] args) {
        // Criação de instâncias da classe Livro
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("Ensaio sobre a Cegueira", "José Saramago");
        Livro livro3 = new Livro("1984", "George Orwell");
        Livro livro4 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro5 = new Livro("A Metamorfose", "Franz Kafka");
        Livro livro6 = new Livro("Drácula", "Bram Stoker");
        Livro livro7 = new Livro("A Divina Comédia", "Dante Alighieri");
        Livro livro8 = new Livro("Código Da Vinci", "Dan Brown");
        Livro livro9 = new Livro("O Alquimista", "Paulo Coelho");
        Livro livro10 = new Livro("E não sobrou nenhum", "Agatha Christie");
        Livro livro11 = new Livro("O Caçador de Pipas", "Khaled Hosseini");
        Livro livro12 = new Livro("A Hora da Estrela", "Clarice Lispector");
        Livro livro13 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams");
        Livro livro14 = new Livro("Pax", "Sara Pennypacker");
        Livro livro15 = new Livro("Dom Casmurro", "Machado de Assis");

        // Criação de uma lista de livros
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
        livros.add(livro6);
        livros.add(livro7);
        livros.add(livro8);
        livros.add(livro9);
        livros.add(livro10);
        livros.add(livro11);
        livros.add(livro12);
        livros.add(livro13);
        livros.add(livro14);
        livros.add(livro15);

        System.out.println("Livros não ordenados:");
        exibirLivros(livros);

        // Ordena os livros por título usando Insertion Sort
        insertionSort(livros);

        System.out.println("\nLivros ordenados por título:");
        exibirLivros(livros);

        // Cria um mapa de livros para busca rápida por título
        HashMap<String, Livro> mapaLivros = criarMapaLivros(livros);

        // Exemplo de busca rápida por título
        String tituloBusca = "Dom Quixote";
        if (mapaLivros.containsKey(tituloBusca)) {
            Livro livroEncontrado = mapaLivros.get(tituloBusca);
            System.out.println("\nLivro encontrado: " + livroEncontrado.titulo + " - " + livroEncontrado.autor);
        } else {
            System.out.println("\nLivro não encontrado.");
        }
    }
}

