package internship.onlinekt

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var password: EditText
    lateinit var submit: Button
    lateinit var createAccount: TextView

    var context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.main_username)
        password = findViewById(R.id.main_password)
        submit = findViewById(R.id.main_login)
        createAccount = findViewById(R.id.main_create_account)

        submit.setOnClickListener {
            if (name.text.toString().trim().equals("")) {
                name.error = "Username Required"
            } else if (password.text.toString().trim().equals("")) {
                password.error = "Password Required"
            } else if (password.text.toString().trim().length < 6) {
                password.error = "Min. 6 Char Password Required"
            } else {
                //Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
                CommonMethod().ToastFun(this@MainActivity,"Login Successfully")
                CommonMethod().SnackbarFun(it,"Login Successfully")
                //Snackbar.make(it, "Login Successfully", Snackbar.LENGTH_LONG).show()
            }
        }

    }
}