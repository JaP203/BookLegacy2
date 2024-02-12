// MainFragment.kt
package com.marisma.booklegacy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.marisma.booklegacy.R
import com.marisma.booklegacy.fragments.MenuFragment
import com.marisma.booklegacy.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener {
            val userName = binding.userEditText.text.toString()
            val bundle = Bundle().apply {
                putString("USER_NAME", userName)
            }
           findNavController().navigate(R.id.action_mainFragment2_to_menuFragment,bundle)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
