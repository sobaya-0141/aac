package sobaya.app.aac.ui.main.repos_db

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import sobaya.app.aac.data.local.entity.RepoOwner
import sobaya.app.aac.data.repository.GithubRepository
import sobaya.app.common.ext.isNotEmptyAndNull
import sobaya.app.common.ext.switchMap
import sobaya.app.common.util.AbsentLiveData
import javax.inject.Inject

class ReposDbViewModel @Inject constructor(repository: GithubRepository): ViewModel() {

    val userName = MutableLiveData<String>()
    val repoList: LiveData<List<RepoOwner>>

    init {
        repoList = userName.switchMap {
            if (isNotEmptyAndNull(userName))
                repository.findRepoOwner(it)
            else
                AbsentLiveData.create()
        }
    }
}