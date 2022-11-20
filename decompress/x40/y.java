// 
// Decompiled by Procyon v0.6.0
// 

package x40;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.content.ContentUris;
import java.util.ArrayList;
import com.reddit.domain.image.model.ImageModel;
import android.database.Cursor;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import android.provider.MediaStore$Images$Media;
import android.os.Build$VERSION;
import android.net.Uri;
import javax.inject.Inject;
import ng2.e;
import t00.a;
import android.content.Context;

public final class y
{
    public final Context a;
    public final a b;
    
    @Inject
    public y(final Context a, final a b) {
        e.f((Object)b, "chatFeatures");
        this.a = a;
        this.b = b;
    }
    
    public static Uri b() {
        Uri uri;
        if (Build$VERSION.SDK_INT >= 29) {
            uri = MediaStore$Images$Media.getContentUri("external");
            e.e((Object)uri, "{\n      MediaStore.Image\u2026re.VOLUME_EXTERNAL)\n    }");
        }
        else {
            uri = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
            e.e((Object)uri, "{\n      MediaStore.Image\u2026XTERNAL_CONTENT_URI\n    }");
        }
        return uri;
    }
    
    public static String c(final List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return b.l("mime_type IN ", CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)"' , '", "('", "')", (l)null, 56));
    }
    
    public final List<ImageModel> a(final Cursor cursor) {
        if (cursor != null && cursor.getCount() != 0) {
            final int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            final int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_data");
            final int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_size");
            final int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("width");
            final int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("height");
            final ArrayList list = new ArrayList();
            while (cursor.moveToNext()) {
                ImageModel imageModel;
                if (this.b.i3()) {
                    final long long1 = cursor.getLong(columnIndexOrThrow);
                    final long long2 = cursor.getLong(columnIndexOrThrow3);
                    final long long3 = cursor.getLong(columnIndexOrThrow4);
                    final long long4 = cursor.getLong(columnIndexOrThrow5);
                    final Uri withAppendedId = ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, long1);
                    e.e((Object)withAppendedId, "withAppendedId(\n        \u2026,\n          id,\n        )");
                    final String string = withAppendedId.toString();
                    e.e((Object)string, "contentUri.toString()");
                    imageModel = new ImageModel(string, Long.valueOf(long2), Long.valueOf(long3), Long.valueOf(long4));
                }
                else {
                    final String string2 = cursor.getString(columnIndexOrThrow2);
                    e.e((Object)string2, "path");
                    imageModel = new ImageModel(string2, (Long)null, (Long)null, (Long)null, 14, (DefaultConstructorMarker)null);
                }
                list.add(imageModel);
            }
            return list;
        }
        return (List<ImageModel>)EmptyList.INSTANCE;
    }
}
