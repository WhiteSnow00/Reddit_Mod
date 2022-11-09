// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import bd.e;
import org.chromium.net.UrlRequest$StatusListener;

public final class b extends UrlRequest$StatusListener
{
    public final /* synthetic */ int[] a;
    public final /* synthetic */ e b;
    
    public b(final int[] a, final e b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onStatus(final int n) {
        this.a[0] = n;
        this.b.e();
    }
}
