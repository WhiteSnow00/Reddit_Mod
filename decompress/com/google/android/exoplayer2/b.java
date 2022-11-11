// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.content.Intent;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Context;

public final class b
{
    public final Context a;
    public final a b;
    public boolean c;
    
    public b(final Context context, final Handler handler, final k$b k$b) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, k$b);
    }
    
    public final void a() {
        if (this.c) {
            this.a.unregisterReceiver((BroadcastReceiver)this.b);
            this.c = false;
        }
    }
    
    public final class a extends BroadcastReceiver implements Runnable
    {
        public final b f;
        public final Handler g;
        
        public a(final Handler g, final k$b f) {
            this.g = g;
            this.f = (b)f;
        }
        
        public final void onReceive(final Context context, final Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.g.post((Runnable)this);
            }
        }
        
        public final void run() {
            if (com.google.android.exoplayer2.b.this.c) {
                ((k$b)this.f).f.B0(-1, 3, false);
            }
        }
    }
    
    public interface b
    {
    }
}
