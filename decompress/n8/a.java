// 
// Decompiled by Procyon v0.6.0
// 

package n8;

import com.bumptech.glide.integration.webp.WebpFrame;

public final class a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    
    public a(final int a, final WebpFrame webpFrame) {
        this.a = a;
        this.b = webpFrame.getXOffest();
        this.c = webpFrame.getYOffest();
        this.d = webpFrame.getWidth();
        this.e = webpFrame.getHeight();
        this.f = webpFrame.getDurationMs();
        this.g = webpFrame.isBlendWithPreviousFrame();
        this.h = webpFrame.shouldDisposeToBackgroundColor();
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("frameNumber=");
        k.append(this.a);
        k.append(", xOffset=");
        k.append(this.b);
        k.append(", yOffset=");
        k.append(this.c);
        k.append(", width=");
        k.append(this.d);
        k.append(", height=");
        k.append(this.e);
        k.append(", duration=");
        k.append(this.f);
        k.append(", blendPreviousFrame=");
        k.append(this.g);
        k.append(", disposeBackgroundColor=");
        k.append(this.h);
        return k.toString();
    }
}
