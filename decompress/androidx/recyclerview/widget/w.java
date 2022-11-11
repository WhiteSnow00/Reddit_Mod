// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

public final class w
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    
    public w() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LayoutState{mAvailable=");
        r.append(this.b);
        r.append(", mCurrentPosition=");
        r.append(this.c);
        r.append(", mItemDirection=");
        r.append(this.d);
        r.append(", mLayoutDirection=");
        r.append(this.e);
        r.append(", mStartLine=");
        r.append(this.f);
        r.append(", mEndLine=");
        return d.l(r, this.g, '}');
    }
}
