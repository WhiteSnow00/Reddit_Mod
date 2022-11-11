// 
// Decompiled by Procyon v0.6.0
// 

package com.squareup.picasso;

import java.io.IOException;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import android.content.Context;

public final class MediaStoreRequestHandler extends e
{
    public static final String[] b;
    
    static {
        b = new String[] { "orientation" };
    }
    
    public MediaStoreRequestHandler(final Context context) {
        super(context);
    }
    
    public final boolean b(final l l) {
        final Uri d = l.d;
        return "content".equals(d.getScheme()) && "media".equals(d.getAuthority());
    }
    
    public final n$a e(final l l) throws IOException {
        final ContentResolver contentResolver = super.a.getContentResolver();
        final Uri d = l.d;
        try {
            final Cursor query = contentResolver.query(d, MediaStoreRequestHandler.b, (String)null, (String[])null, (String)null);
            if (query == null) {
                goto Label_0066;
            }
            try {
                if (!query.moveToFirst()) {
                    goto Label_0066;
                }
                query.getInt(0);
                query.close();
                goto Label_0105;
            }
            catch (final RuntimeException ex) {}
        }
        catch (final RuntimeException ex2) {}
    }
}
