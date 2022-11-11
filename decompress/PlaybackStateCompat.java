// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.media.session.PlaybackState$CustomAction$Builder;
import android.media.session.PlaybackState$Builder;
import android.media.session.PlaybackState$CustomAction;
import java.util.List;
import ak0.n;
import android.text.TextUtils;
import java.util.Collection;
import android.os.Parcel;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PlaybackStateCompat implements Parcelable
{
    public static final Parcelable$Creator<PlaybackStateCompat> CREATOR;
    public final int f;
    public final long g;
    public final long h;
    public final float i;
    public final long j;
    public final int k;
    public final CharSequence l;
    public final long m;
    public ArrayList n;
    public final long o;
    public final Bundle p;
    public PlaybackState q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<PlaybackStateCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new PlaybackStateCompat[n];
            }
        };
    }
    
    public PlaybackStateCompat(final int f, final long g, final long h, final float i, final long j, final int k, final CharSequence l, final long m, final ArrayList list, final long o, final Bundle p11) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = new ArrayList(list);
        this.o = o;
        this.p = p11;
    }
    
    public PlaybackStateCompat(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.i = parcel.readFloat();
        this.m = parcel.readLong();
        this.h = parcel.readLong();
        this.j = parcel.readLong();
        this.l = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createTypedArrayList((Parcelable$Creator)CustomAction.CREATOR);
        this.o = parcel.readLong();
        this.p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.k = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f);
        sb.append(", position=");
        sb.append(this.g);
        sb.append(", buffered position=");
        sb.append(this.h);
        sb.append(", speed=");
        sb.append(this.i);
        sb.append(", updated=");
        sb.append(this.m);
        sb.append(", actions=");
        sb.append(this.j);
        sb.append(", error code=");
        sb.append(this.k);
        sb.append(", error message=");
        sb.append(this.l);
        sb.append(", custom actions=");
        sb.append(this.n);
        sb.append(", active item id=");
        return ak0.n.o(sb, this.o, "}");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeFloat(this.i);
        parcel.writeLong(this.m);
        parcel.writeLong(this.h);
        parcel.writeLong(this.j);
        TextUtils.writeToParcel(this.l, parcel, n);
        parcel.writeTypedList((List)this.n);
        parcel.writeLong(this.o);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.k);
    }
    
    public static final class CustomAction implements Parcelable
    {
        public static final Parcelable$Creator<CustomAction> CREATOR;
        public final String f;
        public final CharSequence g;
        public final int h;
        public final Bundle i;
        public PlaybackState$CustomAction j;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<CustomAction>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new CustomAction(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new CustomAction[n];
                }
            };
        }
        
        public CustomAction(final Parcel parcel) {
            this.f = parcel.readString();
            this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = parcel.readInt();
            this.i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
        
        public CustomAction(final String f, final CharSequence g, final int h, final Bundle i) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Action:mName='");
            k.append((Object)this.g);
            k.append(", mIcon=");
            k.append(this.h);
            k.append(", mExtras=");
            k.append(this.i);
            return k.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.f);
            TextUtils.writeToParcel(this.g, parcel, n);
            parcel.writeInt(this.h);
            parcel.writeBundle(this.i);
        }
    }
    
    public static final class b
    {
        public static void a(final PlaybackState$Builder playbackState$Builder, final PlaybackState$CustomAction playbackState$CustomAction) {
            playbackState$Builder.addCustomAction(playbackState$CustomAction);
        }
        
        public static PlaybackState$CustomAction b(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder) {
            return playbackState$CustomAction$Builder.build();
        }
        
        public static PlaybackState c(final PlaybackState$Builder playbackState$Builder) {
            return playbackState$Builder.build();
        }
        
        public static PlaybackState$Builder d() {
            return new PlaybackState$Builder();
        }
        
        public static PlaybackState$CustomAction$Builder e(final String s, final CharSequence charSequence, final int n) {
            return new PlaybackState$CustomAction$Builder(s, charSequence, n);
        }
        
        public static String f(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getAction();
        }
        
        public static long g(final PlaybackState playbackState) {
            return playbackState.getActions();
        }
        
        public static long h(final PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }
        
        public static long i(final PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }
        
        public static List<PlaybackState$CustomAction> j(final PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }
        
        public static CharSequence k(final PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }
        
        public static Bundle l(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getExtras();
        }
        
        public static int m(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getIcon();
        }
        
        public static long n(final PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }
        
        public static CharSequence o(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getName();
        }
        
        public static float p(final PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }
        
        public static long q(final PlaybackState playbackState) {
            return playbackState.getPosition();
        }
        
        public static int r(final PlaybackState playbackState) {
            return playbackState.getState();
        }
        
        public static void s(final PlaybackState$Builder playbackState$Builder, final long actions) {
            playbackState$Builder.setActions(actions);
        }
        
        public static void t(final PlaybackState$Builder playbackState$Builder, final long activeQueueItemId) {
            playbackState$Builder.setActiveQueueItemId(activeQueueItemId);
        }
        
        public static void u(final PlaybackState$Builder playbackState$Builder, final long bufferedPosition) {
            playbackState$Builder.setBufferedPosition(bufferedPosition);
        }
        
        public static void v(final PlaybackState$Builder playbackState$Builder, final CharSequence errorMessage) {
            playbackState$Builder.setErrorMessage(errorMessage);
        }
        
        public static void w(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder, final Bundle extras) {
            playbackState$CustomAction$Builder.setExtras(extras);
        }
        
        public static void x(final PlaybackState$Builder playbackState$Builder, final int n, final long n2, final float n3, final long n4) {
            playbackState$Builder.setState(n, n2, n3, n4);
        }
    }
    
    public static final class c
    {
        public static Bundle a(final PlaybackState playbackState) {
            return playbackState.getExtras();
        }
        
        public static void b(final PlaybackState$Builder playbackState$Builder, final Bundle extras) {
            playbackState$Builder.setExtras(extras);
        }
    }
    
    public static final class d
    {
        public final ArrayList a;
        public int b;
        public long c;
        public long d;
        public float e;
        public long f;
        public int g;
        public CharSequence h;
        public long i;
        public long j;
        public Bundle k;
        
        public d() {
            this.a = new ArrayList();
            this.j = -1L;
        }
        
        public d(final PlaybackStateCompat playbackStateCompat) {
            final ArrayList a = new ArrayList();
            this.a = a;
            this.j = -1L;
            this.b = playbackStateCompat.f;
            this.c = playbackStateCompat.g;
            this.e = playbackStateCompat.i;
            this.i = playbackStateCompat.m;
            this.d = playbackStateCompat.h;
            this.f = playbackStateCompat.j;
            this.g = playbackStateCompat.k;
            this.h = playbackStateCompat.l;
            final ArrayList n = playbackStateCompat.n;
            if (n != null) {
                a.addAll(n);
            }
            this.j = playbackStateCompat.o;
            this.k = playbackStateCompat.p;
        }
        
        public final PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }
    }
}
