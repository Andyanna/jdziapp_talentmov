package com.movjdzi.app.adapter.setting;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.movjdzi.app.R;

import me.drakeet.multitype.ItemViewBinder;

/**
 * @author huangyong
 * createTime 2019-09-18
 */
public class TextExitSectionViewBinder extends ItemViewBinder<TextExitSection, TextExitSectionViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.item_text_only_section, parent, false);
        return new ViewHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull TextExitSection textOnlySection) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
