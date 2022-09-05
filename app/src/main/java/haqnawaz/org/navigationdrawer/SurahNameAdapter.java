package haqnawaz.org.navigationdrawer;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SurahNameAdapter extends RecyclerView.Adapter<SurahNameAdapter.MyVH>   {
    ArrayList<SurahDetails> surahDetailsArrayList;
    static BookActivity reference = null;

    public SurahNameAdapter(ArrayList<SurahDetails> friendsList, BookActivity ref) {
        this.surahDetailsArrayList = friendsList;
        reference = ref;
    }

    @NonNull
    @Override
    public SurahNameAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.surah_name_row, parent, false);
        return new SurahNameAdapter.MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVH holder, int position) {
        if(position % 2 == 1)
        {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        else
        {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFAF8FD"));
        }
        holder.data = surahDetailsArrayList.get(position);
        holder.surahNumber.setText(holder.data.getSurahNumber());
        holder.surahNameEnglish.setText(String.valueOf(holder.data.getSurahNameEnglish()));
        holder.surahNameUrdu.setText(holder.data.getSurahNameUrdu());
        holder.surahType.setText(holder.data.getSurahType());
        final int element = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reference,DisplayPara.class);
                intent.putExtra("SurahUrduName",surahDetailsArrayList.get(element).getSurahNameUrdu());
                reference.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return surahDetailsArrayList.size();
    }

    public class MyVH extends RecyclerView.ViewHolder {
        TextView surahNumber;
        TextView surahNameEnglish;
        TextView surahNameUrdu;
        TextView surahType;

        SurahDetails data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            surahNumber = itemView.findViewById(R.id.textViewSurahNumber);
            surahNameEnglish = itemView.findViewById(R.id.textViewSurahNameEnglish);
            surahNameUrdu = itemView.findViewById(R.id.textViewSurahNameUrdu);
            surahType = itemView.findViewById(R.id.textViewSurahTypeVerses);
        }
    }
}

