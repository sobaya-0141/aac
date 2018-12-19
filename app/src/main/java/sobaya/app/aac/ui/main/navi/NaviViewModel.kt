package sobaya.app.aac.ui.main.navi

import android.arch.lifecycle.ViewModel
import android.view.View
import androidx.navigation.findNavController
import sobaya.app.aac.R

class NaviViewModel: ViewModel() {

    fun onClickButton(view: View) {
        view.findNavController().navigate(R.id.action_naviFragment_to_resultFragment)
    }
}