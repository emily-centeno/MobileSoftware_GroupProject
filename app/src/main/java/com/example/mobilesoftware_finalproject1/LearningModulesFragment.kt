package com.example.mobilesoftware_finalproject1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobilesoftware_finalproject1.databinding.FragmentLearningModulesBinding

class LearningModulesFragment : Fragment() {

    private var _binding: FragmentLearningModulesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // val fragmentManager = requireActivity().supportFragmentManager
        _binding = FragmentLearningModulesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button8.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button9.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button10.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button11.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button12.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }

        binding.button13.setOnClickListener {
            findNavController().navigate(R.id.action_LearningModulesFragment_to_ModuleResourcesFragment)
        }
//        button1.setOnClickListener {
//            val bundle = Bundle().apply {
//                putString(ModuleResourcesFragment.URL_KEY_SLIDES, "http://www.example.com/url1")
//            }
//
//            val fragmentB = ModuleResourcesFragment()
//            fragmentB.arguments = bundle
//
//            childFragmentManager.beginTransaction()
//                .replace(R.id.container, fragmentB)
//                .addToBackStack(null)
//                .commit()
//        }

//        button2.setOnClickListener {
//            val bundle = Bundle().apply {
//                putString(ModuleResourcesFragment.URL_KEY_LAB, "http://www.example.com/url2")
//            }
//
//            val fragmentB = ModuleResourcesFragment()
//            fragmentB.arguments = bundle
//
//            childFragmentManager.beginTransaction()
//                .replace(R.id.container, fragmentB)
//                .addToBackStack(null)
//                .commit()
//        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
