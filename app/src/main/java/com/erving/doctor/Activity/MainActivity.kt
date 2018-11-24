package com.erving.doctor.Activity

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.widget.TableLayout
import android.widget.Toast
import android.support.design.widget.TabLayout
import android.support.v4.content.ContextCompat

import android.support.v4.view.ViewCompat
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View.SYSTEM_UI_FLAG_VISIBLE
import android.view.WindowManager
import android.widget.TextView
import com.erving.doctor.Fragment.Check
import com.erving.doctor.Fragment.Encyclopedia
import com.erving.doctor.Fragment.History
import com.erving.doctor.PageAdapter
import com.erving.doctor.R
import com.erving.doctor.Toas
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import android.widget.RadioGroup
import com.erving.doctor.R.id.*
import com.erving.doctor.R.id.tabLayout
import com.erving.doctor.R.id.viewPager






class MainActivity : AppCompatActivity() {
//    private val tablayou: TabLayout? = null
//    private val viewpage: ViewPager? = null

//    private var tabIndicators: List<String>? = null

//    val tabIndicators = ArrayList<String>()
//    var tabFragments = ArrayList<Fragment?>()
//    private var tabFragments: List<Fragment>? = null
    private val fragmentList = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer)
        Toas("MainActivity.OnCreate")
//        if(savedInstanceState==null){
//            val intent=Intent(this,LoginPage::class.java)
//            startActivity(intent)
//        }

        setSupportActionBar(toolBar)


    }

    override fun onStart() {
        super.onStart()
        fragmentList.add(History())
        fragmentList.add(Check())
        fragmentList.add(Encyclopedia())


        viewPager.adapter = PageAdapter(this,supportFragmentManager)
//        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(viewPager))
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }

    override fun onBackPressed() {
//        super.onBackPressed()   //Don't run this which will kill this activiy
        val intent= Intent(Intent.ACTION_MAIN)
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tool_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.User->Toas("User")
            R.id.Magnifier->Toas("Magnifier")
        }
        return true
    }



}
