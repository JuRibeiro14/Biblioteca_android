package br.edu.fatecpg.com.biblioteca.dao

import br.edu.fatecpg.com.biblioteca.model.Livro

class LivroDao {
    companion object {
        private var livro: Livro = Livro()

        fun definirLivro(livroRecebido: Livro) {
            livro = livroRecebido
        }

        fun retornarLivro(): Livro {
            return livro
        }
    }
}
