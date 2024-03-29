import android.os.Bundle
import android.util.AndroidException
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.marisma.booklegacy.BookListFragment
import com.marisma.booklegacy.sampledata.Book
import com.marisma.booklegacy.databinding.BookItemBinding
import com.marisma.booklegacy.R

class BookAdapter(private val bookList: List<Book>,  val nav: NavController) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {




    companion object {
        const val DRAWABLE = "drawable"
    }

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = BookItemBinding.bind(itemView)

        fun bind(book: Book ,nav:NavController) {
            binding.tvName.text = book.nombre
            binding.tvPags.text = book.paginas.toString()
            binding.tvAutor.text = book.autor

            // Tomar fotos de drawable...
            val context = binding.ivPhoto.context
            val idPhoto = context.resources.getIdentifier(book.fotografia, DRAWABLE, context.packageName)
            binding.ivPhoto.setImageResource(idPhoto)
            val bundle : Bundle = Bundle()
            bundle.putParcelable("libro",book)
            // Agregar listener de clic a la imagen
            binding.ivPhoto.setOnClickListener {
            nav.navigate(R.id.action_bookListFragment_to_bookDetailFragment,bundle)


            }
            if (book.fav){

                binding.ivDelHero.setImageResource(android.R.drawable.btn_star_big_on)


            }else{

                binding.ivDelHero.setImageResource(android.R.drawable.btn_star_big_off)

            }
            binding.ivDelHero.setOnClickListener{
                if(book.fav){
                   book.fav= false
                    binding.ivDelHero.setImageResource(android.R.drawable.btn_star_big_off)
                }
                else{
                    binding.ivDelHero.setImageResource(android.R.drawable.btn_star_big_on)

                    book.fav = true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(bookList[position], nav)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}
