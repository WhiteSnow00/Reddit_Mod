// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

import com.amazonaws.ivs.player.ViewUtil;
import android.graphics.SurfaceTexture;
import at0.c;
import android.view.View;
import xd2.j;
import android.view.Surface;
import kotlin.jvm.internal.MutablePropertyReference1;
import ug2.f;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ng2.h;
import ug2.k;
import android.view.View$OnLayoutChangeListener;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;

public final class e extends TextureView implements TextureView$SurfaceTextureListener, View$OnLayoutChangeListener
{
    public static final k<Object>[] g;
    public g f;
    
    static {
        g = new k[] { (k)h.b((MutablePropertyReference1)new MutablePropertyReference1Impl((f)h.a((Class)e.class), "surface", "getSurface()Landroid/view/Surface;")) };
    }
    
    private final Surface getSurface() {
        final k<Object> k = e.g[0];
        throw null;
    }
    
    private final void setSurface(final Surface surface) {
        final k<Object> k = e.g[0];
        throw null;
    }
    
    public final j<Surface> getSurfaceObservable$player_release() {
        return null;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        ((View)this).post((Runnable)new c((Object)this, 10));
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        ng2.e.f((Object)surfaceTexture, "surfaceTexture");
        this.setSurface(new Surface(surfaceTexture));
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        ng2.e.f((Object)surfaceTexture, "surfaceTexture");
        final Surface surface = this.getSurface();
        if (surface != null) {
            surface.release();
        }
        this.setSurface(null);
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, int b, int a) {
        ng2.e.f((Object)surfaceTexture, "surfaceTexture");
        final g f = this.f;
        a = f.a;
        if (a > 0) {
            b = f.b;
            if (b > 0) {
                ViewUtil.setTransform((TextureView)this, a, b);
            }
        }
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        ng2.e.f((Object)surfaceTexture, "surfaceTexture");
    }
}
