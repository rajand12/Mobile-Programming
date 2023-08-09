package com.example.question6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<ContactItem> personList;

    public PersonAdapter(List<ContactItem> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        ContactItem person = personList.get(position);
        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView, addressTextView, contactTextView, ageTextView;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            contactTextView = itemView.findViewById(R.id.contactTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
        }

        public void bind(ContactItem person) {
            nameTextView.setText(person.getName());
            addressTextView.setText(person.getAddress());
            contactTextView.setText(person.getContact());
            ageTextView.setText(String.valueOf(person.getAge()));
        }
    }
}

