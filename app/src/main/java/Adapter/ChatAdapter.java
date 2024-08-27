package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dotapksmartapps.learnwithme.R;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    private int[] arr_images;
    private String[] arr_names;

    public ChatAdapter(int[] arr_images, String[] arr_names) {
        this.arr_images = arr_images;
        this.arr_names = arr_names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_chat, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.images.setImageResource(arr_images[position]);
        holder.names.setText(arr_names[position]);
    }

    @Override
    public int getItemCount() {
        return arr_images.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView images;
        private TextView names;

        public MyViewHolder(View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.img);
            names = itemView.findViewById(R.id.name);
        }
    }
}
