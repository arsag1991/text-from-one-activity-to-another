package com.example.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.training.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    //private var launcher: ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        /*launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if (result.resultCode == RESULT_OK){*/

        val getResult = intent.getStringExtra("k1") ?: "0000"
                binding.textView2.text = getResult


    }
}