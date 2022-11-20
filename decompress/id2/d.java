// 
// Decompiled by Procyon v0.6.0
// 

package id2;

import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Status;
import java.util.Map;
import com.tonyodev.fetch2.Priority;
import vi.b;
import androidx.room.RoomDatabase;
import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadInfo;
import i5.e;

public final class d extends e<DownloadInfo>
{
    public final f d;
    
    public d(final f d, final DownloadDatabase downloadDatabase) {
        this.d = d;
        super((RoomDatabase)downloadDatabase);
    }
    
    public final String b() {
        return "UPDATE OR REPLACE `requests` SET `_id` = ?,`_namespace` = ?,`_url` = ?,`_file` = ?,`_group` = ?,`_priority` = ?,`_headers` = ?,`_written_bytes` = ?,`_total_bytes` = ?,`_status` = ?,`_error` = ?,`_network_type` = ?,`_created` = ?,`_tag` = ?,`_enqueue_action` = ?,`_identifier` = ?,`_download_on_enqueue` = ?,`_extras` = ?,`_auto_retry_max_attempts` = ?,`_auto_retry_attempts` = ? WHERE `_id` = ?";
    }
    
    @Override
    public final void d(final m5.f f, final Object o) {
        final DownloadInfo downloadInfo = (DownloadInfo)o;
        ((m5.d)f).bindLong(1, (long)downloadInfo.getId());
        if (downloadInfo.getNamespace() == null) {
            ((m5.d)f).bindNull(2);
        }
        else {
            ((m5.d)f).bindString(2, downloadInfo.getNamespace());
        }
        if (downloadInfo.getUrl() == null) {
            ((m5.d)f).bindNull(3);
        }
        else {
            ((m5.d)f).bindString(3, downloadInfo.getUrl());
        }
        if (downloadInfo.getFile() == null) {
            ((m5.d)f).bindNull(4);
        }
        else {
            ((m5.d)f).bindString(4, downloadInfo.getFile());
        }
        ((m5.d)f).bindLong(5, (long)downloadInfo.getGroup());
        final b b = this.d.b;
        final Priority priority = downloadInfo.getPriority();
        b.getClass();
        ng2.e.g((Object)priority, "priority");
        ((m5.d)f).bindLong(6, (long)priority.getValue());
        final b b2 = this.d.b;
        final Map headers = downloadInfo.getHeaders();
        b2.getClass();
        ((m5.d)f).bindString(7, vi.b.e(headers));
        ((m5.d)f).bindLong(8, downloadInfo.getDownloaded());
        ((m5.d)f).bindLong(9, downloadInfo.getTotal());
        final b b3 = this.d.b;
        final Status status = downloadInfo.getStatus();
        b3.getClass();
        ng2.e.g((Object)status, "status");
        ((m5.d)f).bindLong(10, (long)status.getValue());
        final b b4 = this.d.b;
        final Error error = downloadInfo.getError();
        b4.getClass();
        ng2.e.g((Object)error, "error");
        ((m5.d)f).bindLong(11, (long)error.getValue());
        final b b5 = this.d.b;
        final NetworkType networkType = downloadInfo.getNetworkType();
        b5.getClass();
        ng2.e.g((Object)networkType, "networkType");
        ((m5.d)f).bindLong(12, (long)networkType.getValue());
        ((m5.d)f).bindLong(13, downloadInfo.getCreated());
        if (downloadInfo.getTag() == null) {
            ((m5.d)f).bindNull(14);
        }
        else {
            ((m5.d)f).bindString(14, downloadInfo.getTag());
        }
        final b b6 = this.d.b;
        final EnqueueAction enqueueAction = downloadInfo.getEnqueueAction();
        b6.getClass();
        ng2.e.g((Object)enqueueAction, "enqueueAction");
        ((m5.d)f).bindLong(15, (long)enqueueAction.getValue());
        ((m5.d)f).bindLong(16, downloadInfo.getIdentifier());
        ((m5.d)f).bindLong(17, (long)(downloadInfo.getDownloadOnEnqueue() ? 1 : 0));
        final b b7 = this.d.b;
        final Extras extras = downloadInfo.getExtras();
        b7.getClass();
        ((m5.d)f).bindString(18, vi.b.b(extras));
        ((m5.d)f).bindLong(19, (long)downloadInfo.getAutoRetryMaxAttempts());
        ((m5.d)f).bindLong(20, (long)downloadInfo.getAutoRetryAttempts());
        ((m5.d)f).bindLong(21, (long)downloadInfo.getId());
    }
}
