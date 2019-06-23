package com.beloushkin.learning.android.knotes.tasks


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.beloushkin.learning.android.knotes.R

class TasksListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tasks_list, container, false)
    }


    companion object {
        @JvmStatic
        fun newInstance() = TasksListFragment()
    }
}
