// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class MediaBrowserCompat
{
    public final MediaBrowserCompat.d LIZ;
    
    static {
        Covode.recordClassIndex(107);
    }
    
    public MediaBrowserCompat(final Context context, final ComponentName componentName, final MediaBrowserCompat.b b) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.LIZ = (MediaBrowserCompat.d)new MediaBrowserCompat.g(context, componentName, b);
            return;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            this.LIZ = (MediaBrowserCompat.d)new MediaBrowserCompat.f(context, componentName, b, (Bundle)null);
            return;
        }
        this.LIZ = (MediaBrowserCompat.d)new MediaBrowserCompat.e(context, componentName, b, (Bundle)null);
    }
    
    public final void LIZ() {
        this.LIZ.LIZLLL();
    }
    
    public static class CustomActionResultReceiver extends ResultReceiver
    {
        public final c LIZLLL;
        
        static {
            Covode.recordClassIndex(108);
        }
        
        @Override
        public final void LIZ(final int n, final Bundle bundle) {
            if (this.LIZLLL == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
        }
    }
    
    public static class ItemReceiver extends ResultReceiver
    {
        static {
            Covode.recordClassIndex(109);
        }
        
        @Override
        public final void LIZ(final int n, final Bundle bundle) {
            Bundle liziz = bundle;
            if (bundle != null) {
                liziz = MediaSessionCompat.LIZIZ(bundle);
            }
            if (n == 0 && liziz != null && liziz.containsKey("media_item")) {
                liziz.getParcelable("media_item");
            }
        }
    }
    
    public static class MediaItem implements Parcelable
    {
        public static final Parcelable$Creator<MediaItem> CREATOR;
        public final int LIZ;
        public final MediaDescriptionCompat LIZIZ;
        
        static {
            Covode.recordClassIndex(110);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaItem>() {
                static {
                    Covode.recordClassIndex(111);
                }
            };
        }
        
        public MediaItem(final Parcel parcel) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.LIZ);
            sb.append(", mDescription=");
            sb.append(this.LIZIZ);
            sb.append('}');
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.LIZ);
            this.LIZIZ.writeToParcel(parcel, n);
        }
    }
    
    public static class SearchResultReceiver extends ResultReceiver
    {
        static {
            Covode.recordClassIndex(112);
        }
        
        @Override
        public final void LIZ(int i, final Bundle bundle) {
            Bundle liziz = bundle;
            if (bundle != null) {
                liziz = MediaSessionCompat.LIZIZ(bundle);
            }
            if (i == 0 && liziz != null && liziz.containsKey("search_results")) {
                final Parcelable[] parcelableArray = liziz.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    final ArrayList list = new ArrayList(parcelableArray.length);
                    int length;
                    for (length = parcelableArray.length, i = 0; i < length; ++i) {
                        list.add((Object)parcelableArray[i]);
                    }
                }
            }
        }
    }
}
