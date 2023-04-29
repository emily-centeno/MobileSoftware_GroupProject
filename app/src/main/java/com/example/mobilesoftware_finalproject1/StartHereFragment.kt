package com.example.mobilesoftware_finalproject1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobilesoftware_finalproject1.databinding.FragmentStartHereBinding


class StartHereFragment : Fragment() {
    private var _binding: FragmentStartHereBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStartHereBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonWelcome.setOnClickListener {
            val bundle = Bundle().apply {
                putInt("textResourceId", R.string.welcome_fragment_text)
            }
            findNavController().navigate(R.id.action_StartHereFragment_to_StartHereItemsFragment, bundle)
        }
        binding.buttonLabReport.setOnClickListener {
            val bundle = Bundle().apply {
                putInt("textResourceId", R.string.lab_instructions_details)
            }
            findNavController().navigate(R.id.action_StartHereFragment_to_StartHereItemsFragment, bundle)
        }
        binding.buttonSyllabus.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1yKdUbQT7PC1h5hvcgbFsEgvE2wqCkGDo/view?usp=share_link")
            )
            intent.setPackage("com.android.chrome")
            startActivity(intent)
        }

        binding.buttonProject.setOnClickListener {
            findNavController().navigate(R.id.action_StartHereFragment_to_ProjectFragment)
        }



    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}