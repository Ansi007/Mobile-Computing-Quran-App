package haqnawaz.org.navigationdrawer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyVH>   {
    ArrayList<tayah> tayahArrayList;

    public RecyclerAdapter(ArrayList<tayah> friendsList) {
        this.tayahArrayList = friendsList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customizedview, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyVH holder, int position) {
        holder.data = tayahArrayList.get(position);
        holder.arabicText.setText(holder.data.getArabicText());
        holder.englishText.setText(String.valueOf(holder.data.getEnlishTarjama()));
        holder.urduText.setText(holder.data.getUrduTarajama());
    }

    @Override
    public int getItemCount() {
        return tayahArrayList.size();
    }

    public class MyVH extends RecyclerView.ViewHolder {
        TextView arabicText;
        TextView englishText;
        TextView urduText;
        tayah data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            arabicText = itemView.findViewById(R.id.ayah);
            englishText = itemView.findViewById(R.id.englishTarjama);
            urduText = itemView.findViewById(R.id.urduTarjama);
        }
    }
}
