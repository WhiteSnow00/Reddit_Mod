// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import androidx.appcompat.widget.s0;
import java.io.FileNotFoundException;
import android.provider.ContactsContract$Contacts;
import java.io.IOException;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.UriMatcher;
import java.io.InputStream;

public final class n extends l<InputStream>
{
    public static final UriMatcher i;
    
    static {
        final UriMatcher j = new UriMatcher(-1);
        (i = j).addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        j.addURI("com.android.contacts", "contacts/lookup/*", 1);
        j.addURI("com.android.contacts", "contacts/#/photo", 2);
        j.addURI("com.android.contacts", "contacts/#", 3);
        j.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        j.addURI("com.android.contacts", "phone_lookup/*", 5);
    }
    
    public n(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    public final Class<InputStream> a() {
        return InputStream.class;
    }
    
    public final void e(final Object o) throws IOException {
        ((InputStream)o).close();
    }
    
    public final Object f(final ContentResolver contentResolver, final Uri uri) throws FileNotFoundException {
        final int match = n.i.match(uri);
        InputStream inputStream = null;
        Label_0062: {
            if (match != 1) {
                if (match == 3) {
                    inputStream = ContactsContract$Contacts.openContactPhotoInputStream(contentResolver, uri, true);
                    break Label_0062;
                }
                if (match != 5) {
                    inputStream = contentResolver.openInputStream(uri);
                    break Label_0062;
                }
            }
            final Uri lookupContact = ContactsContract$Contacts.lookupContact(contentResolver, uri);
            if (lookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStream = ContactsContract$Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        }
        if (inputStream != null) {
            return inputStream;
        }
        throw new FileNotFoundException(s0.k("InputStream is null for ", uri));
    }
}
