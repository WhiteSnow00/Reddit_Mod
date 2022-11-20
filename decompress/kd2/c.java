// 
// Decompiled by Procyon v0.6.0
// 

package kd2;

import java.util.List;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.tonyodev.fetch2.database.DownloadInfo;
import md2.a;

public interface c extends Runnable
{
    void I(final md2.a p0);
    
    void P();
    
    void v();
    
    DownloadInfo w();
    
    public interface a
    {
        void a(final DownloadInfo p0, final DownloadBlockInfo p1, final int p2);
        
        void b(final Download p0);
        
        void c(final DownloadInfo p0, final Error p1, final Exception p2);
        
        void d(final DownloadInfo p0, final List p1, final int p2);
        
        DownloadInfo d1();
        
        void e(final DownloadInfo p0);
        
        void f(final DownloadInfo p0, final long p1, final long p2);
    }
}
