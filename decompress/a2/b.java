// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import h.t;
import ng.m;
import android.content.Context;
import com.google.android.play.core.splitinstall.zzo;
import lg.g0;
import lg.g;
import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import pe.b3;
import pe.b4;
import pe.h4;
import java.util.List;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.twilio.live.player.PlayerException;
import org.json.JSONObject;
import ce2.h;
import od.q;
import nd2.i;
import com.reddit.carousel.view.CarouselRecyclerView;
import ej2.c0;
import android.os.Build$VERSION;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import dn.a;
import gg.n0;
import ng.l;
import od.c1;

public final class b implements c1, l, n0
{
    public Object f = f;
    
    public b(final int n) {
        if (n == 7) {
            this.f = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
            return;
        }
        if (n != 15) {
            Object f;
            if (Build$VERSION.SDK_INT >= 28) {
                f = new c0();
            }
            else {
                f = new lw0.b();
            }
            this.f = f;
            return;
        }
        this.f = null;
    }
    
    public final float a(final int n, final int n2) {
        return ((Float[])((e[])this.f)[n].h)[n2];
    }
    
    public final h b(String s) {
        sg2.e.f((Object)s, "accessToken");
        try {
            this.f.getClass();
            s = a.n(s);
            final Object value = new JSONObject(s).get("grants");
            if (value != null) {
                final JSONObject jsonObject = ((JSONObject)value).getJSONObject("player");
                s = jsonObject.getString("playbackUrl");
                sg2.e.e((Object)s, "playbackGrant.getString(\"playbackUrl\")");
                final String string = jsonObject.getString("playerStreamerSid");
                sg2.e.e((Object)string, "playbackGrant.getString(\"playerStreamerSid\")");
                return new h(s, string);
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        catch (final Exception ex) {
            throw new PlayerException(20101, "Twilio was unable to validate your Access Token", (String)null, (Throwable)ex);
        }
    }
    
    public final e c(final int n) {
        return ((e[])this.f)[n];
    }
    
    public final void d(final float n, final int n2, final int n3) {
        ((Float[])((e[])this.f)[n2].h)[n3] = n;
    }
    
    public final void e(final DownloadInfo downloadInfo) {
        sg2.e.g((Object)downloadInfo, "downloadInfo");
        ((i)this.f).k1(downloadInfo);
    }
    
    public final void f(int size, final String s, final List list, final boolean b, final boolean b2) {
        b3 b3;
        if (--size != 0) {
            if (size != 1) {
                if (size != 3) {
                    if (size != 4) {
                        b3 = ((h4)((b4)this.f).f).h().q;
                    }
                    else if (b) {
                        b3 = ((h4)((b4)this.f).f).h().o;
                    }
                    else if (!b2) {
                        b3 = ((h4)((b4)this.f).f).h().p;
                    }
                    else {
                        b3 = ((h4)((b4)this.f).f).h().n;
                    }
                }
                else {
                    b3 = ((h4)((b4)this.f).f).h().s;
                }
            }
            else if (b) {
                b3 = ((h4)((b4)this.f).f).h().l;
            }
            else if (!b2) {
                b3 = ((h4)((b4)this.f).f).h().m;
            }
            else {
                b3 = ((h4)((b4)this.f).f).h().k;
            }
        }
        else {
            b3 = ((h4)((b4)this.f).f).h().r;
        }
        size = list.size();
        if (size == 1) {
            b3.b(list.get(0), s);
            return;
        }
        if (size == 2) {
            b3.c(list.get(0), s, list.get(1));
            return;
        }
        if (size != 3) {
            b3.a(s);
            return;
        }
        b3.d(list.get(0), s, list.get(1), list.get(2));
    }
    
    @Override
    public final void o(final md.b k) {
        ((q)this.f).m.lock();
        try {
            final Object f = this.f;
            ((q)f).k = k;
            q.k((q)f);
        }
        finally {
            ((q)this.f).m.unlock();
        }
    }
    
    @Override
    public final void q(final int n, final boolean b) {
        ((q)this.f).m.lock();
        try {
            final Object f = this.f;
            final q q = (q)f;
            Lock lock;
            if (q.l) {
                q.l = false;
                od.q.j((q)f, n, b);
                lock = ((q)this.f).m;
            }
            else {
                q.l = true;
                ((q)f).d.l(n);
                lock = ((q)this.f).m;
            }
            lock.unlock();
        }
        finally {
            ((q)this.f).m.unlock();
        }
    }
    
    @Override
    public final void r(final Bundle bundle) {
        ((q)this.f).m.lock();
        try {
            final Object f = this.f;
            ((q)f).k = md.b.j;
            q.k((q)f);
        }
        finally {
            ((q)this.f).m.unlock();
        }
    }
    
    public final Object zza() {
        final Context a = ((g)this.f).a;
        synchronized (g0.class) {
            if (g0.j == null) {
                g0.j = new g0(a, zzo.zza);
            }
            final g0 j = g0.j;
            monitorexit(g0.class);
            ml0.a.R0((Object)j);
            return j;
        }
    }
    
    public final void zza() {
        final m m = (m)this.f;
        for (int i = 0; i < m.a.getAttributeCount(); ++i) {
            if ("defaultErrorCode".equals(m.a.getAttributeName(i))) {
                m.b.a = mg.a.a(m.a.getAttributeValue(i));
            }
        }
        m.a("split-install-error", (l)new t((Object)m, 6));
    }
}
