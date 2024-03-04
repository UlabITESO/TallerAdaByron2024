package mx.ulab.retoadabyron.agua

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import mx.ulab.retoadabyron.Constants
import mx.ulab.retoadabyron.R
import mx.ulab.retoadabyron.databinding.ActivityAguaBinding

class AguaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAguaBinding
    val aguaType = object : TypeToken<List<AguaData>>() {}.type
    val aguaList: List<AguaData> = Gson().fromJson(Constants.aguaJson, aguaType)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAguaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var items = arrayListOf<String>()
        aguaList.forEach {
            items.add("${it.InformeCalidadAgua.Ubicacion}")
        }
        val spinner: Spinner = binding.searchView
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position:
            Int, id: Long) {
// Obtén el elemento seleccionado usando position
                val item = items[position]
// Haz algo con el elemento seleccionado
                Log.d("selectedItem", "$position.- $item")
                val locationSelected = aguaList[position]
                val ph = locationSelected.InformeCalidadAgua.Parametros.pH.Valor
//phText
                binding.phText.text = "${ph}°"
//descriptionText
                binding.descriptionText.text =
                    locationSelected.InformeCalidadAgua.Parametros.pH.Descripcion
//tvTemperatura
                binding.tvTemperatura.text =
                    "${locationSelected.InformeCalidadAgua.Parametros.TemperaturaAgua.Valor}°"
//tvTurbidez
                binding.tvTurbidez.text =
                    locationSelected.InformeCalidadAgua.Parametros.Turbidez.Valor
//tvOxiDisuelto
                binding.tvOxiDisuelto.text =
                    "${locationSelected.InformeCalidadAgua.Parametros.OxigenoDisuelto.Valor} ox"
                var conduElectr =
                    locationSelected.InformeCalidadAgua.Parametros.ConductividadElectrica.Valor.toInt()
//semaforo del ph
                var colorConduElectrString = "#59EF6A"
                var statusConduElectr = ""
                if (conduElectr != null) {
                    if (conduElectr <= 100) {
                        statusConduElectr = "Baja"
                        colorConduElectrString = "#BE2D21"
                    } else if ((conduElectr > 100) && (conduElectr <= 300)) {
                        statusConduElectr = "Media"
                        colorConduElectrString = "#E6B250"
                    } else if (conduElectr > 300) {
                        statusConduElectr = "Alta"
                        colorConduElectrString = "#59EF6A"
                    }
                }
//tvStatus
                binding.tvStatus.text = statusConduElectr
                binding.tvStatus.setTextColor(Color.parseColor(colorConduElectrString))
                val phInt = ph.toDouble()
//semaforo del ph
                var colorString = "#59EF6A"
                if (phInt != null) {
                    if (phInt <= 3) {
                        colorString = "#FF0000"
                    } else if ((phInt > 3) && (phInt <= 8)) {
                        colorString = "#93C47D"
                    } else if (phInt > 8) {
                        colorString = "#6FA8DC"
                    }
                }
                val drawable = binding.phText.background as? GradientDrawable
                drawable?.setStroke(20, Color.parseColor(colorString))
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
// Otra lógica para cuando no se selecciona nada
            }
        }


    }
}