package tj.behruz.movies.presentation.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import tj.behruz.movies.databinding.MoviesFragmentBinding
import tj.behruz.movies.domain.models.Status
import tj.behruz.movies.presentation.adapters.MoviesAdapter


class MoviesFragment: Fragment() {

    private lateinit var _binding: MoviesFragmentBinding
    private val binding get() = _binding

    private val viewModel by viewModels<MoviesViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = MoviesFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getMovies().observe(viewLifecycleOwner) { result ->
            if (result.data!=null){
                if (result.data.feed?.results?.isNotEmpty()!!){
                    binding.moviesRecyclerView.adapter=MoviesAdapter(result.data.feed.results){

                    }
                }
            }



        }


    }
}


