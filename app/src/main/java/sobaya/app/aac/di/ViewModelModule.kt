package sobaya.app.aac.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import sobaya.app.aac.ui.main.repos.ReposViewModel
import sobaya.app.aac.ui.main.repos_db.ReposDbViewModel
import sobaya.app.common.di.ViewModelFactory
import sobaya.app.common.di.ViewModelKey

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ReposViewModel::class)
    fun bindRepoViewModel(viewModel: ReposViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ReposDbViewModel::class)
    fun bindRepoDbViewModel(viewModel: ReposDbViewModel): ViewModel
}