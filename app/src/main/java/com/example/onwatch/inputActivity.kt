package com.example.onwatch

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.onwatch.databinding.ActivityInputBinding

class inputActivity : AppCompatActivity() {
    lateinit var binding:ActivityInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val modelClass= ModelClass(
                brand = binding.brand.editText?.text.toString(),
                model = binding.model.editText?.text.toString(),
                price = binding.price.editText?.text.toString()


            )
            AppDatabase.getDatabase(this).ProjectDao().insert(modelClass)
            Toast.makeText(this ,"save",Toast.LENGTH_SHORT).show()
            finish()
        }


    }
}