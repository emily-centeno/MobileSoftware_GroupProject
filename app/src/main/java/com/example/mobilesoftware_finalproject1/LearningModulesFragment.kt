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
                "https://docs.google.com/presentation/d/1aStRnrhZv4R6vvY2I8YcrgZ6zA7k7ItPtAHcSWgaO2g/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-1",
                binding.button
            ),
            ModuleButtonComponent(
                "https://docs.google.com/presentation/d/1Kk-pjfG8NReq6esTjwFrfAhtw6SS2TUFogkgWieYQZw/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-2",
                binding.button2
            ),
            ModuleButtonComponent("https://docs.google.com/presentation/d/1FSZwOeSwL-XNkMXnKDy-YPMEpCPKyb29RlpekSzzJDY/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-3",
                binding.button3
            ),
            ModuleButtonComponent("https://docs.google.com/presentation/d/1wu1c9Q_3mcPS1IjazDkci5-8nBJumCfWWY15B9EUjA0/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-4",
                binding.button4
            ), //L5
            ModuleButtonComponent("https://docs.google.com/presentation/d/13pmWTJiISYksgdK0iB4VPEBLUuciupvlD0Cn0Sy-1WI/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-5",
                binding.button5
            ), //L6
            ModuleButtonComponent("https://docs.google.com/presentation/d/1QWLSLfkodgmd3nns8RRNXBCRL45p_0_249lSXiLE2rU/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-6",
                binding.button6
            ), //L7
            ModuleButtonComponent("https://docs.google.com/presentation/d/1n3OCwb7kRx-y7Q_wYGLtRsDynyDf8e8xOM6_qBn-yY4/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-7",
                binding.button7
            ), //L8
            ModuleButtonComponent("https://docs.google.com/presentation/d/10Qpt3z3-DASD-9AmADRBD_7AElM_5cLH4yf2HKgl4YY/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-8",
                binding.button8
            ), //L9
            ModuleButtonComponent("https://docs.google.com/presentation/d/1COEiWNknSmiI5RUgxumLrgscl9d-yvKoj6tjNF9jw5A/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-9",
                binding.button9
            ), //L10
            ModuleButtonComponent("https://docs.google.com/presentation/d/1dMK7nkyNhbYDm3dxkwimerww4qWg4UuUT8s8c0GoSL8/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-10",
                binding.button10
            ), //L11
            ModuleButtonComponent("https://docs.google.com/presentation/d/1osOpeT2U4JnJpSP4YUk7SJ6qAsqxm4FIRw0q6CEvLRo/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-11",
                binding.button11
            ), //L12
            ModuleButtonComponent("https://docs.google.com/presentation/d/1G_qhNKVzrfuc4y69XUkWpAPB7uDUE1tNtvimKTpGJKM/edit?usp=sharing",
                "https://developer.android.com/courses/pathways/android-development-with-kotlin-12",
                binding.button12
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
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
