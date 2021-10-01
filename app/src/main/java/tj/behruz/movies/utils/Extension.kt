package tj.behruz.movies.utils

import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import tj.behruz.movies.R

fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).diskCacheStrategy(DiskCacheStrategy.DATA).placeholder(R.drawable.ic_picture).error(R.drawable.ic_picture).into(this);
}

fun Fragment.navigate(action: Int) {
    this.findNavController().navigate(action)
}