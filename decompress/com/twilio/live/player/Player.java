// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import yd2.a$a$d;
import yd2.a$a$a;
import android.net.Uri;
import yd2.a$a$b;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ng2.h;
import ug2.k;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.amazonaws.ivs.player.Quality;
import java.util.LinkedHashMap;
import dg2.m;
import yd2.a$b$b;
import com.amazonaws.ivs.player.Statistics;
import yd2.a$a$c;
import java.util.Map;
import com.amazonaws.ivs.player.Player$Listener;
import xd2.d;
import ng2.e;
import com.twilio.live.player.internal.IvsPlayer;
import android.os.Looper;
import com.reddit.talk.data.audio.twilio.source.a$a;
import android.content.Context;
import oi2.d0;
import com.twilio.live.player.internal.Environment;
import yd2.a;
import xd2.c$b;
import mg2.l;
import xd2.f;
import wd2.c;
import t5.x;
import androidx.compose.ui.platform.k0;
import android.os.Handler;
import xd2.g;
import wd2.b;
import xd2.i;
import xd2.j;
import h.s;

public final class Player
{
    public static final a u;
    public static final s v;
    public static boolean w;
    public static final j<LogLevel> x;
    public static final j<LogLevel> y;
    public static i z;
    public final wd2.b a;
    public final String b;
    public final g c;
    public final s d;
    public final Handler e;
    public final com.amazonaws.ivs.player.Player f;
    public final k0 g;
    public final x h;
    public PlayerState i;
    public String j;
    public wd2.g k;
    public float l;
    public c m;
    public c n;
    public final f o;
    public final l<LogLevel, cg2.j> p;
    public boolean q;
    public final xd2.l r;
    public final c$b s;
    public final l<yd2.a, cg2.j> t;
    
    static {
        u = new a();
        v = new s(17, 0);
        Player.w = true;
        y = (x = new j(LogLevel.OFF));
        final Environment dev = Environment.DEV;
        Player.z = new i(new d0());
    }
    
