package ni.edu.uca.navarmandomeza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navarmandomeza.databinding.FragmentSalarioInssBinding

class SalarioInss : Fragment() {

    private lateinit var binding: FragmentSalarioInssBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSalarioInssBinding.inflate(inflater, container, false)
        binding.btnCalcular.setOnClickListener {
            val salarioBruto = binding.etSalario.text.toString().toFloat()
            val valorInss = salarioBruto * 0.07
            val salarioNeto = salarioBruto - valorInss

            binding.tvRespuesta.text = "Salario bruto: ${salarioBruto} \n INSS: ${valorInss}  \n Salario neto: ${salarioNeto}"
        }
        return binding.root
    }
}