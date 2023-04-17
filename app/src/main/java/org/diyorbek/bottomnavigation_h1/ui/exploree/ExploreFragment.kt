package org.diyorbek.bottomnavigation_h1.ui.exploree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import org.diyorbek.bottomnavigation_h1.adapter.RvAdapter
import org.diyorbek.bottomnavigation_h1.databinding.FragmentExploreBinding
import org.diyorbek.bottomnavigation_h1.util.Constantas

class ExploreFragment : Fragment() {
    private val rvAdapter by lazy { RvAdapter() }
    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvAdapter.exList = Constantas.thirdExercises()
        binding.rv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = rvAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}