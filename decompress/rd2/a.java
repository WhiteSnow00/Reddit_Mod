// 
// Decompiled by Procyon v0.6.0
// 

package rd2;

import nd2.i;
import java.util.List;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.tonyodev.fetch2.database.DownloadInfo;
import sg2.e;
import com.tonyodev.fetch2.fetch.ListenerCoordinator$a;
import md2.f;
import a2.b;
import pd2.c$a;

public final class a implements c$a
{
    public volatile boolean a;
    public final b b;
    public final f c;
    public final boolean d;
    public final int e;
    
    public a(final b b, final ListenerCoordinator$a c, final boolean d, final int e) {
        sg2.e.g((Object)b, "downloadInfoUpdater");
        sg2.e.g((Object)c, "fetchListener");
        this.b = b;
        this.c = (f)c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final DownloadInfo downloadInfo, final DownloadBlockInfo downloadBlockInfo, final int n) {
        sg2.e.g((Object)downloadInfo, "download");
        sg2.e.g((Object)downloadBlockInfo, "downloadBlock");
        if (!this.a) {
            this.c.a(downloadInfo, downloadBlockInfo, n);
        }
    }
    
    public final void b(final Download download) {
        sg2.e.g((Object)download, "download");
        if (!this.a) {
            final DownloadInfo downloadInfo = (DownloadInfo)download;
            downloadInfo.setStatus(Status.COMPLETED);
            this.b.e(downloadInfo);
            this.c.j(download);
        }
    }
    
    public final void c(final DownloadInfo downloadInfo, final Error error, final Exception ex) {
        sg2.e.g((Object)downloadInfo, "download");
        sg2.e.g((Object)error, "error");
        if (!this.a) {
            int n = this.e;
            if (n == -1) {
                n = ((Download)downloadInfo).getAutoRetryMaxAttempts();
            }
            if (this.d && downloadInfo.getError() == Error.NO_NETWORK_CONNECTION) {
                downloadInfo.setStatus(Status.QUEUED);
                downloadInfo.setError(ud2.b.d);
                this.b.e(downloadInfo);
                this.c.h((Download)downloadInfo, true);
            }
            else if (downloadInfo.getAutoRetryAttempts() < n) {
                downloadInfo.setAutoRetryAttempts(downloadInfo.getAutoRetryAttempts() + 1);
                downloadInfo.setStatus(Status.QUEUED);
                downloadInfo.setError(ud2.b.d);
                this.b.e(downloadInfo);
                this.c.h((Download)downloadInfo, true);
            }
            else {
                downloadInfo.setStatus(Status.FAILED);
                this.b.e(downloadInfo);
                this.c.f((Download)downloadInfo, error, (Throwable)ex);
            }
        }
    }
    
    public final void d(final DownloadInfo downloadInfo, final List list, final int n) {
        sg2.e.g((Object)downloadInfo, "download");
        if (!this.a) {
            downloadInfo.setStatus(Status.DOWNLOADING);
            this.b.e(downloadInfo);
            this.c.i((Download)downloadInfo, list, n);
        }
    }
    
    public final DownloadInfo d1() {
        return ((i)this.b.f).d1();
    }
    
    public final void e(final DownloadInfo downloadInfo) {
        sg2.e.g((Object)downloadInfo, "download");
        if (!this.a) {
            downloadInfo.setStatus(Status.DOWNLOADING);
            final b b = this.b;
            b.getClass();
            ((i)b.f).z1(downloadInfo);
        }
    }
    
    public final void f(final DownloadInfo downloadInfo, final long n, final long n2) {
        sg2.e.g((Object)downloadInfo, "download");
        if (!this.a) {
            this.c.g((Download)downloadInfo, n, n2);
        }
    }
}