    public Player(final Context context, final a$a a, final String b, final i c, final s d, final boolean b2) {
        final Looper myLooper = Looper.myLooper();
        Handler handler;
        if (myLooper == null) {
            handler = null;
        }
        else {
            handler = new Handler(myLooper);
        }
        Handler e = handler;
        if (handler == null) {
            e = new Handler(Looper.getMainLooper());
        }
        final IvsPlayer f = new IvsPlayer(context, e, c);
        final k0 g = new k0();
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)a, "listener");
        ng2.e.f((Object)b, "accessToken");
        ng2.e.f((Object)c, "logger");
        ng2.e.f((Object)d, "telemetry");
        this.a = (wd2.b)a;
        this.b = b;
        this.c = (g)c;
        this.d = d;
        this.e = e;
        this.f = (com.amazonaws.ivs.player.Player)f;
        this.g = g;
        final x h = new x(0);
        this.h = h;
        new Player$surfaceObserver$1(this);
        this.i = PlayerState.IDLE;
        this.k = new wd2.g(0, 0);
        this.l = 1.0f;
        this.m = xd2.d.c(((xd2.a)f).getQuality());
        this.n = xd2.d.c(((xd2.a)f).getQuality());
        final f o = new f(this, new com.twilio.live.player.a(this), c);
        this.o = o;
        final Player$logLevelObserver$1 p6 = new Player$logLevelObserver$1(this);
        this.p = (l<LogLevel, cg2.j>)p6;
        this.r = new xd2.l(this, d, e, c);
        c$b s;
        if (b2) {
            s = new c$b(c, d);
        }
        else {
            s = null;
        }
        this.s = s;
        final Player$latencyObserver$1 t = new Player$latencyObserver$1(this);
        this.t = (l<yd2.a, cg2.j>)t;
        t5.x.c(h, (String)null, 3);
        ((xd2.a)f).setLogLevel(xd2.d.b(Player.u.b()));
        final j<LogLevel> x = Player.x;
        x.getClass();
        x.g.add(p6);
        f.addListener((Player$Listener)o);
        ((xd2.a)f).setRebufferToLive(true);
        final Player$1 instance = Player$1.INSTANCE;
        ng2.e.f((Object)instance, "telemetryPredicate");
        ((Map)d.g).put(t, instance);
    }
    
    public static final void a(final Player player, final c n) {
        player.h.b("write internal quality", (l)new Player$internalQuality$2(player));
        player.n = n;
    }
    
    public static final void b(final Player player, final c m) {
        player.h.b("write previous quality", (l)new Player$previousQuality$2(player));
        player.m = m;
    }
    
    public final void c() {
        this.c.d(mg.d0.M((Object)this), "disconnect", null);
        this.h.b("disconnect", (l)new Player$disconnect$1(this));
        this.r.a();
        this.n();
        final PlayerState i = this.i();
        final PlayerState ended = PlayerState.ENDED;
        if (i != ended) {
            this.q(ended);
        }
        this.d.y((yd2.a)new a$a$c(this.k()));
    }
    
    public final long d() {
        this.h.b("read bufferSize", (l)new Player$bufferDuration$1(this));
        return this.f.getBufferedPosition() - this.h();
    }
    
    public final c e() {
        this.h.b("get internal quality", (l)new Player$internalQuality$1(this));
        return this.n;
    }
    
    public final long f() {
        this.h.b("read liveLatency", (l)new Player$liveLatency$1(this));
        return this.f.getLiveLatency();
    }
    
    public final float g() {
        this.h.b("read playbackRate", (l)new Player$playbackRate$1(this));
        return this.f.getPlaybackRate();
    }
    
    public final long h() {
        this.h.b("read position", (l)new Player$position$1(this));
        return this.f.getPosition();
    }
    
    public final PlayerState i() {
        this.h.b("read state", (l)new Player$state$1(this));
        return this.i;
    }
    
    public final wd2.d j() {
        this.h.b("read stats", (l)new Player$stats$1(this));
        final Statistics statistics = this.f.getStatistics();
        ng2.e.e((Object)statistics, "ivsPlayer.statistics");
        return new wd2.d(statistics.getVideoBitRate(), statistics.getDecodedFrames(), statistics.getDroppedFrames(), statistics.getRenderedFrames());
    }
    
    public final String k() {
        final String j = this.j;
        if (j != null) {
            return j;
        }
        ng2.e.n("internalStreamerSid");
        throw null;
    }
    
    public final float l() {
        this.h.b("read volume", (l)new Player$volume$1(this));
        return this.l;
    }
    
    public final void m() {
        this.c.d(mg.d0.M((Object)this), "play", null);
        this.h.b("play", (l)new Player$play$1(this));
        t5.x.c(this.h, (String)null, 3);
        final int n = Player.b.a[this.i().ordinal()];
        if (n != 1 && n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n == 5) {
                        this.c.w(mg.d0.M((Object)this), "Attempted to play an ended stream", null);
                    }
                }
                else {
                    this.c.d(mg.d0.M((Object)this), "Attempted to play a stream that is already playing", null);
                }
            }
            else {
                this.c.d(mg.d0.M((Object)this), "Attempted to play a stream that is buffering", null);
            }
        }
        else {
            this.f.play();
        }
        this.d.y((yd2.a)new a$b$b(this.h(), this.k(), this.i()));
    }
    
    public final void n() {
        this.c.d(mg.d0.M((Object)this), "release", null);
        if (!this.q) {
            this.c.d(mg.d0.M((Object)this), "releasing player resources", null);
            final s d = this.d;
            final l<yd2.a, cg2.j> t = this.t;
            d.getClass();
            ng2.e.f((Object)t, "telemetrySubscriber");
            final l l = ((Map)d.g).remove(t);
            this.f.removeListener((Player$Listener)this.o);
            this.f.release();
            final j<LogLevel> x = Player.x;
            final l<LogLevel, cg2.j> p = this.p;
            x.getClass();
            ng2.e.f((Object)p, "onChanged");
            x.g.remove(p);
            this.q = true;
        }
        else {
            this.c.d(mg.d0.M((Object)this), "player resources already released", null);
        }
    }
    
    public final void o(final long n) {
        this.c.d(mg.d0.M((Object)this), "seekTo", null);
        this.h.b("seekTo", (l)new Player$seekTo$1(this));
        this.f.seekTo(n);
    }
    
    public final void p(final float playbackRate) {
        this.h.b("write playbackRate", (l)new Player$playbackRate$2(this));
        this.f.setPlaybackRate(playbackRate);
    }
    
    public final void q(final PlayerState i) {
        this.h.b("write state", (l)new Player$state$2(this));
        final boolean validTransition$player_release = this.i.isValidTransition$player_release(i);
        final StringBuilder t = a.t("Invalid state transition from ");
        t.append(this.i);
        t.append(" to ");
        t.append(i);
        final String string = t.toString();
        final Player$state$3 player$state$3 = new Player$state$3(this);
        ng2.e.f((Object)string, "message");
        if (!validTransition$player_release) {
            ((l)player$state$3).invoke((Object)string);
        }
        this.i = i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Player(state=");
        t.append(this.i());
        t.append(", isMuted=");
        this.h.b("read isMuted", (l)new Player$isMuted$1(this));
        t.append(this.f.isMuted());
        t.append(", liveLatency=");
        t.append(this.f());
        t.append(", position=");
        t.append(this.h());
        t.append(", videoSize=");
        this.h.b("read videoDimensions", (l)new Player$videoSize$1(this));
        t.append(this.k);
        t.append(", volume=");
        t.append(this.l());
        t.append(", quality=");
        this.h.b("get quality", (l)new Player$quality$1(this));
        t.append(this.e());
        t.append(", availableQualities=");
        this.h.b("get availableQualities", (l)new Player$availableQualities$1(this));
        this.h.b("read qualitiesMap", (l)new Player$qualitiesMap$1(this));
        Map u4;
        if (this.f.getQualities() != null) {
            final Set<Quality> qualities = this.f.getQualities();
            ng2.e.e((Object)qualities, "ivsPlayer.qualities");
            int p3;
            if ((p3 = cg.d.p3(dg2.m.u4((Iterable)qualities, 10))) < 16) {
                p3 = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(p3);
            final Iterator<Object> iterator = qualities.iterator();
            while (true) {
                u4 = linkedHashMap;
                if (!iterator.hasNext()) {
                    break;
                }
                final Quality next = iterator.next();
                final Quality quality = next;
                ng2.e.e((Object)quality, "it");
                linkedHashMap.put((Object)xd2.d.c(quality), (Object)next);
            }
        }
        else {
            u4 = kotlin.collections.c.u4();
        }
        t.append(CollectionsKt___CollectionsKt.I5((Iterable)u4.keySet()));
        t.append(')');
        return t.toString();
    }
    
    public static final class a
    {
        public static final k<Object>[] a;
        
        static {
            a = new k[] { (k)h.b((MutablePropertyReference1)new MutablePropertyReference1Impl((ug2.f)h.a((Class)a.class), "logLevel", "getLogLevel()Lcom/twilio/live/player/LogLevel;")) };
        }
        
        public static Player a(Context context, final String s, final a$a a$a) {
            e.f((Object)context, "context");
            e.f((Object)s, "accessToken");
            e.f((Object)a$a, "listener");
            context = (Context)new Player(context, a$a, s, Player.z, Player.v, Player.w);
            ((Player)context).c.d(mg.d0.M((Object)context), "connect", null);
            ((Player)context).d.y((yd2.a)new a$a$b());
            ((Player)context).h.b("connect", (l)new Player$connect$1((Player)context));
            ((Player)context).c.d(mg.d0.M((Object)context), "Decoding playback grant", null);
            try {
                final xd2.h n = ((Player)context).g.n(((Player)context).b);
                ((Player)context).c.d(mg.d0.M((Object)context), "Decoded playback grant", null);
                ((Player)context).j = n.b;
                ((Player)context).f.load(Uri.parse(n.a));
                ((Player)context).d.y((yd2.a)new a$a$a(((Player)context).k()));
            }
            catch (final PlayerException ex) {
                ((Player)context).c.e(mg.d0.M((Object)context), "Failed to get playback grant", ex);
                ((Player)context).j = "";
                ((Player)context).n();
                ((Player)context).q(PlayerState.ENDED);
                ((Player)context).a.b((Player)context, ex);
                ((Player)context).d.y((yd2.a)new a$a$d(ex, ((Player)context).k()));
            }
            return (Player)context;
        }
        
        public final LogLevel b() {
            return ((qg2.b<LogLevel>)Player.y).getValue(this, Player.a.a[0]);
        }
    }
    
    public final class b
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PlayerState.values().length];
            a2[PlayerState.IDLE.ordinal()] = 1;
            a2[PlayerState.READY.ordinal()] = 2;
            a2[PlayerState.BUFFERING.ordinal()] = 3;
            a2[PlayerState.PLAYING.ordinal()] = 4;
            a2[PlayerState.ENDED.ordinal()] = 5;
            a = a2;
        }
    }
}
