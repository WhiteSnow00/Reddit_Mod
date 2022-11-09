// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

public final class e extends ViewPager2$e
{
    public final /* synthetic */ ViewPager2 a;
    
    public e(final ViewPager2 a) {
        this.a = a;
    }
    
    public final void a(final int n) {
        if (n == 0) {
            this.a.e();
        }
    }
    
    public final void c(final int i) {
        final ViewPager2 a = this.a;
        if (a.i != i) {
            a.i = i;
            a.y.b();
        }
    }
}
