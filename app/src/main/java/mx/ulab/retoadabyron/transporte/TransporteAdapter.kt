package mx.ulab.retoadabyron.transporte

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.ulab.retoadabyron.R

class TransporteAdapter(
    private val items: List<String>,
    private val costo: String,
    private val frecuencia: String,
    private val status: String
) : RecyclerView.Adapter<TransporteAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var paradaText : TextView = itemView.findViewById(R.id.tvTitulo)
        var costoText : TextView = itemView.findViewById(R.id.tvCosto)
        var tiempoText : TextView = itemView.findViewById(R.id.tvTiempo)
        var statusText : TextView = itemView.findViewById(R.id.tvStatus)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rutas_layout, parent,
                false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.paradaText.text = items[position]
        holder.costoText.text = "Costo $costo"
        holder.tiempoText.text = frecuencia
        holder.statusText.text = status
        if (status != "En tiempo") {
            holder.statusText.setTextColor(Color.rgb(250, 47, 10))
        }
    }
    override fun getItemCount() = items.size
}