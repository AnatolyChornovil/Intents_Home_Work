package www.fandroid.intents_home_work

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over)
        }

        fun onView1Click(v: View?) {
            sendMessage(findViewById<TextView>(R.id.country_1).text.toString())
        }

        fun onView2Click(v: View?) {
            sendMessage(findViewById<TextView>(R.id.country_2).text.toString())
        }

        fun onView3Click(v: View?) {
            sendMessage(findViewById<TextView>(R.id.country_3).text.toString())
        }
        fun onView4Click(v: View?) {
            sendMessage(findViewById<TextView>(R.id.country_4).text.toString())
        }

        private fun sendMessage(message: String) {
            val data = Intent()
            data.putExtra(MainActivity.ACCESS_MESSAGE, message)
//            data.put
            setResult(RESULT_OK, data)
            finish()
        }

    }


//        findViewById<TextView>(R.id.country_1).setOnClickListener {
//
//            val intentCountry1 = Intent(this, MainActivity::class.java)
//            intentCountry1.putExtra("CNTR1", findViewById<TextView>(R.id.country_1).text.toString())
//            setResult(RESULT_OK, intentCountry1)
//            finish()
//        }
//
//        findViewById<TextView>(R.id.country_2).setOnClickListener {
//
//            val intentCountry2 = Intent(this, MainActivity::class.java)
//            intentCountry2.putExtra("CNTR2", findViewById<TextView>(R.id.country_2).text.toString())
//            setResult(RESULT_OK, intentCountry2)
//            finish()
//        }
//        findViewById<TextView>(R.id.country_3).setOnClickListener {
//
//            val intentCountry3 = Intent(this, MainActivity::class.java)
//            intentCountry3.putExtra("CNTR3", findViewById<TextView>(R.id.country_3).text.toString())
//            setResult(RESULT_OK, intentCountry3)
//            finish()
//        }
//        findViewById<TextView>(R.id.country_4).setOnClickListener {
//
//            val intentCountry4 = Intent(this, MainActivity::class.java)
//            intentCountry4.putExtra("CNTR4", findViewById<TextView>(R.id.country_4).text.toString())
//            setResult(RESULT_OK, intentCountry4)
//            finish()

//        fun onCancelClick(v: View?) {
//            setResult(RESULT_CANCELED)
//            finish()
//        }

//companion object{
//    const val CNTR1 = "KEY_OverActivity1"
//    const val CNTR2 = "KEY_OverActivity2"
//    const val CNTR3 = "KEY_OverActivity3"
//    const val CNTR4 = "KEY_OverActivity4"
//}

//fun onButton1Click(v: View?) {
//    sendMessage("Доступ разрешен")
//}
//
//fun onButton2Click(v: View?) {
//    sendMessage("Доступ запрещен")
//}
//
//fun onButton3Click(v: View?) {
//    sendMessage("Недопустимый возраст")
//}
//fun onButton3Click(v: View?) {
//    sendMessage("Недопустимый возраст")
//}
//
