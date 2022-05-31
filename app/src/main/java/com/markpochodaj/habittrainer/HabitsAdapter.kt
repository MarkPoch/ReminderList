package com.markpochodaj.habittrainer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(private val habits: List<Habit>): RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)

    //Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)

    }
    //Specifies the contents for the  shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        if (holder != null) {
            val habit = habits[position]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.title
            holder.card.iv_icon.setImageResource(habit.image)

        }
    }

    override fun getItemCount(): Int {
        return habits.size
    }
}