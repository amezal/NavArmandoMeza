package ni.edu.uca.navarmandomeza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navarmandomeza.databinding.FragmentBecaBinding

class Beca : Fragment() {
    
    private lateinit var binding: FragmentBecaBinding
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
        binding = FragmentBecaBinding.inflate(inflater, container, false)
        binding.btnCalcular.setOnClickListener{
            val nota = binding.etNota.text.toString().toFloat()
            var beca: Int = 0
            if (nota >= 85 && nota < 90) {
                beca = 25
            }
            else if (nota >= 90 && nota < 95) {
                beca = 50
            }
            else if (nota >= 95 && nota < 100) {
                beca = 75
            }
            else if (nota == 100F) {
                beca = 100
            }
            binding.tvRespuesta.text = "Su beca es de: ${beca}%"
        }
        return binding.root
    }
}