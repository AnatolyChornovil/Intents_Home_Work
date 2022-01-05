package www.fandroid.intents_home_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        findViewById<TextView>(R.id.save_btn).setOnClickListener {

            val intentUser = Intent(this, MainActivity::class.java)
            intentUser.putExtra("KEY1",findViewById<EditText>(R.id.a_n_name).text.toString())
            setResult(RESULT_OK, intentUser)
            finish()
        }
    }

    companion object{
        const val KEY1 = "KEY_NextActivity"
    }
}