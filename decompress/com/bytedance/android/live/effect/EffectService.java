// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect;

import X.44T;
import X.VCb;
import X.1jU;
import X.0gk;
import X.1Mr;
import X.0iV;
import X.0iY;
import X.OgM;
import android.content.Context;
import X.G73;
import X.0gV;
import X.Gkn;
import X.2fc;
import X.1jV;
import X.GTi;
import X.1Mp;
import X.0h0;
import X.0hk;
import X.44V;
import java.util.Iterator;
import X.0b8;
import X.GST;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.n;
import X.1Kr;
import X.0yr;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import X.2P9;
import X.1L4;
import java.util.List;
import X.SRS;
import X.0hc;
import X.1Jj;
import X.0gS;
import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import X.CTM;
import com.bytedance.android.livesdk.ui.BaseFragment;
import X.0gm;
import X.1io;
import X.1JR;
import X.1N5;
import X.0gl;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import X.1Jg;
import X.0gR;
import X.1Kj;
import X.0gQ;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.music.LiveMusicDialog;
import X.1Ja;
import X.0gh;
import X.1KJ;
import com.bytedance.android.live.effect.model.FilterModel;
import X.1Jd;
import X.0gN;
import X.1it;
import X.1Kd;
import X.0gM;
import X.1Kb;
import X.0gd;
import X.1KZ;
import X.0gL;
import X.1KD;
import X.0gg;
import X.1ir;
import X.1JT;
import X.1Jc;
import X.0gB;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import X.1Kk;
import X.1JN;
import X.0g5;
import X.GXh;
import X.1K3;
import X.0g9;
import X.1LR;
import X.0gW;
import X.0gc;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0iO;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import X.1im;
import X.1JQ;
import X.1il;
import X.1JP;
import X.0g8;
import androidx.fragment.app.DialogFragment;
import X.Vqj;
import X.0AB;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import X.0Wm;
import X.1Jn;
import X.1FE;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.api.IEffectService;

public class EffectService implements IEffectService
{
    static {
        Covode.recordClassIndex(6151);
    }
    
    public EffectService() {
        1FE.LIZIZ.LIZ(new 1Jn());
    }
    
    public static void INVOKEVIRTUAL_com_bytedance_android_live_effect_EffectService_com_ss_android_ugc_aweme_lancet_AlertLancet_show(final EffectTextInputFragment effectTextInputFragment, final 0AB 0ab, final String s) {
        Vqj.LIZ((DialogFragment)effectTextInputFragment, s);
        ((DialogFragment)effectTextInputFragment).show(0ab, s);
    }
    
    @Override
    public 0g8 baseComposerManager() {
        return this.composerManagerB();
    }
    
    @Override
    public 1JP composerManager() {
        return 1il.LJFF();
    }
    
    @Override
    public 1JQ composerManagerB() {
        return 1im.LIZJ.LIZ();
    }
    
    @Override
    public LiveEffect convertStickerBean(final Effect effect) {
        return 0iO.LIZ(effect);
    }
    
    @Override
    public 1JP createComposerManager() {
        return new 1il();
    }
    
    @Override
    public 1JQ createComposerManagerB() {
        return new 1im((byte)0);
    }
    
    @Override
    public 0gW getAvatarStickerHandler(final DataChannel dataChannel, final Fragment fragment, final 0gc 0gc, final Boolean b) {
        return new 1LR(dataChannel, fragment, 0gc, b);
    }
    
    @Override
    public 0g9 getComposerFilterSlideHelper() {
        return 1K3.LJIIJ;
    }
    
    @Override
    public 0g5 getComposerHandler(final GXh gXh) {
        return new 1JN(gXh);
    }
    
    @Override
    public LiveDialogFragment getEffectNewDialogFragment(final 1Kk 1Kk) {
        return new LiveEffectNewDialogFragment();
    }
    
    @Override
    public 0gB getLiveBeautyLogManager() {
        return 1Jc.LJIIIZ;
    }
    
    @Override
    public 1JT getLiveComposerFilterHelper() {
        return 1ir.LIZJ.LIZ();
    }
    
    @Override
    public 0gg<LiveEffect> getLiveComposerFilterManager() {
        return 1KD.LJFF.LIZ();
    }
    
    @Override
    public 0gL getLiveEffectDataProvider() {
        return 1KZ.LIZIZ;
    }
    
    @Override
    public 0gd getLiveEffectRedDotManager() {
        return 1Kb.LIZIZ;
    }
    
    @Override
    public 0gM getLiveEffectRestoreManager() {
        return 1Kd.LIZ;
    }
    
    @Override
    public 1JT getLiveFilterHelper() {
        return 1it.a.LIZ;
    }
    
