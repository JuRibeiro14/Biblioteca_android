package br.edu.fatecpg.com.biblioteca

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.com.biblioteca.dao.LivroDao

class LivroActivity : AppCompatActivity(R.layout.activity_livro) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val txtTitulo = findViewById<TextView>(R.id.txt_titulo)
        val txtAutor = findViewById<TextView>(R.id.txt_autor)

        val livro = LivroDao.retornarLivro()

        txtTitulo.text = "Título: ${livro.titulo}"
        txtAutor.text = "Autor: ${livro.autor}"
    }
}
