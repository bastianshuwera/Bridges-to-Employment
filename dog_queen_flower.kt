import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bridges2employ.R
import kotlinx.android.synthetic.main.fragment_bridges2employment.*

class Bridges2EmploymentFragment : Fragment() {
    lateinit var bridges2EmploymentAdapter: Bridges2EmploymentAdapter
    private var bridges2EmploymentList = ArrayList<Bridges2Employment>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_bridges2employment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
        searchBridges2Employment()
    }

    private fun setUpRecyclerView() {
        bridges2EmploymentAdapter = Bridges2EmploymentAdapter(bridges2EmploymentList, activity!!)
        rv_bridges2employment.adapter = bridges2EmploymentAdapter
        rv_bridges2employment.layoutManager = LinearLayoutManager(activity) as RecyclerView.LayoutManager?
    }

    private fun searchBridges2Employment() {
        et_bridges2employment_search.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (TextUtils.isEmpty(newText)) {
                    bridges2EmploymentAdapter.filter("")
                } else {
                    bridges2EmploymentAdapter.filter(newText)
                }
                return false
            }

        })
    }

}