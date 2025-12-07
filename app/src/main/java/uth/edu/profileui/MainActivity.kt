package uth.edu.profileui

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnEdit = findViewById<ImageButton>(R.id.btnEdit)

        btnBack.setOnClickListener {
            // ví dụ quay lại
            finish()
        }

        btnEdit.setOnClickListener {
            // mở màn hình chỉnh sửa - hiện tại demo bằng Toast
            Toast.makeText(this, "Edit profile clicked", Toast.LENGTH_SHORT).show()
        }
    }
}