package com.wearableTwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer

interface FragmentChangeListener {

    fun replaceFragment(fragContainer: Int, fragClass: Fragment) { }

    fun imageShrinkCaller() { }

}