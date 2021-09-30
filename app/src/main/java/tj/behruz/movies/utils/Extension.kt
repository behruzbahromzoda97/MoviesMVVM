package tj.behruz.movies.utils

import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import tj.behruz.movies.R

fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).into(this);
}

fun Fragment.navigate(action: Int) {
    this.findNavController().navigate(action)
}