// 
// Decompiled by Procyon v0.6.0
// 

package id2;

import m5.d;
import m5.f;
import androidx.room.RoomDatabase;
import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadInfo;
import i5.e;

public final class c extends e<DownloadInfo>
{
    public c(final DownloadDatabase downloadDatabase) {
        super((RoomDatabase)downloadDatabase);
    }
    
    public final String b() {
        return "DELETE FROM `requests` WHERE `_id` = ?";
    }
    
    @Override
    public final void d(final f f, final Object o) {
        ((d)f).bindLong(1, (long)((DownloadInfo)o).getId());
    }
}
