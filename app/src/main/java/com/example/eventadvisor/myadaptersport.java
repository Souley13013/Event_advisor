package com.example.eventadvisor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadaptersport extends FirebaseRecyclerAdapter<modelsport, myadaptersport.myviewholder> {

    public myadaptersport(@NonNull FirebaseRecyclerOptions<modelsport> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modelsport model) {
        holder.name_item.setText(model.getTitre());
        holder.description_item.setText(model.getDescription1());
        Glide.with(holder.image_item.getContext()).load(model.getImage()).into(holder.image_item);//ICI


        /**Gestion du clique pour ouvrir la page de description**/
        holder.name_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper, new descfragmentsport(model.getTitre(),model.getDescription2(),model.getImage(),model.getDate(), model.getHeure(), model.getTarif(), model.getLieu(), model.getReserver())).addToBackStack(null).commit();
            }
        });
        holder.description_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper, new descfragmentsport(model.getTitre(),model.getDescription2(),model.getImage(),model.getDate(), model.getHeure(), model.getTarif(), model.getLieu(), model.getReserver())).addToBackStack(null).commit();
            }
        });
        holder.image_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper, new descfragmentsport(model.getTitre(),model.getDescription2(),model.getImage(),model.getDate(), model.getHeure(), model.getTarif(), model.getLieu(), model.getReserver())).addToBackStack(null).commit();
            }
        });
        /************************************************************/
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical, parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder{

        ImageView image_item;
        TextView name_item,description_item;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            image_item=itemView.findViewById(R.id.image_item);
            name_item=itemView.findViewById(R.id.name_item);
            description_item=itemView.findViewById(R.id.description_item);
        }
    }
}
