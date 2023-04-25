package app.mobile.recyclerviewclasswork;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class DistrictRecyclerAdapter extends RecyclerView.Adapter<DistrictRecyclerAdapter.ViewHolder> {

    private Context context;

    private ArrayList<DistrictItem> dataArray;

    public DistrictRecyclerAdapter(Context context, ArrayList<DistrictItem> dataArray){
        this.context = context;
        this.dataArray = dataArray;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DistrictItem item = dataArray.get(position);
        holder.name.setText(item.getName());
        holder.population.setText(item.getPopulation()+"");
        holder.temperature.setText(item.getTemperature()+"");
        holder.area.setText( item.getArea()+"");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public int getItemCount() {
        return dataArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,population,temperature,area;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.district_name);
            population = itemView.findViewById(R.id.district_population);
            temperature = itemView.findViewById(R.id.district_temp);
            area = itemView.findViewById(R.id.district_area);
        }
    }

}

