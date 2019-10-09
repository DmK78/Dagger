package ru.job4j.daggerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<String> list;

    StringAdapter(Context context, List<String> strings) {
        this.list = strings;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StringAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_string, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StringAdapter.ViewHolder holder, int position) {
        String s = list.get(position);
        holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ViewHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);

        }
    }
}
