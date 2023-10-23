package com.example.monikalinearlayout

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">


<Button
android:id="@+id/button1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentTop="true"
android:text=" 1 " />

<Button
android:id="@+id/button2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_centerHorizontal="true"
android:layout_alignParentTop="true"
android:text=" 2 " />

<Button
android:id="@+id/button3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentTop="true"
android:layout_alignParentRight="true"
android:text=" 3 " />

<Button
android:id="@+id/button4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@id/button3"
android:layout_alignParentRight="true"
android:text=" 4 " />

<Button
android:id="@+id/button5"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@id/button4"
android:layout_centerHorizontal="true"
android:text=" 5 " />

<Button
android:id="@+id/button6"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@id/button4"
android:layout_alignParentLeft="true"
android:text=" 6 " />
<Button
android:id="@+id/button7"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_below="@id/button6"
android:text=" 7 " />
</RelativeLayout>