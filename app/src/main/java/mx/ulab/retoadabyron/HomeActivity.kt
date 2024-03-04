package mx.ulab.retoadabyron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.ulab.retoadabyron.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    val items: List<Any> = listOf(
        Transporte("Transporte"),
        Aire("Calidad del aire"),
        Agua("Calidad del agua"),
        Residuos("Residuos")
    )

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = HomeAdapter(items, this)
    }
}