// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.uploaduservideos.view;

import com.reddit.video.creation.usecases.base.DaggerBottomSheetDialogFragment;
import com.reddit.video.creation.usecases.base.DaggerBottomSheetDialogFragment_MembersInjector;
import com.reddit.video.creation.widgets.uploaduservideos.presenter.UploadUserVideosPresenter;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import ke2.b;

public final class UploadUserVideosBottomSheetDialogFragment_MembersInjector implements b<UploadUserVideosBottomSheetDialogFragment>
{
    private final Provider<LocalVideosAdapter> adapterProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<LocalPhotosAdapter> imageAdapterProvider;
    private final Provider<UploadUserVideosPresenter> presenterProvider;
    
    public UploadUserVideosBottomSheetDialogFragment_MembersInjector(final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider, final Provider<UploadUserVideosPresenter> presenterProvider, final Provider<LocalVideosAdapter> adapterProvider, final Provider<LocalPhotosAdapter> imageAdapterProvider) {
        this.androidInjectorProvider = androidInjectorProvider;
        this.presenterProvider = presenterProvider;
        this.adapterProvider = adapterProvider;
        this.imageAdapterProvider = imageAdapterProvider;
    }
    
    public static b<UploadUserVideosBottomSheetDialogFragment> create(final Provider<DispatchingAndroidInjector<Object>> provider, final Provider<UploadUserVideosPresenter> provider2, final Provider<LocalVideosAdapter> provider3, final Provider<LocalPhotosAdapter> provider4) {
        return new UploadUserVideosBottomSheetDialogFragment_MembersInjector(provider, provider2, provider3, provider4);
    }
    
    public static void injectAdapter(final UploadUserVideosBottomSheetDialogFragment uploadUserVideosBottomSheetDialogFragment, final LocalVideosAdapter adapter) {
        uploadUserVideosBottomSheetDialogFragment.adapter = adapter;
    }
    
    public static void injectImageAdapter(final UploadUserVideosBottomSheetDialogFragment uploadUserVideosBottomSheetDialogFragment, final LocalPhotosAdapter imageAdapter) {
        uploadUserVideosBottomSheetDialogFragment.imageAdapter = imageAdapter;
    }
    
    public static void injectPresenter(final UploadUserVideosBottomSheetDialogFragment uploadUserVideosBottomSheetDialogFragment, final UploadUserVideosPresenter presenter) {
        uploadUserVideosBottomSheetDialogFragment.presenter = presenter;
    }
    
    public void injectMembers(final UploadUserVideosBottomSheetDialogFragment uploadUserVideosBottomSheetDialogFragment) {
        DaggerBottomSheetDialogFragment_MembersInjector.injectAndroidInjector((DaggerBottomSheetDialogFragment)uploadUserVideosBottomSheetDialogFragment, (DispatchingAndroidInjector)this.androidInjectorProvider.get());
        injectPresenter(uploadUserVideosBottomSheetDialogFragment, (UploadUserVideosPresenter)this.presenterProvider.get());
        injectAdapter(uploadUserVideosBottomSheetDialogFragment, (LocalVideosAdapter)this.adapterProvider.get());
        injectImageAdapter(uploadUserVideosBottomSheetDialogFragment, (LocalPhotosAdapter)this.imageAdapterProvider.get());
    }
    
    public /* bridge */ void injectMembers(final Object o) {
        this.injectMembers((UploadUserVideosBottomSheetDialogFragment)o);
    }
}
