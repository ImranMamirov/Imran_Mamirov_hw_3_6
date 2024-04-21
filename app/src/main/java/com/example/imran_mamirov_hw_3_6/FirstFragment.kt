package com.example.imran_mamirov_hw_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imran_mamirov_hw_3_6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf(
            ItemName("Максим"),
            ItemName("Анастасия"),
            ItemName("Александр"),
            ItemName("Екатерина"),
            ItemName("Иван"),
            ItemName("Ольга"),
            ItemName("Дмитрий"),
            ItemName("Мария"),
            ItemName("Николай"),
            ItemName("София")
        )

        val adapter = AdapterName(items)
        binding.rvNames.adapter = adapter
        binding.rvNames.layoutManager = LinearLayoutManager(requireContext())
    }
}