package ni.edu.uca.navarmandomeza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navarmandomeza.databinding.FragmentNotasBinding

class Notas : Fragment() {

    private lateinit var binding: FragmentNotasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotasBinding.inflate(inflater, container, false)

        binding.btnCalcular.setOnClickListener{
            val notasText = binding.etNotas.text.toString().replace(" ", "")
            val notas = notasText.split(",").toList().map {it.toFloat()}
            val notasOrdenadas = notas.sortedDescending()
            binding.tvRespuesta.text = "Las notas más altas son: \n1 - ${notasOrdenadas[0]} \n2 - ${notasOrdenadas[1]} \n3 - ${notasOrdenadas[2]}"
        }

        return binding.root
    }
}