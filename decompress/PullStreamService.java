// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.livepullstream;

import X.Fhf;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.5ow;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import X.IX3;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import X.IX4;
import com.bytedance.android.livesdkapi.host.IHostApp;
import X.0jB;
import X.HhC;
import X.Hha;
import X.0yZ;
import X.Hh7;
import X.0jA;
import X.1ND;
import X.0TR;
import X.0yY;
import X.0j5;
import X.1dR;
import X.0yW;
import X.GrQ;
import X.0j3;
import X.GrO;
import X.0jR;
import X.G0A;
import X.Fgj;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import X.0TT;
import X.0TP;
import X.0TS;
import X.Fgi;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra$SrConfig;
import X.Fra;
import X.5WL;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;

public class PullStreamService implements IPullStreamService
{
    public static final String TAG;
    
    static {
        Covode.recordClassIndex(10397);
        TAG = PullStreamService.class.getSimpleName();
    }
    
    public static Context INVOKEVIRTUAL_com_bytedance_android_live_livepullstream_PullStreamService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    @Override
    public 0TP createRoomPlayer(final long n, final String s, final Fra lj, final StreamUrlExtra$SrConfig ljff, final Fgi fgi, final 0TS 0ts, final Context context, final String lizlll) {
        INVOKEVIRTUAL_com_bytedance_android_live_livepullstream_PullStreamService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        final 0TT 0tt = new 0TT();
        0tt.LIZIZ(s);
        0tt.LIZLLL = lizlll;
        0tt.LJ = lj;
        0tt.LJFF = ljff;
        return (0TP)new RoomPlayer2(n, 0tt, fgi, 0ts);
    }
    
    @Override
    public 0TP createRoomPlayer(final long n, final String s, final String liziz, final Fra lj, final StreamUrlExtra$SrConfig ljff, final Fgi fgi, final 0TS 0ts, final Context context) {
        INVOKEVIRTUAL_com_bytedance_android_live_livepullstream_PullStreamService_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        final 0TT 0tt = new 0TT();
        0tt.LIZ(s);
        0tt.LIZIZ = liziz;
        0tt.LJ = lj;
        0tt.LJFF = ljff;
        return (0TP)new RoomPlayer2(n, 0tt, fgi, 0ts);
    }
    
    @Override
    public 0TP ensureRoomPlayer(final long n, final String s, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context, final String s2, final String s3) {
        final String tag = PullStreamService.TAG;
        final StringBuilder sb = new StringBuilder("ensureRoomPlayer -> roomId=");
        sb.append(n);
        sb.append(", playerTag=");
        sb.append(s3);
        Fgj.LIZ(tag, sb.toString());
        final G0A liz = G0A.LIZ();
        if (liz.LIZIZ()) {
            return 0jR.LIZ(IPullStreamService.class).createRoomPlayer(n, s, fra, streamUrlExtra$SrConfig, fgi, 0ts, context, s2);
        }
        final 0TP liz2 = liz.LIZ(s3);
        if (liz2 != null) {
            liz2.attach(context, fgi, 0ts);
            return liz2;
        }
        final 0TP liz3 = liz.LIZ(n, context, s, s2, (String)null, (String)null, streamUrlExtra$SrConfig, fra);
        liz.LIZ(liz3, context, fgi, 0ts);
        return liz3;
    }
    
    @Override
    public 0TP ensureRoomPlayer(final long n, final String s, final String s2, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context, final String s3) {
        final String tag = PullStreamService.TAG;
        final StringBuilder sb = new StringBuilder("ensureRoomPlayer -> roomId=");
        sb.append(n);
        sb.append(", playerTag=");
        sb.append(s3);
        Fgj.LIZ(tag, sb.toString());
        final G0A liz = G0A.LIZ();
        if (liz.LIZIZ()) {
            return 0jR.LIZ(IPullStreamService.class).createRoomPlayer(n, s, null, fra, streamUrlExtra$SrConfig, fgi, 0ts, context);
        }
        final 0TP liz2 = liz.LIZ(s3);
        if (liz2 != null) {
            liz2.attach(context, fgi, 0ts);
            return liz2;
        }
        final 0TP liz3 = liz.LIZ(n, context, (String)null, (String)null, s, s2, streamUrlExtra$SrConfig, fra);
        liz.LIZ(liz3, context, fgi, 0ts);
        return liz3;
    }
    
    public 0j3 getAudioFocusController(final GrO grO) {
        return (0j3)new GrQ(grO);
    }
    
    @Override
    public 0yW getCpuInfoFetcher() {
        return 1dR.LJI().LJFF();
    }
    
    @Override
    public 0j5 getDnsOptimizer() {
        return 1dR.LJI().LIZJ();
    }
    
    @Override
    public 0yY getGpuInfoFetcher() {
        return 1dR.LJI().LJ();
    }
    
    @Override
    public 0TR getIRoomPlayerManager() {
        return (0TR)G0A.LIZ();
    }
    
