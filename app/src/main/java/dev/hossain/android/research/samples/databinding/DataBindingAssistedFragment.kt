package dev.hossain.android.research.samples.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dev.hossain.android.research.data.SampleDataProvider
import dev.hossain.android.research.databinding.ResearchDataBindingAssistedExampleFragmentBinding
import dev.hossain.android.research.samples.ExperimentBaseFragment

class DataBindingAssistedFragment : ExperimentBaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = ResearchDataBindingAssistedExampleFragmentBinding.inflate(inflater, container, false)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val dataBindingAssistedPeopleAdapter = DataBindingAssistedPeopleAdapter()
        binding.recyclerView.adapter = dataBindingAssistedPeopleAdapter
        dataBindingAssistedPeopleAdapter.submitList(SampleDataProvider.people(limit = 30))

        return binding.root
    }

    override fun onSynopsisMenuClicked() {
        findNavController().navigate(
            DataBindingAssistedFragmentDirections
                .actionDataBindingAssistedFragmentToShowSourceCodeFragment("synopsis_data_binding_listener.html")
        )
    }
}
