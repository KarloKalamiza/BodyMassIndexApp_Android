package hr.algebra.bodymassindexapp.utils

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager

fun Activity.hideKeyboard() {
    val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val view = this.currentFocus ?:  View(this)
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}