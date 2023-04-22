package com.example.mobilesoftware_finalproject1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobilesoftware_finalproject1.databinding.FragmentModuleResourcesBinding

class ModuleResourcesFragment : Fragment() {

    private var _binding: FragmentModuleResourcesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val urlSlides = arguments?.getString(URL_KEY_SLIDES)
        val urlLab = arguments?.getString(URL_KEY_LAB)


        _binding = FragmentModuleResourcesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object {
        const val URL_KEY_SLIDES = "url_key_1"
        const val URL_KEY_LAB = "url_key_2"
    }
}
