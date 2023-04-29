package com.example.mobilesoftware_finalproject1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mobilesoftware_finalproject1.databinding.FragmentProjectBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ProjectFragment : Fragment() {

    private var _binding: FragmentProjectBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProjectBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.buttonInstructions.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1GTBv9x7EjhJvzUesuANj7rsX6bLmYgvq/view?usp=sharing"))
            startActivity(intent)
        }
        binding.buttonProposal.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rLCZpiYHZSzTO848MXce3vlkWgM2w9z2/view?usp=sharing"))
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}