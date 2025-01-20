package com.lumenizure.afinal.ui.home

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
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the RecyclerView
        val VisiDanMisiRecylerView: RecyclerView = view.findViewById(R.id.visi_dan_misi)
        val ProspekLulusanRecylerView: RecyclerView = view.findViewById(R.id.prospek_lulusan)

        // Sample data for the list
        val visiMisiItems = listOf(
            "Menguatkan sistem tata pamong, dan sistem manajemen sumber daya untuk menjamin mutu internal Program Studi.",
            "Membangun sistem perekrutan mahasiswa dan penguatan kapabilitas Dosen, kurikulum, sarana prasarana, dan keuangan untuk menjamin terselenggaranya Tridharma dengan baik.",
            "Menguatkan proses pembelajaran, penelitian, pengabdian masyarakat, dan suasana akademik.",
            "Meningkatkan Mutu lulusan Produk ilmiah, inovasi, serta kemanfaatan bagi masyarakat"
        )
        val prospekLulusanItems = listOf(
            "Health, Safety and Environment (HSE) Officer",
            "HSE Officer bertanggung jawab atas kesehatan dan keselamatan kerja karyawan di suatu perusahaan, serta pengelolaan dan pemantauan lingkungannya.",
            "High Concervation Value (HCV) and Social Impact (SI) Officer",
            "HCV and SI Officer bertanggung jawab untuk memenuhi seluruh proses pembangunan lingkungan pada suatu perusahaan secara berkelanjutan, serta melaksanakan penilaian sosial dan lingkungan pada beberapa perusahaan lain yang serupa.",
            "Penyusun Dokumen Lingkungan",
            "Penyusun dokumen lingkungan bertugas untuk memperkirakan dampak lingkungan ataupun perencanaan kegiatanproyek dengan tujuan memastikan kemungkinan dampak lingkungannya, serta menyusunnya dalam dokumen UKL-UPL.",
            "Konsultan Perencana Produksi", "Konsultan perencana produksi bertugas untuk meneliti dan mengevaluasi metode produksi suatu pabrik/perusahaan agar keseluruhan proses produksinya selalu ramah lingkungan.",
            "Aparatur Sipil Negara (ASN)"
        )

        // Set up the RecyclerView
        VisiDanMisiRecylerView.layoutManager = LinearLayoutManager(requireContext())
        VisiDanMisiRecylerView.adapter = OrderedListAdapter(0, visiMisiItems)

        ProspekLulusanRecylerView.layoutManager = LinearLayoutManager(requireContext())
        ProspekLulusanRecylerView.adapter = OrderedListAdapter(0, prospekLulusanItems)
    }
}