package br.edu.fatecpg.com.biblioteca.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.com.biblioteca.R
import com.example.bookapp.model.Livro

class LivroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro)

        val txtTitulo = findViewById<TextView>(R.id.txt_titulo)
        val txtAutor = findViewById<TextView>(R.id.txt_autor)

        val livro = intent.getParcelableExtra<Livro>(Constantes.LIVRO_EXTRA)

        txtTitulo.text = "Título: ${livro?.titulo}"
        txtAutor.text = "Autor: ${livro?.autor}"
    }
}
