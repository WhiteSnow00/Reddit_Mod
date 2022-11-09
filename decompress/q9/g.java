// 
// Decompiled by Procyon v0.6.0
// 

package q9;

import android.net.Uri;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.opengl.EGLContext;
import com.daasuu.mp4compose.VideoFormatMimeType;
import com.daasuu.mp4compose.FillMode;
import com.daasuu.mp4compose.Rotation;
import android.util.Size;
import r9.a;
import t9.b;

public final class g
{
    public final t9.b a;
    public final String b;
    public a c;
    public Size d;
    public int e;
    public Rotation f;
    public b g;
    public FillMode h;
    public float i;
    public long j;
    public long k;
    public VideoFormatMimeType l;
    public EGLContext m;
    public ExecutorService n;
    public i o;
    public v7.a p;
    public g$a q;
    
    public g(final Context context, final Uri uri, final String b) {
        final v7.a p3 = new v7.a();
        this.e = -1;
        this.f = Rotation.NORMAL;
        this.h = FillMode.PRESERVE_ASPECT_FIT;
        this.i = 1.0f;
        this.j = 0L;
        this.k = -1L;
        this.l = VideoFormatMimeType.AUTO;
        this.q = new t9.a() {};
        this.p = p3;
        this.a = new t9.b(uri, context, p3, this.q);
        this.b = b;
    }
    
    public static void a(final g g, final Exception ex) {
        final b g2 = g.g;
        if (g2 != null) {
            g2.onFailed(ex);
        }
        final ExecutorService n = g.n;
        if (n != null) {
            n.shutdown();
        }
    }
    
    public interface b
    {
        void onCanceled();
        
        void onCompleted();
        
        void onCurrentWrittenVideoTime(final long p0);
        
        void onFailed(final Exception p0);
        
        void onProgress(final double p0);
    }
}
