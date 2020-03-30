package com.home.dev.mymaterialapplication.ui.mainScreen.themeScreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseActivityAbs


class ThemeScreenActivityImpl: BaseActivityAbs(), IThemeScreenView {
    companion object {
        fun show(context: Context) {
            val intent = Intent(context, ThemeScreenActivityImpl::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppThemeSecond)
        setContentView(R.layout.activity_theme_screen)
    }
}