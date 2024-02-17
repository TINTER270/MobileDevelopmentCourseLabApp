package com.example.mobiledevelopmentcourselabapp.presentation.view.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobiledevelopmentcourselabapp.databinding.FragmentArticleBinding

class ArticleFragment : Fragment() {

    private var _binding: FragmentArticleBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticleBinding.inflate(inflater, container, false)
        val root: View = binding.root
        var likeResult1 = 0
        binding.thumbUp.setOnClickListener {
            likeResult1 += 1
            binding.likeResult.text = likeResult1.toString()
        }
        binding.thumbDown.setOnClickListener {
            if (likeResult1 > 0) {
                likeResult1 -= 1
                binding.likeResult.text = likeResult1.toString()
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}