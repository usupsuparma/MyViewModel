package id.usupsuparma.myviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMyButtonEnable()
        my_edit_text.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                setMyButtonEnable()
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        my_button.setOnClickListener{Toast.makeText(this, my_edit_text.text, Toast.LENGTH_LONG).show()}



    }

    private fun setMyButtonEnable() {
        my_button.isEnabled = my_edit_text.text != null && my_edit_text.text.toString().isNotEmpty()
    }
}
