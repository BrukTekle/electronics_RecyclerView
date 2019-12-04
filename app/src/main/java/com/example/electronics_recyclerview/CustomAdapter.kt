package com.example.electronics_recyclerview
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.electronics_recyclerview.Product




class CustomAdapter(var context:Context,val productList: ArrayList<Product>,var img:IntArray): RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    /**
     * Sets the contents of an item at a given position in the RecyclerView.
     * Called by RecyclerView to display the data at a specified position.
     *
     * @param holder The view holder for that position in the RecyclerView.
     * @param position The position of the item in the RecycerView.
     */
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder?.img.setImageResource(img[position])
        holder?.desc.text=productList[position].Title
//        holder?.desc.append(productList[position].Title)
        holder?.price.append(productList[position].price.toString())// .text=productList[position].price.toString()
        holder?.color.append(productList[position].color)

        holder.parentLayout.setOnClickListener{
            val intentDetail=Intent(context,detail::class.java)
            intentDetail.putExtra("image",img[position])
            intentDetail.putExtra("title",productList[position].Title)
            intentDetail.putExtra("id",productList[position].itemId)
            intentDetail.putExtra("color",productList[position].color)
            intentDetail.putExtra("detail",productList[position].desc)
            context.startActivity(intentDetail)
        }
//holder.parentlayout.setOnClickListener {
//            val intent = Intent(context, DetailActivity::class.java)
//            var res = text1[position]
//            Toast.makeText(context," $res clicked",Toast.LENGTH_LONG).show()
//            intent.putExtra("image", img[position])
//            intent.putExtra("name", text1[position])
//            intent.putExtra("detail",text3[position])
//            context.startActivity(intent)
//        }

    }
    /**
     * Inflates an item view and returns a new view holder that contains it.
     * Called when the RecyclerView needs a new view holder to represent an item.
     *
     * @param parent The view group that holds the item views.
     * @param viewType Used to distinguish views, if more than one type of item view is used.
     * @return a view holder.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(v)
    }
    /**
     * Returns the size of the container that holds the data.
     * @return Size of the list of data.
     */
    override fun getItemCount(): Int {
        return productList.size
    }

    /*RecyclerView.Adapter accepts the generic type of your Adapter inner class ViewHolder type.
  In this example Adapter class name is CustomAdapter and the MyViewHolder  is the inner class */
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img=itemView.findViewById<ImageView>(R.id.image1)
        val desc=itemView.findViewById<TextView>(R.id.tv1)
        val price=itemView.findViewById<TextView>(R.id.tv2)
        val color=itemView.findViewById<TextView>(R.id.tv3)
        val parentLayout=itemView.findViewById<RelativeLayout>(R.id.playout)
    }
}