    @Override
    public 0gN getLiveFilterLogManager() {
        return 1Jd.LJFF;
    }
    
    @Override
    public 0gg<FilterModel> getLiveFilterManager() {
        return 1KJ.b.LIZ;
    }
    
    @Override
    public 0gh getLiveGameEffectHelper() {
        return 1Ja.LIZ;
    }
    
    @Override
    public LiveDialogFragment getLiveMusicDialog() {
        return new LiveMusicDialog();
    }
    
    @Override
    public LiveDialogFragment getLiveSoundEffectDialog() {
        return new SoundEffectFragment();
    }
    
    @Override
    public LiveWidget getLiveSoundEffectMiniWidget() {
        return new SoundEffectMiniWidget();
    }
    
    @Override
    public 0gQ getLiveStickerDataProvider() {
        return 1Kj.LIZIZ;
    }
    
    @Override
    public 0gR getLiveStickerLogManager() {
        return 1Jg.LJIIJ;
    }
    
    @Override
    public LiveDialogFragment getLiveVoiceEffectDialog() {
        return new LiveVoiceEffectDialogFragment((byte)0);
    }
    
    @Override
    public 0gl getLiveVoiceEffectHelper() {
        return 1N5.LJI;
    }
    
    @Override
    public 1JR getMultiGuestBeautyLogManager() {
        return 1io.LIZLLL;
    }
    
    @Override
    public BaseFragment getMultiGuestEffectFragment(final 1JQ liziz, final 0gm ljff) {
        CTM.LIZ((Object)liziz, (Object)ljff);
        final LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = new LiveMultiGuestBeautyEffectFragment();
        liveMultiGuestBeautyEffectFragment.LIZJ = ljff.LIZ();
        liveMultiGuestBeautyEffectFragment.LIZIZ = liziz;
        liveMultiGuestBeautyEffectFragment.LJ = ljff.LIZIZ();
        liveMultiGuestBeautyEffectFragment.LJFF = ljff;
        return liveMultiGuestBeautyEffectFragment;
    }
    
    @Override
    public 0gS getUploadEffectRelatedLog() {
        return 1Jj.LIZ;
    }
    
    @Override
    public Boolean hasUsedAccompanimentBusiness() {
        return 0hc.LJIILIIL;
    }
    
    @Override
    public boolean isUsingAccompanimentBusiness() {
        return 0hc.LJIIIZ != 0L && !0hc.LJIIJJI;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void pauseAccompanimentPlay(final Boolean b) {
        0hc.LJIILJJIL.LIZIZ(b);
    }
    
    @Override
    public void preloadAccompanimentList() {
        0hc.LJIILJJIL.LIZ((SRS<? super List<1L4>, 2P9>)null);
    }
    
    @Override
    public void preloadBroadcastApi() {
        0yr.LIZ().LIZ(EffectRelatedApi.class).uploadBeautyParams(0L, "", 0, 0, 0, 0, false);
    }
    
    @Override
    public void releaseAccompanimentResources() {
        final 0hc ljiiljjil = 0hc.LJIILJJIL;
        ljiiljjil.LIZ("0");
        ljiiljjil.LIZJ(0hc.LJIIIZ);
        if (0hc.LJIIJ != null && !0hc.LJIIJJI) {
            1Jj.LIZ.LIZ(0hc.LJ, System.currentTimeMillis() / 1000L, 3L, null, 0hc.LIZLLL);
        }
        ljiiljjil.LIZ().removeMessages(0);
        ljiiljjil.LIZ().removeMessages(1);
        final 1Kr liz = 1Kr.LIZ;
        CTM.LIZ((Object)"live_music_accompaniment");
        final List downloadingDownloadInfosWithMimeType = ((VCb)liz.LIZ()).getDownloadingDownloadInfosWithMimeType("live_music_accompaniment");
        n.LIZIZ((Object)downloadingDownloadInfosWithMimeType, "");
        for (final DownloadInfo downloadInfo : downloadingDownloadInfosWithMimeType) {
            final 1Kr liz2 = 1Kr.LIZ;
            n.LIZIZ((Object)downloadInfo, "");
            liz2.LIZ(downloadInfo);
        }
        final List unCompletedDownloadInfosWithMimeType = ((VCb)liz.LIZ()).getUnCompletedDownloadInfosWithMimeType("live_music_accompaniment");
        n.LIZIZ((Object)unCompletedDownloadInfosWithMimeType, "");
        for (final DownloadInfo downloadInfo2 : unCompletedDownloadInfosWithMimeType) {
            final 1Kr liz3 = 1Kr.LIZ;
            n.LIZIZ((Object)downloadInfo2, "");
            liz3.LIZ(downloadInfo2);
        }
        0hc.LJFF.clear();
        0hc.LJI.clear();
        0hc.LJII.clear();
        0hc.LJIIIZ = 0L;
        0hc.LJIIJ = null;
        0hc.LJIIL = false;
        0hc.LJIIJJI = false;
        ljiiljjil.LIZJ().clear();
        0hc.LIZIZ = null;
        final 44V llzzjlil = GST.LLZZJLIL;
        n.LIZIZ((Object)llzzjlil, "");
        ((44T)llzzjlil).LIZ((Object)0b8.a.LIZJ.LIZIZ((Object)ljiiljjil.LIZIZ()));
    }
    
    @Override
    public void releaseNaviAvatarResources() {
        0hk.LIZ = null;
        0hk.LIZIZ = false;
        0hk.LIZJ.clear();
        0hk.LIZLLL = 0;
        0hk.LJ = 0;
        0hk.LJFF = 0;
        0hk.LJI = false;
    }
    
    @Override
    public void releasePanelResource(final boolean b) {
        final 1jV liz = 0h0.LIZ;
        if (liz != null) {
            if (b) {
                1Mp.LIZLLL = null;
            }
            final 2fc ljiil = liz.LJIIL;
            Boolean value;
            if (ljiil != null) {
                value = (ljiil.isDisposed() ^ true);
            }
            else {
                value = null;
            }
            if (GTi.LIZ(value)) {
                final 2fc ljiil2 = liz.LJIIL;
                if (ljiil2 != null) {
                    ljiil2.dispose();
                }
            }
        }
        0h0.LIZ = null;
    }
    
    @Override
    public void reportClickSoundEffectIconLog(final DataChannel dataChannel) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_take_voice_click");
        liz.LIZ(dataChannel);
        liz.LIZLLL();
    }
    
