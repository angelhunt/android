package com.example.navigationjava.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.navigationjava.databinding.HomeFragmentBinding;

import viewmodel.SharedViewModel;

public class HomeFragment extends Fragment {
    private SharedViewModel model;
    private HomeFragmentBinding addBinding;
    public HomeFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //InflatetheViewforthisfragment
        addBinding=HomeFragmentBinding.inflate(inflater,container,false);
        View view=addBinding.getRoot();
        return view;}
        @Override
        public void onDestroyView(){super.onDestroyView();addBinding=null;}}
    
