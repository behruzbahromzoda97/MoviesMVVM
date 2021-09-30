package tj.behruz.movies.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tj.behruz.movies.databinding.MoviesItemBinding
import tj.behruz.movies.domain.models.Movies
import tj.behruz.movies.utils.loadImage

class MoviesAdapter(val movies: List<Movies>, val itemHandler: (Movies) -> Unit): RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = MoviesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.setMovies(movies[position])
    }

    override fun getItemCount() = movies.size

    inner class MoviesViewHolder(val binding: MoviesItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun setMovies(movies: Movies) {
            binding.artistName.text = movies.artistName
            binding.moviesName.text = movies.name
            binding.releaseDate.text = movies.releaseDate
            binding.moviesCategory.text = movies.genres.firstOrNull()?.name
            binding.moviesImage.loadImage(movies.artworkUrl100)
        }
    }


}