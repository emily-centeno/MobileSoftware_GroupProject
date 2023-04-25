package com.example.mobilesoftware_finalproject1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobilesoftware_finalproject1.databinding.FragmentModuleResourcesBinding

class ModuleResourcesFragment : Fragment() {

    private var _binding: FragmentModuleResourcesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var slideURL : String? = ""
    private var labURL : String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args = arguments ?: return binding.root
        slideURL = args.getString("slideURL")
        labURL = args.getString("labURL")

        _binding = FragmentModuleResourcesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.button17.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("slideURL", slideURL)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(slideURL))
            startActivity(intent)
        }
        binding.button18.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(labURL))
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
