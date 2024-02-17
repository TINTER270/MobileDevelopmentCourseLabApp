package com.example.mobiledevelopmentcourselabapp.presentation.view.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobiledevelopmentcourselabapp.databinding.FragmentSecondBinding
import com.example.mobiledevelopmentcourselabapp.presentation.view.second.adapter.PlayerAdapter
import com.example.mobiledevelopmentcourselabapp.presentation.view.second.player.Palye
import com.example.mobiledevelopmentcourselabapp.presentation.view.second.player.PlayePosition
import java.util.jar.Attributes.Name

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val adapter by lazy {PlayerAdapter()}
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.playerList.adapter = adapter
        adapter.updateItems(arrayListOf(Palye(
            name = "Владислав С.",
            Age = "23",
            Team = "Урал",
            Number = "23",
            PhotoURL = "https://s1.1zoom.ru/big7/471/Owls_Birds_Glance_537043_2485x1920.jpg",
            position = PlayePosition.RORWARD
        )))
        // Обращайся к элементам View здесь
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}