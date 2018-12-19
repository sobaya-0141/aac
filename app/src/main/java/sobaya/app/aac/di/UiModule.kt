package sobaya.app.aac.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sobaya.app.aac.ui.main.navi.NaviFragment
import sobaya.app.aac.ui.main.navi.result.ResultFragment
import sobaya.app.aac.ui.main.repos.ReposFragment
import sobaya.app.aac.ui.main.repos_db.ReposDbFragment

@Module
internal abstract class UiModule {

    @ContributesAndroidInjector
    internal abstract fun contributeReposFragmentInjector(): ReposFragment

    @ContributesAndroidInjector
    internal abstract fun contributeResultFragmentInjector(): ResultFragment

    @ContributesAndroidInjector
    internal abstract fun contributeNaviFragmentInjector(): NaviFragment

    @ContributesAndroidInjector
    internal abstract fun contributeReposDbFragmentInjector(): ReposDbFragment
}