// 
// Decompiled by Procyon v0.6.0
// 

package qa;

import androidx.fragment.app.Fragment;
import com.reddit.video.creation.models.voiceover.VoiceoverData;
import com.reddit.video.creation.video.merge.Mp4Merger;
import af2.d0;
import android.content.SharedPreferences$Editor;
import zg.d;
import android.content.Context;
import we.j;
import com.google.firebase.messaging.a;
import com.google.firebase.messaging.FirebaseMessaging;
import ab.g;
import com.google.android.exoplayer2.n;
import xa.b$a;
import com.google.android.datatransport.runtime.EventInternal;
import dl1.i;
import com.reddit.screen.settings.preferences.PreferencesFragment;
import androidx.preference.Preference;
import af2.f0;
import androidx.preference.Preference$e;
import we.f;
import bd.n$a;
import ta.a$a;

public final class b implements a$a, n$a, f, Preference$e, f0
{
    public final Object f;
    public final Object g;
    public final Object h;
    
    public b(final Object f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final boolean d(final Preference preference) {
        final PreferencesFragment preferencesFragment = (PreferencesFragment)this.f;
        preferencesFragment.X.b0(((Fragment)preferencesFragment).getContext(), preferencesFragment.X.N(), new i((Object)preferencesFragment, (Comparable)this.g, (Object)this.h, 0));
        return true;
    }
    
    public final Object execute() {
        final c c = (c)this.f;
        final com.google.android.datatransport.runtime.c c2 = (com.google.android.datatransport.runtime.c)this.g;
        c.d.m2(c2, (EventInternal)this.h);
        c.a.b(c2, 1);
        return null;
    }
    
    public final void invoke(final Object o) {
        final b$a b$a = (b$a)this.f;
        final n n = (n)this.g;
        final g g = (g)this.h;
        final xa.b b = (xa.b)o;
        b.onAudioInputFormatChanged(b$a, n);
        b.onAudioInputFormatChanged(b$a, n, g);
        b.onDecoderInputFormatChanged(b$a, 1, n);
    }
    
    public final we.g then(final Object o) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)this.f;
        final String s = (String)this.g;
        final com.google.firebase.messaging.a$a a$a = (com.google.firebase.messaging.a$a)this.h;
        final String s2 = (String)o;
        final Context d = firebaseMessaging.d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.m == null) {
                FirebaseMessaging.m = new a(d);
            }
            final a m = FirebaseMessaging.m;
            monitorexit(FirebaseMessaging.class);
            final d a = firebaseMessaging.a;
            a.b();
            String g;
            if ("[DEFAULT]".equals(a.b)) {
                g = "";
            }
            else {
                g = firebaseMessaging.a.g();
            }
            Object o2 = firebaseMessaging.j;
            synchronized (o2) {
                if (((oi.n)o2).b == null) {
                    ((oi.n)o2).d();
                }
                final String b = ((oi.n)o2).b;
                monitorexit(o2);
                synchronized (m) {
                    o2 = com.google.firebase.messaging.a$a.a(System.currentTimeMillis(), s2, b);
                    if (o2 == null) {
                        monitorexit(m);
                    }
                    else {
                        final SharedPreferences$Editor edit = m.a.edit();
                        edit.putString(com.google.firebase.messaging.a.a(g, s), (String)o2);
                        edit.commit();
                        monitorexit(m);
                    }
                    if (a$a == null || !s2.equals(a$a.a)) {
                        firebaseMessaging.d(s2);
                    }
                    return j.e((Object)s2);
                }
            }
        }
    }
    
    public final void y(final d0 d0) {
        Mp4Merger.c((Mp4Merger)this.f, (String)this.g, (VoiceoverData)this.h, d0);
    }
}
