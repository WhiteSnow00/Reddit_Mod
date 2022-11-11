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
import X.0Vq;

public interface IEffectService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6172);
    }
    
    0g8 baseComposerManager();
    
    1JP composerManager();
    
    1JQ composerManagerB();
    
    LiveEffect convertStickerBean(final Effect p0);
    
    1JP createComposerManager();
    
    1JQ createComposerManagerB();
    
    0gW getAvatarStickerHandler(final DataChannel p0, final Fragment p1, final 0gc p2, final Boolean p3);
    
    0g9 getComposerFilterSlideHelper();
    
    0g5 getComposerHandler(final GXh p0);
    
    LiveDialogFragment getEffectNewDialogFragment(final 1Kk p0);
    
    0gB getLiveBeautyLogManager();
    
    1JT getLiveComposerFilterHelper();
    
    0gg<LiveEffect> getLiveComposerFilterManager();
    
    0gL getLiveEffectDataProvider();
    
    0gd getLiveEffectRedDotManager();
    
    0gM getLiveEffectRestoreManager();
    
    1JT getLiveFilterHelper();
    
    0gN getLiveFilterLogManager();
    
    0gg<FilterModel> getLiveFilterManager();
    
    0gh getLiveGameEffectHelper();
    
    LiveDialogFragment getLiveMusicDialog();
    
    LiveDialogFragment getLiveSoundEffectDialog();
    
    LiveWidget getLiveSoundEffectMiniWidget();
    
    0gQ getLiveStickerDataProvider();
    
    0gR getLiveStickerLogManager();
    
    LiveDialogFragment getLiveVoiceEffectDialog();
    
    0gl getLiveVoiceEffectHelper();
    
    1JR getMultiGuestBeautyLogManager();
    
    BaseFragment getMultiGuestEffectFragment(final 1JQ p0, final 0gm p1);
    
    0gS getUploadEffectRelatedLog();
    
    Boolean hasUsedAccompanimentBusiness();
    
    boolean isUsingAccompanimentBusiness();
    
    void pauseAccompanimentPlay(final Boolean p0);
    
    void preloadAccompanimentList();
    
    void preloadBroadcastApi();
    
    void releaseAccompanimentResources();
    
    void releaseNaviAvatarResources();
    
    void releasePanelResource(final boolean p0);
    
    void reportClickSoundEffectIconLog(final DataChannel p0);
    
    void resumeAccompanimentPlay();
    
    void selectSoundEffectAfterGameLiveResume();
    
    void showEffectTextInputDialog(final DataChannel p0, final 0gV p1, final SRS<Boolean, 2P9> p2);
    
    void showStickerPanel(final Context p0, final DataChannel p1, final LiveEffect p2, final OgM p3);
    
    0gk stickerPresenter();
}
