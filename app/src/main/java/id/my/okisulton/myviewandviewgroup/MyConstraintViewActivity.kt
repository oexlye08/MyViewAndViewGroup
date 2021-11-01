package id.my.okisulton.myviewandviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyConstraintViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_constraint_view)

        supportActionBar?.title = "Google Pixel"
    }
}