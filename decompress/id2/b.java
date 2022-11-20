// 
// Decompiled by Procyon v0.6.0
// 

package id2;

import m5.d;
import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Status;
import java.util.Map;
import com.tonyodev.fetch2.Priority;
import ng2.e;
import androidx.room.RoomDatabase;
import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadInfo;
import i5.f;

public final class b extends f<DownloadInfo>
{
    public final id2.f d;
    
    public b(final id2.f d, final DownloadDatabase downloadDatabase) {
        this.d = d;
        super((RoomDatabase)downloadDatabase);
    }
    
    public final String b() {
        return "INSERT OR ABORT INTO `requests` (`_id`,`_namespace`,`_url`,`_file`,`_group`,`_priority`,`_headers`,`_written_bytes`,`_total_bytes`,`_status`,`_error`,`_network_type`,`_created`,`_tag`,`_enqueue_action`,`_identifier`,`_download_on_enqueue`,`_extras`,`_auto_retry_max_attempts`,`_auto_retry_attempts`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    @Override
    public final void d(final m5.f f, final Object o) {
        final DownloadInfo downloadInfo = (DownloadInfo)o;
        ((d)f).bindLong(1, (long)downloadInfo.getId());
        if (downloadInfo.getNamespace() == null) {
            ((d)f).bindNull(2);
        }
        else {
            ((d)f).bindString(2, downloadInfo.getNamespace());
        }
        if (downloadInfo.getUrl() == null) {
            ((d)f).bindNull(3);
        }
        else {
            ((d)f).bindString(3, downloadInfo.getUrl());
        }
        if (downloadInfo.getFile() == null) {
            ((d)f).bindNull(4);
        }
        else {
            ((d)f).bindString(4, downloadInfo.getFile());
        }
        ((d)f).bindLong(5, (long)downloadInfo.getGroup());
        final vi.b b = this.d.b;
        final Priority priority = downloadInfo.getPriority();
        b.getClass();
        e.g((Object)priority, "priority");
        ((d)f).bindLong(6, (long)priority.getValue());
        final vi.b b2 = this.d.b;
        final Map headers = downloadInfo.getHeaders();
        b2.getClass();
        ((d)f).bindString(7, vi.b.e(headers));
        ((d)f).bindLong(8, downloadInfo.getDownloaded());
        ((d)f).bindLong(9, downloadInfo.getTotal());
        final vi.b b3 = this.d.b;
        final Status status = downloadInfo.getStatus();
        b3.getClass();
        e.g((Object)status, "status");
        ((d)f).bindLong(10, (long)status.getValue());
        final vi.b b4 = this.d.b;
        final Error error = downloadInfo.getError();
        b4.getClass();
        e.g((Object)error, "error");
        ((d)f).bindLong(11, (long)error.getValue());
        final vi.b b5 = this.d.b;
        final NetworkType networkType = downloadInfo.getNetworkType();
        b5.getClass();
        e.g((Object)networkType, "networkType");
        ((d)f).bindLong(12, (long)networkType.getValue());
        ((d)f).bindLong(13, downloadInfo.getCreated());
        if (downloadInfo.getTag() == null) {
            ((d)f).bindNull(14);
        }
        else {
            ((d)f).bindString(14, downloadInfo.getTag());
        }
        final vi.b b6 = this.d.b;
        final EnqueueAction enqueueAction = downloadInfo.getEnqueueAction();
        b6.getClass();
        e.g((Object)enqueueAction, "enqueueAction");
        ((d)f).bindLong(15, (long)enqueueAction.getValue());
        ((d)f).bindLong(16, downloadInfo.getIdentifier());
        ((d)f).bindLong(17, (long)(downloadInfo.getDownloadOnEnqueue() ? 1 : 0));
        final vi.b b7 = this.d.b;
        final Extras extras = downloadInfo.getExtras();
        b7.getClass();
        ((d)f).bindString(18, vi.b.b(extras));
        ((d)f).bindLong(19, (long)downloadInfo.getAutoRetryMaxAttempts());
        ((d)f).bindLong(20, (long)downloadInfo.getAutoRetryAttempts());
    }
}
