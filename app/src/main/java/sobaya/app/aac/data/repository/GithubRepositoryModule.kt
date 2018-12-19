package sobaya.app.aac.data.repository

import dagger.Module
import dagger.Provides
import sobaya.app.aac.data.local.Database
import sobaya.app.aac.data.network.api.GithubService
import javax.inject.Inject
import javax.inject.Singleton

@Module
class GithubRepositoryModule @Inject constructor(val database: Database) {

    @Provides
    @Singleton
    fun provideGithubService(githubService: GithubService) = GithubRepository(githubService, database)
}