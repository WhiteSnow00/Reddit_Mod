// 
// Decompiled by Procyon v0.6.0
// 

package k8;

import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public interface a
{
    void a();
    
    int b();
    
    int c();
    
    void clear();
    
    int d();
    
    int e();
    
    ByteBuffer getData();
    
    Bitmap getNextFrame();
    
    public interface a
    {
        byte[] a(final int p0);
        
        Bitmap b(final int p0, final int p1, final Bitmap$Config p2);
        
        void c(final Bitmap p0);
        
        int[] d(final int p0);
        
        void e(final byte[] p0);
        
        void f(final int[] p0);
    }
}
