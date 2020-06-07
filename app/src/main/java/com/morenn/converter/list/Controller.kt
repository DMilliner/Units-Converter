package com.morenn.converter.list

import android.content.Context
import android.content.Intent
import com.airbnb.epoxy.EpoxyController
import com.morenn.converter.detail.DetailActivity
import com.morenn.converter.detail.SELECTED_UNIT
import com.morenn.converter.models.UnitRowModel
import com.morenn.converter.utils.UnitsType

class Controller(private val context: Context): EpoxyController() {

    override fun buildModels() {
        for (unit in UnitsType.values()) {
            add(UnitRowModel(unit) {
//                If Free open Details
//                Otherwise display the purchase banner

                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(SELECTED_UNIT, it)
                context.startActivity(intent)

            })
        }
    }
}