    @Override
    public void resumeAccompanimentPlay() {
        0hc.LJIILJJIL.LIZ(false);
    }
    
    @Override
    public void selectSoundEffectAfterGameLiveResume() {
        final LiveEffect ljff = 1N5.LJFF;
        if (ljff != null) {
            1N5.LJI.LIZ(ljff, true);
        }
    }
    
    @Override
    public void showEffectTextInputDialog(final DataChannel dataChannel, final 0gV lizj, final SRS<Boolean, 2P9> liziz) {
        final 0AB 0ab = (0AB)dataChannel.LIZIZ((Class)G73.class);
        if (0ab != null) {
            final EffectTextInputFragment effectTextInputFragment = new EffectTextInputFragment();
            CTM.LIZ((Object)liziz);
            effectTextInputFragment.LIZIZ = liziz;
            CTM.LIZ((Object)lizj);
            effectTextInputFragment.LIZJ = lizj;
            INVOKEVIRTUAL_com_bytedance_android_live_effect_EffectService_com_ss_android_ugc_aweme_lancet_AlertLancet_show(effectTextInputFragment, 0ab, EffectTextInputFragment.class.getSimpleName());
        }
    }
    
    @Override
    public void showStickerPanel(final Context context, final DataChannel dataChannel, final LiveEffect liveEffect, final OgM lizlll) {
        CTM.LIZ((Object)context, (Object)dataChannel, (Object)lizlll);
        if (0h0.LIZ == null) {
            final 1jV 1jV = 0h0.LIZ = new 1jV(context, dataChannel);
            CTM.LIZ((Object)lizlll);
            1jV.LJIIJ = lizlll;
            final 0iY ljff = 1jV.LJFF;
            CTM.LIZ((Object)lizlll);
            ljff.LIZLLL = lizlll;
            final 0iV lji = 1jV.LJI;
            CTM.LIZ((Object)lizlll);
            final 1Mr liz = lji.LIZ;
            CTM.LIZ((Object)lizlll);
            liz.LIZLLL = lizlll;
        }
        final 1jV liz2 = 0h0.LIZ;
        if (liz2 != null) {
            liz2.LJIIJJI = liveEffect;
            liz2.LJ.LIZJ = liveEffect;
        }
        final 0AB 0ab = (0AB)dataChannel.LIZIZ((Class)G73.class);
        if (0ab != null) {
            final 1jV liz3 = 0h0.LIZ;
            if (liz3 != null) {
                final LiveEffectContainerDialog liveEffectContainerDialog = new LiveEffectContainerDialog();
                CTM.LIZ((Object)liz3);
                liveEffectContainerDialog.LIZ = liz3;
                final String simpleName = 1jV.class.getSimpleName();
                n.LIZIZ((Object)simpleName, "");
                Vqj.LIZ((DialogFragment)liveEffectContainerDialog, simpleName);
                ((DialogFragment)liveEffectContainerDialog).show(0ab, simpleName);
            }
        }
    }
    
    @Override
    public 0gk stickerPresenter() {
        return 1jU.a.LIZ;
    }
}
