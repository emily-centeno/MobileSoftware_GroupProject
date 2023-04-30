package com.example.mobilesoftware_finalproject1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobilesoftware_finalproject1.databinding.FragmentFirstBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // [START declare_auth]
    private lateinit var auth: FirebaseAuth

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            reload()
        }
    }
    // [END on_start_check_user]

    private fun createAccount(email: String, password: String) {
        if (email == "" || password == "") {
            Toast.makeText(
                requireContext(),
                "Authentication failed.",
                Toast.LENGTH_SHORT,
            ).show()
        }
       else {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(requireActivity()) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "createUserWithEmail:success")
                        Toast.makeText(
                            requireContext(),
                            "Authentication successful.",
                            Toast.LENGTH_SHORT,
                        ).show()
                        val user = auth.currentUser
                        updateUI(user)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "createUserWithEmail:failure", task.exception)
                        Toast.makeText(
                            requireContext(),
                            "Authentication failed.",
                            Toast.LENGTH_SHORT,
                        ).show()
                        updateUI(null)
                    }
                }
        }
        // [END create_user_with_email]
    }

    private fun signIn(email: String, password: String) {
        // [START sign_in_with_email]
        Log.d("AuthCheck", email)
        Log.d("AuthCheck", password)
        if (email == "" || password == "") {
            Toast.makeText(
                requireContext(),
                "Authentication failed.",
                Toast.LENGTH_SHORT,
            ).show()
        }
       else { auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(
                        requireContext(),
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                    updateUI(null)
                }
            }
            }
    }

//    private fun sendEmailVerification() {
//        // [START send_email_verification]
//        val user = auth.currentUser!!
//        user.sendEmailVerification()
//            .addOnCompleteListener(requireActivity()) { task ->
//                // Email Verification sent
//            }
//        // [END send_email_verification]
//    }

    private fun updateUI(user: FirebaseUser?) {
        if (user != null) {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    private fun reload() {
    }

    companion object {
        private const val TAG = "EmailPassword"
    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        auth = Firebase.auth
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // (activity as PhoneAuthActivity?)

        binding.buttonFirst2.setOnClickListener {
            val editTextEmail = binding.editTextTextEmailAddress2.text.toString()
            val editTextPwd = binding.editTextTextPassword.text.toString()
            createAccount(editTextEmail, editTextPwd)
        }

        binding.buttonFirst.setOnClickListener {
            val editTextEmail = binding.editTextTextEmailAddress2.text.toString()
            val editTextPwd = binding.editTextTextPassword.text.toString()
            signIn(editTextEmail, editTextPwd)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}