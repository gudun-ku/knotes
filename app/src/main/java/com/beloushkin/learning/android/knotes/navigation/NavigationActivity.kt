package com.beloushkin.learning.android.knotes.navigation

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.beloushkin.learning.android.knotes.R
import com.beloushkin.learning.android.knotes.models.Task
import com.beloushkin.learning.android.knotes.tasks.TasksListFragment
import com.beloushkin.learning.android.knotes.notes.NotesListFragment
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_tasks -> {
                replaceFragment(TasksListFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notes -> {
                replaceFragment(NotesListFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        replaceFragment(TasksListFragment.newInstance())
        bottomNavView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentHolder, fragment)
            .commit()

    }
}
