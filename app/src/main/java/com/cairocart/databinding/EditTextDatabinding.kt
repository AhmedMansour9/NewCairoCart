package com.cairocart.databinding

import android.util.Patterns
import androidx.core.widget.doAfterTextChanged
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.regex.Pattern

class EditTextDatabinding {
    companion object {
        @BindingAdapter("emailVaild")
        @JvmStatic
        fun emailVaid(editText: TextInputLayout, msg: String) {
            editText.editText?.doAfterTextChanged {
                if (!Patterns.EMAIL_ADDRESS.matcher(editText.editText?.text.toString()).matches()) {
                    editText.error = msg
                } else {
                    editText.error = null
                }
            }

        }

        @BindingAdapter("passwordVaild")
        @JvmStatic
        fun passwordValid(editText: TextInputLayout, msg: String) {
            val passwordRegex = "^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    "(?=.*[a-z])" +         //at least 1 lower case letter
                    "(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
//                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{8,}"               //at least 8 characters
//                    "$"
            editText.editText?.doAfterTextChanged {
                if (!Pattern.compile(passwordRegex).matcher(editText.editText?.text.toString())
                        .matches()
                ) {
                    editText.error = msg
                } else {
                    editText.error = null
                }
            }
        }

        @BindingAdapter("passwordloginValid")
        @JvmStatic
        fun passwordloginValid(editText: TextInputLayout, msg: String) {
            val passwordRegex = "^" + "(?=\\S+$)" + ".{7,}"

            editText.editText?.doAfterTextChanged {
                if (!Pattern.compile(passwordRegex).matcher(editText.editText?.text.toString())
                        .matches()
                ) {
                    editText.error = msg
                } else {
                    editText.error = null
                }
            }
        }

    }


    }
