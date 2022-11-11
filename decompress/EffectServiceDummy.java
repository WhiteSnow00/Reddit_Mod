// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.api;

import X.0gk;
import X.OgM;
import android.content.Context;
import X.2P9;
import X.SRS;
import X.0gV;
import X.0gS;
import com.bytedance.android.livesdk.ui.BaseFragment;
import X.0gm;
import X.1JR;
import X.0gl;
import X.0gR;
import X.0gQ;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0gh;
import com.bytedance.android.live.effect.model.FilterModel;
import X.0gN;
import X.0gM;
import X.0gd;
import X.0gL;
import X.0gg;
import X.1JT;
import X.0gB;
import com.bytedance.android.livesdk.LiveDialogFragment;
import X.1Kk;
import X.0g5;
import X.GXh;
import X.0g9;
import X.0gW;
import X.0gc;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import X.1JQ;
import X.1JP;
import X.0g8;
import com.bytedance.covode.number.Covode;

public class EffectServiceDummy implements IEffectService
{
    static {
        Covode.recordClassIndex(6171);
    }
    
    @Override
    public 0g8 baseComposerManager() {
        return null;
    }
    
    @Override
    public 1JP composerManager() {
        return null;
    }
    
    @Override
    public 1JQ composerManagerB() {
        return null;
    }
    
    @Override
    public LiveEffect convertStickerBean(final Effect effect) {
        return null;
    }
    
    @Override
    public 1JP createComposerManager() {
        return null;
    }
    
    @Override
    public 1JQ createComposerManagerB() {
        return null;
    }
    
    @Override
    public 0gW getAvatarStickerHandler(final DataChannel dataChannel, final Fragment fragment, final 0gc 0gc, final Boolean b) {
        return null;
    }
    
    @Override
    public 0g9 getComposerFilterSlideHelper() {
        return null;
    }
    
    @Override
    public 0g5 getComposerHandler(final GXh gXh) {
        return null;
    }
    
    @Override
    public LiveDialogFragment getEffectNewDialogFragment(final 1Kk 1Kk) {
        return null;
    }
    
    @Override
    public 0gB getLiveBeautyLogManager() {
        return null;
    }
    
    @Override
    public 1JT getLiveComposerFilterHelper() {
        return null;
    }
    
    @Override
    public 0gg<LiveEffect> getLiveComposerFilterManager() {
        return null;
    }
    
    @Override
    public 0gL getLiveEffectDataProvider() {
        return null;
    }
    
    @Override
    public 0gd getLiveEffectRedDotManager() {
        return null;
    }
    
    @Override
    public 0gM getLiveEffectRestoreManager() {
        return null;
    }
    
    @Override
    public 1JT getLiveFilterHelper() {
        return null;
    }
    
    @Override
    public 0gN getLiveFilterLogManager() {
        return null;
    }
    
    @Override
    public 0gg<FilterModel> getLiveFilterManager() {
        return null;
    }
    
    @Override
    public 0gh getLiveGameEffectHelper() {
        return null;
    }
    
    @Override
    public LiveDialogFragment getLiveMusicDialog() {
        return null;
    }
    
    @Override
    public LiveDialogFragment getLiveSoundEffectDialog() {
        return null;
    }
    
    @Override
    public LiveWidget getLiveSoundEffectMiniWidget() {
        return null;
    }
    
    @Override
    public 0gQ getLiveStickerDataProvider() {
        return null;
    }
    
    @Override
    public 0gR getLiveStickerLogManager() {
        return null;
    }
    
    @Override
    public LiveDialogFragment getLiveVoiceEffectDialog() {
        return null;
    }
    
    @Override
    public 0gl getLiveVoiceEffectHelper() {
        return null;
    }
    
    @Override
    public 1JR getMultiGuestBeautyLogManager() {
        return null;
    }
    
    @Override
    public BaseFragment getMultiGuestEffectFragment(final 1JQ 1jq, final 0gm 0gm) {
        return null;
    }
    
    @Override
    public 0gS getUploadEffectRelatedLog() {
        return null;
    }
    
    @Override
    public Boolean hasUsedAccompanimentBusiness() {
        return false;
    }
    
    @Override
    public boolean isUsingAccompanimentBusiness() {
        return false;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void pauseAccompanimentPlay(final Boolean b) {
    }
    
    @Override
    public void preloadAccompanimentList() {
    }
    
    @Override
    public void preloadBroadcastApi() {
    }
    
    @Override
    public void releaseAccompanimentResources() {
    }
    
    @Override
    public void releaseNaviAvatarResources() {
    }
    
    @Override
    public void releasePanelResource(final boolean b) {
    }
    
    @Override
    public void reportClickSoundEffectIconLog(final DataChannel dataChannel) {
    }
    
    @Override
    public void resumeAccompanimentPlay() {
    }
    
    @Override
    public void selectSoundEffectAfterGameLiveResume() {
    }
    
    @Override
    public void showEffectTextInputDialog(final DataChannel dataChannel, final 0gV 0gV, final SRS<Boolean, 2P9> srs) {
    }
    
    @Override
    public void showStickerPanel(final Context context, final DataChannel dataChannel, final LiveEffect liveEffect, final OgM ogM) {
    }
    
    @Override
    public 0gk stickerPresenter() {
        return null;
    }
}
