package proyectokotlin.ejemplo.app.morales.nuria.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var textView : TextView
        textView = findViewById(R.id.textView) as TextView
        textView.text = "Hola TextView en Kotlin!!!"*/

        boton.setOnClickListener {
            /*Log.d("TAG", "Hiciste click en el botón")*/
            Toast.makeText(this,"Hiciste Click",Toast.LENGTH_SHORT).show()
            //textView.setText("Hola Kotlinx !!!! - TextView !!!")
            textView.setText(editText.getText())
            imageView.setImageResource(R.drawable.ic_launcher)
        }
    }
}