    @Override
    public 1ND getLivePlayController() {
        return 1dR.LJI().LIZ();
    }
    
    @Override
    public 0jA getLivePlayControllerManager() {
        return Hh7.LIZ;
    }
    
    @Override
    public 0yZ getLivePlayerLog() {
        return (0yZ)1dR.LJI().LIZIZ();
    }
    
    public Hha getLivePlayerView(final Context context) {
        return (Hha)new HhC(context);
    }
    
    @Override
    public 0jB getLiveStreamStrategy() {
        return 1dR.LJI().LIZLLL();
    }
    
    @Override
    public String getProjectKey() {
        if (0jR.LIZ(IHostApp.class).isInMusicallyRegion()) {
            return "musically_live";
        }
        return "tiktok_live";
    }
    
    @Override
    public void onInit() {
        IX3.LIZ = (IX4)new IX4() {
            static {
                Covode.recordClassIndex(10398);
            }
            
            public final boolean LIZ(final String s) {
                return LiveAppBundleUtils.loadSOByLoader(s, "liveplayer-loadPlayerLibrary", true);
            }
            
            public final boolean LIZIZ(final String s) {
                return LiveAppBundleUtils.loadSOByLoader(s, "liveplayer-loadPluginLibrary", true);
            }
        };
    }
    
    @Override
    public boolean preCreatedSurface(final String s, final Context context) {
        final G0A liz = G0A.LIZ();
        if (!LivePreCreateSurfaceSetting.INSTANCE.getValue()) {
            return false;
        }
        final 0TP liz2 = liz.LIZ(s);
        if (liz2 == null) {
            return false;
        }
        Fgj.LIZ(G0A.LIZ, "preCreatedSurface() -> playerTag is ".concat(String.valueOf(s)));
        return liz2.preCreatedSurface(context);
    }
    
    @Override
    public void recycleRoomPlayer(final String s) {
        final G0A liz = G0A.LIZ();
        Fgj.LIZ(G0A.LIZ, "recycle() -> playerTag=".concat(String.valueOf(s)));
        if (s != null) {
            final 0TP liz2 = liz.LIZ(s);
            if (liz2 != null) {
                liz.LIZ(liz2);
            }
        }
    }
    
    @Override
    public void stopRoomPlayer(final String s, final boolean b) {
        final G0A liz = G0A.LIZ();
        final String liz2 = G0A.LIZ;
        final StringBuilder sb = new StringBuilder("stop() -> playerTag=");
        sb.append(s);
        sb.append("; needRelease: ");
        sb.append(b);
        Fgj.LIZ(liz2, sb.toString());
        if (s != null) {
            final 0TP liz3 = liz.LIZ(s);
            if (liz3 != null) {
                liz3.stop(b);
            }
        }
    }
    
    @Override
    public 0TP warmUp(final long n, EnterRoomConfig enterRoomConfig, final Context context) {
        final EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        Fgj.LIZ(PullStreamService.TAG, "warmUp -> roomId=".concat(String.valueOf(n)));
        final G0A liz = G0A.LIZ();
        if (liz.LIZIZ() || enterRoomConfig2 == null) {
            return null;
        }
        final EnterRoomConfig ljjijiijil = enterRoomConfig2.LIZLLL.LJJIJIIJIL;
        enterRoomConfig = enterRoomConfig2;
        if (ljjijiijil != null) {
            enterRoomConfig2.LIZLLL.LJJIJIIJIL = null;
            enterRoomConfig = ljjijiijil;
        }
        final String liziz = enterRoomConfig.LIZIZ.LIZIZ;
        String lizlll = enterRoomConfig.LIZIZ.LIZLLL;
        final String lj = enterRoomConfig.LIZIZ.LJ;
        final boolean liz2 = 5ow.LIZ(lj);
        if (!liz2) {
            lizlll = lj;
        }
        return liz.LIZ(n, context, liziz, enterRoomConfig.LIZIZ.LIZJ, lizlll, enterRoomConfig.LIZIZ.LJFF, new StreamUrlExtra$SrConfig(enterRoomConfig.LIZIZ.LJII, enterRoomConfig.LIZIZ.LJIIIIZZ, enterRoomConfig.LIZIZ.LJIIIZ), Fra.valueOf(enterRoomConfig.LIZIZ.LJIIJ), liz2 ^ true, enterRoomConfig.LIZLLL.LJJIZ, enterRoomConfig.LIZLLL.LJJLIIIJJI);
    }
    
    @Override
    public 0TP warmUp(final Room room, final Context context) {
        final String tag = PullStreamService.TAG;
        final StringBuilder sb = new StringBuilder("warmUp -> roomId=");
        sb.append(room.getId());
        Fgj.LIZ(tag, sb.toString());
        final G0A liz = G0A.LIZ();
        if (liz.LIZIZ()) {
            return null;
        }
        return liz.LIZ(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().LJIILIIL, room.getStreamType(), false, (String)null, Fhf.LIZ.LIZ().LIZIZ.LIZLLL.LJJLIIIJJI);
    }
}
