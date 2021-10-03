package com.hfad.android14fragments.ui.fragments.ThirdFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.android14fragments.R;
import com.hfad.android14fragments.models.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private ArrayList<User> list;
    private OnItemClick onItemClick;

    public void setList(ArrayList<User> list){
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();


    }
    public void setListener(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_rv,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {

        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView number;
        private final TextView nameSong;
        private final TextView avtor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number_tv);
            nameSong = itemView.findViewById(R.id.name_tv);
            avtor = itemView.findViewById(R.id.avtor_tv);
        }

        public void onBind(User user) {

            nameSong.setText(user.getSongName());
            number.setText(user.getNumber());
            avtor.setText(user.getAvtor());
            itemView.setOnClickListener(v -> onItemClick.clickItem(user.getSongName()));
        }
    }

    public  interface OnItemClick {
        void clickItem(String name);
    }


}
