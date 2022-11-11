// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.content.SharedPreferences$Editor;
import yd.a;
import android.content.SharedPreferences;
import android.util.Pair;

public final class q3 extends t4
{
    public static final Pair B;
    public final m3 A;
    public SharedPreferences h;
    public o3 i;
    public final n3 j;
    public final p3 k;
    public String l;
    public boolean m;
    public long n;
    public final n3 o;
    public final l3 p;
    public final p3 q;
    public final l3 r;
    public final n3 s;
    public boolean t;
    public final l3 u;
    public final l3 v;
    public final n3 w;
    public final p3 x;
    public final p3 y;
    public final n3 z;
    
    static {
        B = new Pair((Object)"", (Object)0L);
    }
    
    public q3(final h4 h4) {
        super(h4);
        this.o = new n3(this, "session_timeout", 1800000L);
        this.p = new l3(this, "start_new_session", true);
        this.s = new n3(this, "last_pause_time", 0L);
        this.q = new p3(this, "non_personalized_ads");
        this.r = new l3(this, "allow_remote_dynamite", false);
        this.j = new n3(this, "first_open_time", 0L);
        new n3(this, "app_install_time", 0L);
        this.k = new p3(this, "app_instance_id");
        this.u = new l3(this, "app_backgrounded", false);
        this.v = new l3(this, "deep_link_retrieval_complete", false);
        this.w = new n3(this, "deep_link_retrieval_attempts", 0L);
        this.x = new p3(this, "firebase_feature_rollouts");
        this.y = new p3(this, "deferred_attribution_cache");
        this.z = new n3(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new m3(this);
    }
    
    public final SharedPreferences C() {
        ((w)this).y();
        this.A();
        a.S0((Object)this.h);
        return this.h;
    }
    
    public final void D() {
        final SharedPreferences sharedPreferences = ((h4)((w)this).f).f.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.h = sharedPreferences;
        if (!(this.t = sharedPreferences.getBoolean("has_been_opened", false))) {
            final SharedPreferences$Editor edit = this.h.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        ((w)this).f.getClass();
        this.i = new o3(this, Math.max(0L, (long)q2.d.a((Object)null)));
    }
    
    public final g E() {
        ((w)this).y();
        return g.b(this.C().getString("consent_settings", "G1"));
    }
    
    public final Boolean F() {
        ((w)this).y();
        if (this.C().contains("measurement_enabled")) {
            return this.C().getBoolean("measurement_enabled", true);
        }
        return null;
    }
    
    public final void G(final Boolean b) {
        ((w)this).y();
        final SharedPreferences$Editor edit = this.C().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }
    
    public final void H(final boolean b) {
        ((w)this).y();
        ((h4)((w)this).f).f().s.b(b, "App measurement setting deferred collection");
        final SharedPreferences$Editor edit = this.C().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    public final boolean I(final long n) {
        return n - this.o.a() > this.s.a();
    }
    
    public final boolean J(final int n) {
        final int int1 = this.C().getInt("consent_source", 100);
        final g b = g.b;
        return n <= int1;
    }
    
    public final boolean z() {
        return true;
    }
}
