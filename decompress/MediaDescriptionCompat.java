// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.os.BaseBundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaDescriptionCompat> CREATOR;
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;
    public final Bitmap j;
    public final Uri k;
    public final Bundle l;
    public final Uri m;
    public MediaDescription n;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaDescriptionCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            }
            
            public final Object[] newArray(final int n) {
                return new MediaDescriptionCompat[n];
            }
        };
    }
    
    public MediaDescriptionCompat() {
        throw null;
    }
    
    public MediaDescriptionCompat(final String f, final CharSequence g, final CharSequence h, final CharSequence i, final Bitmap j, final Uri k, final Bundle l, final Uri m) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static MediaDescriptionCompat a(final Object o) {
        MediaDescriptionCompat mediaDescriptionCompat = null;
        final BaseBundle baseBundle = null;
        if (o != null) {
            final d d = new d();
            final MediaDescription n = (MediaDescription)o;
            d.a = b.g(n);
            d.b = b.i(n);
            d.c = b.h(n);
            d.d = b.c(n);
            d.e = b.e(n);
            d.f = b.f(n);
            final Bundle d2 = b.d(n);
            Bundle c;
            if ((c = d2) != null) {
                c = MediaSessionCompat.c(d2);
            }
            Uri h;
            if (c != null) {
                h = (Uri)c.getParcelable("android.support.v4.media.description.MEDIA_URI");
            }
            else {
                h = null;
            }
            if (h != null) {
                if (((BaseBundle)c).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && ((BaseBundle)c).size() == 2) {
                    c = (Bundle)baseBundle;
                }
                else {
                    c.remove("android.support.v4.media.description.MEDIA_URI");
                    c.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            d.g = c;
            if (h != null) {
                d.h = h;
            }
            else {
                d.h = MediaDescriptionCompat.c.a(n);
            }
            mediaDescriptionCompat = new MediaDescriptionCompat(d.a, d.b, d.c, d.d, d.e, d.f, d.g, d.h);
            mediaDescriptionCompat.n = n;
        }
        return mediaDescriptionCompat;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.g);
        sb.append(", ");
        sb.append((Object)this.h);
        sb.append(", ");
        sb.append((Object)this.i);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        MediaDescription n2;
        if ((n2 = this.n) == null) {
            final MediaDescription$Builder b = MediaDescriptionCompat.b.b();
            MediaDescriptionCompat.b.n(b, this.f);
            MediaDescriptionCompat.b.p(b, this.g);
            MediaDescriptionCompat.b.o(b, this.h);
            MediaDescriptionCompat.b.j(b, this.i);
            MediaDescriptionCompat.b.l(b, this.j);
            MediaDescriptionCompat.b.m(b, this.k);
            MediaDescriptionCompat.b.k(b, this.l);
            c.b(b, this.m);
            n2 = MediaDescriptionCompat.b.a(b);
            this.n = n2;
        }
        n2.writeToParcel(parcel, n);
    }
    
    public static final class b
    {
        public static MediaDescription a(final MediaDescription$Builder mediaDescription$Builder) {
            return mediaDescription$Builder.build();
        }
        
        public static MediaDescription$Builder b() {
            return new MediaDescription$Builder();
        }
        
        public static CharSequence c(final MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }
        
        public static Bundle d(final MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
        
        public static Bitmap e(final MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }
        
        public static Uri f(final MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }
        
        public static String g(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }
        
        public static CharSequence h(final MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }
        
        public static CharSequence i(final MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }
        
        public static void j(final MediaDescription$Builder mediaDescription$Builder, final CharSequence description) {
            mediaDescription$Builder.setDescription(description);
        }
        
        public static void k(final MediaDescription$Builder mediaDescription$Builder, final Bundle extras) {
            mediaDescription$Builder.setExtras(extras);
        }
        
        public static void l(final MediaDescription$Builder mediaDescription$Builder, final Bitmap iconBitmap) {
            mediaDescription$Builder.setIconBitmap(iconBitmap);
        }
        
        public static void m(final MediaDescription$Builder mediaDescription$Builder, final Uri iconUri) {
            mediaDescription$Builder.setIconUri(iconUri);
        }
        
        public static void n(final MediaDescription$Builder mediaDescription$Builder, final String mediaId) {
            mediaDescription$Builder.setMediaId(mediaId);
        }
        
        public static void o(final MediaDescription$Builder mediaDescription$Builder, final CharSequence subtitle) {
            mediaDescription$Builder.setSubtitle(subtitle);
        }
        
        public static void p(final MediaDescription$Builder mediaDescription$Builder, final CharSequence title) {
            mediaDescription$Builder.setTitle(title);
        }
    }
    
    public static final class c
    {
        public static Uri a(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
        
        public static void b(final MediaDescription$Builder mediaDescription$Builder, final Uri mediaUri) {
            mediaDescription$Builder.setMediaUri(mediaUri);
        }
    }
    
    public static final class d
    {
        public String a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;
    }
}
