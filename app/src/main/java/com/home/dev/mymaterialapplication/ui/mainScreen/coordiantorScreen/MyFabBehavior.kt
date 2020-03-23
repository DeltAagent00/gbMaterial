package com.home.dev.mymaterialapplication.ui.mainScreen.coordiantorScreen

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton


open class MyFabBehavior(context: Context, attributeSet: AttributeSet)
    : CoordinatorLayout.Behavior<FloatingActionButton>(context, attributeSet) {
    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout,
                                child: FloatingActionButton, target: View, dxConsumed: Int,
                                dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed,
                dxUnconsumed, dyUnconsumed)

        if (child.visibility == View.VISIBLE && dyConsumed > 0) {
            child.hide()
        } else if (child.visibility == View.INVISIBLE && dyConsumed < 0) {
            child.show()
        }
    }

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout,
                                     child: FloatingActionButton, directTargetChild: View,
                                     target: View, nestedScrollAxes: Int): Boolean {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL
    }

}