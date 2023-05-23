package com.example.cooking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.ViewHolder> {
    private Context context;
    private Activity activity;
    private List<Dish> dishes;

    public DishAdapter(Context context, Activity activity, List<Dish> dishes) {
        this.context = context;
        this.activity = activity;
        this.dishes = dishes;
    }

    @Override
    public DishAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(DishAdapter.ViewHolder holder, int position) {
        holder.name.setText(dishes.get(position).getName());
        holder.description.setText(dishes.get(position).getDescription());


        holder.mLayout.setOnClickListener(view -> {

            Intent intent = new Intent(context, DishViewer.class);

            intent.putExtra("kitchen", dishes.get(position).getKitchen());
            intent.putExtra("name", dishes.get(position).getName());
            intent.putExtra("description", dishes.get(position).getDescription());
            intent.putExtra("ingredients", dishes.get(position).getIngredients());
            intent.putExtra("time", dishes.get(position).getTime());
            intent.putExtra("recipe", dishes.get(position).getRecipe());
            intent.putExtra("resource", dishes.get(position).getResource());

            activity.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dishes.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, description;
        ConstraintLayout mLayout;

        ViewHolder(@NonNull View view) {
            super(view);
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
            mLayout = view.findViewById(R.id.mLayout);
        }
    }
}

