package com.github.iyql.colorful;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColorPickerDialog extends DialogFragment implements ColorPickerAdapter.OnItemClickListener {
    private RecyclerView recycler;
    private OnColorSelectedListener listener;

    public ColorPickerDialog() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_color_picker, container, false);

        recycler = ((RecyclerView) view.findViewById(R.id.colorful_color_picker_recycler));

        recycler.setLayoutManager(new GridLayoutManager(getContext(), 4));
        ColorPickerAdapter adapter = new ColorPickerAdapter(getContext());
        adapter.setOnItemClickListener(this);
        recycler.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(Colorful.ThemeColor color) {
        if (listener != null) {
            listener.onColorSelected(color);
        }
    }

    public interface OnColorSelectedListener {
        void onColorSelected(Colorful.ThemeColor color);
    }

    public void setOnColorSelectedListener(OnColorSelectedListener listener) {
        this.listener = listener;
    }
}
