// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import androidx.activity.g;
import android.content.Intent;
import va.u;
import ad.m;
import va.o;
import lg.e0;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import ad.d0;
import android.media.AudioManager;
import android.os.Handler;
import android.content.Context;

public final class c0
{
    public final Context a;
    public final Handler b;
    public final a c;
    public final AudioManager d;
    public b e;
    public int f;
    public int g;
    public boolean h;
    
    public c0(Context applicationContext, final Handler b, final k$b c) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.c = (a)c;
        final AudioManager d = (AudioManager)applicationContext.getSystemService("audio");
        d0.g(d);
        this.d = d;
        this.f = 3;
        this.g = a(d, 3);
        final int f = this.f;
        boolean streamMute;
        if (ad.c0.a >= 23) {
            streamMute = d.isStreamMute(f);
        }
        else {
            streamMute = (a(d, f) == 0);
        }
        this.h = streamMute;
        final b e = new b();
        final IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            applicationContext.registerReceiver((BroadcastReceiver)e, intentFilter);
            this.e = e;
        }
        catch (final RuntimeException ex) {
            e0.w0("StreamVolumeManager", "Error registering stream volume receiver", (Throwable)ex);
        }
    }
    
    public static int a(final AudioManager audioManager, final int n) {
        try {
            return audioManager.getStreamVolume(n);
        }
        catch (final RuntimeException ex) {
            final StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(n);
            e0.w0("StreamVolumeManager", sb.toString(), (Throwable)ex);
            return audioManager.getStreamMaxVolume(n);
        }
    }
    
    public final void b(final int f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        this.c();
        final k$b k$b = (k$b)this.c;
        final i f2 = k.f0(k$b.f.B);
        if (!f2.equals((Object)k$b.f.h0)) {
            final k f3 = k$b.f;
            f3.h0 = f2;
            f3.l.e(29, new o(f2, 2));
        }
    }
    
    public final void c() {
        final int a = a(this.d, this.f);
        final AudioManager d = this.d;
        final int f = this.f;
        boolean streamMute;
        if (ad.c0.a >= 23) {
            streamMute = d.isStreamMute(f);
        }
        else {
            streamMute = (a(d, f) == 0);
        }
        if (this.g != a || this.h != streamMute) {
            this.g = a;
            this.h = streamMute;
            ((k$b)this.c).f.l.e(30, new u(a, streamMute));
        }
    }
    
    public interface a
    {
    }
    
    public final class b extends BroadcastReceiver
    {
        public final void onReceive(final Context context, final Intent intent) {
            final c0 a = c0.this;
            a.b.post((Runnable)new g((Object)a, 2));
        }
    }
}
