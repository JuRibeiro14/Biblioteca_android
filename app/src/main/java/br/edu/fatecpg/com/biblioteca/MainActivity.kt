package br.edu.fatecpg.com.biblioteca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.com.biblioteca.dao.LivroDao
import br.edu.fatecpg.com.biblioteca.model.Livro

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)

        btnSalvar.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()

            val livro = Livro(titulo, autor)

            LivroDao.definirLivro(livro)

            val intent = Intent(this, LivroActivity::class.java)
            startActivity(intent)
        }
    }
}
