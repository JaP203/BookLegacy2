import BookAdapter.Companion.DRAWABLE
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marisma.booklegacy.sampledata.Book
import com.marisma.booklegacy.databinding.FragmentBookDetailBinding

class BookDetailFragment : Fragment() {
    private lateinit var binding: FragmentBookDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBookDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val book = arguments?.getParcelable <Book>("libro")
        if (book != null) {
            binding.tvtitulo.text = book.nombre
            binding.tvUtor.text = book.autor
            binding.tvPaginas.text = book.paginas.toString()
            binding.tvDescripcion.text = book.description

            val idPhoto = context?.resources?.getIdentifier(book.fotografia, DRAWABLE, requireContext().packageName) ?: 0
            binding.imgLibro.setImageResource(idPhoto)
        }
    }
}
