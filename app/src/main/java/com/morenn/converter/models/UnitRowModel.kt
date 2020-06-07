package com.morenn.converter.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.morenn.converter.R
import com.morenn.converter.utils.UnitsType

class UnitRowModel(private val unit: UnitsType, var listener: (UnitsType) -> Unit): EpoxyModelWithHolder<UnitRowModel.Holder>() {

    init {
        id("RowModelItem$unit")
    }

    override fun getDefaultLayout(): Int = R.layout.row_model_item

    override fun createNewHolder(): Holder = Holder()

    override fun bind(holder: Holder) {
        holder.cardTitle.text = holder.cardTitle.context.getString(unit.unitGroupNameId)
        holder.card.setOnClickListener { listener(unit) }
    }

    inner class Holder : EpoxyHolder() {
        lateinit var cardTitle: TextView
        lateinit var cardImage: ImageView
        lateinit var card: CardView

        override fun bindView(itemView: View) {
            cardTitle = itemView.findViewById(R.id.cardTitle)
            cardImage = itemView.findViewById(R.id.cardImage)
            card = itemView.findViewById(R.id.card)
        }
    }
}
