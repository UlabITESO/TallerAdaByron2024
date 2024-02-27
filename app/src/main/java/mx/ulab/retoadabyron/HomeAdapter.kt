package mx.ulab.retoadabyron

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val items: List<Any>, private val context: Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val VIEW_TRANSPORTE = 1
    }
    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Transporte -> VIEW_TRANSPORTE
            else -> throw IllegalArgumentException("Tipo de elemento desconocido en la posición $position")
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        return when (viewType) {
                    VIEW_TRANSPORTE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.transporte_layout, parent, false)
                TransporteViewHolder(view)
            }
            else -> throw IllegalArgumentException("Tipo de vista desconocido")
        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position:
    Int) {
        when (holder) {
            is TransporteViewHolder -> {
                val item = items[position] as Transporte
                holder.bind(item, context)
            }
        }
    }
    override fun getItemCount() = items.size
    class TransporteViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bind(item: Transporte, context: Context) {
            val textView : TextView = itemView.findViewById(R.id.titleTV)
            textView.text = item.texto
            itemView.setOnClickListener {
                Log.d("HomeAdapter", "tap tap tap")
            }
        }
    }
}
data class Transporte(val texto: String)