package com.erving.doctor

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.erving.doctor.Fragment.Check
import com.erving.doctor.Fragment.Encyclopedia
import com.erving.doctor.Fragment.History
import com.erving.doctor.R.id.toolBar

//ViewPager类需要一个PagerAdapter适配器类给它提供数据
//ViewPager经常和Fragment一起使用，并且提供了专门的
// FragmentPagerAdapter和FragmentStatePagerAdapter类供Fragment中的ViewPager使用。
class PageAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    // This determines the fragment for each tab
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            History()
        } else if (position == 1) {
            Check()
        } else {
            Encyclopedia()
        }
    }

    // This determines the number of tabs
    override fun getCount(): Int {
        return 3
    }

    // This determines the title for each tab
//    override fun getPageTitle(position: Int): CharSequence? {
//        // Generate title based on item position
//        when (position) {
//            0 -> return mContext.getString(R.string.History)
//            1 -> return mContext.getString(R.string.Check)
//            else -> return mContext.getString(R.string.Encyclopedia)
//        }
//    }

}

