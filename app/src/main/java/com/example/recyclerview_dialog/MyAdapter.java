package com.example.recyclerview_dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final Context context;
    private final List<MyModel> list;

    public MyAdapter(Context context, List<MyModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyModel model = list.get(position);
        holder.txtName.setText(model.getName());

        holder.itemView.setOnClickListener(v -> {
            // نمایش دیالوگ هنگام کلیک بر روی آیتم
            new AlertDialog.Builder(context)
                    .setTitle("اطلاعات دانشجو")
                    .setMessage("شما روی " + model.getName() + " کلیک کردید.")
                    .setPositiveButton("باشه", (dialog, which) -> dialog.dismiss())
                    .setCancelable(false)
                    .show();
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
