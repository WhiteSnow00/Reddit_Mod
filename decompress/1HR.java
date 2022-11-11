// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;

public final class 1hr extends AbsDownloadListener
{
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ 0TD LIZJ;
    
    static {
        Covode.recordClassIndex(4587);
    }
    
    public 1hr(final String liz, final String liziz, final 0TD lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onCanceled(final DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (H25.LJFF) {
            0ba.LIZ(6, "FileDownloader", "onCanceled. entity=".concat(String.valueOf(downloadInfo)));
        }
        final 0TD lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ();
        }
    }
    
    public final void onFailed(final DownloadInfo downloadInfo, final BaseException ex) {
        CTM.LIZ((Object)downloadInfo, (Object)ex);
        super.onFailed(downloadInfo, ex);
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("onFailed. download file {");
            sb.append(this.LIZ);
            sb.append("} to path {");
            sb.append(this.LIZIZ);
            sb.append("} failure.");
            0ba.LIZ(6, "FileDownloader", sb.toString());
        }
        final 0TD lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(downloadInfo, ex);
        }
    }
    
    public final void onProgress(final DownloadInfo downloadInfo) {
        CTM.LIZ((Object)downloadInfo);
        super.onProgress(downloadInfo);
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("onProgress. progress=");
            sb.append(downloadInfo.getDownloadProcess());
            0ba.LIZ(4, "FileDownloader", sb.toString());
        }
        final 0TD lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(downloadInfo);
        }
    }
    
    public final void onSuccessed(final DownloadInfo downloadInfo) {
        CTM.LIZ((Object)downloadInfo);
        super.onSuccessed(downloadInfo);
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("onSuccessed. download file {");
            sb.append(this.LIZ);
            sb.append("} to path {");
            sb.append(this.LIZIZ);
            sb.append("} success.");
            0ba.LIZ(4, "FileDownloader", sb.toString());
        }
        final 0TD lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZIZ(downloadInfo);
        }
    }
}
