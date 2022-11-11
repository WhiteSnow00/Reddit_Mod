// 
// Decompiled by Procyon v0.6.0
// 

package cc0;

import android.database.Cursor;
import rg2.l;
import com.reddit.domain.media.usecase.DownloadMediaUseCase$d$d;
import com.reddit.domain.media.usecase.DownloadMediaUseCase$d$e;
import android.app.DownloadManager$Query;
import sg2.e;
import android.content.Intent;
import android.content.Context;
import com.reddit.domain.media.usecase.DownloadMediaUseCase$a;
import android.app.DownloadManager;
import com.reddit.domain.media.usecase.DownloadMediaUseCase;
import kotlin.jvm.internal.Ref$LongRef;
import android.content.BroadcastReceiver;

public final class a extends BroadcastReceiver
{
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ DownloadMediaUseCase b;
    public final /* synthetic */ DownloadManager c;
    public final /* synthetic */ DownloadMediaUseCase$a d;
    
    public a(final Ref$LongRef a, final DownloadMediaUseCase b, final DownloadManager c, final DownloadMediaUseCase$a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        e.f((Object)context, "context");
        e.f((Object)intent, "intent");
        if (this.a.element == intent.getLongExtra("extra_download_id", -1L) && e.a((Object)intent.getAction(), (Object)"android.intent.action.DOWNLOAD_COMPLETE")) {
            final DownloadMediaUseCase b = this.b;
            final DownloadManager c = this.c;
            final long element = this.a.element;
            final l c2 = this.d.c;
            b.getClass();
            final DownloadManager$Query downloadManager$Query = new DownloadManager$Query();
            downloadManager$Query.setFilterById(new long[] { element });
            final Cursor query = c.query(downloadManager$Query);
            e.e((Object)query, "downloadManager.query(query)");
            if (query.moveToFirst()) {
                final int int1 = query.getInt(query.getColumnIndex("status"));
                if (int1 != 8) {
                    if (int1 == 16) {
                        c2.invoke(DownloadMediaUseCase$d$e.a);
                    }
                }
                else {
                    c2.invoke(DownloadMediaUseCase$d$d.a);
                }
            }
        }
    }
}
