package com.markpochodaj.habittrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.single_card.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Adapter -> defines data
        //RecyclerView -> implement 3 methods

        rv.setHasFixedSize(true)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HabitsAdapter(getSampleHabits())


    }
}
