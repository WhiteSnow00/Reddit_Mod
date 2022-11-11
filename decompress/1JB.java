// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;

public final class 1jB extends AbsDownloadListener
{
    public final /* synthetic */ 0hV LIZ;
    
    static {
        Covode.recordClassIndex(6443);
    }
    
    public 1jB(final 0hV liz) {
        this.LIZ = liz;
    }
    
    public final void onFailed(final DownloadInfo downloadInfo, final BaseException ex) {
        super.onFailed(downloadInfo, ex);
        this.LIZ.LIZ(downloadInfo, ex);
    }
    
    public final void onProgress(final DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        this.LIZ.LIZ(downloadInfo);
    }
    
    public final void onSuccessed(final DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        this.LIZ.LIZIZ(downloadInfo);
    }
}
