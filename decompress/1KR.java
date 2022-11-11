// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.bytedance.covode.number.Covode;

public final class 1Kr implements 0hU
{
    public static final 1Kr LIZ;
    public static final 5DO LIZIZ;
    
    static {
        Covode.recordClassIndex(6440);
        LIZ = new 1Kr();
        LIZIZ = 3Os.LIZ((QgG)1tL.LIZ);
    }
    
    public final Downloader LIZ() {
        return (Downloader)1Kr.LIZIZ.getValue();
    }
    
    @Override
    public final void LIZ(final DownloadInfo downloadInfo) {
        CTM.LIZ((Object)downloadInfo);
        ((VCb)this.LIZ()).clearDownloadData(downloadInfo.getId(), true);
        final StringBuilder sb = new StringBuilder();
        sb.append(downloadInfo.getSavePath());
        sb.append(downloadInfo.getName());
        5ls.LIZIZ(new File(sb.toString()));
    }
}
