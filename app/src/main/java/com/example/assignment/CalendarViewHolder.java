package com.example.assignment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView dayOfMonth;
    private final com.example.assignment.CalendarAdapter.OnItemListener onItemListener;
    public CalendarViewHolder(@NonNull View itemView, com.example.assignment.CalendarAdapter.OnItemListener onItemListener) {
        super(itemView);
        dayOfMonth=itemView.findViewById(R.id.cellDayText);
        this.onItemListener = onItemListener;
        itemView.setOnClickListener( this);
    }

    @Override
    public void onClick(View view) {
        onItemListener.onItemClick(getAdapterPosition(),(String) dayOfMonth.getText());
    }
}
