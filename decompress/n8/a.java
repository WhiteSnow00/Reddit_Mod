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
        final StringBuilder t = a.t("frameNumber=");
        t.append(this.a);
        t.append(", xOffset=");
        t.append(this.b);
        t.append(", yOffset=");
        t.append(this.c);
        t.append(", width=");
        t.append(this.d);
        t.append(", height=");
        t.append(this.e);
        t.append(", duration=");
        t.append(this.f);
        t.append(", blendPreviousFrame=");
        t.append(this.g);
        t.append(", disposeBackgroundColor=");
        t.append(this.h);
        return t.toString();
    }
}
