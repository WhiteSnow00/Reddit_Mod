// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.Serializable;

public final class 1L2 extends 9Mp implements Serializable
{
    public final DownloadInfo LIZ;
    public final 1L1 LIZIZ;
    
    static {
        Covode.recordClassIndex(6469);
    }
    
    public 1L2(final DownloadInfo liz, final 1L1 liziz) {
        CTM.LIZ((Object)liz, (Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final 1L2 copy(final DownloadInfo downloadInfo, final 1L1 1l1) {
        CTM.LIZ((Object)downloadInfo, (Object)1l1);
        return new 1L2(downloadInfo, 1l1);
    }
    
    public final 1L1 getAccompaniment() {
        return this.LIZIZ;
    }
    
    public final DownloadInfo getDownloadInfo() {
        return this.LIZ;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ };
    }
}
