package com.home.dev.mymaterialapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import com.home.dev.mymaterialapplication.R
import com.home.dev.mymaterialapplication.mvp.presenter.list.IImageListPresenter
import com.home.dev.mymaterialapplication.mvp.view.list.IImageListRowView

class ImageRvAdapter(private val presenter: IImageListPresenter)
    : RecyclerView.Adapter<ImageRvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_card_view,
            parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return presenter.getCount()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mPos = position
        holder.reset()
        presenter.bind(holder)

        holder.itemView.setOnClickListener {
            presenter.onClick(position)
        }
    }

    class ViewHolder(view: View): SimpleRecyclerViewHolder(view), IImageListRowView {
        @BindView(R.id.imageView)
        lateinit var imageView: ImageView

        override fun reset() {
            imageView.setImageResource(android.R.color.transparent)
        }

        override fun setImage(position: Int) {
            val resId = when(position) {
                0 -> R.drawable.image_0
                1 -> R.drawable.image_1
                2 -> R.drawable.image_2
                3 -> R.drawable.image_3
                4 -> R.drawable.image_4
                else -> R.drawable.image_0
            }
            imageView.setImageResource(resId)
        }
    }
}