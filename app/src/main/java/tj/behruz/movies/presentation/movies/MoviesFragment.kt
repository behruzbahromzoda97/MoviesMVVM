package tj.behruz.movies.presentation.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import tj.behruz.movies.databinding.MoviesFragmentBinding
import tj.behruz.movies.domain.models.Movies
import tj.behruz.movies.domain.models.Status
import tj.behruz.movies.presentation.adapters.MoviesAdapter
import tj.behruz.movies.utils.Constants
import tj.behruz.movies.utils.Utils


class MoviesFragment: Fragment() {

    private lateinit var _binding: MoviesFragmentBinding
    private val binding get() = _binding
    private val viewModel by viewModels<MoviesViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = MoviesFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchMovies()
        Utils.status.observe(viewLifecycleOwner, Observer {
            if (it) {
                viewModel.fetchMovies()
            }
        })

    }

    private fun fetchMovies() {
        viewModel.getMovies().observe(viewLifecycleOwner) { result ->
            when (result.status) {

                Status.SUCCESS -> {
                    binding.moviesRecyclerView.visibility = View.VISIBLE
                    if (result.data?.feed?.results?.isNotEmpty()!!) {
                        setMovies(result.data.feed.results)
                    }

                }

                Status.ERROR -> {
                    Utils.showErrorMessage(binding.root, Constants.interNalError)
                }

                Status.LOADING -> {
                    binding.shimmerLayout.startShimmer()
                }

            }

        }
    }

    private fun setMovies(movies: List<Movies>) {
        binding.moviesRecyclerView.visibility = View.VISIBLE
        binding.shimmerLayout.apply {
            stopShimmer()
            visibility = View.GONE
        }
        binding.moviesRecyclerView.adapter = MoviesAdapter(movies) {

        }
    }


}


