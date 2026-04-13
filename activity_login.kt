<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="30dp"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="LOGIN"
        android:textSize="28sp"
        android:textStyle="bold"
        android:layout_marginBottom="30dp"/>

    <EditText
        android:id="@+id/etUsernameLogin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Username"
        android:layout_marginBottom="15dp"/>

    <EditText
        android:id="@+id/etPasswordLogin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Password"
        android:inputType="textPassword"
        android:layout_marginBottom="25dp"/>

    <Button
        android:id="@+id/btnLogin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="MASUK"
        android:layout_marginBottom="15dp"/>

    <TextView
        android:id="@+id/tvToRegister"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Belum punya akun? Daftar di sini"
        android:textColor="@color/design_default_color_primary"
        android:padding="10dp"
        android:clickable="true"
        android:focusable="true"/>
</LinearLayout>
