// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import androidx.lifecycle.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import androidx.lifecycle.q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;

class EmojiCompatInitializer$1 implements c
{
    public final /* synthetic */ Lifecycle f;
    public final /* synthetic */ EmojiCompatInitializer g;
    
    public EmojiCompatInitializer$1(final EmojiCompatInitializer g, final Lifecycle f) {
        this.g = g;
        this.f = f;
    }
    
    public final void a(final q q) {
        this.g.getClass();
        Handler a;
        if (Build$VERSION.SDK_INT >= 28) {
            a = b.a(Looper.getMainLooper());
        }
        else {
            a = new Handler(Looper.getMainLooper());
        }
        a.postDelayed((Runnable)new EmojiCompatInitializer$c(), 500L);
        this.f.c((p)this);
    }
}
