

package tj.behruz.movies.utils

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import com.google.android.material.snackbar.Snackbar

object Utils {

    var status= MutableLiveData<Boolean>()

    fun showErrorMessage(view:View,message:String){
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction("Action", null)
        snackBar.setActionTextColor(Color.WHITE)
        val snackBarView = snackBar.view
        snackBarView.setBackgroundColor(Color.RED)
        val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        textView.setTextColor(Color.WHITE)
        snackBar.show()
    }
}