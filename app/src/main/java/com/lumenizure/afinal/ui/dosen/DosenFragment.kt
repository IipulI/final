package com.lumenizure.afinal.ui.dosen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lumenizure.afinal.Person
import com.lumenizure.afinal.PersonAdapter
import com.lumenizure.afinal.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DosenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DosenFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PersonAdapter

    private val fullList = listOf(
        Person("Dr. Tjahjo Tri Hartono, S.Hut., M.Si", "Ketua Program Studi", "401002763441123", "LEKTOR", R.drawable.person_1),
        Person("Aidha Zulaika,S.Si., M.Si", "Sekretaris Program Studi", "4010078108408704", "LEKTOR", R.drawable.person_2),
        Person("Dr. Rimun Wibowo, S.P., M.Si", "Wakil Dekan Bidang Kemahasiswaan", "40100795030267894", "LEKTOR", R.drawable.person_3),
        Person("Dr. Hj. Syarifah Sofiah Dwikorawati, M.Si", "Dosen", "401006938789730032", "LEKTOR", R.drawable.person_4),
        Person("Bahagia, S.P., M.Sc", "Dosen", "410100477/0427128402", "LEKTOR", R.drawable.person_5),
        Person("Dr. Budi Susetyo, Ir. MT. IT", "Dosen", "410100269/420016605", "LEKTOR", R.drawable.person_6),
        Person("Gunawan Ismail, ST, M.Si", "Dosen", "410100758/413027003", "ASISTEN AHLI", R.drawable.person_7),
        Person("Dr. Ir. Rosmawaty Anwar, M. P", "Dosen", "1967091219", "LEKTOR", R.drawable.person_8),
        Person("Meisella Devy Safitri, S.M", "Staf Tata Usaha", "410100693/8998730022", "ILMU LINGKUNGAN", R.drawable.person_9),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PersonAdapter(fullList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DosenFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DosenFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}