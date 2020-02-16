package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingpractice.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // レイアウト読み込み
        setContentView(R.layout.main_activity)

        // Fragment設置
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
