package sobaya.app.aac.ui.main.repos

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import sobaya.app.aac.data.network.api.model.Repo
import sobaya.app.aac.data.repository.GithubRepository
import sobaya.app.common.ext.isNotEmptyAndNull
import javax.inject.Inject

class ReposViewModel @Inject constructor(val repository: GithubRepository): ViewModel() {

    val userName = MutableLiveData<String>()
    val repoList = MutableLiveData<List<Repo>>()

    fun getRepoList(view: View) {

        if (isNotEmptyAndNull(userName.value)) {
            repository.listRepos(userName.value!!)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {repos ->
                    repoList.postValue(repos)
                    repository.saveRepo(repos)
                }
        }
    }
}