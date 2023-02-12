package com.example.al_madaris;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.MyVH> {

    List<Student> studentList;
    public myRecyclerViewAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.showdatalayout, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVH holder, int position) {
        holder.data=studentList.get(position);
        holder.nameadp.setText(holder.data.getName() +" / " + holder.data.getFather_contact());
        holder.paraadap.setText(holder.data.getParano());
        holder.ayatadp.setText(holder.data.getAyatfrom()+"-"+holder.data.getAyatto());
        holder.sabkiadp.setText(holder.data.getSabki());
        holder.manziladp.setText(holder.data.getManzil());
        holder.rollnoadp.setText(holder.data.getRollno());
//        holder.contactadp.setText(holder.data.getFather_contact());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyVH extends RecyclerView.ViewHolder {
        TextView nameadp , paraadap , ayatadp , sabkiadp , manziladp , rollnoadp;
        Button editbtnadp;
        Student data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            nameadp = itemView.findViewById(R.id.namelayout);
            paraadap = itemView.findViewById(R.id.paralayout);
            ayatadp = itemView.findViewById(R.id.ayatlayout);
            sabkiadp = itemView.findViewById(R.id.sabkilayout);
            manziladp = itemView.findViewById(R.id.manzillayout);
            rollnoadp = itemView.findViewById(R.id.rollnoshowdata);
//            contactadp = itemView.findViewById(R.id.fatherlayout);

            editbtnadp = itemView.findViewById(R.id.editbtnlayout);
        }
    }
}
