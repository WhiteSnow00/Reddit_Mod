// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.voiceover;

import com.reddit.video.creation.widgets.base.bottomSheetDialog.BaseBottomSheetDialogFragment;
import com.reddit.video.creation.widgets.base.bottomSheetDialog.BaseBottomSheetDialogFragment_MembersInjector;
import com.reddit.video.creation.usecases.base.DaggerBottomSheetDialogFragment;
import com.reddit.video.creation.usecases.base.DaggerBottomSheetDialogFragment_MembersInjector;
import com.reddit.video.creation.eventbus.EventBus;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import ke2.b;

public final class VoiceoverBottomSheetDialogFragment_MembersInjector implements b<VoiceoverBottomSheetDialogFragment>
{
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<EventBus> eventBusProvider;
    private final Provider<VoiceoverPresenter> presenterProvider;
    
    public VoiceoverBottomSheetDialogFragment_MembersInjector(final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider, final Provider<EventBus> eventBusProvider, final Provider<VoiceoverPresenter> presenterProvider) {
        this.androidInjectorProvider = androidInjectorProvider;
        this.eventBusProvider = eventBusProvider;
        this.presenterProvider = presenterProvider;
    }
    
    public static b<VoiceoverBottomSheetDialogFragment> create(final Provider<DispatchingAndroidInjector<Object>> provider, final Provider<EventBus> provider2, final Provider<VoiceoverPresenter> provider3) {
        return new VoiceoverBottomSheetDialogFragment_MembersInjector(provider, provider2, provider3);
    }
    
    public static void injectPresenter(final VoiceoverBottomSheetDialogFragment voiceoverBottomSheetDialogFragment, final VoiceoverPresenter presenter) {
        voiceoverBottomSheetDialogFragment.presenter = presenter;
    }
    
    public void injectMembers(final VoiceoverBottomSheetDialogFragment voiceoverBottomSheetDialogFragment) {
        DaggerBottomSheetDialogFragment_MembersInjector.injectAndroidInjector((DaggerBottomSheetDialogFragment)voiceoverBottomSheetDialogFragment, (DispatchingAndroidInjector)this.androidInjectorProvider.get());
        BaseBottomSheetDialogFragment_MembersInjector.injectEventBus((BaseBottomSheetDialogFragment)voiceoverBottomSheetDialogFragment, (EventBus)this.eventBusProvider.get());
        injectPresenter(voiceoverBottomSheetDialogFragment, (VoiceoverPresenter)this.presenterProvider.get());
    }
    
    public /* bridge */ void injectMembers(final Object o) {
        this.injectMembers((VoiceoverBottomSheetDialogFragment)o);
    }
}
