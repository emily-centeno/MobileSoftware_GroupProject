package com.example.mobilesoftware_finalproject1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilesoftware_finalproject1.databinding.FragmentStartHereItemsBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class StartHereItemsFragment : Fragment() {

    private var _binding: FragmentStartHereItemsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartHereItemsBinding.inflate(inflater, container, false)
        val args = arguments ?: return binding.root
        val textResourceId = args.getInt("textResourceId")
        val text = getString(textResourceId)

        binding.textView.text = text

        Log.d("StartHereItemsFragment", "text: $text") // add this log statement to check the value of text


        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}