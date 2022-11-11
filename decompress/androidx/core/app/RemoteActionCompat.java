// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Icon;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.IconCompat$a;
import android.app.RemoteAction;
import androidx.core.graphics.drawable.IconCompat;
import android.app.PendingIntent;
import w5.c;

public final class RemoteActionCompat implements c
{
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;
    
    public RemoteActionCompat() {
    }
    
    public RemoteActionCompat(final RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
    
    public RemoteActionCompat(final IconCompat mIcon, final CharSequence mTitle, final CharSequence mContentDescription, final PendingIntent mActionIntent) {
        mIcon.getClass();
        this.mIcon = mIcon;
        mTitle.getClass();
        this.mTitle = mTitle;
        mContentDescription.getClass();
        this.mContentDescription = mContentDescription;
        mActionIntent.getClass();
        this.mActionIntent = mActionIntent;
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }
    
    public static RemoteActionCompat createFromRemoteAction(final RemoteAction remoteAction) {
        remoteAction.getClass();
        final Icon d = RemoteActionCompat.RemoteActionCompat$a.d(remoteAction);
        final PorterDuff$Mode k = IconCompat.k;
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat$a.a((Object)d), RemoteActionCompat.RemoteActionCompat$a.e(remoteAction), RemoteActionCompat.RemoteActionCompat$a.c(remoteAction), RemoteActionCompat.RemoteActionCompat$a.b(remoteAction));
        remoteActionCompat.setEnabled(RemoteActionCompat.RemoteActionCompat$a.f(remoteAction));
        if (Build$VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(RemoteActionCompat.RemoteActionCompat$b.b(remoteAction));
        }
        return remoteActionCompat;
    }
    
    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }
    
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }
    
    public IconCompat getIcon() {
        return this.mIcon;
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public boolean isEnabled() {
        return this.mEnabled;
    }
    
    public void setEnabled(final boolean mEnabled) {
        this.mEnabled = mEnabled;
    }
    
    public void setShouldShowIcon(final boolean mShouldShowIcon) {
        this.mShouldShowIcon = mShouldShowIcon;
    }
    
    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }
    
    public RemoteAction toRemoteAction() {
        final IconCompat mIcon = this.mIcon;
        mIcon.getClass();
        final RemoteAction a = RemoteActionCompat.RemoteActionCompat$a.a(IconCompat$a.g(mIcon, (Context)null), this.mTitle, this.mContentDescription, this.mActionIntent);
        RemoteActionCompat.RemoteActionCompat$a.g(a, this.isEnabled());
        if (Build$VERSION.SDK_INT >= 28) {
            RemoteActionCompat.RemoteActionCompat$b.a(a, this.shouldShowIcon());
        }
        return a;
    }
}
