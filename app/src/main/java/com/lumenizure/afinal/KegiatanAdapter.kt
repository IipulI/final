import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lumenizure.afinal.Kegiatan
import com.lumenizure.afinal.R

class KegiatanAdapter(private val items: List<Kegiatan>) :
    RecyclerView.Adapter<KegiatanAdapter.KegiatanViewHolder>() {

    class KegiatanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
        val descriptionView: TextView = itemView.findViewById(R.id.itemDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KegiatanViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kegiatan, parent, false)
        return KegiatanViewHolder(view)
    }

    override fun onBindViewHolder(holder: KegiatanViewHolder, position: Int) {
        val item = items[position]
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description

        // Load image using Glide or any other image-loading library
        item.imageResId?.let {
            holder.imageView.setImageResource(it)
        } ?: holder.imageView.setImageResource(R.drawable.back)
    }

    override fun getItemCount(): Int = items.size
}
