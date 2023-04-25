package com.example.mobilesoftware_finalproject1

import android.os.Bundle
import android.util.Log
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

        val urls = arrayOf(
            ModuleButtonComponent(
                "https://drive.google.com/file/d/1yEUgYqGZP9fFV2Dwd-upfRBL2BS0kLuc/view?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-1",
                binding.button
            ),
            ModuleButtonComponent(
                "https://drive.google.com/file/d/1JFGntkIxP2fDprbotTvr68-cNR0xefjv/view?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-2",
                binding.button2
            ),
            ModuleButtonComponent(
                "https://drive.google.com/file/d/1x3Qaq6vJ-ZqUgN1-zWzCvlZNEitr4oxS/view?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-3",
                binding.button3
            ),
            ModuleButtonComponent(
                "https://drive.google.com/file/d/1e3sHDJAARD5Y372lL474h7-sXnJzCQpT/view?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-13",
                binding.button13
            )
        )

        urls.forEach { moduleButtonComponent ->
            moduleButtonComponent.button.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("slideURL", moduleButtonComponent.SlideURL)
                bundle.putString("labURL", moduleButtonComponent.LabURL)
                findNavController().navigate(
                    R.id.action_LearningModulesFragment_to_ModuleResourcesFragment,
                    bundle
                )

            }
            Log.d("Print URLS", moduleButtonComponent.SlideURL)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
