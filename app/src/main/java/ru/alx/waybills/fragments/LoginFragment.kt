package ru.alx.waybills.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import ru.alx.waybills.R

private const val TAG = "LoginFragment"

class LoginFragment : Fragment() {

    private lateinit var editTextTextUserName: EditText
    private lateinit var editTextTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        editTextTextUserName = view.findViewById(R.id.editTextTextUserName) as EditText
        editTextTextPassword = view.findViewById(R.id.editTextTextPassword) as EditText
        buttonLogin = view.findViewById(R.id.buttonLogin) as Button

        return view
    }

    override fun onStart() {
        super.onStart()

        buttonLogin.setOnClickListener { view ->
            Toast.makeText(requireContext(), "Login pressed", Toast.LENGTH_SHORT).show()
        }
    }
}