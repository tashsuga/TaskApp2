package com.onespan.takeshisugai.taskapp2

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView


import java.text.SimpleDateFormat
import java.util.*


//class TaskAdapter: BaseAdapter() {

class TaskAdapter(context: Context): BaseAdapter() {
    private val mLayoutInflater: LayoutInflater
    var taskList = mutableListOf<Task>()

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return taskList.size
    }

    override fun getItem(position: Int): Any {
        return taskList[position]
    }

    override fun getItemId(position: Int): Long {
        return taskList[position].id.toLong()
    }

    /*

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return taskList.size
    }

    override fun getItem(position: Int): Any {
        return taskList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    */

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null)

        val textView1 = view.findViewById<TextView>(android.R.id.text1)
        val textView2 = view.findViewById<TextView>(android.R.id.text2)

        textView1.text = taskList[position].title

        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.JAPANESE)
        val date = taskList[position].date
        textView2.text = simpleDateFormat.format(date)

        return view
    }
    /*
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null)

        val textView1 = view.findViewById<TextView>(android.R.id.text1)
        val textView2 = view.findViewById<TextView>(android.R.id.text2)

        // 後でTaskクラスから情報を取得するように変更する
        textView1.text = taskList[position]

        return view
    }
    */
    /*
        var taskList = mutableListOf<String>()

        override fun getCount(): Int {
            return taskList.size
        }

        override fun getItem(position: Int): Any {
            return taskList[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        */
/*
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    */

}