// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import va.a;
import android.media.AudioFocusRequest$Builder;
import android.media.AudioManager$OnAudioFocusChangeListener;
import a4.r;
import ad.c0;
import android.os.Handler;
import android.content.Context;
import android.media.AudioFocusRequest;
import xa.d;
import android.media.AudioManager;

public final class c
{
    public final AudioManager a;
    public final a b;
    public b c;
    public d d;
    public int e;
    public int f;
    public float g;
    public AudioFocusRequest h;
    
    public c(final Context context, final Handler handler, final k$b c) {
        this.g = 1.0f;
        final AudioManager a = (AudioManager)context.getApplicationContext().getSystemService("audio");
        a.getClass();
        this.a = a;
        this.c = (b)c;
        this.b = new a(handler);
        this.e = 0;
    }
    
    public final void a() {
        if (this.e == 0) {
            return;
        }
        if (c0.a >= 26) {
            final AudioFocusRequest h = this.h;
            if (h != null) {
                r.d(this.a, h);
            }
        }
        else {
            this.a.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)this.b);
        }
        this.d(0);
    }
    
    public final void b(final int n) {
        final b c = this.c;
        if (c != null) {
            final k$b k$b = (k$b)c;
            final boolean o = k$b.f.o();
            final k f = k$b.f;
            int n2 = 1;
            if (o) {
                n2 = n2;
                if (n != 1) {
                    n2 = 2;
                }
            }
            f.B0(n, n2, o);
        }
    }
    
    public final void c() {
        if (!c0.a(this.d, null)) {
            this.d = null;
            this.f = 0;
        }
    }
    
    public final void d(final int e) {
        if (this.e == e) {
            return;
        }
        float g;
        if ((this.e = e) == 3) {
            g = 0.2f;
        }
        else {
            g = 1.0f;
        }
        if (this.g == g) {
            return;
        }
        this.g = g;
        final b c = this.c;
        if (c != null) {
            final k f = ((k$b)c).f;
            f.s0(1, 2, f.c0 * f.A.g);
        }
    }
    
    public final int e(int n, final boolean b) {
        final int n2 = 1;
        final int n3 = 1;
        if (n != 1 && this.f == 1) {
            n = 0;
        }
        else {
            n = 1;
        }
        final int n4 = -1;
        if (n != 0) {
            this.a();
            if (b) {
                n = n3;
            }
            else {
                n = -1;
            }
            return n;
        }
        n = n4;
        if (b) {
            if (this.e == 1) {
                n = n2;
            }
            else {
                if (c0.a >= 26) {
                    final AudioFocusRequest h = this.h;
                    if (h == null) {
                        AudioFocusRequest$Builder audioFocusRequest$Builder;
                        if (h == null) {
                            audioFocusRequest$Builder = new AudioFocusRequest$Builder(this.f);
                        }
                        else {
                            audioFocusRequest$Builder = new AudioFocusRequest$Builder(this.h);
                        }
                        final d d = this.d;
                        final boolean willPauseWhenDucked = d != null && d.f == 1;
                        d.getClass();
                        this.h = audioFocusRequest$Builder.setAudioAttributes(d.a()).setWillPauseWhenDucked(willPauseWhenDucked).setOnAudioFocusChangeListener((AudioManager$OnAudioFocusChangeListener)this.b).build();
                    }
                    n = this.a.requestAudioFocus(this.h);
                }
                else {
                    final AudioManager a = this.a;
                    final a b2 = this.b;
                    final d d2 = this.d;
                    d2.getClass();
                    n = a.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)b2, c0.z(d2.h), this.f);
                }
                if (n == 1) {
                    this.d(1);
                    n = n2;
                }
                else {
                    this.d(0);
                    n = -1;
                }
            }
        }
        return n;
    }
    
    public final class a implements AudioManager$OnAudioFocusChangeListener
    {
        public final Handler a;
        
        public a(final Handler a) {
            this.a = a;
        }
        
        public final void onAudioFocusChange(final int n) {
            this.a.post((Runnable)new va.a((Object)this, n, 0));
        }
    }
    
    public interface b
    {
    }
}
