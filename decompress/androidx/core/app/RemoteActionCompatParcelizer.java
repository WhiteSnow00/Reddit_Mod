// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import w5.c;
import android.os.Parcelable;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final VersionedParcel versionedParcel) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object o = remoteActionCompat.mIcon;
        if (versionedParcel.h(1)) {
            o = versionedParcel.n();
        }
        remoteActionCompat.mIcon = (IconCompat)o;
        CharSequence mTitle = remoteActionCompat.mTitle;
        if (versionedParcel.h(2)) {
            mTitle = versionedParcel.g();
        }
        remoteActionCompat.mTitle = mTitle;
        CharSequence mContentDescription = remoteActionCompat.mContentDescription;
        if (versionedParcel.h(3)) {
            mContentDescription = versionedParcel.g();
        }
        remoteActionCompat.mContentDescription = mContentDescription;
        remoteActionCompat.mActionIntent = (PendingIntent)versionedParcel.l((Parcelable)remoteActionCompat.mActionIntent, 4);
        boolean mEnabled = remoteActionCompat.mEnabled;
        if (versionedParcel.h(5)) {
            mEnabled = versionedParcel.e();
        }
        remoteActionCompat.mEnabled = mEnabled;
        boolean mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
        if (versionedParcel.h(6)) {
            mShouldShowIcon = versionedParcel.e();
        }
        remoteActionCompat.mShouldShowIcon = mShouldShowIcon;
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        final IconCompat mIcon = remoteActionCompat.mIcon;
        versionedParcel.o(1);
        versionedParcel.w((c)mIcon);
        final CharSequence mTitle = remoteActionCompat.mTitle;
        versionedParcel.o(2);
        versionedParcel.r(mTitle);
        final CharSequence mContentDescription = remoteActionCompat.mContentDescription;
        versionedParcel.o(3);
        versionedParcel.r(mContentDescription);
        final PendingIntent mActionIntent = remoteActionCompat.mActionIntent;
        versionedParcel.o(4);
        versionedParcel.u((Parcelable)mActionIntent);
        final boolean mEnabled = remoteActionCompat.mEnabled;
        versionedParcel.o(5);
        versionedParcel.p(mEnabled);
        final boolean mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
        versionedParcel.o(6);
        versionedParcel.p(mShouldShowIcon);
    }
}
