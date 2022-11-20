// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.reddit.video.creation.video.trim.audioResampler.AudioEditor;
import com.reddit.video.creation.video.trim.data.audioEditor.AudioTrackFormat;
import af2.d0;
import android.hardware.SensorEventListener;
import ff2.f;
import wv1.a;
import wv1.b;
import ng2.e;
import android.hardware.Sensor;
import wv1.c;
import af2.i;
import com.google.android.exoplayer2.w$c;
import com.google.android.exoplayer2.w;
import af2.f0;
import af2.j;
import bd.n$a;

public final class r implements n$a, j, f0
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public r(final int f, final Object g, final Object h) {
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    public r(final w.d g, final w.d h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void invoke(final Object o) {
        final int f = this.f;
        final w.d d = (w.d)this.g;
        final w.d d2 = (w.d)this.h;
        final w$c w$c = (w$c)o;
        w$c.onPositionDiscontinuity(f);
        w$c.onPositionDiscontinuity(d, d2, f);
    }
    
    public final void subscribe(final i i) {
        final c c = (c)this.g;
        final Sensor sensor = (Sensor)this.h;
        final int f = this.f;
        e.f((Object)c, "this$0");
        e.f((Object)sensor, "$sensor");
        final b b = new b(i);
        i.setCancellable((f)new a(c, b));
        if (!c.b().registerListener((SensorEventListener)b, sensor, f)) {
            ((af2.f)i).onError((Throwable)new Exception("unable to register listener for accelerometer"));
        }
    }
    
    public final void y(final d0 d0) {
        AudioEditor.a((AudioTrackFormat)this.g, (AudioEditor)this.h, this.f, d0);
    }
}
