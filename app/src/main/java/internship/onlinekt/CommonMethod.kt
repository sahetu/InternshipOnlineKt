package internship.onlinekt

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class CommonMethod {

    fun ToastFun(context : Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }

    fun SnackbarFun(view : View,message : String){
        Snackbar.make(view,message,Snackbar.LENGTH_LONG).show()
    }

}