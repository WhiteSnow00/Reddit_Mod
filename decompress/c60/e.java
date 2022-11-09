// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import android.database.Cursor;
import android.content.ContentValues;
import ah2.f;
import android.net.Uri;
import android.content.ContentProvider;

public class e extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        f.f((Object)uri, "uri");
        return 0;
    }
    
    public final String getType(final Uri uri) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        f.f((Object)uri, "uri");
        return 0;
    }
}
