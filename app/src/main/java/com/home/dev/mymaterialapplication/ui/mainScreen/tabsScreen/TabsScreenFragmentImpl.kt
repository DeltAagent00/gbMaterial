package com.home.dev.mymaterialapplication.ui.mainScreen.tabsScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.arellomobile.mvp.presenter.InjectPresenter
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.ui.BaseFragmentAbs
import kotlinx.android.synthetic.main.fragment_tabs.*


class TabsScreenFragmentImpl: BaseFragmentAbs(), ITabsScreenView {
    companion object {
        const val PAGE_COUNT = 3
        const val PAGE_1 = 0
        const val PAGE_2 = 1
        const val PAGE_3 = 2
    }

    @InjectPresenter
    lateinit var presenter: TabsScreenPresenterImpl

    private var pageAdapter: MyPagerAdapter? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tabs, container, false)
    }

    override fun initTabs() {
        pageAdapter = MyPagerAdapter(parentFragmentManager)
        viewPagerView.adapter = pageAdapter
        tabsView.setupWithViewPager(viewPagerView)
    }

    private class MyPagerAdapter(fm: FragmentManager)
        : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getItem(position: Int): Fragment {
            return when(position) {
                PAGE_1 -> FragmentTab(position)
                PAGE_2 -> FragmentTab(position)
                PAGE_3 -> FragmentTab(position)
                else -> FragmentTab(position)
            }
        }

        override fun getCount(): Int {
            return PAGE_COUNT
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                PAGE_1 -> "Page 1"
                PAGE_2 -> "Page 2"
                PAGE_3 -> "Page 3"
                else -> ""
            }
        }
    }
}