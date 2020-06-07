package com.morenn.converter.detail

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.morenn.converter.R
import com.morenn.converter.utils.*
import kotlinx.android.synthetic.main.activity_detail.*

const val SELECTED_UNIT = "SELECTED_UNIT"

class DetailActivity : AppCompatActivity() {

    private lateinit var selectedUnit: UnitsType
    private lateinit var adapter: ArrayAdapter<*>

    private var firstUnit: UnitType? = null
    private var secondUnit: UnitType? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        selectedUnit = intent.getSerializableExtra(SELECTED_UNIT) as UnitsType
        supportActionBar?.title = getString(selectedUnit.unitGroupNameId)

        val items = selectedUnit.unitsList.map { it.unitSymbolId }
        adapter = ArrayAdapter(this@DetailActivity, R.layout.list_item, items)

        convertButton.setOnClickListener {
            viceVersa()
        }

        setupFirstValueAndUnit()
        setupSecondValueAndUnit()
    }

    private fun setupFirstValueAndUnit() {
        firstValueField.editText?.doOnTextChanged { inputText, _, _, _ ->
            convertUnits(selectedUnit, firstUnit, secondUnit, inputText.toString())
        }

        val firstUnitAutoCompleteField = (firstUnitField.editText as? AutoCompleteTextView)
        firstUnitAutoCompleteField?.setAdapter(adapter)
        firstUnitAutoCompleteField?.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val unitSelected = parent.getItemAtPosition(position)
                firstUnit = selectedUnit.unitsList.find { it.unitSymbolId == unitSelected }
                convertUnits(
                    selectedUnit,
                    firstUnit,
                    secondUnit,
                    firstValueField.editText?.text.toString()
                )
            }
    }

    private fun setupSecondValueAndUnit() {
        secondValueInputEditText.isEnabled = false

        val secondUnitAutoCompleteField = (secondUnitField.editText as? AutoCompleteTextView)
        secondUnitAutoCompleteField?.setAdapter(adapter)
        secondUnitAutoCompleteField?.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val unitSelected = parent.getItemAtPosition(position)
                secondUnit = selectedUnit.unitsList.find { it.unitSymbolId == unitSelected }
                convertUnits(
                    selectedUnit,
                    firstUnit,
                    secondUnit,
                    firstValueField.editText?.text.toString()
                )
            }
    }

    private fun viceVersa() {

    }

    private fun convertUnits(
        selectedUnit: UnitsType,
        firstUnit: UnitType?,
        secondUnit: UnitType?,
        text: String
    ) {
        if (text.isNotEmpty()) {
            val valueConverted = when (selectedUnit) {
                UnitsType.ACCELERATION -> convertAccelerations(text.toDouble(), firstUnit, secondUnit)
                UnitsType.ANGLE -> convertAngles(text.toDouble(), firstUnit, secondUnit)
                UnitsType.AREA -> convertAreas(text.toDouble(), firstUnit, secondUnit)
                UnitsType.BYTES -> convertBytes(text.toDouble(), firstUnit, secondUnit)
                UnitsType.COOKING -> convertCooking(text.toDouble(), firstUnit, secondUnit)
                UnitsType.DISTANCE -> convertDistances(text.toDouble(), firstUnit, secondUnit)
                UnitsType.FUEL_CONSUMPTION -> convertFuelConsumptions(text.toDouble(), firstUnit, secondUnit)
                UnitsType.MASS -> convertMass(text.toDouble(), firstUnit, secondUnit)
                UnitsType.NUMERAL_SYSTEM -> convertNumbers(text.toDouble(), firstUnit, secondUnit)
                UnitsType.PERCENTAGE -> convertPercentages(text.toDouble(), firstUnit, secondUnit)
                UnitsType.SI_PREFIXES -> convertPrefixes(text.toDouble(), firstUnit, secondUnit)
                UnitsType.SPEED -> convertSpeeds(text.toDouble(), firstUnit, secondUnit)
                UnitsType.TEMPERATURE -> convertTemperatures(text.toDouble(), firstUnit, secondUnit)
                UnitsType.TIME -> convertTimes(text.toDouble(), firstUnit, secondUnit)
                UnitsType.VOLUME -> convertVolumes(text.toDouble(), firstUnit, secondUnit)
            }

            secondValueInputEditText.setText(valueConverted.toString())
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}