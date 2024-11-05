import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.example.plantdesease.R
import com.example.plantdesease.presentation.home.DataModel

class CustomListViewAdapter(
    context: Context,
    @LayoutRes private val layoutResource: Int,
    private val dataList: List<DataModel>
) : ArrayAdapter<DataModel>(context, layoutResource, dataList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(layoutResource, parent, false)

        val item = getItem(position)

        val imageView = view.findViewById<ImageView>(R.id.imageIcon)
        val titleView = view.findViewById<TextView>(R.id.titleTextView)
        val descriptionView = view.findViewById<TextView>(R.id.descriptionTextView)
        val timeView = view.findViewById<TextView>(R.id.timeTextView)

        item?.let {
            imageView.setImageResource(it.imageResId)
            titleView.text = it.title
            descriptionView.text = it.description
            timeView.text = it.time
        }

        return view
    }
}