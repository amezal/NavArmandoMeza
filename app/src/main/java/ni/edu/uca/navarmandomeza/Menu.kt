package ni.edu.uca.navarmandomeza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navarmandomeza.databinding.ActivityMainBinding
import ni.edu.uca.navarmandomeza.databinding.FragmentMenuBinding

class Menu : Fragment() {
    private lateinit var binding: FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        layoutInflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        binding.btnINSS.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_salarioInss)
        }
        binding.btnNotas.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_notas)
        }
        binding.btnBeca.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_beca)
        }
        return binding.root
    }


}