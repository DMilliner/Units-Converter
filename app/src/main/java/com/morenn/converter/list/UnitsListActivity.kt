package com.morenn.converter.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.morenn.converter.R

class UnitsListActivity : AppCompatActivity() {

    private lateinit var recyclerView: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_units_list)

        recyclerView = findViewById(R.id.epoxyRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val controller = Controller(this@UnitsListActivity)
        recyclerView.setControllerAndBuildModels(controller)
    }
}
