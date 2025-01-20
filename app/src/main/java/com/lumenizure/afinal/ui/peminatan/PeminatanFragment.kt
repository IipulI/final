package com.lumenizure.afinal.ui.peminatan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lumenizure.afinal.OrderedListAdapter
import com.lumenizure.afinal.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PeminatanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PeminatanFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the RecyclerView
        val Peminatan1: RecyclerView = view.findViewById(R.id.peminatan_1)
        val Peminatan2: RecyclerView = view.findViewById(R.id.peminatan_2)
        val Peminatan3: RecyclerView = view.findViewById(R.id.peminatan_3)
        val Peminatan4: RecyclerView = view.findViewById(R.id.peminatan_4)

        // Sample data for the list
        val Peminatan1Item = listOf(
            "Instrumentasi dan Manajemen Laboratorium Lingkungan",
            "Toksikologi (Pencemaran) Ekosistem Perairan",
            "Toksikologi (Pencemaran) Ekosistem Daratan",
            "Toksikologi (Pencemaran) Udara",
            "Material dan Teknologi Hijau",
            "Produksi Bersih",
            "Sistem Pengelolaan Limbah"
        )

        val Peminatan2Item = listOf(
            "Mikrobiologi Lingkungan",
            "Biomaterial",
            "Bioremediasi",
            "Konservasi Sumberdaya Hayati",
            "Biogeografi",
            "Biokimia",
            "Bioproses"
        )

        val Peminatan3Item = listOf(
            "Pemodelan Spasial Jasa Ekosistem",
            "Sistem Penunjang Keputusan Pengelolaan Lingkungan",
            "Inovasi Sains Pengelolaan Lingkungan",
            "Pengelolaan Kawasan Konservasi SDA dan Ekowisata",
            "Geostatistik Lingkungan",
            "Rehabilitasi Lahan Kritis",
            "Pengelolaan Daerah Aliran Sungai",
            "Desain Ekosistem Tapak"
        )

        val Peminatan4Item = listOf(
            "Ekonomi Kelembagaan dan Lingkungan",
            "Metodologi Penelitian Kualitatif",
            "Perencanaan Partisipatif Proyek Pengelolaan Lingkungan",
            "Teknik Analisis Biaya Manfaat Jasa Ekosistem",
            "Masyarakat Adat dan Kearifan Lokal",
            "Komunikasi Lingkungan",
            "Dinamika dan Komunikasi Kelompok Sosial"
        )

        Peminatan1.layoutManager = LinearLayoutManager(requireContext())
        Peminatan1.adapter = OrderedListAdapter(10, Peminatan1Item)

        Peminatan2.layoutManager = LinearLayoutManager(requireContext())
        Peminatan2.adapter = OrderedListAdapter(10, Peminatan2Item)

        Peminatan3.layoutManager = LinearLayoutManager(requireContext())
        Peminatan3.adapter = OrderedListAdapter(10, Peminatan3Item)

        Peminatan4.layoutManager = LinearLayoutManager(requireContext())
        Peminatan4.adapter = OrderedListAdapter(10, Peminatan4Item)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peminatan, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PeminatanFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PeminatanFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}