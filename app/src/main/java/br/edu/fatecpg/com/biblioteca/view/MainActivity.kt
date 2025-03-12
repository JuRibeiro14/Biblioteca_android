package br.edu.fatecpg.com.biblioteca.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.com.biblioteca.R
import com.example.bookapp.model.Livro

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)

        btnSalvar.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()

            val livro = Livro(titulo, autor)

            val intent = Intent(this, LivroActivity::class.java)
            intent.putExtra(Constantes.LIVRO_EXTRA, livro)
            
            startActivity(intent)
        }
    }
}
