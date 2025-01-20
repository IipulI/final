package com.lumenizure.afinal.ui.kegiatan

import KegiatanAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lumenizure.afinal.Kegiatan
import com.lumenizure.afinal.Person
import com.lumenizure.afinal.PersonAdapter
import com.lumenizure.afinal.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [KegiatanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KegiatanFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PersonAdapter
    private lateinit var btnToggle: Button

    private val fullList = listOf(
        Kegiatan("Kegiatan Stakeholder Mapping, UIKA Bogor Bahas Keberlangsungan Sungai Ciliwung",
            "Universitas Ibn Khaldun (UIKA) Bogor bekerja sama dengan Komunitas Peduli Ciliwung (KPC) dan Alkesa menyelenggarakan pelatihan pemetaan stakeholder pengelolaan Sungai Ciliwung pada Selasa (2/7/2024). Kegiatan ini merupakan bagian dari rangkaian Milad ke-63 UIKA Bogor, dengan tujuan untuk meningkatkan kesadaran dan partisipasi berbagai pihak dalam upaya pelestarian dan perbaikan kualitas lingkungan Sungai Ciliwung.",
            R.drawable.kegiatan_1),

        Kegiatan("Riset penelitian terhadap air limbah yang ada di sungai Cisadane bubulak kota Bogor",
            "Universitas Ibn Khaldun (UIKA) Bogor melalui Program Studi Ilmu Lingkungan menyelenggarakan penelitian kualitas air di Sungai Cisadane pada Rabu (5/1/2023). Penelitian ini bertujuan untuk mengedukasi masyarakat tentang bahaya pencemaran limbah rumah tangga dan industri yang dibuang ke sungai, sekaligus mengukur kualitas air dan udara di sekitar wilayah tersebut. \n\n Kegiatan ini melibatkan mahasiswa Program Studi Ilmu Lingkungan UIKA Bogor yang dibimbing oleh dosen dan pengawas profesional, serta menggunakan peralatan laboratorium berstandar nasional (SNI). Penelitian ini juga diharapkan mampu meningkatkan kesadaran masyarakat akan pentingnya menjaga kualitas lingkungan dan ekosistem sungai",
            R.drawable.kegiatan_2),

        Kegiatan("Eksplorasi Mendalam terhadap Kondisi Kualitas Air di Sungai Cisindang barang",
            "Universitas Ibn Khaldun (UIKA) Bogor melalui Program Studi Ilmu Lingkungan melaksanakan eksplorasi mendalam mengenai kualitas air di Sungai Cisindang Barang pada Sabtu (2/12/2023). Penelitian ini bertujuan untuk memahami kondisi kualitas air sungai serta memberikan solusi pengelolaan berkelanjutan yang dapat menjaga keseimbangan ekosistem dan kesehatan masyarakat. \n\n Kegiatan ini dilakukan oleh mahasiswa Ilmu Lingkungan UIKA bekerja sama dengan tim dari Halqi Lab. Dalam penelitian ini, berbagai parameter fisika, kimia, dan biologi dianalisis secara komprehensif untuk mengungkap pola pencemaran, mengidentifikasi sumber limbah, serta merumuskan strategi pengelolaan yang tepat. Dengan menggunakan pendekatan berbasis data ilmiah dan peralatan modern, kegiatan ini diharapkan dapat meningkatkan kesadaran masyarakat terhadap pentingnya menjaga kualitas lingkungan dan kelestarian sungai sebagai sumber kehidupan.",
            R.drawable.kegiatan_3),

        Kegiatan("Meneliti Polusi Udara di Jl. KH. R. Abdullah Bin Nuh, Bubulak, Kec. Bogor Barat, Kota Bogor",
            "Universitas Ibn Khaldun (UIKA) Bogor melalui Program Studi Ilmu Lingkungan melaksanakan penelitian polusi udara di Jl. KH. R. Abdullah Bin Nuh, Bubulak, Kecamatan Bogor Barat, pada Sabtu (2/12/2023). Penelitian ini bekerja sama dengan Halqi Lab untuk mengidentifikasi sumber pencemaran, menganalisis jenis polutan, dan menilai dampaknya terhadap kesehatan serta lingkungan. \n\n Melibatkan mahasiswa yang dibimbing oleh dosen dan tenaga ahli, penelitian ini menggunakan peralatan berstandar nasional. Kegiatan ini diharapkan dapat meningkatkan kesadaran masyarakat akan pentingnya udara bersih dan keseimbangan ekosistem guna mendukung kualitas hidup yang lebih baik.",
            R.drawable.kegiatan_4),

        Kegiatan("Kunjungan Edukatif ke SMK PUI dan SMA Taruna Andigha",
            "Universitas Ibn Khaldun (UIKA) Bogor melalui Program Studi Ilmu Lingkungan berkesempatan melakukan kunjungan edukatif ke SMK PUI dan SMA Taruna Andigha pada Jumat (10/2/2023). Kegiatan ini bertujuan untuk memberikan wawasan mengenai pentingnya menjaga lingkungan serta memperkenalkan upaya-upaya sederhana yang dapat dilakukan untuk mendukung keberlanjutan ekosistem",
            R.drawable.kegiatan_5),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kegiatan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        // Set up the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = KegiatanAdapter(fullList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment KegiatanFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            KegiatanFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}