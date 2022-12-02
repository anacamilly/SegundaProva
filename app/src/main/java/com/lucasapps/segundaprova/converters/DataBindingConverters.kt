package com.lucasapps.segundaprova.converters

import android.text.TextUtils
import androidx.databinding.InverseMethod

class DataBindingConverters {
    companion object {
        @InverseMethod("convertIntToString")
        @JvmStatic
        fun convertStringToInt(value: String): Int {
            if (TextUtils.isEmpty(value) || !TextUtils.isDigitsOnly(value)) {
                return 0
            }
            return value.toInt()
        }

        @JvmStatic
        fun convertIntToString(value: Int?): String {
            return value?.toString() ?: ""
        }
    }
}