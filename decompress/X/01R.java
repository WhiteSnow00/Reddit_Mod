// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import android.os.IInterface;

public interface 01R extends IInterface
{
    default static {
        Covode.recordClassIndex(169);
    }
    
    void LIZ();
    
    void LIZ(final int p0);
    
    void LIZ(final Bundle p0);
    
    void LIZ(final MediaMetadataCompat p0);
    
    void LIZ(final ParcelableVolumeInfo p0);
    
    void LIZ(final PlaybackStateCompat p0);
    
    void LIZ(final CharSequence p0);
    
    void LIZ(final String p0, final Bundle p1);
    
    void LIZ(final List<MediaSessionCompat.QueueItem> p0);
    
    void LIZ(final boolean p0);
    
    void LIZIZ();
    
    void LIZIZ(final int p0);
    
    void LIZIZ(final boolean p0);
    
    public abstract static class a extends Binder implements 01R
    {
        static {
            Covode.recordClassIndex(170);
        }
        
        public a() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaControllerCallback");
        }
        
        public static 01R LIZ(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof 01R) {
                return (01R)queryLocalInterface;
            }
            return new 01R.a.a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            if (n == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            final boolean b = false;
            boolean b2 = false;
            final PlaybackStateCompat playbackStateCompat = null;
            final MediaMetadataCompat mediaMetadataCompat = null;
            final CharSequence charSequence = null;
            final Bundle bundle = null;
            final ParcelableVolumeInfo parcelableVolumeInfo = null;
            final Bundle bundle2 = null;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 1: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    final String string = parcel.readString();
                    Bundle bundle3 = bundle2;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(string, bundle3);
                    return true;
                }
                case 2: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.LIZ();
                    return true;
                }
                case 3: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    PlaybackStateCompat playbackStateCompat2 = playbackStateCompat;
                    if (parcel.readInt() != 0) {
                        playbackStateCompat2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(playbackStateCompat2);
                    return true;
                }
                case 4: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(mediaMetadataCompat2);
                    return true;
                }
                case 5: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.LIZ(parcel.createTypedArrayList((Parcelable$Creator)MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                }
                case 6: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    CharSequence charSequence2 = charSequence;
                    if (parcel.readInt() != 0) {
                        charSequence2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(charSequence2);
                    return true;
                }
                case 7: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    Bundle bundle4 = bundle;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(bundle4);
                    return true;
                }
                case 8: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ParcelableVolumeInfo parcelableVolumeInfo2 = parcelableVolumeInfo;
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    this.LIZ(parcelableVolumeInfo2);
                    return true;
                }
                case 9: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.LIZ(parcel.readInt());
                    return true;
                }
                case 10: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        b2 = true;
                    }
                    this.LIZ(b2);
                    return true;
                }
                case 11: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    boolean b3 = b;
                    if (parcel.readInt() != 0) {
                        b3 = true;
                    }
                    this.LIZIZ(b3);
                    return true;
                }
                case 12: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.LIZIZ(parcel.readInt());
                    return true;
                }
                case 13: {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    this.LIZIZ();
                    return true;
                }
            }
        }
        
        public static final class a implements 01R
        {
            public static 01R LIZ;
            public IBinder LIZIZ;
            
            static {
                Covode.recordClassIndex(171);
            }
            
            public a(final IBinder liziz) {
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ() {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.LIZIZ.transact(2, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ();
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final int n) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    if (!this.LIZIZ.transact(9, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(n);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(7, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(bundle);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final MediaMetadataCompat mediaMetadataCompat) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(4, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(mediaMetadataCompat);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final ParcelableVolumeInfo parcelableVolumeInfo) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(8, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(parcelableVolumeInfo);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final PlaybackStateCompat playbackStateCompat) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(3, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(playbackStateCompat);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final CharSequence charSequence) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(6, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(charSequence);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final String s, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(s);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.LIZIZ.transact(1, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(s, bundle);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final List<MediaSessionCompat.QueueItem> list) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList((List)list);
                    if (!this.LIZIZ.transact(5, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(list);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZ(final boolean b) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.LIZIZ.transact(10, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZ(b);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZIZ() {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.LIZIZ.transact(13, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZIZ();
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZIZ(final int n) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    if (!this.LIZIZ.transact(12, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZIZ(n);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public final void LIZIZ(final boolean b) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    if (!this.LIZIZ.transact(11, obtain, (Parcel)null, 1)) {
                        final 01R liz = a.LIZ;
                        if (liz != null) {
                            liz.LIZIZ(b);
                        }
                    }
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public final IBinder asBinder() {
                return this.LIZIZ;
            }
        }
    }
}
