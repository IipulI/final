package com.lumenizure.afinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(private val persons: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val jabatan: TextView = view.findViewById(R.id.jabatan)
        val nik: TextView = view.findViewById(R.id.nik)
        val position: TextView = view.findViewById(R.id.position)
        val image: ImageView = view.findViewById(R.id.person_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]
        holder.name.text = person.name
        holder.jabatan.text = person.jabatan
        holder.nik.text = "NIK : ${person.nik}"
        holder.position.text = person.position

        person.imageResId?.let {
            holder.image.setImageResource(it)
        } ?: holder.image.setImageResource(R.drawable.back)
    }

    override fun getItemCount(): Int = persons.size
}
