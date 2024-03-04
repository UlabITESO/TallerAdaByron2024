package mx.ulab.retoadabyron

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.ulab.retoadabyron.agua.AguaActivity
import mx.ulab.retoadabyron.aire.AireActivity
import mx.ulab.retoadabyron.transporte.TransporteActivity

class HomeAdapter(private val items: List<Any>, private val context: Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val VIEW_TRANSPORTE = 1
        private const val VIEW_AIRE = 2
        private const val VIEW_AGUA = 3
    }
    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Transporte -> VIEW_TRANSPORTE
            is Aire -> VIEW_AIRE
            is Agua -> VIEW_AGUA
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
            VIEW_AIRE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.aire_layout,
                        parent,false)
                AireViewHolder(view)
            }
            VIEW_AGUA -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.agua_layout,
                        parent,false)
                AguaViewHolder(view)
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
            is AireViewHolder -> {
                val item = items[position] as Aire
                holder.bind(item, context)
            }
            is AguaViewHolder -> {
                val item = items[position] as Agua
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
                val intent = Intent(context, TransporteActivity::class.java)
                context.startActivity(intent)
            }
        }
    }

    class AireViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Aire, context: Context) {
            val textView : TextView = itemView.findViewById(R.id.titleTV)
            textView.text = item.texto
            itemView.setOnClickListener {
                val intent = Intent(context, AireActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
    class AguaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Agua, context: Context) {
            val textView : TextView = itemView.findViewById(R.id.titleTV)
            textView.text = item.texto
            itemView.setOnClickListener {
                val intent = Intent(context, AguaActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
}
data class Transporte(val texto: String)
data class Aire(val texto: String)
data class Agua(val texto: String)