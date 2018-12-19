package sobaya.app.aac.data.network.api

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path
import sobaya.app.aac.data.network.api.model.Repo

interface GithubService {

    @GET("/users/{user}/repos")
    fun listRepos(@Path("user") user: String): Flowable<List<Repo>>
}