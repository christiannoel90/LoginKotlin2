package arellano.christian.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener {
            val user = etNombre.text.toString()
            val pass = etPass.text.toString()

            if (user.equals("") or pass.equals("")) {
                mensaje("Datos vacios", Toast.LENGTH_LONG)
            } else {
                if (user.equals("christian") and pass.equals("1234")) {
                    mensaje("Bienvenido")
                } else {
                    mensaje("no te conozco")
                }

            }
        }
    }


    override fun onStart() {
        super.onStart()
        Log.w( /*tag:*/ "ejemplo", /*msg: */ "debo estar en el onstart")
    }


    fun mensaje(mensaje: String, dur: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, mensaje, dur).show()
    }

}