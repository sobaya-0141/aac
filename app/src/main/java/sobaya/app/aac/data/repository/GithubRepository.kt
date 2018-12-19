package sobaya.app.aac.data.repository

import sobaya.app.aac.data.local.Database
import sobaya.app.aac.data.local.entity.Owner
import sobaya.app.aac.data.local.entity.Repo
import sobaya.app.aac.data.network.api.GithubService

import javax.inject.Inject
import kotlin.concurrent.thread

class GithubRepository @Inject constructor(val githubService: GithubService, val database: Database) {

    fun listRepos(user: String) = githubService.listRepos(user)

    fun findRepoOwner(id: String) = database.repoDao().findRepoOwner("%${id}%")

    fun saveRepo(repos: List<sobaya.app.aac.data.network.api.model.Repo>) {

        thread {
            repos.forEach {
                database.repoDao().insert(Repo(id = it.owner.login, name = it.name))
                database.ownerDao().insert(Owner(repoId = it.owner.login, avatar = it.owner.avatar))
            }
        }
    }
}