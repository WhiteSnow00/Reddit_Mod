// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.domain.image.model.ImageModel;
import android.database.Cursor;
import pg2.j;
import com.reddit.domain.image.model.FolderModel;
import ah2.f;
import java.io.Closeable;
import n02.r;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import c50.c0;
import yb0.b;

public final class f0 implements b
{
    public final c0 a;
    
    @Inject
    public f0(final c0 a) {
        this.a = a;
    }
    
    public final List a() {
        final c0 a = this.a;
        a.getClass();
        final HashSet set = new HashSet();
        final Cursor query = a.a.getContentResolver().query(c0.b(), new String[] { "bucket_display_name", "bucket_id" }, (String)null, (String[])null, (String)null);
        Label_0168: {
            if (query == null) {
                break Label_0168;
            }
            try {
                List list;
                if (query.getCount() == 0) {
                    list = CollectionsKt___CollectionsKt.h2((Iterable)set);
                    r.o((Closeable)query, (Throwable)null);
                }
                else {
                    final int columnIndex = query.getColumnIndex("bucket_display_name");
                    final int columnIndex2 = query.getColumnIndex("bucket_id");
                    while (query.moveToNext()) {
                        final String string = query.getString(columnIndex2);
                        final String string2 = query.getString(columnIndex);
                        f.e((Object)string2, "bucketName");
                        f.e((Object)string, "bucketId");
                        set.add(new FolderModel(string2, string));
                    }
                    final j a2 = j.a;
                    r.o((Closeable)query, (Throwable)null);
                    list = CollectionsKt___CollectionsKt.h2((Iterable)set);
                }
                return list;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    r.o((Closeable)query, t);
                }
            }
        }
    }
    
    public final Object b(FolderModel query, List a) {
        final c0 a2 = this.a;
        a2.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("bucket_id = '");
        sb.append(query.getBucketId());
        sb.append('\'');
        String string = sb.toString();
        final String c = c0.c(a);
        if (c != null) {
            final String n = a40.f.n(string, " AND ", c);
            if (n != null) {
                string = n;
            }
        }
        query = (FolderModel)a2.a.getContentResolver().query(c0.b(), new String[] { "_data", "_id", "mime_type", "_size", "width", "height" }, string, (String[])null, "date_modified DESC");
        try {
            a = a2.a((Cursor)query);
            r.o((Closeable)query, (Throwable)null);
            return a;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r.o((Closeable)query, t);
            }
        }
    }
    
    public final Object c(List query) {
        final c0 a = this.a;
        a.getClass();
        query = a.a.getContentResolver().query(c0.b(), new String[] { "_data", "_id", "mime_type", "_size", "width", "height" }, c0.c((List)query), (String[])null, "date_modified DESC");
        try {
            final List<ImageModel> a2 = a.a(query);
            r.o((Closeable)query, (Throwable)null);
            return a2;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r.o((Closeable)query, t);
            }
        }
    }
}
