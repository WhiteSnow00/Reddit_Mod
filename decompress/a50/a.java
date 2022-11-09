// 
// Decompiled by Procyon v0.6.0
// 

package a50;

import android.content.SharedPreferences$Editor;
import javax.inject.Inject;
import ah2.f;
import db0.o;
import android.content.SharedPreferences;

public final class a implements dc0.a
{
    public final SharedPreferences a;
    public final o b;
    
    @Inject
    public a(final SharedPreferences a, final o b) {
        f.f((Object)a, "prefs");
        f.f((Object)b, "liveAudioFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        final SharedPreferences a = this.a;
        boolean b = false;
        final int int1 = a.getInt("com.reddit.liveaudio.new_host_onboarding_seen_count", 0);
        int n;
        if (this.b.i5()) {
            n = 3;
        }
        else {
            n = 2;
        }
        if (int1 < n) {
            b = true;
        }
        return b;
    }
    
    public final void b() {
        final int int1 = this.a.getInt("com.reddit.liveaudio.new_host_onboarding_seen_count", 0);
        final SharedPreferences$Editor edit = this.a.edit();
        f.e((Object)edit, "editor");
        edit.putInt("com.reddit.liveaudio.new_host_onboarding_seen_count", int1 + 1);
        edit.apply();
    }
    
    public final boolean c() {
        final SharedPreferences a = this.a;
        boolean b = false;
        if (a.getInt("com.reddit.liveaudio.new_host_onboarding_seen_count", 0) < 1) {
            b = true;
        }
        return b;
    }
    
    public final void reset() {
        final SharedPreferences$Editor edit = this.a.edit();
        f.e((Object)edit, "editor");
        edit.remove("com.reddit.liveaudio.new_host_onboarding_seen_count");
        edit.apply();
    }
}
