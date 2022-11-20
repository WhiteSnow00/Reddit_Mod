// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import com.reddit.news.ui.composables.RecommendationContextSection;
import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import ng2.e;
import kotlinx.coroutines.sync.MutexImpl;
import u2.b;
import n0.g;

public final class PressGestureScopeImpl implements g, b
{
    public final b f;
    public boolean g;
    public boolean h;
    public final MutexImpl i;
    
    public PressGestureScopeImpl(final b f) {
        e.f((Object)f, "density");
        this.f = f;
        this.i = new MutexImpl(false);
    }
    
    public final float M0(final float n) {
        return this.f.M0(n);
    }
    
    public final float Y(final int n) {
        return this.f.Y(n);
    }
    
    public final long g0(final long n) {
        return this.f.g0(n);
    }
    
    public final float getDensity() {
        return this.f.getDensity();
    }
    
    public final float getFontScale() {
        return this.f.getFontScale();
    }
    
    public final long i(final long n) {
        return this.f.i(n);
    }
    
    public final float k(final long n) {
        return this.f.k(n);
    }
    
    public final long l(final float n) {
        return this.f.l(n);
    }
    
    public final Object p0(final c<? super Boolean> c) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$2 = null;
        Label_0047: {
            if (c instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
                final PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1)c;
                final int label = pressGestureScopeImpl$tryAwaitRelease$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pressGestureScopeImpl$tryAwaitRelease$1.label = label + Integer.MIN_VALUE;
                    pressGestureScopeImpl$tryAwaitRelease$2 = pressGestureScopeImpl$tryAwaitRelease$1;
                    break Label_0047;
                }
            }
            pressGestureScopeImpl$tryAwaitRelease$2 = new PressGestureScopeImpl$tryAwaitRelease$1(this, (c)c);
        }
        final Object result = pressGestureScopeImpl$tryAwaitRelease$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pressGestureScopeImpl$tryAwaitRelease$2.label;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl)pressGestureScopeImpl$tryAwaitRelease$2.L$0;
            d.b4(result);
        }
        else {
            d.b4(result);
            if (!this.g && !this.h) {
                final MutexImpl i = this.i;
                pressGestureScopeImpl$tryAwaitRelease$2.L$0 = this;
                pressGestureScopeImpl$tryAwaitRelease$2.label = 1;
                if (i.b(null, (c<? super j>)pressGestureScopeImpl$tryAwaitRelease$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            pressGestureScopeImpl = this;
        }
        return pressGestureScopeImpl.g;
    }
    
    public final float u(final float n) {
        return this.f.u(n);
    }
    
    public final long w() {
        final float f = RecommendationContextSection.f;
        return this.f.w();
    }
    
    public final int w0(final float n) {
        return this.f.w0(n);
    }
    
    public final float z0(final long n) {
        return this.f.z0(n);
    }
}
