// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public abstract class c implements AudioProcessor
{
    public AudioProcessor$a b;
    public AudioProcessor$a c;
    public AudioProcessor$a d;
    public AudioProcessor$a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;
    
    public c() {
        final ByteBuffer a = AudioProcessor.a;
        this.f = a;
        this.g = a;
        final AudioProcessor$a e = AudioProcessor$a.e;
        this.d = e;
        this.e = e;
        this.b = e;
        this.c = e;
    }
    
    public boolean b() {
        return this.h && this.g == AudioProcessor.a;
    }
    
    public final void c() {
        this.h = true;
        this.g();
    }
    
    public final AudioProcessor$a d(AudioProcessor$a d) throws AudioProcessor$UnhandledAudioFormatException {
        this.d = d;
        this.e = this.e(d);
        if (this.isActive()) {
            d = this.e;
        }
        else {
            d = AudioProcessor$a.e;
        }
        return d;
    }
    
    public abstract AudioProcessor$a e(final AudioProcessor$a p0) throws AudioProcessor$UnhandledAudioFormatException;
    
    public void f() {
    }
    
    public final void flush() {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.f();
    }
    
    public void g() {
    }
    
    public ByteBuffer getOutput() {
        final ByteBuffer g = this.g;
        this.g = AudioProcessor.a;
        return g;
    }
    
    public void h() {
    }
    
    public final ByteBuffer i(final int n) {
        if (this.f.capacity() < n) {
            this.f = ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
        }
        else {
            this.f.clear();
        }
        return this.g = this.f;
    }
    
    public boolean isActive() {
        return this.e != AudioProcessor$a.e;
    }
    
    public final void reset() {
        this.flush();
        this.f = AudioProcessor.a;
        final AudioProcessor$a e = AudioProcessor$a.e;
        this.d = e;
        this.e = e;
        this.b = e;
        this.c = e;
        this.h();
    }
}
