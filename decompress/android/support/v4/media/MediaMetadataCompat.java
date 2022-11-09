// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import j0.i;
import a40.f;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.media.MediaMetadata;
import android.os.Bundle;
import j0.b;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaMetadataCompat> CREATOR;
    public static final j0.b<String, Integer> h;
    public final Bundle f;
    public MediaMetadata g;
    
    static {
        final j0.b<String, Integer> b = (j0.b<String, Integer>)(h = new j0.b());
        final Integer value = 1;
        ((i)b).put((Object)"android.media.metadata.TITLE", (Object)value);
        ((i)b).put((Object)"android.media.metadata.ARTIST", (Object)value);
        final Integer value2 = 0;
        ((i)b).put((Object)"android.media.metadata.DURATION", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.ALBUM", (Object)value);
        ((i)b).put((Object)"android.media.metadata.AUTHOR", (Object)value);
        ((i)b).put((Object)"android.media.metadata.WRITER", (Object)value);
        ((i)b).put((Object)"android.media.metadata.COMPOSER", (Object)value);
        ((i)b).put((Object)"android.media.metadata.COMPILATION", (Object)value);
        ((i)b).put((Object)"android.media.metadata.DATE", (Object)value);
        ((i)b).put((Object)"android.media.metadata.YEAR", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.GENRE", (Object)value);
        ((i)b).put((Object)"android.media.metadata.TRACK_NUMBER", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.NUM_TRACKS", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.DISC_NUMBER", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.ALBUM_ARTIST", (Object)value);
        final Integer value3 = 2;
        ((i)b).put((Object)"android.media.metadata.ART", (Object)value3);
        ((i)b).put((Object)"android.media.metadata.ART_URI", (Object)value);
        ((i)b).put((Object)"android.media.metadata.ALBUM_ART", (Object)value3);
        ((i)b).put((Object)"android.media.metadata.ALBUM_ART_URI", (Object)value);
        final Integer value4 = 3;
        ((i)b).put((Object)"android.media.metadata.USER_RATING", (Object)value4);
        ((i)b).put((Object)"android.media.metadata.RATING", (Object)value4);
        ((i)b).put((Object)"android.media.metadata.DISPLAY_TITLE", (Object)value);
        ((i)b).put((Object)"android.media.metadata.DISPLAY_SUBTITLE", (Object)value);
        ((i)b).put((Object)"android.media.metadata.DISPLAY_DESCRIPTION", (Object)value);
        ((i)b).put((Object)"android.media.metadata.DISPLAY_ICON", (Object)value3);
        ((i)b).put((Object)"android.media.metadata.DISPLAY_ICON_URI", (Object)value);
        ((i)b).put((Object)"android.media.metadata.MEDIA_ID", (Object)value);
        ((i)b).put((Object)"android.media.metadata.BT_FOLDER_TYPE", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.MEDIA_URI", (Object)value);
        ((i)b).put((Object)"android.media.metadata.ADVERTISEMENT", (Object)value2);
        ((i)b).put((Object)"android.media.metadata.DOWNLOAD_STATUS", (Object)value2);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaMetadataCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new MediaMetadataCompat[n];
            }
        };
    }
    
    public MediaMetadataCompat(Bundle f) {
        f = new Bundle(f);
        MediaSessionCompat.a(this.f = f);
    }
    
    public MediaMetadataCompat(final Parcel parcel) {
        this.f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.f);
    }
    
    public static final class b
    {
        public final Bundle a;
        
        public b() {
            this.a = new Bundle();
        }
        
        public final void a(final Bitmap bitmap, final String s) {
            final j0.b<String, Integer> h = MediaMetadataCompat.h;
            if (((i)h).containsKey((Object)s) && (int)((i)h).getOrDefault((Object)s, (Object)null) != 2) {
                throw new IllegalArgumentException(a40.f.n("The ", s, " key cannot be used to put a Bitmap"));
            }
            this.a.putParcelable(s, (Parcelable)bitmap);
        }
        
        public final void b(final String s, final String s2) {
            final j0.b<String, Integer> h = MediaMetadataCompat.h;
            if (((i)h).containsKey((Object)s) && (int)((i)h).getOrDefault((Object)s, (Object)null) == 0) {
                throw new IllegalArgumentException(a40.f.n("The ", s, " key cannot be used to put a String"));
            }
            this.a.putCharSequence(s, (CharSequence)s2);
        }
    }
}
