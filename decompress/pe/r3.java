// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.SharedPreferences$Editor;
import lw0.b;
import android.content.SharedPreferences;
import android.util.Pair;

public final class r3 extends v4
{
    public static final Pair B;
    public final n3 A;
    public SharedPreferences h;
    public p3 i;
    public final o3 j;
    public final q3 k;
    public String l;
    public boolean m;
    public long n;
    public final o3 o;
    public final m3 p;
    public final q3 q;
    public final m3 r;
    public final o3 s;
    public boolean t;
    public final m3 u;
    public final m3 v;
    public final o3 w;
    public final q3 x;
    public final q3 y;
    public final o3 z;
    
    static {
        B = new Pair((Object)"", (Object)0L);
    }
    
    public r3(final h4 h4) {
        super(h4);
        this.o = new o3(this, "session_timeout", 1800000L);
        this.p = new m3(this, "start_new_session", true);
        this.s = new o3(this, "last_pause_time", 0L);
        this.q = new q3(this, "non_personalized_ads");
        this.r = new m3(this, "allow_remote_dynamite", false);
        this.j = new o3(this, "first_open_time", 0L);
        new o3(this, "app_install_time", 0L);
        this.k = new q3(this, "app_instance_id");
        this.u = new m3(this, "app_backgrounded", false);
        this.v = new m3(this, "deep_link_retrieval_complete", false);
        this.w = new o3(this, "deep_link_retrieval_attempts", 0L);
        this.x = new q3(this, "firebase_feature_rollouts");
        this.y = new q3(this, "deferred_attribution_cache");
        this.z = new o3(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new n3(this);
    }
    
    @Override
    public final boolean N() {
        return true;
    }
    
    public final SharedPreferences Q() {
        this.M();
        this.O();
        b.R((Object)this.h);
        return this.h;
    }
    
    public final void R() {
        final SharedPreferences sharedPreferences = ((h4)super.f).f.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.h = sharedPreferences;
        if (!(this.t = sharedPreferences.getBoolean("has_been_opened", false))) {
            final SharedPreferences$Editor edit = this.h.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        super.f.getClass();
        this.i = new p3(this, Math.max(0L, (long)r2.d.a(null)));
    }
    
    public final g S() {
        this.M();
        return pe.g.b(this.Q().getString("consent_settings", "G1"));
    }
    
    public final Boolean T() {
        this.M();
        if (this.Q().contains("measurement_enabled")) {
            return this.Q().getBoolean("measurement_enabled", true);
        }
        return null;
    }
    
    public final void U(final Boolean b) {
        this.M();
        final SharedPreferences$Editor edit = this.Q().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }
    
    public final void V(final boolean b) {
        this.M();
        ((h4)super.f).h().s.b((Object)b, "App measurement setting deferred collection");
        final SharedPreferences$Editor edit = this.Q().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    public final boolean W(final long n) {
        return n - this.o.a() > this.s.a();
    }
    
    public final boolean X(final int n) {
        final int int1 = this.Q().getInt("consent_source", 100);
        final g b = pe.g.b;
        return n <= int1;
    }
}
